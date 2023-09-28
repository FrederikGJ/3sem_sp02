package DTO;

import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class YrWeatherDTO {
    private String LocationName;
    private WeatherDTO.CurrentDataDTO CurrentData2;

    @Override
    public String toString() {
        return "WeatherDTO(locationName=" + LocationName + ", temperature=" + CurrentData2.getTemperature() +")";
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @Setter
    @Builder
    public static class CurrentDataDTO2 {
        private String temperature;

    }
}
