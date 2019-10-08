package com.howtodoinjava.demo.spring.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.howtodoinjava.demo.spring.dao.CardsDao;
import com.howtodoinjava.demo.spring.model.Cards;

@Service
public class CardsServiceImp implements CardsService {

   @Autowired
   private CardsDao cardsDao;
   

	public void setCardsDAO(CardsDao cardsDao) {
		this.cardsDao = cardsDao;
	}

   @Override
   @Transactional(readOnly = true)
   public Cards findPanNumber(String panNumber) {
	   
	   System.out.println("inside service" + panNumber);
      return this.cardsDao.findPanNumber(panNumber);
   }


}
