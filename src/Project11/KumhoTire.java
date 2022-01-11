package Project11;

public class KumhoTire extends Tire {
	
	public KumhoTire(String location,int maxRotation) {
		super(location,maxRotation);
	}
	@Override
	public boolean roll() {
		++accumulatedRoatation;
		if(accumulatedRoatation<maxRotation) {
			System.out.println(location +"KumhoTire ¼ö¸í:" +
		(maxRotation-accumulatedRoatation) +"È¸");
			return true;
		} else {
			System.out.println("***" +location +"KumhoTire ÆãÅ© ***");
			 return false;
			 
		}
	}
}
