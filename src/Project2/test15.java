package Project2;

public class test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Qutter : for(char upper ='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
			System.out.println(upper +"-" +lower);
			if(lower=='z') {
			break Qutter;
			}
		}
	}
	System.out.println("프로그램종료");

}
}