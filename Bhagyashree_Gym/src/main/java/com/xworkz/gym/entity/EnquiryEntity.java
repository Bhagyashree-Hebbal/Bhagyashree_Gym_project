package com.xworkz.gym.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "enquiry_followup_table")
@RequiredArgsConstructor
@NamedQuery(name = "countByName" , query ="select count(*) from EnquiryEntity ae where ae.name = :SetName")
@NamedQuery(name = "countByArea", query = "select count(*) from EnquiryEntity ae where ae.area = :SetArea")
@NamedQuery(name = "countByPhoneNo", query = "select count(*) from EnquiryEntity ae where ae.phoneNo = :SetPhoneNo")
@NamedQuery(name = "countByDistance", query = "select count(*) from EnquiryEntity ae where ae.distance = :SetDistance")
@NamedQuery(name = "countByAge", query = "select count(*) from EnquiryEntity ae where ae.age = :SetAge")
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
