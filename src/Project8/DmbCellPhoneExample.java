package Project8;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DmbCellphone dmbCellPhone =new DmbCellphone("�ڹ���","����",10);
		
		System.out.println("��:" +dmbCellPhone.model);
		System.out.println("����:" +dmbCellPhone.color);
		
		System.out.println("ä��:" +dmbCellPhone.channel);
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������");
		dmbCellPhone.receiveVoice("�ݸ���������");
		dmbCellPhone.sendVoice("���̸��������");
		dmbCellPhone.hangup();
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}

}
