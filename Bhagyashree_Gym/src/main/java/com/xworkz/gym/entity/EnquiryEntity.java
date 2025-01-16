package com.xworkz.gym.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "enquiry_followup_table")
@RequiredArgsConstructor
public class EnquiryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String area;
    @Column(name = "phone_no")
    private long phoneNo;
    private double distance;
    private int age;
    private String status;
    private String reasons;
}
