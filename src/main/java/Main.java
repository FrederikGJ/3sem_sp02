import controller.ApiReader;
import model.LocationDTOtoEntity;
import model.LocationEntity;
import model.WatherDTOtoEntity;
import model.WeatherEntity;
import repository.LocationDAO;
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

        weatherEntityList.forEach(System.out::println);

        WeatherDAO weatherDAO = WeatherDAO.getInstance();

        //create weather in database
        weatherEntityList.forEach(weatherDAO::createWeather);


        List<LocationEntity> locationEntityList = new ArrayList<>();

        LocationEntity l1 = LocationDTOtoEntity.locationDTOtoEntity(ApiReader.apiGet1(2300));
        LocationEntity l2 = LocationDTOtoEntity.locationDTOtoEntity(ApiReader.apiGet1(4000));
        LocationEntity l3 = LocationDTOtoEntity.locationDTOtoEntity(ApiReader.apiGet1(2620));
        LocationEntity l4 = LocationDTOtoEntity.locationDTOtoEntity(ApiReader.apiGet1(3400));
        LocationEntity l5 = LocationDTOtoEntity.locationDTOtoEntity(ApiReader.apiGet1(3600));
        LocationEntity l6 = LocationDTOtoEntity.locationDTOtoEntity(ApiReader.apiGet1(3700));
        LocationEntity l7 = LocationDTOtoEntity.locationDTOtoEntity(ApiReader.apiGet1(4600));
        LocationEntity l8 = LocationDTOtoEntity.locationDTOtoEntity(ApiReader.apiGet1(4800));
        LocationEntity l9 = LocationDTOtoEntity.locationDTOtoEntity(ApiReader.apiGet1(5000));
        LocationEntity l10 = LocationDTOtoEntity.locationDTOtoEntity(ApiReader.apiGet1(5200));
        LocationEntity l11 = LocationDTOtoEntity.locationDTOtoEntity(ApiReader.apiGet1(5500));

        locationEntityList.add(l1);
        locationEntityList.add(l2);
        locationEntityList.add(l3);
        locationEntityList.add(l4);
        locationEntityList.add(l5);
        locationEntityList.add(l6);
        locationEntityList.add(l7);
        locationEntityList.add(l8);
        locationEntityList.add(l9);
        locationEntityList.add(l10);
        locationEntityList.add(l11);

        locationEntityList.forEach(System.out::println);

        //create location in database

        LocationDAO locationDAO = LocationDAO.getInstance();

        locationEntityList.forEach(locationDAO::createLocation);
    }
}
