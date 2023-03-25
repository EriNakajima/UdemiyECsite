package model;

import java.util.HashMap;

import beans.ItemBean;

public class ItemLogic {

	//itemMap(HAshMap)を属性値にする
	private HashMap<String,ItemBean> itemMap;

	//コンストラクタ
	public ItemLogic() {
		this.itemMap = new HashMap<String,ItemBean>();
	}

	//itemIDをキーにして商品登録
	public void putItem(ItemBean itemBean) {
		itemMap.put(itemBean.getItemID(),itemBean);
	}

	//商品IDで商品を指定して、その在庫を増減させる
	public void updateStock(String itemID,int quantity) throws Exception{
		ItemBean itemBean = itemMap.get(itemID);
		int newStock = itemBean.getItemStock() + quantity;
		if(newStock < 0 ) {throw new Exception(itemID+"は在庫不足です");}
		itemBean.setItemStock(newStock);
		itemMap.put(itemID, itemBean);
	}

	public HashMap<String, ItemBean> getItemMap() {
		return itemMap;
	}

	public void setItemMap(HashMap<String, ItemBean> itemMap) {
		this.itemMap = itemMap;
	}



}
