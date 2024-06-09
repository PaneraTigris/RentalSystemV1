package dev.rentranger.rentalsystem;

import dev.rentranger.rentalsystem.config.JwtRequestFilter;
import dev.rentranger.rentalsystem.service.JwtUtil;
import dev.rentranger.rentalsystem.service.UserDetailsServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class JwtRequestFilterTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private JwtRequestFilter jwtRequestFilter;

    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @Autowired
    private JwtUtil jwtUtil;

    @Test
    @WithMockUser
    public void testFilterIsInvoked() throws Exception {
        mockMvc.perform(get("/some-secure-endpoint"))
                .andExpect(status().isOk());
    }
}
