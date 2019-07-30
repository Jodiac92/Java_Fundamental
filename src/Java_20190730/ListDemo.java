package Java_20190730;

import java.util.ArrayList;

class Product{
	int number;
	String name;
	double price;
	Product(int number, String name, double price){
		this.number = number;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "product [number=" + number + ", name=" + name + ", price=" + price + "]";
	}
}



public class ListDemo {
	
	public static void main(String[] args) {
		//ArrayList : 순서가 있고, 객체의 중복을 허용한다.
		ArrayList<Product> list = new ArrayList<Product>();
		
		Product p1 = new Product(1,"terran",2500);
		Product p2 = new Product(2,"zerg",1000);
		Product p3 = new Product(3,"protoss",3000);
		Product p4 = new Product(1,"terran",2500);
		Product p5 = new Product(3,"protoss",3000);
		Product p6 = new Product(1,"terran",2500);		
		Product p7 = new Product(1,"terran",2500);
		Product p8 = new Product(3,"protoss",3000);
		Product p9 = new Product(1,"terran",2500);		
		Product p10 = new Product(1,"terran",2500);	
		Product p11 = new Product(1,"terran",2500);		
		Product p12 = new Product(1,"terran",2500);
		
		
		list.add(p1);//할당
		list.add(p2);//할당
		list.add(p3);//할당
		list.add(p4);//할당
		
		list.remove(1);//삭제
		
		//모두삭제
		for(int i=0;i<list.size();i++) {
				list.remove(i--);
		}
		
		//출력
		for(int i=0;i<list.size();i++) {
			Product temp = (Product)list.get(i);
			System.out.println(temp);
		}
		//enhanced for loop(출력 가능 제너릭으로 선언한 경우만 가능)
		for (Product product : list) {
			System.out.println(product);
		}
	}
}
