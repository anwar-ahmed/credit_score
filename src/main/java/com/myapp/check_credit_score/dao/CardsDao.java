package com.myapp.check_credit_score.dao;

import  com.myapp.check_credit_score.model.Cards;

public interface CardsDao {
   public Cards findPanNumber(String panNumber);
}
