package interfaceex;

public interface Controll {
	public int max=10;
	public int min=0;
	public void TurnOn();
	public void TurnOff();
	public void setVolume(int volume);
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó��");
		}else {
			System.out.println("���� ����");
		}
	}static void changeB() {
		System.out.println("������ ��ü");
	}
}
