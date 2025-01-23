package com.xworkz.gym.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "registration_update_table")
@RequiredArgsConstructor

@NamedQuery(name = "countByRegiName" , query ="select count(*) from RegistrationEntity ae where ae.name = :SetName")
@NamedQuery(name = "countByRegiEmail", query = "select count(*) from RegistrationEntity ae where ae.email = :SetEmail")
@NamedQuery(name = "countByRegiPhoneNo", query = "select count(*) from RegistrationEntity ae where ae.phoneNo = :SetPhoneNo")
@NamedQuery(name = "countByGymName", query = "select count(*) from RegistrationEntity ae where ae.gymName = :SetGymName")
@NamedQuery(name = "countByGymTrainer", query = "select count(*) from RegistrationEntity ae where ae.gymTrainer = :SetGymTrainer")
public class RegistrationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private String password;
    @Column(name = "phone_no")
    private long phoneNo;
    @Column(name = "gym_name")
    private String gymName;
    @Column(name = "gym_package")
    private String gymPackage;
    @Column(name = "gym_trainer")
    private String gymTrainer;
    private double amount;
    private String discount;
    private int installment;
    @Column(name = "paid_amount")
    private int paidAmount;
    private double balance;
}
