package com.myapp.check_credit_score.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myapp.check_credit_score.dao.CardsDao;
import com.myapp.check_credit_score.model.Cards;

@Service
public class CardsServiceImp implements CardsService {

   @Autowired
   private CardsDao cardsDao;
   
   @Transactional(readOnly = true)
   public Cards findPanNumber(String panNumber) {
	   
	   System.out.println("inside service" + panNumber);
      return this.cardsDao.findPanNumber(panNumber);
   }


}
