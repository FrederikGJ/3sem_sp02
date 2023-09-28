import DTO.YrWeatherDTO;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class WeatherScraping {

public static YrWeatherDTO scraping() throws IOException {
        String url = "https://www.yr.no/nb/v%C3%A6rvarsel/daglig-tabell/2-2618468/Danmark/Region%20Hovedstaden/Lyngby-T%C3%A5rb%C3%A6k/Kgs.%20Lyngby";
        String cssSelector = "span.temperature.temperature--warm";

        Document document = null;

        try {
            document = Jsoup.connect(url).get();

            Elements temperatureElements = document.select(cssSelector);
           // Element temperature = temperatureElements.first();
            Element temperatureElement = temperatureElements.first();

            if (temperatureElement != null) {
                String temperatureText = temperatureElement.text();
                YrWeatherDTO yrWeatherDTO = new YrWeatherDTO();
                yrWeatherDTO.getCurrentData2().setTemperature(temperatureText);
                return yrWeatherDTO;
            } else {
                return null; // Element not found, return null
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}