package Java_20190723;

public class AdminDemo {
	public static void main(String[] args) {
		Admin a = new Admin("zodiac", "Supernova", "galaxy@gmail.com"); //방법2
		//a.setId("zodiac"); //방법1
		//a.setPwd("Supernova");
		//a.setEmail("galaxy@gmail.com");
		//a.setLevel(1);
		System.out.printf("%s, %s, %s, %d %n",a.getId(), a.getPwd(), a.getEmail(), a.getLevel());
	}
}
