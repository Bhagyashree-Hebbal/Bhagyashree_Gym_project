package com.xworkz.gym.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "registration_update_table")
@RequiredArgsConstructor
@ToString
@NamedQuery(name = "countByRegiName", query = "select count(*) from RegistrationEntity re where re.name = :SetName")
@NamedQuery(name = "countByRegiEmail", query = "select count(*) from RegistrationEntity re where re.email = :SetEmail")
@NamedQuery(name = "countByRegiPhoneNo", query = "select count(*) from RegistrationEntity re where re.phoneNo = :SetPhoneNo")
@NamedQuery(name = "countByGymName", query = "select count(*) from RegistrationEntity re where re.gymName = :SetGymName")
@NamedQuery(name = "countByGymTrainer", query = "select count(*) from RegistrationEntity re where re.gymTrainer = :SetGymTrainer")
//USer login and count
//@NamedQuery(name="getEmailPassword",query = "SELECT re FROM RegistrationEntity re WHERE re.email = :emailBy AND re.password = :passwordBy")
@NamedQuery(name = "getAllByEmail", query="select re from RegistrationEntity re  where re.email = :byEmail")
@NamedQuery(name = "updateCount",query="update RegistrationEntity re set re.count = :setCount where re.email = :byEmail")
@NamedQuery(name = "resetCount",query="update RegistrationEntity re set re.count = :setCount where re.email = :byEmail")

//count
@NamedQuery(name = "updatePasswordByName",query = "update RegistrationEntity re set re.password = :setNewPassword , re.count = :setCount where re.name = :nameBy")
//forget password
@NamedQuery(name = "resetPasswordByEmail", query = "update RegistrationEntity re set re.password = :setNewPassword where re.email = :emailBy")
//Update Profile
@NamedQuery(name = "getAllRegDetailsById",query = "select re from RegistrationEntity re where re.registrationId=:getRegistrationId")
@NamedQuery(name = "updateUserProfileByName", query = "UPDATE RegistrationEntity re SET re.age=:getAge,re.height=:getHeight,re.weight=:getWeight,re.filePath=:getFilePath where re.name=:getName")

public class RegistrationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "registration_id")
    private int registrationId;
    private String name;
    private String email;
    private int age;
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
    private int count;
    @Column(name = "account_locked_time")
    private LocalDateTime accountLockedTime;
    @Column(name = "file_path")
    private String filePath;
    private int height;
    private int weight;
}
