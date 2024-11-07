package kadai_015;

public class Car_Chapter15 {
	private int gear  = 0;
	private int speed = 0;
	
	public Car_Chapter15(int gear,int speed) {
		this.gear  = gear;
		this.speed = speed;
		
		System.out.println("現在のギア：" + this.gear);
		System.out.println("現在の速度：時速" + this.speed + "Km");
	}
	
	public void gearChange( final int afterGear) {
		this.gear = afterGear;
		
		switch(this.gear) {
		case 1  -> this.speed = 10;
		case 2  -> this.speed = 20;
		case 3  -> this.speed = 30;
		case 4  -> this.speed = 40;
		case 5  -> this.speed = 50;
		default -> this.speed = 10;
		}
	}

	public void run() {
		System.out.println("変更後のギア：" + this.gear);
		System.out.println("変更後の速度：時速" + this.speed + "Km");
		
	}
	
}
