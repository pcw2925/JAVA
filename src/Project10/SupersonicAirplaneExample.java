package Project10;

public class SupersonicAirplaneExample {
	public static void main(String[] args) {
		SupersonicAirplane sa =new SupersonicAirplane();
		sa.takeoff();
		sa.fly();
		sa.flyMode =SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode =SupersonicAirplane.NOMAL;
		sa.fly();
		sa.land();
	}
}
