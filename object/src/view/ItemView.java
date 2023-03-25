package view;

import java.util.ArrayList;
import java.util.HashMap;

import beans.ItemBean;

public class ItemView {

	//ArrayListのItemBeanオブジェクトを表示
	public static void itemView(ArrayList<ItemBean>itemList) {
		//表示
		System.out.println("商品ID：商品名：価格：在庫");
		System.out.println("------------------------");

		//拡張for文で表示
		for(ItemBean itemBean:itemList) {
			System.out.print(itemBean.getItemID()+":");
			System.out.print(itemBean.getItemName()+"：");;
			System.out.print(itemBean.getItemPrice()+"円：");
			System.out.println(itemBean.getItemStock()+"個");
		}

	}

	//HashMapのItenBeanオブジェクトを表示
	public static void itemView(HashMap<String,ItemBean>itemMap) {
		//表示
		System.out.println("商品ID：商品名：価格：在庫");
		System.out.println("------------------------");

		//拡張for文表示
		for(String key : itemMap.keySet()) {
			System.out.print(key+":");
			System.out.print(itemMap.get(key).getItemName()+":");
			System.out.print(itemMap.get(key).getItemPrice()+":");
			System.out.println(itemMap.get(key).getItemStock()+":");
		}


	}

}
