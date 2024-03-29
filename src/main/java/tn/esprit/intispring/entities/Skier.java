package tn.esprit.intispring.entities;

import jakarta.persistence.*;


import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "skier")
public class Skier implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numSkier;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "dateofBirth")
    @Temporal (TemporalType.DATE)
    private Date dateofBirth;

    @Column(name = "city")
    private String city;

    @OneToOne(cascade = CascadeType.REMOVE)
    private Subscription subscription;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Piste> pistesList;

    @ManyToOne(cascade = CascadeType.ALL)
    Registration registration;
}
