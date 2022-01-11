package Project11;

public class HankookTire extends Tire {
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRoatation;
		if(accumulatedRoatation<maxRotation) {
			System.out.println(location +"HankookTire ¼ö¸í:" +
		(maxRotation-accumulatedRoatation) +"È¸");
			 return true;
		} else {
			System.out.println("***" +location + "HanKookTire ÆãÅ© ***");
			return false;
		}
	}

}
