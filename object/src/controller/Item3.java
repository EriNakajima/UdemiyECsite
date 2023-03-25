package controller;

import java.util.HashMap;

import beans.ItemBean;
import model.ItemLogic;
import view.ItemView;

public class Item3 {

	public static void main(String[] args) {

		// 商品の作成
		ItemBean itemBean1 = new ItemBean("001","商品1",1000,10);
		ItemBean itemBean2 = new ItemBean("002","商品2",2000,20);
		ItemBean itemBean3 = new ItemBean("003","商品3",3000,30);

		//ItemLogicを使って商品登録
		ItemLogic itemLogic = new ItemLogic();
		itemLogic.putItem(itemBean1);
		itemLogic.putItem(itemBean2);
		itemLogic.putItem(itemBean3);


		try {
			//商品2の在庫を50個増やす
			itemLogic.updateStock("002", 50);
			//商品3の在庫を40個減らす
			itemLogic.updateStock("003", -40);
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}




		//HashMapを取り出す
		HashMap<String,ItemBean>itemMap = itemLogic.getItemMap();


		//Vewにキー管理オブジェクトを投げる
		ItemView.itemView(itemMap);




	}

}
