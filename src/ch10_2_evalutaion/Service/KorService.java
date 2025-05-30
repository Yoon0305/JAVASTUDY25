package ch10_2_evalutaion.Service;

import java.util.Scanner;

import ch10_2_evalutaion.dto.AccountDTO;

public class KorService {

	public void menu(Scanner inputInt, Scanner inputStr, AccountDTO[] korMaj) {

		boolean korRun = true;
		while (korRun) {
			System.out.println("=== 성적 관리 시스템입니다. ===");
			System.out.println("1. 성적 등록");
			System.out.println("2. 전체 성적 보기");
			System.out.println("3. 내 성적 보기");
			System.out.println("4. 성적 수정");
			System.out.println("5. 성적 삭제");
			System.out.println("6. 종료");
			System.out.print(">>>>");
			String select = inputStr.next();
			switch (select) {

			case "1":
				createAccount(inputInt, inputStr, korMaj);
				break;
			case "2":
				accountLists(inputStr, inputStr, korMaj);
				break;
			case "3":
				myAccountScore(inputStr, inputStr, korMaj);
				break;
			case "4":
				myScoreUpdate(inputStr, inputStr, korMaj);
				break;
			case "5":
				myScoreDelete(inputStr, inputStr, korMaj);
				break;
			case "6":
				System.out.println("=== 초기화면으로 돌아갑니다.===");
				korRun = false;
				break;
			} // 국문과 성적 처리 switch 종료

		} // 국문과 성적 처리 while 종료

	}// 국문과 성적 처리 menu method 종료

	private void myScoreDelete(Scanner inputStr, Scanner inputInt, AccountDTO[] korMaj) {
		// 성적 삭제
		System.out.println("학번과 이름을 입력해주세요.");
		System.out.print("학번 : ");
		String studentId = inputStr.next();
		System.out.print("이름 : ");
		String studentName = inputStr.next();

		AccountDTO inputAccount = findAccount(studentId, studentName, korMaj);

		if (inputAccount == null) {
			System.out.println("찾는 정보가 없습니다. 입력하신 정보를 확인해주세요.");
			return;
		} // 계정 정보 검증 if 종료

		boolean run = true;
		while (run) {

			System.out.println("==" + inputAccount.getStudentName() + "님의 현재 성적 ==");
			System.out.println("1. 국어 : " + (inputAccount.getKorScore()));
			System.out.println("2. 수학 : " + (inputAccount.getMatScore()));
			System.out.println("3. 영어 : " + (inputAccount.getEngScore()));
			System.out.println(
					"총점 : " + (inputAccount.getKorScore() + inputAccount.getMatScore() + inputAccount.getEngScore()));

			System.out.println("삭제하실 과목의 번호를 입력하세요");
			System.out.println("이전화면으로 돌아가려면 9번을 입력해주세요.");
			System.out.print(">>>>");
			int ScoreDeleteSelect = inputInt.nextInt();

			int deleteScore = 0;

			switch (ScoreDeleteSelect) {

			case 1:
				System.out.println("==국어 점수를 삭제합니다==");
				int deletedKorScore = deleteScore;
				inputAccount.setKorScore(deletedKorScore);
				System.out.println("==국어 점수 삭제가 완료되었습니다. ==");
				System.out.println("국어 점수 : " + inputAccount.getKorScore());
				break;

			case 2:
				System.out.println("==수학 점수를 삭제합니다==");
				int deletedMatScore = deleteScore;
				inputAccount.setMatScore(deletedMatScore);
				System.out.println("==수학 점수 삭제가 완료되었습니다. ==");
				System.out.println("수학 점수 : " + inputAccount.getMatScore());
				break;

			case 3:
				System.out.println("==영어 점수를 삭제합니다==");
				int deletedEngScore = deleteScore;
				inputAccount.setEngScore(deletedEngScore);
				System.out.println("==영어 점수 삭제가 완료되었습니다. ==");
				System.out.println("영어 점수 : " + inputAccount.getEngScore());
				break;

			case 9:
				System.out.println("==이전 화면으로 돌아갑니다.==");
				run = false;
				break;

			default:
				System.out.println("(1~3)까지의 과목 번호만 입력해주세요.");
				break;

			}
		}
	}

	private void myScoreUpdate(Scanner inputStr, Scanner inputInt, AccountDTO[] korMaj) {
		// 내 성적 수정

		System.out.println("학번과 이름을 입력해주세요.");
		System.out.print("학번 : ");
		String studentId = inputStr.next();
		System.out.print("이름 : ");
		String studentName = inputStr.next();

		AccountDTO inputAccount = findAccount(studentId, studentName, korMaj);
		if (inputAccount == null) {
			System.out.println("찾는 정보가 없습니다. 입력하신 정보를 확인해주세요.");
			return;
		}

		boolean run = true;

		while (run) {

			System.out.println("==" + inputAccount.getStudentName() + "님의 현재 성적 ==");
			System.out.println("1. 국어 : " + (inputAccount.getKorScore()));
			System.out.println("2. 수학 : " + (inputAccount.getMatScore()));
			System.out.println("3. 영어 : " + (inputAccount.getEngScore()));
			System.out.println(
					"총점 : " + (inputAccount.getKorScore() + inputAccount.getMatScore() + inputAccount.getEngScore()));
			System.out.println("============================================");
			System.out.println("== 수정하실 과목의 번호를 입력하세요. ==");
			System.out.println("== 이전화면으로 가려면 9번을 눌러주세요. ==");
			System.out.print(">>>>");

			int ScoreUpdateSelect = inputInt.nextInt();

			switch (ScoreUpdateSelect) {

			case 1:
				System.out.println("현재 국어 점수 :" + inputAccount.getKorScore());
				System.out.print("수정 점수 : ");
				int updatedKorScore = inputInt.nextInt();
				inputAccount.setKorScore(updatedKorScore);
				System.out.println("== 수정이 완료되었습니다. ==");
				break;

			case 2:
				System.out.println("현재 수학 점수 :" + inputAccount.getMatScore());
				System.out.print("수정 점수 : ");
				int updatedMatScore = inputInt.nextInt();
				inputAccount.setMatScore(updatedMatScore);
				System.out.println("== 수정이 완료되었습니다. ==");
				break;

			case 3:
				System.out.println("현재 영어 점수 :" + inputAccount.getEngScore());
				System.out.print("수정 점수 : ");
				int updatedEngScore = inputInt.nextInt();
				inputAccount.setEngScore(updatedEngScore);
				System.out.println("== 수정이 완료되었습니다. ==");
				break;

			case 9:
				System.out.println("== 이전 메뉴로 돌아갑니다. ==");
				run = false;
				break;

			default:
				System.out.println("(1~3)까지의 과목 번호만 입력해주세요.");
				break;
			}
		}

	}

	private void myAccountScore(Scanner inputStr, Scanner inputStr2, AccountDTO[] korMaj) {
		// 내 성적 확인

		System.out.println("학번과 이름을 입력해주세요.");
		System.out.print("학번 : ");
		String studentId = inputStr.next();
		System.out.print("이름 : ");
		String studentName = inputStr.next();

		AccountDTO inputAccount = findAccount(studentId, studentName, korMaj);
		if (inputAccount == null) {
			System.out.println("찾는 정보가 없습니다. 입력하신 정보를 확인해주세요.");
			return;
		} else
			System.out.println("==" + inputAccount.getStudentName() + "님의 성적 ==");
		System.out.println("국어 : " + (inputAccount.getKorScore()));
		System.out.println("수학 : " + (inputAccount.getMatScore()));
		System.out.println("영어 : " + (inputAccount.getEngScore()));
		System.out.println(
				"총점 : " + (inputAccount.getKorScore() + inputAccount.getMatScore() + inputAccount.getEngScore()));
		return;

	}

	private AccountDTO findAccount(String studentId, String studentName, AccountDTO[] korMaj) {
		// 국문과 정보 확인 메서드
		AccountDTO account = null;

		for (int i = 0; i < korMaj.length; i++)

			if (korMaj[i] != null) { // 국문과 i번째 값 검증
				String dbStudentId = korMaj[i].getStudentId();
				String dbStudentName = korMaj[i].getStudentName();
				if (dbStudentId.equals(studentId) && dbStudentName.equals(studentName)) {
					account = korMaj[i];
					break;
				}
			}
		return account;
	}

	private void accountLists(Scanner inputStr, Scanner inputInt, AccountDTO[] korMaj) {
		// 전체 성적표
		System.out.println("=== 학과 전체 성적 ===");
		for (int i = 0; i < korMaj.length; i++) {

			AccountDTO accountlist = korMaj[i];
			if (accountlist != null) {
				System.out.println("학과 :" + accountlist.getMajorName());
				System.out.println("\t");
				System.out.println("학번 :" + accountlist.getStudentId());
				System.out.println("\t");
				System.out.println("이름 :" + accountlist.getStudentName());
				System.out.println("\t");
				System.out.println("국어 :" + accountlist.getKorScore());
				System.out.println("\t");
				System.out.println("수학 :" + accountlist.getMatScore());
				System.out.println("\t");
				System.out.println("영어 :" + accountlist.getEngScore());
				System.out.println("\t");
				System.out.println(
						"총점 :" + (accountlist.getKorScore() + accountlist.getMatScore() + accountlist.getEngScore()));
				System.out.println("\t\n");
				System.out.println("===========================");

			}
		}

	}

	private void createAccount(Scanner inputInt, Scanner inputStr, AccountDTO[] korMaj) {
		// 학생 정보 등록 및 성적 입력

		System.out.println("=== 학생 등록 및 성적 등록을 진행합니다. ===");
		AccountDTO myAccount = new AccountDTO();

		System.out.println("=== 학번을 등록하세요 ===");
		System.out.print("학번 : ");
		myAccount.setStudentId(inputStr.next());

		System.out.println("=== 이름을 등록하세요 ===");
		System.out.print("이름 : ");
		myAccount.setStudentName(inputStr.next());

		boolean run = true;
		boolean run1 = true;
		boolean run2 = true;

		while (run) {
			System.out.println("*** 국어 성적을 등록하세요 ***");
			System.out.print("점수 : ");
			myAccount.setKorScore(inputInt.nextInt());

			if (myAccount.getKorScore() < 0 || myAccount.getKorScore() > 100) {
				System.out.println("맞지 않는 입력값입니다.");
				System.out.println("다시 입력해주세요.");
			} else
				run = false;
		}

		while (run1) {
			System.out.println("*** 수학 성적을 등록하세요 ***");
			System.out.print("점수 : ");
			myAccount.setMatScore(inputInt.nextInt());

			if (myAccount.getMatScore() < 0 || myAccount.getMatScore() > 100) {
				System.out.println("맞지 않는 입력값입니다.");
				System.out.println("다시 입력해주세요.");
			} else
				run1 = false;
		}

		while (run2) {

			System.out.println("*** 영어 성적을 등록하세요 ***");
			System.out.print("점수 : ");
			myAccount.setEngScore(inputInt.nextInt());

			if (myAccount.getEngScore() < 0 || myAccount.getEngScore() > 100) {
				System.out.println("맞지 않는 입력값입니다.");
				System.out.println("다시 입력해주세요.");
			} else
				run2 = false;
		}
		// 성적값 검증 while-if-else 종료

		// 학번, 이름, 성적 3개, 학과설정 완료

		for (int i = 0; i < korMaj.length; i++) {

			if (korMaj[i] == null) {
				korMaj[i] = myAccount;
				break;
			} // 국문과 db입력 if 종료
		} // 국문과 db입력 for 종료

		System.out.println("성적 등록이 정상적으로 처리되었습니다.");

	}// 국문과 성적 등록 method 종료

}// KorService (국문과 성적 처리) class 종료
