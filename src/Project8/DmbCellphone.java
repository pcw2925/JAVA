package Project8;

public class DmbCellphone extends CellPhone {
	
	int channel;
	
		DmbCellphone(String model, String color, int channel) {
		this.model =model;
		this.color =color;
		this.channel =channel;
	}
	
	
	void turnOnDmb() {
		System.out.println("ä��" +channel+ "�� DMB ��� ���� ����.");
		
	}
	void changeChannelDmb(int channel) {
		this.channel =channel;
		System.out.println("ä��" +channel +"�� ���� �ٲߴϴ�");
	}
	void turnOffDmb() {
		System.out.println("DMB ��� ������ ����");
	}
}
