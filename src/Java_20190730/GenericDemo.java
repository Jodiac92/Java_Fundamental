package Java_20190730;

import java.util.ArrayList;

public class GenericDemo {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		//list.add("4");
		for(int i=0;i<list.size();i++) {
			Integer temp = (Integer)list.get(i); //(Integer)생략가능 Integer가 확실하기 때문
			System.out.println(temp);
		}
	}
}
