package com.xworkz.gym.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "admin_table")
@RequiredArgsConstructor
@NamedQuery(name = "getEmailAndPassword", query = "SELECT ae.id FROM AdminEntity ae WHERE ae.email = :setEmail AND ae.password = :setPassword")
//@NamedQuery(name = "countByEmail", query = "select count(*) from AdminEntity ae where ae.email = :SetEmail")
public class AdminEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String email;
    private String password;

}
