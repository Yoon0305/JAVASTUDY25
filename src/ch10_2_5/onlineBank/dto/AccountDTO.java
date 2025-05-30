package ch10_2_5.onlineBank.dto;

public class AccountDTO {
	
	
	
	//필드
	private String ano;
	private String owner;
	private int balance;
	private String bankname;
	
	
	//기본 생성자
	
	public AccountDTO() {
		
	}

	//메서드 (getter setter)
	public String getAno() {
		return ano;
	}


	public void setAno(String ano) {
		this.ano = ano;
	}


	public String getOwner() {
		return owner;
	}


	public void setOwner(String owner) {
		this.owner = owner;
	}


	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}


	public String getBankname() {
		return bankname;
	}


	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	
	// 지정 생성자
	public AccountDTO(String ano, String owner, int balance, String bankname) {
		
	}
	

}//AccountDTO class 종료
