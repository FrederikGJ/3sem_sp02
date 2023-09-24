package DTO;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class WeatherDTO {
    private String locationName;
    private String Region;
    private String temperature;
    private String forecastText;
    private String humidity;
    private String windText;
}
