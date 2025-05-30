package ch10_2_evalutaion.dto;

public class AccountDTO {

	//필
	
	private String studentId ;
	private String studentName;
	private int korScore;
	private int matScore;
	private int engScore;
	private String majorName;
	
	
	
	
	//생
	public AccountDTO() {
		
	}
	
	//지정 생성자
	public AccountDTO(String studentId, String studentName, int korScore, int matScore, int engScore, String majorName) {
		
		this.studentId = studentId;
		this.studentName = studentName;
		this.korScore = korScore;
		this.matScore = matScore;
		this.engScore = engScore;
		this.majorName = majorName;
		
	}



	//메 (GET,SET)
	public String getStudentId() {
		return studentId;
	}




	public String getStudentName() {
		return studentName;
	}




	public int getKorScore() {
		return korScore;
	}




	public int getMatScore() {
		return matScore;
	}




	public int getEngScore() {
		return engScore;
	}




	public String getMajorName() {
		return majorName;
	}




	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}




	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}




	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}




	public void setMatScore(int matScore) {
		this.matScore = matScore;
	}




	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}




	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}
	
	
	
	

	
	
	
	
	
	
}//AccountDTO class 종료
