package dao;

public interface ItemBeanDao {

	public void dataPersist(String itemName, int qty ,float cal);
	public String dataRetrieve();
}
