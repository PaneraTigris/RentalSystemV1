package dev.rentranger.rentalsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.security.oauth2.core.OAuth2AccessToken;

// Service to interact with Lightspeed's API using OAuth2 access token
@Service
public class LightspeedApiService {

    @Autowired
    private OAuth2Service oAuth2Service;

    private final RestTemplate restTemplate = new RestTemplate();

    public ResponseEntity<String> getInventory() {
        OAuth2AccessToken accessToken = oAuth2Service.getAccessToken();
        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(accessToken.getTokenValue());
        HttpEntity<String> entity = new HttpEntity<>(headers);

        String url = "https://api.lightspeedapp.com/API_ENDPOINT"; // Replace with actual Lightspeed API endpoint
        return restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
    }

}