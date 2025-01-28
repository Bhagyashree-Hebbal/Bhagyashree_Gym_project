package com.xworkz.gym.repository;

import com.xworkz.gym.controller.FollowUpController;
import com.xworkz.gym.entity.EnquiryEntity;
import com.xworkz.gym.entity.FollowUpViewEntity;
import com.xworkz.gym.entity.RegistrationEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
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

//    @Override
//    public List<RegistrationEntity> findByNameAndPhoneNo(String name, Long phoneNo) {
//        EntityManager em = emf.createEntityManager();
//        String queryStr = "SELECT e FROM RegistrationEntity e WHERE e.name = :name OR e.phoneNo = :phoneNo";
//        List<RegistrationEntity> results = new ArrayList<>();
//
//        try {
//            Query query = em.createQuery(queryStr);
//            query.setParameter("name", name);
//            query.setParameter("phoneNo", phoneNo);
//            results = query.getResultList();
//        } catch (Exception e) {
//            log.error("Error in finding records: {}", e.getMessage());
//        } finally {
//            em.close();
//        }
//
//        return results;
//    }



}

