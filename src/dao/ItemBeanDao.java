package dao;

import resources.ItemBean;

public interface ItemBeanDao {

	public void dataPersistDAO(ItemBean itemName);
	public ItemBean dataRetrieveDAO();
}
