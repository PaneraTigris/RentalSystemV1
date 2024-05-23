package dev.rentranger.rental.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientManager;
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.core.OAuth2AccessToken;
import org.springframework.stereotype.Service;

// Service to manage OAuth2 Tokens
@Service
public class OAuth2Service {

    @Autowired
    private OAuth2AuthorizedClientManager authorizedClientManager;

    @Autowired
    private ClientRegistrationRepository clientRegistrationRepository;

    public OAuth2AccessToken getAccessToken() {
        ClientRegistration clientRegistration = clientRegistrationRepository.findByRegistrationId("lightspeed");
        OAuth2AccessToken accessToken = authorizedClientManager
                .authorize(OAuth2AuthorizationContext
                        .withClientRegistration(clientRegistration)
                        .principal(SecurityContextHolder.getContext().getAuthentication())
                        .build())
                .getAccessToken();
        return accessToken;
    }
}