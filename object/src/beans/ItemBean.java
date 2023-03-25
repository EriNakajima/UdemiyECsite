package beans;

import java.io.Serializable;

public class ItemBean implements Serializable {

	private String itemID;//商品ID
	private String itemName;//商品名
	private int itemPrice;//価格
	private int itemStock;//在庫

	//引数なしコンストラクタ（引数有りを作った場合は作る）
	public ItemBean() {
	}

	//引数蟻コンストラクタ（ID、名前、値段、在庫）
	public ItemBean(String itemID,String itemName, int itemPrice, int itemStock) {
		this.itemID = itemID;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemStock = itemStock;
	}


	public String getItemID() {
		return itemID;
	}
	public void setItemID(String itemID) {
		this.itemID = itemID;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(int price) {
		this.itemPrice = price;
	}
	public int getItemStock() {
		return itemStock;
	}
	public void setItemStock(int itemStock) {
		this.itemStock = itemStock;
	}



}
