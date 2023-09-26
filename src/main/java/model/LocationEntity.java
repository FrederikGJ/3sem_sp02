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
    private int id;
    private String dagiId;
    private String kode;
    private String navn;
    private String nuts2;
    private String href;
}





