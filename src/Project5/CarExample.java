package Project5;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar =new Car();
		
		myCar.setGas(5);
		
		boolean gasState =myCar.isLeftGas();
		if(gasState) {
			System.out.println("???P?մϴ?.");
			myCar.run();
		}
		if(myCar.isLeftGas() ) {
			System.out.println("gas?? ?????? ?ʿ䰡 ?????ϴ?");
		} else {
			System.out.println("gas?? ?????մϴ?.");
		}
	}

}
