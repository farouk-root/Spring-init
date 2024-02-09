package tn.esprit.intispring.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "subscription")
public class Subscription implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numSubscription")
    private long numSubscription;

    @Column(name = "startDate")
    @Temporal (TemporalType.DATE)
    private Date startDate;

    @Column(name = "endDate")
    @Temporal (TemporalType.DATE)
    private Date endDate;

    @Column(name = "price")
    private float price;

    @Column(name="TypeSubscription")
    private TypeSubscription typeSubscription;



}
