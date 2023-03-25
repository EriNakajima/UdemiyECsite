package controller;

import java.util.HashMap;

import beans.ItemBean;
import view.ItemView;

public class Item2 {

	public static void main(String[] args) {

		// 商品の作成
		ItemBean itemBean1 = new ItemBean("001","商品1",1000,10);
		ItemBean itemBean2 = new ItemBean("002","商品2",2000,20);
		ItemBean itemBean3 = new ItemBean("003","商品3",3000,30);

		//HashMapへの商品登録
		HashMap<String,ItemBean> itemMap =new HashMap<String, ItemBean>();
		itemMap.put(itemBean1.getItemID(),itemBean1);
		itemMap.put(itemBean2.getItemID(),itemBean2);
		itemMap.put(itemBean3.getItemID(),itemBean3);

		//Vewにキー管理オブジェクトを投げる
		ItemView.itemView(itemMap);

//		//表示
//		System.out.println("商品ID：商品名：価格：在庫");
//		System.out.println("------------------------");
//
//		//拡張for文表示
//		for(String key : itemMap.keySet()) {
//			System.out.print(key+":");
//			System.out.print(itemMap.get(key).getItemName()+":");
//			System.out.print(itemMap.get(key).getItemPrice()+":");
//			System.out.println(itemMap.get(key).getItemStock()+":");
//		}


	}

}
