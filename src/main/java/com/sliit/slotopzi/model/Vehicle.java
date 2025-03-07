package com.sliit.slotopzi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

//@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Vehicle {
    @Id
    @GeneratedValue
    private long vehicleId;

    @Column(unique = true)
    private String vin;

    @Column
    private String vehicleNumber;

    @Column
    private String engineNo;

    @Column
    private String chassisNo;

    @Column
    private String make;

    @Column
    private String model;

//    @Column(name = "customer_customer_id")
//    private Long customerCustomerId;

    @ManyToOne
    @JsonIgnore
    private Customer customer;

    @OneToMany(targetEntity = Repair.class, mappedBy = "vehicle", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Repair> repairs;

    @OneToMany(targetEntity = Appointment.class, mappedBy = "vehicle", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Appointment> appointments;


}
