package com.xworkz.gym.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "enquiry_followup_table")
@RequiredArgsConstructor
//@NamedQuery(name = "findAll", query = "select ue from FollowUpEntity ue where ue.reasons = :setReasons and ue.status = :setStatus")
public class FollowUpEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String reasons;
    private String status;
}
