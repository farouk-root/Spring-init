package tn.esprit.intispring.entities;
import jakarta.persistence.*;


import java.io.Serializable;


@Entity
@Table(name = "registration")
public class Registration implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numRegistration")
    private long numRegistration;

    @Column(name = "numWeek")
    private int numWeek;

}
