package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import dao.ItemBeanDao;
import resources.ItemBean;
public class ItemBeanDaoImpl implements ItemBeanDao{

	Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
	
	
	SessionFactory sf=cfg.buildSessionFactory();
	public void dataPersistDAO(ItemBean itemName) {
		
		
		Session sess= sf.openSession();
		Transaction t=sess.beginTransaction();
		
		
		
		sess.save(itemName);
		t.commit();
		sess.close();
		
		System.out.println("done");
	}
	
	public ItemBean dataRetrieveDAO() {
		Session sess= sf.openSession();
		Transaction t=sess.beginTransaction();
		
		/*Query q=sess.createQuery("from ItemBean");
		List list=q.list();
		for(Object l:list) {
			ItemBean i=(ItemBean) l;
			System.out.println(i.getItemName());
		}*/
		ItemBean item=(ItemBean)sess.get(ItemBean.class, 1);
		System.out.println(item.getItemName()+" "+item.getId()+" "+item.getCal());
		return item;
	}
	
	public static void main(String[] args) {
		ItemBeanDaoImpl e= new ItemBeanDaoImpl();
		e.dataRetrieveDAO();
		//e.dataPersist("Cool", 100, 1000);
	}
}
