package tn.enicarthage.backend.Domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;



@Entity
@Data

public class Pack {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long idPack;
    @Column(name="nom")
    private String nom;
    @Column(name="description")
    private String description;
    @Column(name="prix")
    private double prix;
}