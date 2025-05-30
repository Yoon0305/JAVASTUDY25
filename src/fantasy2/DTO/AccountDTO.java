package fantasy2.DTO;

public class AccountDTO {
	
	//필드
	private String id;
	private String pw;
	
	
	//기본 생성자	
	public AccountDTO() {
		super();
	}
	
	
	//지정 생성자
	public AccountDTO(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}

	
	//메서드
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPw() {
		return pw;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}



}
