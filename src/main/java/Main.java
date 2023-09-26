import controller.ApiReader;
import model.LocationDTOtoEntity;
import model.LocationEntity;
import model.WatherDTOtoEntity;
import model.WeatherEntity;
import repository.WeatherDAO;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {

       /* List<WeatherEntity> weatherEntityList = new ArrayList<>();

        WeatherEntity w1 = WatherDTOtoEntity.weatherDTOtoEntity(ApiReader.apiGet("Roskilde"));
        WeatherEntity w2 =WatherDTOtoEntity.weatherDTOtoEntity(ApiReader.apiGet("Hillerød"));
        WeatherEntity w3 =WatherDTOtoEntity.weatherDTOtoEntity(ApiReader.apiGet("Albertslund"));
        WeatherEntity w4 =WatherDTOtoEntity.weatherDTOtoEntity(ApiReader.apiGet("Amager"));

        weatherEntityList.add(w1);
        weatherEntityList.add(w2);
        weatherEntityList.add(w3);
        weatherEntityList.add(w4);

        weatherEntityList.forEach(System.out::println);

        WeatherDAO weatherDAO = WeatherDAO.getInstance();

        //create weather in database
        weatherEntityList.forEach(weatherDAO::createWeather);*/


        List<LocationEntity> locationEntityList = new ArrayList<>();
        LocationEntity l1 = LocationDTOtoEntity.locationDTOtoEntity(ApiReader.apiGet1(3400));

       // locationEntityList.add(l1);
       // locationEntityList.forEach(System.out::println);


    }
}
