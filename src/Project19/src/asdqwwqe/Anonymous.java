package asdqwwqe;

public class Anonymous {
	RemoteControl field =new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("����� ���ϴ�.");
		}
		@Override
		public void turnOff() {
			System.out.println("tv�� ���ϴ�.");
		}
	};
	void method1() {
		RemoteControl localVar =new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("Audio�� ���ϴ�");
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