package asdqwwqe;

public class AnonymousExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anonymous anony = new Anonymous();
		anony.field.turnOn();
		anony.method1();
		anony.method2(
			new RemoteControl() {
				@Override
				public void turnOn() {
					System.out.println("SMART TV¸¦ ÄÕ´Ï´Ù.");
				}
				public void turnOff() {
					System.out.println("smart tv¸¦ ²ü´Ï´Ù");
					}
				}
			);
	}

}
