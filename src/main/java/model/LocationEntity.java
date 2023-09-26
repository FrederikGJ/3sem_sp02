package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;



@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class LocationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private String id;
        private String hovedtype;
        private String undertype;
        private String primærtnavn;
        private String primærnavnestatus;
        private String ændret;
        private String geo_ændret;
        private int geo_version;
}





