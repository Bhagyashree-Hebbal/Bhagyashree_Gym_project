package com.xworkz.gym.repository;

import com.xworkz.gym.controller.FollowUpController;
import com.xworkz.gym.dto.RegistrationDTO;
import com.xworkz.gym.entity.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
@Slf4j
public class GymRepositoryImpl implements GymRepository {

    @Autowired
    EntityManagerFactory emf;

//    @Override
//    public boolean
//    save(AdminEntity adminEntity) {
//        System.out.println("running save in GymRepositoryImpl");
//        EntityManager em = emf.createEntityManager();
//        EntityTransaction et = em.getTransaction();
//        try {
//            et.begin();
//
//            et.commit();
//        }catch (Exception e){
//            if (et.isActive()){
//                et.rollback();
//            }
//        }finally {
//            em.close();
//        }
//        return true;
//    }

    @Override
    public boolean getValue(String email, String password) {
        System.out.println("getName query in GymRepositoryImpl");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            Query query = em.createNamedQuery("getEmailAndPassword");
            query.setParameter("setEmail", email);
            query.setParameter("setPassword", password);
            Object pass = query.getSingleResult();
            et.commit();

            if (pass != null) {
                System.out.println("result is not null");
                return true;
            }
            System.out.println("It is Null");
            return false;

        } catch (Exception e) {
            if (et.isActive()) {
                et.rollback();
            }
            return false;
        } finally {
            em.close();
        }
        //return true;
    }

    @Override
    public Long getCountByAdminEmail(String email) {
        EntityManager em = emf.createEntityManager();
        Long count = 0L;
        try {
            count = (Long) em.createNamedQuery("countByAdminEmail").setParameter("SetEmail", email).getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
        return count;
    }

    //Admin Ajax
    @Override
    public Long getCountByAdminPassword(String password) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        Long count = (Long) em.createNamedQuery("countByAdminPassword").setParameter("SetPassword",password).getSingleResult();
        try {
            et.begin();
            et.commit();
        } catch (Exception e){
            if(et.isActive()){
                et.rollback();
            }
        }finally {
            em.close();
        }
        return count;
    }


    @Override
    public Long getCountByName(String name) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        Long count = (Long) em.createNamedQuery("countByName").setParameter("SetName", name).getSingleResult();

        try {
            et.begin();
            et.commit();
        } catch (Exception e) {
            if (et.isActive()) {
                et.rollback();
            }
        } finally {
            em.close();
        }
        return count;
    }

    @Override
    public Long getCountByArea(String area) {
        EntityManager em = emf.createEntityManager();
        Long count = 0L;
        try {
            count = (Long) em.createNamedQuery("countByArea").setParameter("SetArea", area).getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
        return count;
    }

    @Override
    public Long getCountByPhoneNo(long phoneNo) {
        EntityManager em = emf.createEntityManager();
        Long count = 0L;
        try {
            count = (Long) em.createNamedQuery("countByPhoneNo").setParameter("SetPhoneNo", phoneNo).getSingleResult();
        } catch (Exception e) {
            e.printStackTrace(); // Log the error
        } finally {
            em.close();
        }
        return count;
    }

    @Override
    public Long getCountByDistance(double distance) {
        EntityManager em = emf.createEntityManager();
        Long count = 0L;
        try {
            count = (Long) em.createNamedQuery("countByDistance").setParameter("SetDistance", distance).getSingleResult();
        } catch (Exception e) {
            e.printStackTrace(); // Log the error
        } finally {
            em.close();
        }
        return count;
    }

    @Override
    public Long getCountByAge(int age) {
        EntityManager em = emf.createEntityManager();
        Long count = 0L;
        try {
            count = (Long) em.createNamedQuery("countByAge").setParameter("SetAge", age).getSingleResult();
        } catch (Exception e) {
            e.printStackTrace(); // Log the error
        } finally {
            em.close();
        }
        return count;
    }

    @Override
    public Long getCountByRegiName(String name) {
        EntityManager em = emf.createEntityManager();
        Long count = 0L;
        try {
            count = (Long) em.createNamedQuery("countByRegiName").setParameter("SetName", name).getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
        return count;
    }

    @Override
    public Long getCountByRegiEmail(String email) {
        EntityManager em = emf.createEntityManager();
        Long count = 0L;
        try {
            count = (Long) em.createNamedQuery("countByRegiEmail").setParameter("SetEmail", email).getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
        return count;
    }

    @Override
    public Long getCountByRegiPhoneNo(long phoneNo) {
        EntityManager em = emf.createEntityManager();
        Long count = 0L;
        try {
            count = (Long) em.createNamedQuery("countByRegiPhoneNo").setParameter("SetPhoneNo", phoneNo).getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
        return count;
    }

    @Override
    public Long getCountByGymName(String gymName) {
        EntityManager em = emf.createEntityManager();
        Long count = 0L;
        try {
            count = (Long) em.createNamedQuery("countByGymName").setParameter("SetGymName", gymName).getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
        return count;
    }

    @Override
    public Long getCountByTrainer(String gymTrainer) {
        EntityManager em = emf.createEntityManager();
        Long count = 0L;
        try {
            count = (Long) em.createNamedQuery("countByGymTrainer").setParameter("SetGymTrainer", gymTrainer).getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
        return count;
    }


    @Override
    public boolean enquirySave(EnquiryEntity enquiryEntity) {
        System.out.println("running enquirySave in GymRepositoryImpl");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            em.persist(enquiryEntity);
            et.commit();
        } catch (Exception e) {
            if (et.isActive()) {
                et.rollback();
            }
        } finally {
            em.close();
        }
        return true;
    }

    @Override
    public List<EnquiryEntity> findAll() {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        String query = "SELECT e FROM EnquiryEntity e";
        return em.createQuery(query, EnquiryEntity.class).getResultList();
    }



    @Override
    public List<EnquiryEntity> findByStatus(String status) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        String query = "SELECT e FROM EnquiryEntity e WHERE e.status = :status";
        return em.createQuery(query, EnquiryEntity.class).setParameter("status", status).getResultList();
    }

//    @Override
//    public boolean followUpSave(FollowUpEntity followUpEntity) {
//        System.out.println("running followUpSave in GymRepositoryImpl");
//        EntityManager em = emf.createEntityManager();
//        EntityTransaction et = em.getTransaction();
//        try {
//            et.begin();
//            em.merge(followUpEntity);
//            et.commit();
//        } catch (Exception e) {
//            if (et.isActive()) {
//                et.rollback();
//            }
//        } finally {
//            em.close();
//        }
//        return true;
//    }

    @Override
    public boolean updateStatusAndReason(String name, String status, String reasons) {
        System.out.println("Running updateStatusAndReason in GymRepositoryImpl");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        //boolean isUpdated = false;

        try {
            et.begin(); // Start the transaction

            // JPQL update query
            String query = "UPDATE EnquiryEntity e SET e.status = :status, e.reasons = :reasons WHERE e.name = :name";
            int rowsAffected = em.createQuery(query)
                    .setParameter("status", status)
                    .setParameter("reasons", reasons)
                    .setParameter("name", name)
                    .executeUpdate();

            et.commit(); // Commit the transaction if successful
            //isUpdated = true; // Return true if at least one row was updated
        } catch (Exception e) {
            if (et.isActive()) {
                et.rollback(); // Rollback the transaction if there is an error
            }
            e.printStackTrace(); // Log the exception
        } finally {
            em.close(); // Ensure EntityManager is closed
        }

        return true;
    }

    @Override
    public EnquiryEntity getEnquiryEntityByName(String name) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        String queryStr = "SELECT e FROM EnquiryEntity e WHERE e.name = :setName";
        EnquiryEntity result = null;

        try {
            et.begin();
            Query query = em.createQuery(queryStr);
            query.setParameter("setName", name);

            result = (EnquiryEntity) query.getSingleResult();
            et.commit();
        } catch (Exception e) {
            if (et.isActive()) {
                et.rollback();
            }
            e.printStackTrace();  // Log the exception
        } finally {
            em.close();
        }

        return result;  // Will be null if no result or multiple results were found
    }



    @Override
    public boolean saveView(FollowUpViewEntity followUpViewEntity) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try{
            et.begin();
            em.persist(followUpViewEntity);
            et.commit();
        }catch (Exception e){
            if(et.isActive()){
                et.rollback();
            }
        }finally {
            em.close();
        }
        return true;
    }

    @Override
    public List<FollowUpViewEntity> getAll(int enquiryId) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        List<FollowUpViewEntity> list = null;

        try {

            List<FollowUpViewEntity> result = em.createNamedQuery("getAllData").setParameter("setEnquiryId",enquiryId).getResultList();
            System.out.println("viewDetails in repo======"+result);
            return result;

        } catch (Exception e) {
           e.getMessage();
        } finally {
            em.close();
        }
        return Collections.emptyList();
    }

    @Override
    public boolean registrationSave(RegistrationEntity registrationEntity) {
        System.out.println("running registrationSave in GymRepositoryImpl");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            em.merge(registrationEntity);
            et.commit();
        } catch (Exception e) {
            if (et.isActive()) {
                et.rollback();
            }
        } finally {
            em.close();
        }
        return true;
    }

    @Override
    public RegistrationEntity updateRegistration(String name, long phoneNo) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        String queryStr = "SELECT e FROM RegistrationEntity e WHERE e.name = :name AND e.phoneNo = :phoneNo";
        RegistrationEntity result = null;

        try {
            et.begin();
            Query query = em.createQuery(queryStr);
            query.setParameter("name", name);
            query.setParameter("phoneNo", phoneNo);
            result = (RegistrationEntity) query.getSingleResult();
            et.commit();
        } catch (Exception e) {
            System.err.println("Error in updateRegistration: " + e.getMessage());
            if (et.isActive()) {
                et.rollback();
            }
        } finally {
            em.close();
        }

        return result;
    }





    //USER login
//    @Override
//    public RegistrationEntity userSave(String email,String password) {
//        System.out.println("running userSave in GymRepositoryImpl"+email);
//        EntityManager em = emf.createEntityManager();
//        EntityTransaction et = em.getTransaction();
//        try {
//            et.begin();
//            Object result = em.createNamedQuery("getEmailPassword").setParameter("emailBy",email).setParameter("passwordBy",password).getSingleResult();
////            log.info("In repo--"+result);
//            System.out.println("in repository the result from datbase.....:"+result);
//            et.commit();
//            return (RegistrationEntity) result;
//        }catch (Exception e){
//            if (et.isActive()){
//                et.rollback();
//            }
//            System.out.println("getting exception....from repo.."+e.getMessage());
//            return null;
//        }finally {
//            em.close();
//        }
//    }


    //USER login
    @Override
    public RegistrationEntity userSave(String email) {
        System.out.println("running userSave in GymRepositoryImpl"+email);
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        RegistrationEntity entity = null;
        try {
            Query query = em.createNamedQuery("getAllByEmail");
            query.setParameter("byEmail", email);

            entity = (RegistrationEntity) query.getSingleResult();
            System.out.println("Entity from repository " + entity.toString());

        } catch (Exception e) {
            e.getStackTrace();
            return null;
        } finally {
            em.close();
        }
        return entity;

    }

    @Override
    public void updateCount(String email, int count) {
        int result = count + 1;
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        int value;
        try {
            et.begin();
            value = em.createNamedQuery("updateCount").setParameter("setCount", result).setParameter("byEmail", email).executeUpdate();
            et.commit();
        } catch (Exception e) {
            if (et.isActive()) {
                et.rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    @Override
    public boolean resetCount(String email, int count) {
        int result = 0;
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        int value = 0;
        try {
            et.begin();
            value = em.createNamedQuery("resetCount").setParameter("setCount", 0).setParameter("byEmail", email).executeUpdate();
            et.commit();
        } catch (Exception e) {
            if (et.isActive()) {
                et.rollback();
            }
        } finally {
            em.close();
        }
        if (value > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String updateLockedAccountTimeByEmail(String email) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try{
            et.begin();
            Query query = em.createNamedQuery("accountLockedTimeByEmail");
            query.setParameter("accountLockedTimeBy", LocalDateTime.now());
            query.setParameter("emailBy",email);

            int value = query.executeUpdate();
            et.commit();

            if(value > 0){
                System.out.println("Account lock time is set to current time");
            }else{
                System.out.println("Failed to set account lock time");
            }
        }catch (Exception e){
            if(et.isActive()){
                et.rollback();
            }
        }finally {
            em.close();
        }
        return "Account lock time is set";
    }

    @Override
    public String updatePasswordByName(String newPassword,String name) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            et.begin();
            System.out.println("name::" + name);
            System.out.println("newPassword::" + newPassword);

            // Assuming "updatePasswordByName" is a named query in the UserEntity class
            Query query = em.createNamedQuery("updatePasswordByName");
            query.setParameter("setNewPassword", newPassword);
            query.setParameter("setCount", 0);
            query.setParameter("nameBy", name);

            int value = query.executeUpdate(); // Call executeUpdate on the Query object
            et.commit();

            if (value > 0) {
                return "password updated successfully";
            } else {
                return "Password is not updated";
            }
        } catch (Exception e) {
            if (et.isActive()) {
                et.rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
        }
        return "password updated successfully";
    }

    //forget password
    @Override
    public String resetPasswordByEmail(String email, String newPassword) {
        System.out.println("Entering repository resetPasswordByEmail");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try{
            et.begin();

            Query query = em.createNamedQuery("resetPasswordByEmail");
            query.setParameter("setNewPassword",newPassword);
            query.setParameter("emailBy",email);

            int value = query.executeUpdate();
            et.commit();

            System.out.println("Rows affected:" +value);

            if(value>0){
                return "password updated successfully";
            }else {
                return "Password Updated";
            }
        }catch(Exception e){
            if(et.isActive()){
                et.rollback();
            }
        }finally{
            em.close();
        }
        return "password updated successfully";
    }

    //Update Profile
    @Override
    public List<RegistrationEntity> getAllRegisteredUserDetailsById(int registrationId) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        List<RegistrationEntity> list=em.createNamedQuery("getAllRegDetailsById",RegistrationEntity.class).
                setParameter("getRegistrationId",registrationId).getResultList();
        try {
            et.begin();
            em.merge(list);
            et.commit();
        } catch (Exception e) {
            if (et.isActive()) {
                et.rollback();
            }
        } finally {
            em.close();
        }
        System.out.println(list);
        return list;
    }

    @Override
    public RegistrationDTO updateUserProfile(String name,RegistrationDTO registrationDTO, String filePath) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        int value=0;
        try {
            et.begin();
            value=em.createNamedQuery("updateUserProfileByName")
                    .setParameter("getAge",registrationDTO.getAge())
                    .setParameter("getHeight",registrationDTO.getHeight())
                    .setParameter("getWeight",registrationDTO.getWeight())
                    .setParameter("getFilePath",filePath)
                    .setParameter("getName",name).executeUpdate();

            et.commit();
        } catch (Exception e) {
            if (et.isActive()) {
                et.rollback();
            }
        } finally {
            em.close();
        }
        return null;
    }

    //Slots and Trainers Name
    @Override
    public boolean saveSlots(SlotTimingsEntity slotTimings) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            em.persist(slotTimings);
            et.commit();
            return true;
        } catch (Exception e) {
            if (et.isActive()) {
                et.rollback();
            }
            e.printStackTrace();
            return false;
        } finally {
            em.close();
        }
    }

    @Override
    public List<SlotTimingsEntity> findAllSlots() {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            et.begin();
            Query query = em.createNamedQuery("getSlotList");
            List<SlotTimingsEntity> result = query.getResultList();
            et.commit();
            return result;

        } catch (Exception e) {
            if (et.isActive()) {
                et.rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
        }
        return null;
    }

    @Override
    public boolean saveTrainerDetails(TrainerInfoEntity entity) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            em.persist(entity);
            et.commit();
            return true;
        } catch (Exception e) {
            if (et.isActive()) {
                et.rollback();
            }
            e.printStackTrace();
            return false;
        } finally {
            em.close();
        }
    }



    @Override
    public List<TrainerInfoEntity> findAllTrainerList() {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        List<TrainerInfoEntity> result=null;

        try {
            et.begin();
            Query query = em.createNamedQuery("GetTrainerInfoList");
            result = query.getResultList();
            et.commit();
            return result;
        } catch (Exception e) {
            if (et.isActive()) {
                et.rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
        }
        return result;
    }
}

