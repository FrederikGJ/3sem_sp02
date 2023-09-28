package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class WeatherScraping {

    public static void main(String[] args) throws IOException {
        String url = "https://www.yr.no/nb/v%C3%A6rvarsel/daglig-tabell/2-2618468/Danmark/Region%20Hovedstaden/Lyngby-T%C3%A5rb%C3%A6k/Kgs.%20Lyngby";

        try {
            // Send a GET request to the URL
            Document doc = Jsoup.connect(url).userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 " + "(KHTML, like Gecko) Chrome/94.0.4606.81 Safari/537.36").get();

            // Find the element containing the weather forecast
            Elements forecastContainer = doc.getElementsByClass("daily-weather-list-item");

            for (int i = 0; i < 10; i++){
               Element weatherSection =  doc.getElementById("dailyWeatherListItem" + i);
                String dato = String.valueOf(weatherSection.select(".daily-weather-list-item__temperature"));
                System.out.println(dato);

            }

            //System.out.println(forecastContainer);


        } catch (IOException e) {
            System.err.println("Failed to retrieve the webpage: " + e.getMessage());
        }
    }
}