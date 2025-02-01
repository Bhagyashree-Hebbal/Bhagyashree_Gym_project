package com.xworkz.gym.service;

import com.xworkz.gym.constants.StatusEnum;
import com.xworkz.gym.dto.*;
import com.xworkz.gym.entity.EnquiryEntity;
import com.xworkz.gym.entity.FollowUpViewEntity;
import com.xworkz.gym.entity.RegistrationEntity;
import com.xworkz.gym.repository.GymRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.*;

@Service
@Slf4j
public class GymServiceImpl implements GymService {

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
    public boolean getValue(String email, String password) {
        System.out.println("getName in GymServiceImpl");
        boolean getNames = gymRepository.getValue(email, password);
        return getNames;
    }

    @Override
    public Long getCountByAdminEmail(String email) {
        return gymRepository.getCountByAdminEmail(email);
    }

    //Admin Ajax
    @Override
    public Long getCountByAdminPassword(String password) {
        return gymRepository.getCountByAdminPassword(password);
    }

    //Enquiry Ajax
    @Override
    public Long getCountByName(String name) {
        Long count = gymRepository.getCountByName(name);
        return count;
    }

    @Override
    public Long getCountByArea(String area) {
        return gymRepository.getCountByArea(area);
    }

    @Override
    public Long getCountByPhoneNo(long phoneNo) {
        return gymRepository.getCountByPhoneNo(phoneNo);
    }

    @Override
    public Long getCountByDistance(double distance) {
        return gymRepository.getCountByDistance(distance);
    }

    @Override
    public Long getCountByAge(int age) {
        return gymRepository.getCountByAge(age);
    }

    @Override
    public Long getCountByRegiName(String name) {
        return gymRepository.getCountByRegiName(name);
    }

    @Override
    public Long getCountByRegiEmail(String email) {
        return gymRepository.getCountByRegiEmail(email);
    }

    @Override
    public Long getCountByRegiPhoneNo(long phoneNo) {
        return gymRepository.getCountByRegiPhoneNo(phoneNo);
    }

    @Override
    public Long getCountByGymName(String gymName) {
        return gymRepository.getCountByGymName(gymName);
    }

    @Override
    public Long getCountByTrainer(String gymTrainer) {
        return gymRepository.getCountByTrainer(gymTrainer);
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
        if (enquirySaved) {
            return true;
        } else {
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
    public boolean updateStatusAndReason(String name, String status, String reason) {
        System.out.println("------upstAnRe----in sevuce---");
        boolean saved = gymRepository.updateStatusAndReason(name, status, reason);
        EnquiryEntity enquiryEntity =gymRepository.getEnquiryEntityByName(name);
        FollowUpViewEntity followUpViewEntity = new FollowUpViewEntity();
        followUpViewEntity.setName(enquiryEntity.getName());
        followUpViewEntity.setArea(enquiryEntity.getArea());
        followUpViewEntity.setPhoneNo(enquiryEntity.getPhoneNo());
        followUpViewEntity.setReasons(enquiryEntity.getReasons());
        followUpViewEntity.setEnquiryEntity(enquiryEntity);
        followUpViewEntity.setUpdatedDate(LocalDateTime.now());

        gymRepository.saveView(followUpViewEntity);
        if (saved)
            return true;
        return false;
    }

    @Override
    public boolean saveView(FollowUpViewDTO followUpViewDTO) {
        log.info("saveview in serviceImpl");
        FollowUpViewEntity entity = new FollowUpViewEntity();
        boolean savedView = gymRepository.saveView(entity);
        if (savedView) {
            System.out.println("saved view page in savice");
            return true;
        }else{
            System.out.println("Not saveView");
            return false;
        }
    }


    @Override
    public List<FollowUpViewEntity> getAllFollowup(int enquiryId) {
        System.out.println("viewDtails in service============"+gymRepository.getAll(enquiryId));
        return gymRepository.getAll(enquiryId);
    }

    @Override
    public boolean registrationSave(RegistrationDTO registrationDTO) {
        System.out.println("running registrationSave in GymServiceImpl");
        RegistrationEntity registrationEntity = new RegistrationEntity();
        registrationEntity.setName(registrationDTO.getName());
        registrationEntity.setEmail(registrationDTO.getEmail());
        //registrationEntity.setPassword(registrationDTO.getPassword());
        registrationEntity.setPhoneNo(registrationDTO.getPhoneNo());
        registrationEntity.setGymName(registrationDTO.getGymName());
        registrationEntity.setGymPackage(registrationDTO.getGymPackage());
        registrationEntity.setGymTrainer(registrationDTO.getGymTrainer());
        registrationEntity.setAmount(registrationDTO.getAmount());
        registrationEntity.setDiscount(registrationDTO.getDiscount());
        registrationEntity.setInstallment(registrationDTO.getInstallment());
        registrationEntity.setPaidAmount(registrationDTO.getPaidAmount());
        registrationEntity.setBalance(registrationDTO.getBalance());
        registrationEntity.setCount(-1);
        //registrationEntity.setAccountLockedTime(LocalDateTime.now());
        // Generate and set a random password
        String randomPassword = generateRandomPassword();
        registrationEntity.setPassword(randomPassword);

        boolean isResponse = gymRepository.registrationSave(registrationEntity);
        if (isResponse) {
            // Send the email with the random password
            saveEmail(registrationDTO.getEmail(), randomPassword);
        }

        return isResponse;
    }

    // generated random password
    public static String generateRandomPassword() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < 8; i++) {
            int randomIndex = random.nextInt(characters.length());
            password.append(characters.charAt(randomIndex));
        }

        return password.toString();
    }

    @Override
    public boolean saveEmail(String email, String password) {

        System.out.println(email + password);
        final String username = "hebbalbhagya304@gmail.com";
        final String userPassword = "ukxf fmhi hjte qaes";

        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true"); //TLS
        prop.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        System.out.println("=================================================");
        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, userPassword);
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(email)
            );
            message.setSubject("Your password");
            message.setText("your password : " + password);

            Transport.send(message);

            System.out.println("Done");

        } catch (MessagingException e) {
            e.printStackTrace();
        }

        return true;
    }

    @Override
    public boolean updateRegistration(RegistrationDTO registrationDTO, String name, long phoneNo) {
        // Query the database for an existing record using name and phone number
        RegistrationEntity entity = gymRepository.updateRegistration(name, phoneNo);

        if (entity != null) {
            // Update the existing entity with new values from the DTO
            entity.setGymPackage(registrationDTO.getGymPackage());
            entity.setGymTrainer(registrationDTO.getGymTrainer());
            entity.setAmount(registrationDTO.getAmount());
            entity.setBalance(registrationDTO.getBalance());

            // Save the updated entity back to the database
            gymRepository.registrationSave(entity);
            return true; // Successfully updated
        }

        return false; // No matching record found, no update performed
    }

//    @Override
//    public List<RegistrationDTO> searchByNameAndPhoneNo(String name, Long phoneNo) {
//        List<RegistrationEntity> entities = gymRepository.findByNameAndPhoneNo(name, phoneNo);
//
//        List<RegistrationDTO> dtos = new ArrayList<>();
//        for (RegistrationEntity entity : entities) {
//            RegistrationDTO dto = new RegistrationDTO();
//            dto.setName(entity.getName());
//            dto.setPhoneNo(entity.getPhoneNo());
//            dto.setGymPackage(entity.getGymPackage());
//            dto.setGymTrainer(entity.getGymTrainer());
//            dto.setAmount(entity.getAmount());
//            dto.setBalance(entity.getBalance());
//            dtos.add(dto);
//        }
//        return dtos;
//    }


    //USER login
    @Override
    public RegistrationEntity userSave(String email, String password) {
        System.out.println("running userSave in GymServiceImpl"+email+"........"+password);
        RegistrationEntity registrationEntity=gymRepository.userSave(email);
        System.out.println("====in serive====:"+registrationEntity);
        if (registrationEntity != null) {
            System.out.println(registrationEntity.toString());
            if (password.equals(registrationEntity.getPassword()) && registrationEntity.getCount() == -1) {
                System.out.println("matches");
                return registrationEntity;
            } else if (!(password.equals(registrationEntity.getPassword())) && (registrationEntity.getCount() >= 0 && registrationEntity.getCount() < 3)) {

                gymRepository.updateCount(email, registrationEntity.getCount());
                System.out.println("password entered is wrong");
                return null;

            } else if (!(password.equals(registrationEntity.getPassword())) && registrationEntity.getCount() == 3) {
                System.out.println("locked");
                if(registrationEntity.getAccountLockedTime()==null)
                    gymRepository.updateLockedAccountTimeByEmail(email);
                return null;
            } else if (password.equals(registrationEntity.getPassword()) && (registrationEntity.getCount() < 3 && registrationEntity.getCount() > -1)) {
                boolean reset = gymRepository.resetCount(email, registrationEntity.getCount());
                if (reset)
                    return registrationEntity;
                else
                    return null;
            }
        }
        return null;
    }

    @Override
    public String updatePasswordByName(String name, String oldPassword, String newPassword, String confirmPassword) {

        if (newPassword.equals(confirmPassword)) {
            String msg = gymRepository.updatePasswordByName(newPassword, name);

        }
        return "password updated successfully";
    }

    @Override
    public String resetPasswordByEmail(String email, String newPassword, String confirmPassword) {
        System.out.println("reset password in service");
        if(newPassword.equals(confirmPassword)){
            gymRepository.userSave(email);
            return gymRepository.resetPasswordByEmail(email, newPassword);
        }
        return "password updated successfully";
    }
}
