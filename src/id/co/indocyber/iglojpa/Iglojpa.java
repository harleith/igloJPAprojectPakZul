/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.iglojpa;

import id.co.indocyber.iglojpa.model.Person;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author zulfahmi
 */
public class Iglojpa {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("iglojpaPU");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        Person p = new Person();
        p.setName("Smith Depok");
        p.setAge(23);
        p.setSalary(245000000.0);
        
        em.persist(p);  // menyimpan ke database
        
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
    
}
