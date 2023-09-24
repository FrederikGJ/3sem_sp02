package entity;

import DTO.WeatherDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class WeatherEntity {

    @Id
    private Long id;
    private String locationName;
    private String temperature;
    private String forecastText;
    private String humidity;
    private String windText;

    public void watherDTOtoEntity(WeatherDTO weatherDTO) {
        this.locationName = weatherDTO.getLocationName();
        this.temperature = weatherDTO.getCurrentData().getTemperature();
        this.forecastText = weatherDTO.getCurrentData().getSkyText();
        this.humidity = weatherDTO.getCurrentData().getHumidity();
        this.windText = weatherDTO.getCurrentData().getWindText();
    }

}
