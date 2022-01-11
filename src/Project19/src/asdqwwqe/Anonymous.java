package asdqwwqe;

public class Anonymous {
	RemoteControl field =new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("Á¤»ó¼ö ²ü´Ï´Ù.");
		}
		@Override
		public void turnOff() {
			System.out.println("tv¸¦ ²ü´Ï´Ù.");
		}
	};
	void method1() {
		RemoteControl localVar =new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("Audio¸¦ ²ü´Ï´Ù");
			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				
			}
		};
		localVar.turnOn();
		
	}
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
}