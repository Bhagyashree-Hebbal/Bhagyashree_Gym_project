package com.xworkz.gym.repository;

import com.xworkz.gym.dto.EnquiryDTO;
import com.xworkz.gym.dto.FollowUpDTO;
import com.xworkz.gym.entity.AdminEntity;
import com.xworkz.gym.entity.EnquiryEntity;
import com.xworkz.gym.entity.FollowUpEntity;

import java.util.List;

public interface GymRepository {
    //boolean save(AdminEntity adminEntity);
    boolean getName(String email,String password);

    boolean enquirySave(EnquiryEntity enquiryEntity);

    //boolean followUpSave(FollowUpEntity followUpEntity);

    List<EnquiryEntity> findAll();
    List<EnquiryEntity> findByStatus(String status);

    boolean updateStatusAndReason(String name,String status,String reason);
}
