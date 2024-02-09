package tn.esprit.intispring.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "course")

public class Course implements Serializable {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(name = "numCourse")
    private long  numCourse;
    @Column(name = "Level")
    private int Level;
    @Enumerated(EnumType.STRING)
    private TypeCourse typeCourse;

    @Enumerated(EnumType.STRING)
    private Support support;

    @Column(name = "price")
    private float price;

    @Column(name = "timeSlot")
    private String timeSlot;


}
