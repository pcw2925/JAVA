package Project2;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time =(int) (Math.random() *4) +8;
		System.out.println("[���� �ð�:" +time +"��]");
		
		switch(time) {
		case 8:
			System.out.println("���");
		case 9:
			System.out.println("ȸ��");
		case 10:
			System.out.println("����");
		default:
			System.out.println("�ܱ�");
			
		}
	}

}
