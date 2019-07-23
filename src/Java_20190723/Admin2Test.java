package Java_20190723;

public class Admin2Test {
	private String id;
	private String pwd;
	private String email;
	private int level;
	public Admin2Test() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin2Test(String id, String pwd, String email, int level) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.email = email;
		this.level = level;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
}
	