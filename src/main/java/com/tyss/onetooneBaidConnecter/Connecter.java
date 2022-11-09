package com.tyss.onetooneBaidConnecter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.onetooneBaid.AdharCard;
import com.tyss.onetooneBaid.Person;

public class Connecter {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("punith");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		AdharCard adharCard=new AdharCard();
		adharCard.setName("raj");
		adharCard.setAddress("Hassan");
		adharCard.setAdharCardNo(386612052);
		adharCard.setPin("573115");
		
		Person person=new Person();
		person.setAddress("hassan");
		person.setMotherName("surya");
		person.setFathername("chandramma");
		person.setName("raj");
		person.setAdharCard(adharCard);
		
		entityTransaction.begin();
		
		entityManager.persist(adharCard);
		entityManager.persist(person);
		
		entityTransaction.commit();
		
	}
}
