package day10;

public class TvMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv2 tv2 = new Tv2();
		tv2.power = true;
		tv2.channel = 10;
		tv2.volumn = 20;
		tv2.power();
		tv2.channelUp();
		tv2.channelUp();
		tv2.channelDown();
		tv2.channelDown();

		System.out.println(tv2.power + " / " + tv2.channel + " / " + tv2.volumn);
		
		Tv tv = new Tv();
		tv.power = false;
		tv.channel = 10;
		// tv. volumn = 9; 에러
	}

}

class Tv {
	boolean power;
	int channel;

	public void power() {
		this.power = !power;
	}

	public void channelUp() {
		this.channel++;
	}

	public void channelDown() {
		this.channel--;
	}

}

class Tv2 extends Tv {
	int volumn;

	public void volumnUp() {
		volumn++;
	}

	public void volumnDown() {
		volumn--;
	}
}









