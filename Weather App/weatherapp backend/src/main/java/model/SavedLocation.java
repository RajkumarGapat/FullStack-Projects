package model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class SavedLocation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String label;
    private String latitude;
    private String longitude;
}