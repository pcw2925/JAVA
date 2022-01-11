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
					System.out.println("»ó¼ö²¿Ãß¸¦»¤´Ï´Ù");
				}
				@Override
				void wake( ) {
					System.out.println("8½Ã¿¡ ÀÏ¾î³³´Ï´Ù");
					study();
				}
			}
			);
	}

}
