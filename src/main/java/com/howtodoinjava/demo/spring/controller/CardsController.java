package com.howtodoinjava.demo.spring.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.howtodoinjava.demo.spring.model.Cards;

import org.springframework.ui.ModelMap;
import com.howtodoinjava.demo.spring.service.CardsService;


@Controller
public class CardsController {
	
	    private CardsService cardsService;
	    
	    
	    @Autowired(required=true)
		@Qualifier(value="cardsService")
	    
	    public void setCardsService(CardsService cs){
			this.cardsService = cs;
		}

	   @RequestMapping(value = "/", method = RequestMethod.GET)
	   public ModelAndView index() {
	      return new ModelAndView("index", "command", new Cards());
	   }
	   
	   @RequestMapping(value = "/checkEligibility", method = RequestMethod.POST)
	   public String checkEligibility(@ModelAttribute("card")Cards card, 
	   ModelMap model) {
		   
		   Cards c = new Cards();
		   
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

