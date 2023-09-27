package controller;

import io.javalin.Javalin;
import model.WatherDTOtoEntity;
import model.WeatherEntity;
import repository.WeatherDAO;

public class JavalinApi {
    public static void main(String[] args) {

        WeatherDAO weatherDAO = WeatherDAO.getInstance();

        WeatherEntity w1 = WatherDTOtoEntity.weatherDTOtoEntity(ApiReader.apiGet("Roskilde"));

        weatherDAO.createWeather(w1);


        var app = Javalin.create().start(7500);
        app.get("/", ctx -> ctx.result("Hello World"));

        app.get("/api/items", ctx -> {
            try {
                long id = 1;
                WeatherEntity weatherEntity = weatherDAO.readWeather(id);
                ctx.json(weatherEntity.toString());
            } catch (Exception e) {
                ctx.status(500).result(e.getMessage());
            }
        });

        app.post("/api/items", ctx -> {
            try {
                // Convert incoming request body to WeatherEntity
                WeatherEntity weatherEntity = ctx.bodyAsClass(WeatherEntity.class);

                // Use the DAO instance to persist the entity
                weatherDAO.createWeather(weatherEntity);

                // Return status 201 (Created)
                ctx.status(201);    
            } catch (Exception e) {
                // Handle any potential exceptions
                ctx.status(500).result(e.getMessage());
            }
        });


    }
}
