package Java_20190723; //멤버변수, 메서드, 생성자

public class Admin {
	private String id;
	private String pwd;
	private String email;
	private int level;
	//디폴트 생성자(default constructor) => alt + shift + s c(디폴트) => alt + shift + s o(매개변수 생성자)
	//alt + shift + s r(setter, getter생성)
	//디폴트 : 매개변수가 아무것도 없는 것
	public Admin() {
		super();//부모 클래스의 디폴트 생성자를 호출, 사용하는것이 좋음(디폴트)
	}
	
	
	//생성자(constructor)                      //방법2
	//생성자는 변환값이 없고, 이름은 클래스 이름과 동일하게
	//역할은 인스턴스 변수 초기화(값을 처음으로 할당)
	public Admin(String id, String pwd, String email, int level) {
		//super();가 숨어져잇다.
		this.id = id;
		this.pwd = pwd;
		this.email = email;
		this.level = level;
	}

	public Admin(String id, String pwd, String email) {
		//this.id = id;
		//this.pwd = pwd;
		//this.email = email;
		this(id, pwd, email,0);//다른 생성자 호출, 생성자에서만 사용가능
		//this용법 2가지
		//1. 자기자신 객체 => this.
		//2. 다른 생성자 호출 => this(~~)
	}
	
	
	
	//방법1
	public void setId(String id) {
		this.id = id;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
	

	public String getId() {
		return id;
	}
	
	public String getPwd() {
		return pwd;
	}
	
	public String getEmail() {
		return email;
	}
	
	public int getLevel() {
		return level;
	}
}
