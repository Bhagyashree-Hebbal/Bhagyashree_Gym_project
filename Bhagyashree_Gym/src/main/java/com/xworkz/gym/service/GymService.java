package com.xworkz.gym.service;

import com.xworkz.gym.dto.AdminDTO;
import com.xworkz.gym.dto.EnquiryDTO;
import com.xworkz.gym.dto.FollowUpDTO;
import com.xworkz.gym.entity.EnquiryEntity;

import java.util.List;

public interface GymService {
    //boolean save(AdminDTO adminDTO);
    boolean getName(String email,String password);

    boolean enquirySave(EnquiryDTO enquiryDTO);

    //boolean followUpSave(FollowUpDTO followUpDTO);

    List<EnquiryEntity> getEnquiries() ;
    List<EnquiryEntity> getEnquiriesByStatus(String status);

    boolean updateStatusAndReason(String name,String status, String reason);

}
