package tn.esprit.intispring.entities;
import jakarta.persistence.*;


import java.io.Serializable;
import java.util.Set;


@Entity
@Table(name = "registration")
public class Registration implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numRegistration")
    private long numRegistration;

    @Column(name = "numWeek")
    private int numWeek;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "registration")
    private Set<Skier> skiersList;

    @ManyToOne(cascade = CascadeType.ALL)
    Course course;

}
