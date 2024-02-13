package tn.esprit.intispring.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "instructor")
public class Instructor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numInstructor")
    private long numInstructor;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "dateofHire")
    @Temporal(TemporalType.DATE)
    private Date dateofHire;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Course> coursesList;

}
