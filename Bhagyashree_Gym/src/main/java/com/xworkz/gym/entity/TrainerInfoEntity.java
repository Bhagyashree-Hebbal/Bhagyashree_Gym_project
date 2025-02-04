package com.xworkz.gym.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="trainer_info_table")
@NamedQuery(name = "GetTrainerInfoList", query = "SELECT e FROM TrainerInfoEntity e")
public class TrainerInfoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    // @Column(name = "Name")
    private String name;
    @Column(name = "phone_no")
    private long phoneNo;
    @Column(name = "slot_timings")
    private String slotTimings;

}
