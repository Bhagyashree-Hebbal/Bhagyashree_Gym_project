package com.xworkz.gym.service;

import com.xworkz.gym.constants.StatusEnum;
import com.xworkz.gym.dto.AdminDTO;
import com.xworkz.gym.dto.EnquiryDTO;
import com.xworkz.gym.dto.FollowUpDTO;
import com.xworkz.gym.entity.AdminEntity;
import com.xworkz.gym.entity.EnquiryEntity;
import com.xworkz.gym.entity.FollowUpEntity;
import com.xworkz.gym.repository.GymRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GymServiceImpl implements GymService{

    @Autowired
    public GymRepository gymRepository;
//    @Override
//    public boolean save(AdminDTO adminDTO) {
//        System.out.println("running save in GymServiceImpl ");
//        AdminEntity adminEntity = new AdminEntity();
//        adminEntity.setName(adminDTO.getName());
//        adminEntity.setEmail(adminDTO.getEmail());
//        adminEntity.setPassword(adminDTO.getPassword());
//
//        boolean saved = gymRepository.save(adminEntity);
//        if(saved){
//            return true;
//        }else {
//            return false;
//        }
//
//    }

    @Override
    public boolean getName(String email, String password) {
        System.out.println("getName in GymServiceImpl");
        boolean getNames = gymRepository.getName(email, password);
        return getNames;
    }

    @Override
    public boolean enquirySave(EnquiryDTO enquiryDTO) {
        System.out.println("running enquirySave in GymServiceImpl");
        EnquiryEntity enquiryEntity = new EnquiryEntity();
        enquiryEntity.setName(enquiryDTO.getName());
        enquiryEntity.setArea(enquiryDTO.getArea());
        enquiryEntity.setPhoneNo(enquiryDTO.getPhoneNo());
        enquiryEntity.setDistance(enquiryDTO.getDistance());
        enquiryEntity.setAge(enquiryDTO.getAge());
        enquiryEntity.setStatus(String.valueOf(StatusEnum.Enquired));

        boolean enquirySaved = gymRepository.enquirySave(enquiryEntity);
        if(enquirySaved){
            return true;
        }else {
            return false;
        }
    }

//    @Override
//    public boolean followUpSave(FollowUpDTO followUpDTO) {
//        System.out.println("running followUpSave in GymServiceImpl");
//        FollowUpEntity followUpEntity = new FollowUpEntity();
//        followUpEntity.setId(followUpDTO.getId());
//        followUpEntity.setReasons(followUpDTO.getReasons());
//        followUpEntity.setStatus(String.valueOf(StatusEnum.Interested));
//
//        gymRepository.followUpSave(followUpEntity);
//        return true;
//    }

    @Override
    public List<EnquiryEntity> getEnquiries() {
        return gymRepository.findAll();
    }

    @Override
    public List<EnquiryEntity> getEnquiriesByStatus(String status) {
        return gymRepository.findByStatus(status);
    }


    @Override
    public boolean updateStatusAndReason(String name,String status, String reason) {
        boolean saved=gymRepository.updateStatusAndReason(name,status,reason);
        if(saved)
            return  true;
        return false;
    }

}
