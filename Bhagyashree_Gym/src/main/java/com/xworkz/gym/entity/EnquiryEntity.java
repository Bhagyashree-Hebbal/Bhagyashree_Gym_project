package com.xworkz.gym.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "enquiry_followup_table")
@RequiredArgsConstructor
@Getter
@Setter
//@ToString
@EqualsAndHashCode
@NamedQuery(name = "countByName", query = "select count(*) from EnquiryEntity ae where ae.name = :SetName")
@NamedQuery(name = "countByArea", query = "select count(*) from EnquiryEntity ae where ae.area = :SetArea")
@NamedQuery(name = "countByPhoneNo", query = "select count(*) from EnquiryEntity ae where ae.phoneNo = :SetPhoneNo")
@NamedQuery(name = "countByDistance", query = "select count(*) from EnquiryEntity ae where ae.distance = :SetDistance")
@NamedQuery(name = "countByAge", query = "select count(*) from EnquiryEntity ae where ae.age = :SetAge")
public class EnquiryEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "enquiry_id")
    private int enquiryId;

    private String name;
    private String area;
    @Column(name = "phone_no")
    private long phoneNo;
    private double distance;
    private int age;
    private String status;
    private String reasons;

    @OneToMany(mappedBy = "enquiryEntity")
    private List<FollowUpViewEntity> followUpViewEntities = new ArrayList<>();


}
