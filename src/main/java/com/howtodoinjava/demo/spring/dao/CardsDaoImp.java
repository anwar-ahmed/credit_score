package com.howtodoinjava.demo.spring.dao;


import javax.persistence.NoResultException;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.howtodoinjava.demo.spring.model.Cards;

@Repository
public class CardsDaoImp implements CardsDao {

   @Autowired
   private SessionFactory sessionFactory;


   @Override
   public Cards findPanNumber(String panNumber) {
	   
	   Cards card;
	   
	   try {
	   
	  @SuppressWarnings("rawtypes")
	  Query query = sessionFactory.getCurrentSession().createQuery("from Cards where pan_number= :panNumber");
      query.setParameter("panNumber", panNumber.toUpperCase());
      
      card = (Cards) query.uniqueResult();
	   } catch (NoResultException e) {
		   card = null;
	}
      return card;
   }

}

