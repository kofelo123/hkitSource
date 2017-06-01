package com.poly.c0515;

class Product {
	int price;
	int bonusPoint;

	public Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);

	}

	public Product() {
		// TODO Auto-generated constructor stub
	}
}

class TV extends Product {
	public TV() {
		super(100);
	}

	public String toString() {
		return "tv";
	}
}

class Computer extends Product {
	public Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}

}

class Audio extends Product {
	Audio() {
		super(50);
	}

	public String toString() {
		return "Audio";
	}

}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	Product[] item = new Product[10];
	int i = 0;

	void buy(Product p) {
		if (money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i++] = p;
		System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
	}

	void summary() {
		int sum = 0;
		String itemList = "";

		for (int i = 0; i < item.length; i++) {
			if (item[i] == null)
				break;
			sum += item[i].price;
			itemList += item[i] + ", ";
		}
		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� " + sum + "�����Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� " + itemList  + "�Դϴ�.");
	}

}

public class PolyArgumentTest {
	public static void main(String[] args) {
		Buyer buyer = new Buyer();

		buyer.buy(new TV());
		buyer.buy(new Computer());
		buyer.buy(new Audio());
		buyer.summary();

	}

}
