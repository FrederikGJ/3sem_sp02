package model;

import DTO.LocationDTO;

public class LocationDTOtoEntity {

    public static LocationEntity locationDTOtoEntity(LocationDTO locationDTO) {
        LocationEntity locationEntity =new LocationEntity();
        locationEntity.setDagiId(locationDTO.getCurrentData().getDagiId());
        locationEntity.setKode(locationDTO.getKode());
        locationEntity.setNavn(locationDTO.getCurrentData().getNavn());
        locationEntity.setNuts2(locationDTO.getCurrentData().getNuts2());
        locationEntity.setHref(locationDTO.getCurrentData().getHref());

        return locationEntity;
    }
}