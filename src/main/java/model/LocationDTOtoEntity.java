package model;

import DTO.LocationDTO;

public class LocationDTOtoEntity {

    public static LocationEntity locationDTOtoEntity(LocationDTO locationDTO) {
        LocationEntity locationEntity =new LocationEntity();
        locationEntity.setHovedtype(locationDTO.getCurrentData().getHovedtype());
        locationEntity.setUndertype(locationDTO.getCurrentData().getUndertype());
        locationEntity.setPrimærtnavn(locationDTO.getLocationName());
        locationEntity.setPrimærnavnestatus(locationDTO.getCurrentData().getPrimærnavnestatus());
        locationEntity.setÆndret(locationDTO.getCurrentData().getÆndret());
        locationEntity.setGeo_ændret(locationDTO.getCurrentData().getGeo_ændret());
        locationEntity.setGeo_version(locationDTO.getCurrentData().getGeo_version());
        return locationEntity;
    }
}