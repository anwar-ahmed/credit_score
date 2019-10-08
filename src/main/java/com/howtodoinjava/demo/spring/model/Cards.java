package com.howtodoinjava.demo.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "TBL_CARDS")
public class Cards {

   @Id
   @GeneratedValue
   @Column(name = "PAN_NUMBER")
   private String panNumber;

   @Column(name = "CREDIT_SCORE")
   private Float creditScore;
   
   public Cards() {
	   
   }
   
   public Cards(String panNumber, Float creditScore) {
       this.panNumber = panNumber;
       this.creditScore = creditScore;
   }
   

   public String getPanNumber() {
      return panNumber;
   }

   public void setPanNumber(String panNumber) {
      this.panNumber = panNumber;
   }

   public Float getcreditScore() {
      return creditScore;
   }

   public void setcreditScore(Float creditScore) {
      this.creditScore = creditScore;
   }


}
