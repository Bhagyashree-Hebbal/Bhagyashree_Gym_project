package com.xworkz.gym.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
//@ToString
@EqualsAndHashCode
@Entity
@Table(name = "followup_view_table")
@RequiredArgsConstructor
@NamedQuery(name = "getAllData", query = "SELECT e FROM FollowUpViewEntity e WHERE e.enquiryEntity.enquiryId = :setEnquiryId")
public class FollowUpViewEntity extends AbstractAuditEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "followup_view_id")
    private int followUpViewId;
    private String name;
    private String area;
    @Column(name = "phone_no")
    private long phoneNo;
    private String reasons;

//    @Column(name = "enquiry_id")
//    private int enquiryId;

    @ManyToOne
    @JoinColumn(name ="enquiry_id" ,referencedColumnName = "enquiry_id")
    private EnquiryEntity enquiryEntity;


}
