package interfaceex;

public interface Controll {
	public int max=10;
	public int min=0;
	public void TurnOn();
	public void TurnOff();
	public void setVolume(int volume);
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리");
		}else {
			System.out.println("무음 해제");
		}
	}static void changeB() {
		System.out.println("건전지 교체");
	}
}
