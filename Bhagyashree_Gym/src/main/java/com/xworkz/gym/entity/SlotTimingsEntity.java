package com.xworkz.gym.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "trainer_slot_table")
@NamedQuery(name = "getSlotList", query = "SELECT e FROM SlotTimingsEntity e")
public class SlotTimingsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "start_time")
    private String startTimings;

    @Column(name = "end_time")
    private String endTimings;

    //@Column(name = "Duration")
    private String duration;

}
