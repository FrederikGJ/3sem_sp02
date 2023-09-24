import API.ApiReader;
import entity.WeatherEntity;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<WeatherEntity> weatherEntityList = new ArrayList<>();

        ApiReader.apiGet("Roskilde");
        ApiReader.apiGet("Hillerød");
        ApiReader.apiGet("Albertslund");
        ApiReader.apiGet("Amager");


        System.out.println(weatherEntityList);
    }
}
