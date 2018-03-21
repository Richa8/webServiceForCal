package services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import resources.ItemBean;
public class CalDataExch {

	public void dataPersist(String itemName, int qty ,float cal) {
		Configuration	cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session sess= sf.openSession();
		Transaction t=sess.beginTransaction();
		
		ItemBean itm= new ItemBean();
		itm.setItemName(itemName);
		itm.setQty(qty);
		itm.setCal(cal);
		
		sess.persist(itm);
		t.commit();
		sess.close();
		
		System.out.println("done");
	}
	
	public static void main(String[] args) {
		CalDataExch e= new CalDataExch();
		e.dataPersist("Richa", 100, 1000);
	}
}
