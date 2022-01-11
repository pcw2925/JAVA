package project;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hongdroid ="잘생겼다";
		int a =1;
		
		
		if(hongdroid == "못생겼다") { // 
			System.out.print("정답");
		} 
		else if(hongdroid =="잘생겼다") {	
			System.out.println("잘생겼다");
		
		}
		else if(hongdroid =="박찬우") {	
			System.out.print("정답");
		
		}
		else if(hongdroid =="잘생겼다") {
			System.out.print("정답");
		}
			
			if(a==0) {
				System.out.println("a는 0입니다");
			} else if (a==1) {
				System.out.println("a는 1입니다");
			}
		
		// and 연산자 or 연산자
		if(a ==0 && a== 1) { //and 연산자 사용 하나라도 틀리면 실행안됨
			System.out.println("TEST");
		}
		if (a== 0|| a==1) { //or 연산자 사용 하나라도 맞으면 실행 
			System.out.println("TEST");
		}
		}

	
}

