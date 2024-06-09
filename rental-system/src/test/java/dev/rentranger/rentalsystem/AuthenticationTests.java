package dev.rentranger.rentalsystem;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class AuthenticationTests {

    @Autowired
    private MockMvc mockMvc;

    private static String jwtToken;

    @Test
    public void testAuthenticationAndRefreshToken() throws Exception {
        // Authenticate and get token
        this.mockMvc.perform(post("/api/auth/authenticate")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"username\":\"testuser\",\"password\":\"testpass\"}"))
                .andExpect(status().isOk())
                .andDo(result -> jwtToken = extractTokenFromResult(result.getResponse().getContentAsString()));

        // Use the token to access a secured endpoint
        this.mockMvc.perform(get("/api/secured-endpoint")
                        .header("Authorization", "Bearer " + jwtToken))
                .andExpect(status().isOk());

        // Refresh the token
        this.mockMvc.perform(post("/api/auth/refresh-token")
                        .header("Authorization", "Bearer " + jwtToken))
                .andExpect(status().isOk())
                .andDo(result -> jwtToken = extractTokenFromResult(result.getResponse().getContentAsString()));

        // Use the refreshed token to access the secured endpoint
        this.mockMvc.perform(get("/api/secured-endpoint")
                        .header("Authorization", "Bearer " + jwtToken))
                .andExpect(status().isOk());
    }

    private String extractTokenFromResult(String json) {
        // Extract and return the token from JSON response
        // Placeholder for JSON parsing logic, typically you might use Jackson or another JSON parsing library
        return json.substring(json.indexOf(":\"") + 2, json.length() - 2);
    }
}