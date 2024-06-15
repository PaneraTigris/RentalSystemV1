package dev.rentranger.rentalsystem.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientManager;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;
import org.springframework.security.oauth2.client.web.DefaultOAuth2AuthorizedClientManager;
import org.springframework.security.oauth2.client.web.OAuth2AuthorizedClientRepository;

@Configuration
@EnableWebSecurity
public class OAuth2ClientConfig {


    private ClientRegistration lightspeedClientRegistration() {
        return ClientRegistration.withRegistrationId("lightspeed")
                .clientId("your-client-id")
                .clientSecret("your-client-secret")
                .scope("read", "write")
                .authorizationUri("https://cloud.lightspeedapp.com/oauth/authorize")
                .tokenUri("https://cloud.lightspeedapp.com/oauth/token")
                .userInfoUri("https://api.lightspeedapp.com/API/Account/{accountID}/Employee.json")
                .redirectUri("{baseUrl}/login/oauth2/code/{registrationId}")
                .clientName("Lightspeed")
                .build();
    }

    @Bean
    public OAuth2AuthorizedClientManager authorizedClientManager(
            ClientRegistrationRepository clientRegistrationRepository,
            OAuth2AuthorizedClientRepository authorizedClientRepository) {

        return new DefaultOAuth2AuthorizedClientManager(
                clientRegistrationRepository, authorizedClientRepository);
    }
}