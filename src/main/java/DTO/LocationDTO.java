package DTO;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class LocationDTO {
    private String LocationName;
    private CurrentDataDTO CurrentData;

    @Override
    public String toString() {
        return "LocationDTO{" +
                "LocationName='" + LocationName + '\'' +
                ", CurrentData=" + CurrentData +
                '}';
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @Setter
    @Builder
    public static class CurrentDataDTO{
        private String id;
        private String hovedtype;
        private String undertype;
        private String primærtnavn;
        private String primærnavnestatus;
        private String ændret;
        private String geo_ændret;
        private int geo_version;


    }
}
