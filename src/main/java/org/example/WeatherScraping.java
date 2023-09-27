package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class WeatherScraping {

    public static void main(String[] args) {
        String url = "https://vejr.tv2.dk/vejr/koebenhavn-2618425";

        try {
            // Send a GET request to the URL
            Document doc = Jsoup.connect(url).get();

            // Find the element containing the weather forecast
            Element forecastContainer = doc.selectFirst(".forecast-extended-container");

            if (forecastContainer != null) {
                // Find all the daily forecast elements
                Elements dailyForecasts = forecastContainer.select(".day");

                // Extract and print the temperature estimate for each day
                for (Element forecast : dailyForecasts) {
                    String dayName = forecast.selectFirst(".day-name").text().trim();
                    String temperature = forecast.selectFirst(".temp").text().trim();
                    System.out.println(dayName + ": " + temperature);
                }
            } else {
                System.out.println("Weather forecast not found on the page.");
            }
        } catch (IOException e) {
            System.err.println("Failed to retrieve the webpage: " + e.getMessage());
        }
    }
}