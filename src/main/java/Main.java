import controller.ApiReader;
import model.WatherDTOtoEntity;
import model.WeatherEntity;
import repository.WeatherDAO;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<WeatherEntity> weatherEntityList = new ArrayList<>();

        WeatherEntity w1 = WatherDTOtoEntity.weatherDTOtoEntity(ApiReader.apiGet("Roskilde"));
        WeatherEntity w2 =WatherDTOtoEntity.weatherDTOtoEntity(ApiReader.apiGet("Hillerød"));
        WeatherEntity w3 =WatherDTOtoEntity.weatherDTOtoEntity(ApiReader.apiGet("Albertslund"));
        WeatherEntity w4 =WatherDTOtoEntity.weatherDTOtoEntity(ApiReader.apiGet("Amager"));

        weatherEntityList.add(w1);
        weatherEntityList.add(w2);
        weatherEntityList.add(w3);
        weatherEntityList.add(w4);

        //weatherEntityList.forEach(System.out::println);

        WeatherDAO weatherDAO = WeatherDAO.getInstance();

        //create weather in database
        weatherEntityList.forEach(weatherDAO::createWeather);

        //Se alle vejr entitieter i db
        List<WeatherEntity> weatherEntityList1 = weatherDAO.readAllWeather();
        weatherEntityList1.forEach(System.out::println);

        System.out.println("We want to see weather with location Roskilde");
        List<WeatherEntity> weatherEntityList2 = weatherDAO.getWeatherByLocationName("Hillerød");
        System.out.println(weatherEntityList2);


    }
}
