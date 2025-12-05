package Examples;

public class Activity7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MountainBike mb = new MountainBike(3, 0, 25);
	    System.out.println(mb.bicycleDesc());
	    mb.speedUp(20);
	    mb.applyBrake(5);
	}

}

interface BicycleParts{
	public static int tyres = 2;
	public int maxSpeed = 50;
}

interface BicycleOperations {
    public void applyBrake(int decrement);
    public void speedUp(int increment);
}

class Bicycle implements BicycleParts, BicycleOperations{
int gears, currentSpeed;
	@Override
	public void applyBrake(int decrement) {
		// TODO Auto-generated method stub
		currentSpeed -= decrement;
        System.out.println("Current speed: " + currentSpeed);
		
	}

	@Override
	public void speedUp(int increment) {
		// TODO Auto-generated method stub
		currentSpeed += increment;
        System.out.println("Current speed: " + currentSpeed);
		
	}
	
	Bicycle(int gears, int currentSpeed){
		this.gears = gears;
		this.currentSpeed = currentSpeed;
	}
	
	public String bicycleDesc() {
		return("No of gears are "+ gears + "\nSpeed of bicycle is " + maxSpeed);
	}
}

class MountainBike extends Bicycle{
	int seatHeight=10;

	MountainBike(int gears, int currentSpeed, int seatHeight) {
		super(gears, currentSpeed);
		// TODO Auto-generated constructor stub
		this.seatHeight= seatHeight;
	}
	public void setHeight(int newValue) {
	    seatHeight = newValue;
	}
	public String bicycleDesc() {
		return("No of gears are "+ gears + "\nSpeed of bicycle is " + maxSpeed + "\nSeatHeight is "+ seatHeight);
	}
	
}

