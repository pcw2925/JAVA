package asdqw;

public class AnonymousExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amonymous anony =new Amonymous();
		anony.field.wake();
		
		anony.method1();
		
		anony.method2(
			new Person() {
				void study() {
					System.out.println("������߸����ϴ�");
				}
				@Override
				void wake( ) {
					System.out.println("8�ÿ� �Ͼ�ϴ�");
					study();
				}
			}
			);
	}

}
