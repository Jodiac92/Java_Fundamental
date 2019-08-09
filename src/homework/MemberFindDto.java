package homework;

public class MemberFindDto {
	private int seq;
	private String email;
	private String code;
	private String sdate;
	private String edate;
	//생성자 만들기 
	//seq에 대한 setter만들기
	//seq에 대한 getter만들기
	public MemberFindDto(int seq, String email, String code, String sdate,String edate) {
	super();
	this.seq = seq;
	this.email = email;
	this.code = code;
	this.sdate = sdate;
	this.edate = edate;
}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String email() {
		return email;
	}
	public void email(String email) {
		this.email = email;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getSdate() {
		return sdate;
	}
	public void setSdate(String sdate) {
		this.sdate = sdate;
	}
	public String getEdate() {
		return edate;
	}
	public void setEdate(String edate) {
		this.edate = edate;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
