package dev.rentranger.rentalsystem;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LightSpeedService {

    private final RestTemplate restTemplate = new RestTemplate();
    private final String apiUrl = "https://api.lightspeedapp.com/API_URL_HERE";
    private final String apiKey = "YOUR_API_KEY";

    public String getInventory() {
        String url = apiUrl + "/inventory";
        return restTemplate.getForObject(url, String.class);
    }

    // ADDITIONAL METHODS FOR OTHER API INTERACTIONS HERE AS NEEDED
}