package com.example.ratingapp.application;

import com.example.ratingapp.entity.UserApp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class RatingApp {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("ratingApp");
        EntityManager manager = factory.createEntityManager();


        manager.getTransaction().begin();


        UserApp userAdmin = new UserApp();
        userAdmin.setAdmin(true);
        userAdmin.setEmail("damimiko94@gmail.com");
        userAdmin.setName("Damian");
        userAdmin.setNickname("Bajtek");
        userAdmin.setPassword("admin1234");
        userAdmin.setSurname("Mikolajczyk");

        manager.persist(userAdmin);

        UserApp user001 = new UserApp();
        user001.setAdmin(false);
        user001.setEmail("przykladowy@gmail.com");
        user001.setName("Pawel");
        user001.setNickname("Pseudo");
        user001.setPassword("qwerty");
        user001.setSurname("Kowalski");

        manager.persist(user001);





        manager.getTransaction().commit();

        manager.close();
        factory.close();
    }

}