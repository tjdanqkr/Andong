package interfaceex;

public class Remote {
	public static void main(String[] args) {
		Tv tv= new Tv();
		tv.TurnOn();
		tv.TurnOff();
		tv.setVolume(2);
	}
}
