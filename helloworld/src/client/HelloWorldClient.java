package client;

import domain.Message;
import util.HibernateUtil;
import org.hibernate.Session;

public class HelloWorldClient {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		Message message = new Message("thrid message form code");
		
		session.save(message);
		
		session.getTransaction().commit();
		session.close();
	}

}
