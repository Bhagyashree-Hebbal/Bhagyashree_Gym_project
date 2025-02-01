package com.xworkz.gym.repository;

import com.xworkz.gym.entity.EnquiryEntity;
import com.xworkz.gym.entity.FollowUpViewEntity;
import com.xworkz.gym.entity.RegistrationEntity;

import java.util.List;

public interface GymRepository {
    //boolean save(AdminEntity adminEntity);
    boolean getValue(String email, String password);

    //Admin Ajax
    Long getCountByAdminEmail(String email);
    Long getCountByAdminPassword(String password);

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

    boolean updateStatusAndReason(String name, String status, String reason);
    //List<FollowUpViewEntity> getAll();
    EnquiryEntity getEnquiryEntityByName(String name);
    boolean saveView(FollowUpViewEntity followUpViewEntity);
    List<FollowUpViewEntity> getAll(int enquiryId);

    boolean registrationSave(RegistrationEntity registrationEntity);

    RegistrationEntity updateRegistration(String name, long phoneNo);

    //public List<RegistrationEntity> findByNameAndPhoneNo(String name, Long phoneNo);


    //USER login
    //RegistrationEntity userSave(String email,String password);
    RegistrationEntity userSave(String email);
    void updateCount(String email,int count);
    boolean resetCount(String email,int count);
    String updateLockedAccountTimeByEmail(String email);
    //reset password
    String updatePasswordByName(String newPassword,String name);
    //forget password
    String resetPasswordByEmail(String email, String newPassword);
}

