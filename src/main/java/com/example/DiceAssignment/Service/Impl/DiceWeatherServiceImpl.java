package com.example.DiceAssignment.Service.Impl;

import com.example.DiceAssignment.Service.DiceWeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.HashMap;
import java.util.Map;

/**
 * Service implementation to interact with an external weather API.
 */
@Service
public class DiceWeatherServiceImpl implements DiceWeatherService {

    // Injecting the RestTemplate object to perform HTTP requests
    @Autowired
    private RestTemplate restTemplate;

    /**
     * Retrieves a summary forecast for a given location by name.
     * @param name The location name for which the forecast is requested.
     * @return ResponseEntity containing the forecast summary as a string.
     */
    @Override
    public ResponseEntity<String> RapidApiGetForecastSummaryByLocationName(String name) {
        // Base URL for the forecast summary endpoint
        String baseurl = "https://forecast9.p.rapidapi.com/rapidapi/forecast/{name}/summary/";

        // Setting up HTTP headers with the required API keys and host
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-RapidAPI-Host", "forecast9.p.rapidapi.com");
        headers.set("X-RapidAPI-Key", "fc2828b9f7msh07ff4e7dd0001b5p13860bjsn2d90c723a0e3");

        // Parameters to be replaced in the URI
        Map<String, String> urlParams = new HashMap<>();
        urlParams.put("name", name);

        // Creating an HTTP entity with headers
        HttpEntity<?> entity = new HttpEntity<>(headers);

        // Building the complete URI with parameters
        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(baseurl);

        // Executing the HTTP GET request and returning the response
        return restTemplate.exchange(builder.buildAndExpand(urlParams).toUri(), HttpMethod.GET, entity, String.class);
    }

    /**
     * Retrieves hourly forecast data for a given location by name.
     * @param name The location name for which the hourly forecast is requested.
     * @return ResponseEntity containing the hourly forecast as a string.
     */
    @Override
    public ResponseEntity<String> RapidApiGetHourlyForecastByLocationName(String name) {
        // Base URL for the hourly forecast endpoint
        String baseurl = "https://forecast9.p.rapidapi.com/rapidapi/forecast/{name}/hourly/";

        // Setting up HTTP headers with the required API keys and host
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-RapidAPI-Host", "forecast9.p.rapidapi.com");
        headers.set("X-RapidAPI-Key", "fc2828b9f7msh07ff4e7dd0001b5p13860bjsn2d90c723a0e3");

        // Parameters to be replaced in the URI
        Map<String, String> urlParams = new HashMap<>();
        urlParams.put("name", name);

        // Creating an HTTP entity with headers
        HttpEntity<?> entity = new HttpEntity<>(headers);

        // Building the complete URI with parameters
        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(baseurl);

        // Executing the HTTP GET request and returning the response
        return restTemplate.exchange(builder.buildAndExpand(urlParams).toUri(), HttpMethod.GET, entity, String.class);
    }
}
