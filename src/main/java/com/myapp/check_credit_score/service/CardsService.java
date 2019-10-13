package com.myapp.check_credit_score.service;


import  com.myapp.check_credit_score.model.Cards;


public interface CardsService {
	   
	   public Cards findPanNumber(String panNumber);
}