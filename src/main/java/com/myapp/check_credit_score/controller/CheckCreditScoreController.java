package com.myapp.check_credit_score.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.myapp.check_credit_score.model.Cards;

import org.springframework.ui.ModelMap;
import com.myapp.check_credit_score.service.CardsService;


@Controller
public class CheckCreditScoreController {
	    
	
	 	@Autowired
	    private CardsService cardsService;
    

	   @RequestMapping(value = "/", method = RequestMethod.GET)
	   public ModelAndView index() {
	      return new ModelAndView("Index", "command", new Cards());
	   }
	   
	   @RequestMapping(value = "/checkEligibility", method = RequestMethod.POST)
	   public String checkEligibility(@ModelAttribute("card")Cards card, 
	   ModelMap model) {
		   
		   Cards c = new Cards();
		   
		   System.out.println("inside controller" + card.getPanNumber());
		   
		   c = this.cardsService.findPanNumber(card.getPanNumber());
		   
		   if( null != c) {
			   
			   if(c.getcreditScore() >=  5 ) {
				   return "Eligible" ;
			   } 
			   
			   else  {
				   return "NotEligible" ;
			   }
			  
		   }
		   else {
			   
			   return "Invalid" ;
		   }
		   
	   
	     
	   }
}

