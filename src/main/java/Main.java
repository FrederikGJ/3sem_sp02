import API.ApiReader;
import entity.WatherDTOtoEntity;
import entity.WeatherEntity;

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
    }
}
