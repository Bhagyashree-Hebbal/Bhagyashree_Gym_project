package com.xworkz.gym.service;

import com.xworkz.gym.dto.*;
import com.xworkz.gym.entity.EnquiryEntity;
import com.xworkz.gym.entity.FollowUpViewEntity;
import com.xworkz.gym.entity.RegistrationEntity;

import java.util.List;

public interface GymService {
    //boolean save(AdminDTO adminDTO);
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


    boolean enquirySave(EnquiryDTO enquiryDTO);

    //boolean followUpSave(FollowUpDTO followUpDTO);

    List<EnquiryEntity> getEnquiries();
    List<EnquiryEntity> getEnquiriesByStatus(String status);
    boolean updateStatusAndReason(String name, String status, String reason);
    //view page
    boolean saveView(FollowUpViewDTO followUpViewDTO);
    List<FollowUpViewEntity> getAllFollowup(int enquiryId);
    //List<FollowUpViewEntity> getAllEnquiries();


    boolean registrationSave(RegistrationDTO registrationDTO);

    //password to email
    boolean saveEmail(String email, String password);
    boolean updateRegistration(RegistrationDTO registrationDTO, String name, long phoneNo);

    //public List<RegistrationDTO> searchByNameAndPhoneNo(String name, Long phoneNo);


    //USER login
    RegistrationEntity userSave(String email, String password);
    //reset password
    String updatePasswordByName(String name, String oldPassword, String newPassword,String confirmPassword);
    //forget password
    String resetPasswordByEmail(String email,String newPassword,String confirmPassword);
}
