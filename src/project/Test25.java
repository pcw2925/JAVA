package project;

import java.util.Scanner;

public class Test25 {

	public static void main(String[] args)  throws Exception {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while(true) {
			inputData = scanner.nextLine();
			System.out.println("입력된 문자열: \"" + inputData +"\"");
			if(inputData.equals("q")) {
				break;
				
			}
		}
		
		System.out.println("종료");
	}
	

}
