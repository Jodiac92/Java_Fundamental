package java_20190809;

import java.io.IOException;
import java.util.ArrayList;

class A extends Thread{
	public void run() {
		//System.out.println("Thread");
	}
}

class B implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//System.out.println("Thread2");
		
	
	}
}

class Customer{
	String name;
	Customer(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

class CustomerDao{
	public Customer[] getCustomer() { //배열
		Customer[] cs = new Customer[10]; //배열이 몇 개가 올지 알 수 없어 잘 쓰지 않는다. Ex) [10]개가 들어올지 [1000]개가 들어올지 모름,속도는 제일 빠르지만 유동적이지 못함.
		Customer c1 = new Customer("조현기1");
		Customer c2 = new Customer("조현기2");
		Customer c3 = new Customer("조현기3");
		Customer c4 = new Customer("조현기4");
		Customer c5 = new Customer("조현기5");
		Customer c6 = new Customer("조현기6");
		Customer c7 = new Customer("조현기7");
		Customer c8 = new Customer("조현기8");
		Customer c9 = new Customer("조현기9");
		Customer c10 = new Customer("조현기10");
		cs[0] = new Customer("조현기1");  //<= cs[0] = c1;
		cs[1] = new Customer("조현기2");
		cs[2] = new Customer("조현기3");
		cs[3] = new Customer("조현기4");
		cs[4] = new Customer("조현기5");
		cs[5] = new Customer("조현기6");
		cs[6] = new Customer("조현기7");
		cs[7] = new Customer("조현기8");
		cs[8] = new Customer("조현기9");
		cs[9] = new Customer("조현기10");
		return cs;
		
	}
	public ArrayList<Customer> getCustomers(){ //컬렉션의 어레이리스트
		ArrayList<Customer> list = new ArrayList<Customer>();
		list.add(new Customer("조현기1"));
		list.add(new Customer("조현기2"));
		list.add(new Customer("조현기3"));
		list.add(new Customer("조현기4"));
		list.add(new Customer("조현기5"));
		list.add(new Customer("조현기6"));
		list.add(new Customer("조현기7"));
		list.add(new Customer("조현기8"));
		list.add(new Customer("조현기9"));
		list.add(new Customer("조현기10"));
		
		
		return list;
	}
}




public class GarbageDemo { //**중요
	public static void main(String[] args) throws IOException {
		//Dao (Data Access Object)
		CustomerDao cdao = new CustomerDao();
		Customer[] customers = cdao.getCustomer();
		for (Customer customer : customers) { //for + ctl + space
			System.out.println(customer.getName());
		}
		ArrayList<Customer> list = cdao.getCustomers();
		for (Customer customer : list) {
			System.out.println(customer.getName());
		}
	
	
	
	
	
	
	
	
	
	
	
	}	
	
}
