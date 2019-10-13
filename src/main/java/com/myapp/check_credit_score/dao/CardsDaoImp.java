package  com.myapp.check_credit_score.dao;


import javax.persistence.NoResultException;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.myapp.check_credit_score.model.Cards;

@Repository
public class CardsDaoImp implements CardsDao {

   @Autowired
   private SessionFactory sessionFactory;
   
//   @Override
   @Transactional
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

