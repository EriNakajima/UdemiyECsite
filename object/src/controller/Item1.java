package controller;

import java.util.ArrayList;

import beans.ItemBean;
import view.ItemView;

public class Item1 {

	public static void main(String[] args) {

		// 商品の作成
		ItemBean itemBean1 = new ItemBean("001","商品1",1000,10);
		ItemBean itemBean2 = new ItemBean("002","商品2",2000,20);
		ItemBean itemBean3 = new ItemBean("003","商品3",3000,30);

		//商品リストへの登録
		ArrayList<ItemBean> itemList = new ArrayList<ItemBean> ();
		itemList.add(itemBean1);
		itemList.add(itemBean2);
		itemList.add(itemBean3);

		//Viewにリスト管理オブジェクトを投げる
		ItemView.itemView(itemList);

//		//表示
//		System.out.println("商品ID：商品名：価格：在庫");
//		System.out.println("------------------------");
//
//		//拡張for文で表示
//		for(ItemBean itemBean:itemList) {
//			System.out.print(itemBean.getItemID()+":");
//			System.out.print(itemBean.getItemName()+"：");;
//			System.out.print(itemBean.getItemPrice()+"円：");
//			System.out.println(itemBean.getItemStock()+"個");
//		}


	}

}
