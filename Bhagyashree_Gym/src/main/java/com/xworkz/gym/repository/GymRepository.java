package com.xworkz.gym.repository;

import com.xworkz.gym.entity.EnquiryEntity;
import com.xworkz.gym.entity.RegistrationEntity;

import java.util.List;

public interface GymRepository {
    //boolean save(AdminEntity adminEntity);
    boolean getValue(String email,String password);
    //Enquiry Ajax
    public Long getCountByName(String name);
    public Long getCountByArea(String area);
    public Long getCountByPhoneNo(long phoneNo);
    public Long getCountByDistance(double distance);
    public Long getCountByAge(int age);
    //Registration Ajax
    public Long getCountByRegiName(String name);
    public Long getCountByRegiEmail(String email);
    public Long getCountByRegiPhoneNo(long phoneNo);
    public Long getCountByGymName(String gymName);
    public Long getCountByTrainer(String gymTrainer);

    boolean enquirySave(EnquiryEntity enquiryEntity);

    //boolean followUpSave(FollowUpEntity followUpEntity);

    List<EnquiryEntity> findAll();
    List<EnquiryEntity> findByStatus(String status);
    boolean updateStatusAndReason(String name,String status,String reason);

    boolean registrationSave(RegistrationEntity registrationEntity);

    RegistrationEntity updateRegistration(String name, long phoneNo);

}
