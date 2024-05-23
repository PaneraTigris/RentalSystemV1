package dev.rentranger.rentalsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

// Service to interact with Lightspeed's API using OAuth2 access token
@Service
public class LightspeedApiService {

    @Autowired
    private OAuth2Service oAuth2Service;

    private final RestTemplate restTemplate = new RestTemplate();

    public ResponseEntity<String> getInventory() {
        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(oAuth2Service.getAccessToken().getTokenValue());
        HttpEntity<String> entity = new HttpEntity<>(headers);

        return restTemplate.exchange("https://api.lightspeedapp.com/API_ENDPOINT", HttpMethod.GET, entity, String.class);
    }
}