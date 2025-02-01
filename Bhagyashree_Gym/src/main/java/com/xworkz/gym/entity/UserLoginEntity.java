//package com.xworkz.gym.entity;
//
//import lombok.Data;
//import lombok.RequiredArgsConstructor;
//
//import javax.persistence.*;
//import java.time.LocalDateTime;
//
//@Entity
//@Table(name = "userlogin_table")
//@Data
//@RequiredArgsConstructor
//@NamedQuery(name = "saveEmailAndPassword", query = "SELECT ue.userId FROM UserLoginEntity ue WHERE ue.email = :setEmail AND ue.password = :setPassword")
//public class UserLoginEntity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "user_id")
//    private int userId;
//    private String email;
//    private String password;
////    private int count;
////    @Column(name = "account_locked_time")
////    private LocalDateTime accountLockedTime;
//}
