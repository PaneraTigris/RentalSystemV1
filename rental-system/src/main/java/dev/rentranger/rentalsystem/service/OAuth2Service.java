package dev.rentranger.rentalsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientManager;
import org.springframework.security.oauth2.client.OAuth2AuthorizeRequest;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.core.OAuth2AccessToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class OAuth2Service {

    @Autowired
    private OAuth2AuthorizedClientManager authorizedClientManager;

    @Autowired
    private ClientRegistrationRepository clientRegistrationRepository;

    public OAuth2AccessToken getAccessToken() {
        ClientRegistration clientRegistration = clientRegistrationRepository.findByRegistrationId("lightspeed");

        OAuth2AuthorizeRequest authorizeRequest = OAuth2AuthorizeRequest
                .withClientRegistrationId(clientRegistration.getRegistrationId())
                .principal(SecurityContextHolder.getContext().getAuthentication())
                .build();

        return authorizedClientManager.authorize(authorizeRequest).getAccessToken();
    }
}