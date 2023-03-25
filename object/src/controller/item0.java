package controller;

import beans.ItemBean;

public class item0 {

	public static void main(String[] args) {

		// 商品1の作成
		ItemBean itemBean1 = new ItemBean();
		itemBean1.setItemID("001");
		itemBean1.setItemName("商品1");
		itemBean1.setItemPrice(1000);
		itemBean1.setItemStock(10);

		//表示
		System.out.println("商品ID：商品名：価格：在庫");
		System.out.println("------------------------");
		System.out.print(itemBean1.getItemID()+"：");
		System.out.print(itemBean1.getItemName()+"：");;
		System.out.print(itemBean1.getItemPrice()+"円：");
		System.out.println(itemBean1.getItemStock()+"個");

		// 商品2の作成
		ItemBean itemBean2 = new ItemBean("002","商品2",2000,200);

		//表示
		System.out.println("商品ID：商品名：価格：在庫");
		System.out.println("------------------------");
		System.out.print(itemBean2.getItemID()+"：");
		System.out.print(itemBean2.getItemName()+"：");;
		System.out.print(itemBean2.getItemPrice()+"円：");
		System.out.println(itemBean2.getItemStock()+"個");

	}



}
