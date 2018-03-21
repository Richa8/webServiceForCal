package resources;
import javax.persistence.*;
@Entity
@Table(name="Item")
public class ItemBean {
	@Column (name="item_name")
	private String itemName;
	@Column (name="qty")
	private int qty;
	@Column (name="calorie")
	private float cal;
	@Id @GeneratedValue
	@Column (name="id")
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public float getCal() {
		return cal;
	}
	public void setCal(float cal) {
		this.cal = cal;
	}
	
}
