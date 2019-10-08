package com.howtodoinjava.demo.spring.dao;

import com.howtodoinjava.demo.spring.model.Cards;

public interface CardsDao {
   public Cards findPanNumber(String panNumber);
}
