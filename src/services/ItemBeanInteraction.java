package services;

import dao.ItemBeanDaoImpl;
import resources.ItemBean;

public class ItemBeanInteraction {
	public void dataPersist(String itemName, int qty ,float cal) {
		ItemBean itm= new ItemBean();
		itm.setItemName(itemName);
		itm.setQty(qty);
		itm.setCal(cal);
		ItemBeanDaoImpl item = new ItemBeanDaoImpl();
		item.dataPersistDAO(itm);
		
	}
	public ItemBean dataRetrieve(){
		return dataRetrieve();
	}
}
