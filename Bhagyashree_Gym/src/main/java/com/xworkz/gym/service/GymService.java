package com.xworkz.gym.service;

import com.xworkz.gym.dto.AdminDTO;
import com.xworkz.gym.dto.EnquiryDTO;
import com.xworkz.gym.dto.FollowUpDTO;
import com.xworkz.gym.dto.RegistrationDTO;
import com.xworkz.gym.entity.EnquiryEntity;

import java.util.List;

public interface GymService {
    //boolean save(AdminDTO adminDTO);
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


    boolean enquirySave(EnquiryDTO enquiryDTO);

    //boolean followUpSave(FollowUpDTO followUpDTO);

    List<EnquiryEntity> getEnquiries() ;
    List<EnquiryEntity> getEnquiriesByStatus(String status);
    boolean updateStatusAndReason(String name,String status, String reason);

    boolean registrationSave(RegistrationDTO registrationDTO);
    //password to email
    boolean saveEmail(String email,String password);

    boolean updateRegistration(RegistrationDTO registrationDTO,String name, long phoneNo);


}
