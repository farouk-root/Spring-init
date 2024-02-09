package tn.esprit.intispring.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "piste")
public class Piste implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numPiste")
    private long numPiste;

    @Column(name = "namePiste")
    private String namePiste;

    @Enumerated(EnumType.STRING)
    private Color color;

    @Column(name = "length")
    private int length;

    @Column(name = "slope")
    private int slope;

}
