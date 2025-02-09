package com.xworkz.gym.service;

import com.xworkz.gym.dto.*;
import com.xworkz.gym.entity.*;

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

    //password to email and Registration
    boolean saveEmail(String email, String password);
    boolean updateRegistration(RegistrationDTO registrationDTO, String name, long phoneNo);




    //USER login
    RegistrationEntity userSave(String email, String password);
    //reset password
    String updatePasswordByName(String name, String oldPassword, String newPassword,String confirmPassword);
    //forget password
    String resetPasswordByEmail(String email,String newPassword,String confirmPassword);

    //Update Profile
    List<RegistrationEntity> getAllRegisteredUserDetailsById(int registrationId);

    RegistrationDTO updateUserProfile(String name,RegistrationDTO registrationDTO, String filePath);

    //Slots and Trainers name
    public boolean saveSlots(String startTimings, String endTimings, String duration);
    public List<SlotTimingsEntity> getAllSlots();

    public boolean saveTrainerDetails(String name, long phoneNumber, String slotTimings);
    public List<TrainerInfoEntity> getAllTrainerDetails();
    //public List<TrainerInfoEntity> getTrainerById();

}
