package interfaceex;

public class Tv implements Controll{
	private int volume;
	@Override
	public void TurnOn() {
		System.out.println("Æ¼ºñ¸¦ Å´");
		
	}

	@Override
	public void TurnOff() {
		System.out.println("Æ¼ºñ¸¦ ²û");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume>Controll.max) {
			this.volume= Controll.max;
		}else if(volume<Controll.min){
			this.volume=Controll.min;
		}else {
			this.volume=volume;
		}
		System.out.println("ÇöÀç tv º¼·ý"+ this.volume);
	}
	
}
