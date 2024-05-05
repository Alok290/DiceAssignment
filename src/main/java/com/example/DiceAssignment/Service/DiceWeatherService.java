package com.example.DiceAssignment.Service;


import org.springframework.http.ResponseEntity;

public interface DiceWeatherService {

    ResponseEntity<String> RapidApiGetForecastSummaryByLocationName(String name);

    ResponseEntity<String> RapidApiGetHourlyForecastByLocationName(String name);
}
