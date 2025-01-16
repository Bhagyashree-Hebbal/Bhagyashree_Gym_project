package com.xworkz.gym.repository;

import com.xworkz.gym.entity.AdminEntity;
import com.xworkz.gym.entity.EnquiryEntity;
import com.xworkz.gym.entity.FollowUpEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.Collections;
import java.util.List;

@Repository
public class GymRepositoryImpl implements GymRepository{

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
    public boolean getName(String email, String password) {
        System.out.println("getNameByEmailAndPassword query in GymRepositoryImpl");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            Query query = em.createNamedQuery("getNameByEmailAndPassword");
            query.setParameter("setEmail",email);
            query.setParameter("setPassword",password);
            Object pass = query.getSingleResult();
            et.commit();

            if(pass != null){
                System.out.println("result is not null");
                return true;
            }
            System.out.println("It is Null");
            return false;

        }catch (Exception e){
            if (et.isActive()){
                et.rollback();
            }
            return false;
        }finally {
            em.close();
        }
        //return true;
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
    public boolean  updateStatusAndReason(String name, String status, String reasons) {
        System.out.println("Running updateStatusAndReason in GymRepositoryImpl");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        boolean isUpdated = false;

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
            isUpdated = rowsAffected > 0; // Return true if at least one row was updated
        } catch (Exception e) {
            if (et.isActive()) {
                et.rollback(); // Rollback the transaction if there is an error
            }
            e.printStackTrace(); // Log the exception
        } finally {
            em.close(); // Ensure EntityManager is closed
        }

        return isUpdated;
    }

}
