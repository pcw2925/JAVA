package Project8;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DmbCellphone dmbCellPhone =new DmbCellphone("자바폰","검정",10);
		
		System.out.println("모델:" +dmbCellPhone.model);
		System.out.println("색상:" +dmbCellPhone.color);
		
		System.out.println("채널:" +dmbCellPhone.channel);
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("반말하지마라");
		dmbCellPhone.sendVoice("내이름은정상수");
		dmbCellPhone.hangup();
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}

}
