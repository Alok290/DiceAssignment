# Dice Weather Application

The Dice Weather Application provides weather forecast information through a RESTful API. It consists of two main components: the `DiceWeatherController` and the `DiceWeatherServiceImpl`.

## Components

### DiceWeatherController

The `DiceWeatherController` is responsible for handling incoming HTTP requests and delegating the business logic to the `DiceWeatherService`.

#### Endpoints

- **GET /api/{name}**: Returns a summary forecast for the specified location.
- **GET /api/hourly/{name}**: Provides hourly forecast data for the specified location.

### DiceWeatherServiceImpl

The `DiceWeatherServiceImpl` implements the `DiceWeatherService` interface and interacts with an external weather API to fetch the forecast data.

## Setup

To set up the Dice Weather Application, you need to:

1. Clone the repository.
2. Import the project into your IDE.
3. Ensure you have Maven and JDK installed.
4. Run the application using the Spring Boot Maven plugin: `mvn spring-boot:run`.

## Usage

Once the application is running, you can make requests to the endpoints provided by the `DiceWeatherController` to retrieve weather forecasts.

## Configuration

The application requires the following environment variables for the external weather API:

- `X-RapidAPI-Host`: The host URL for the weather API.
- `X-RapidAPI-Key`: The API key for accessing the weather API.

## Contribution

Contributions are welcome. Please follow the standard workflow for contributing to a project:

1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Commit your changes.
4. Push to your branch.
5. Submit a pull request.

