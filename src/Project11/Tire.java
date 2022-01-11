package Project11;

public class Tire {
	public int maxRotation;
	public int accumulatedRoatation;
	public String location;
	
	public Tire(String location,int maxRotation) {
		this.location =location;
		this.maxRotation =maxRotation;
	}
	
	public boolean roll() {
		++accumulatedRoatation;
		if(accumulatedRoatation<maxRotation) {
			System.out.println(location +"Tire ����:" +
		(maxRotation-accumulatedRoatation) +"ȸ");
		return true;
		} else {
			System.out.println("***" +location +" Tire ��ũ***");
					return false;
		}
	}
}
