package com.example.DiceAssignment.Controller;

import com.example.DiceAssignment.Service.DiceWeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * REST controller for handling weather-related requests.
 */
@RestController
@RequestMapping("/api")
public class DiceWeatherController {

    // Injecting the service to handle the business logic
    @Autowired
    private DiceWeatherService diceWeatherService;

    /**
     * Endpoint to get a summary forecast for a specific location by name.
     * @param name The name of the location.
     * @return A ResponseEntity containing the forecast summary or an error message.
     */
    @GetMapping("/{name}")
    public ResponseEntity<String> GetForecastSummaryByLocationName(@PathVariable("name") String name) {
        try {
            // Delegating the call to the service layer and returning the response
            return diceWeatherService.RapidApiGetForecastSummaryByLocationName(name);

        } catch (Exception e) {
            // Returning an error response if an exception occurs
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    /**
     * Endpoint to get hourly forecast data for a specific location by name.
     * @param name The name of the location.
     * @return A ResponseEntity containing the hourly forecast or an error message.
     */
    @GetMapping("/hourly/{name}")
    public ResponseEntity<String> GetHourlyForecastByLocationName(@PathVariable("name") String name) {
        try {
            // Delegating the call to the service layer and returning the response
            return diceWeatherService.RapidApiGetHourlyForecastByLocationName(name);

        } catch (Exception e) {
            // Returning an error response if an exception occurs
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
