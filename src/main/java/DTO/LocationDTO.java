package DTO;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class LocationDTO {
    private String kode;
    private CurrentDataDTO CurrentData;

    @Override
    public String toString() {
        return "LocationDTO(kdoe=" + kode + ", dagiId=" + CurrentData.getDagiId() +", navn=" + CurrentData.getNavn() +
                ", nuts2=" + CurrentData.getNuts2() +  ", href=" + CurrentData.getHref();

    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @Setter
    @Builder
    public static class CurrentDataDTO{
        private String id;
        private String dagiId;
        private String navn;
        private String nuts2;
        private String href;


    }
}
