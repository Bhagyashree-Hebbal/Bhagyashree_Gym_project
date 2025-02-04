package com.xworkz.gym.repository;

import com.xworkz.gym.dto.RegistrationDTO;
import com.xworkz.gym.entity.*;

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

    //registration
    boolean registrationSave(RegistrationEntity registrationEntity);

    RegistrationEntity updateRegistration(String name, long phoneNo);



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

    //Update Profile
    List<RegistrationEntity> getAllRegisteredUserDetailsById(int registrationId);

    RegistrationDTO updateUserProfile(String name,RegistrationDTO registrationDTO, String filePath);

    //Slots and Trainers Name
    public boolean saveSlots(SlotTimingsEntity slotTimings);
    List<SlotTimingsEntity> findAllSlots();

    boolean saveTrainerDetails(TrainerInfoEntity entity);
    List<TrainerInfoEntity> findAllTrainerList();

}

