package Java_20190724;

import Java_20190724.Customer;
import Java_20190724.Employee;

public class EmployeeDemo {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.name = "성영한";
		e1.phone1 = "010";
		e1.phone2 = "2033";
		e1.phone3 = "1909";
		e1.zipcode = "12345";
		e1.address1 = "서울";
		e1.address2 = "제2롯데 110층 1021호";
		e1.id = "syh1011";
		e1.pwd = "1234";

		Customer c1 = e1.change(e1);
		System.out.println(e1.name);
	}
}
