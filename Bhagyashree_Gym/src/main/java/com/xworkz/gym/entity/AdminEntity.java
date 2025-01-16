package com.xworkz.gym.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "admin_table")
@RequiredArgsConstructor
@NamedQuery(name = "getNameByEmailAndPassword", query = "select ae.name from AdminEntity ae where ae.email = :setEmail and ae.password = :setPassword")
public class AdminEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private String password;

}
