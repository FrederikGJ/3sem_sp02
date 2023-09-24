package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

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

}
