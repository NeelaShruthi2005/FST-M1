package Examples;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Activity6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		List<String> list = Arrays.asList("a","b","c");
		Plane p=new Plane(4, list);
		p.onBoard("d");
		p.onBoard("e");
		 System.out.println("Take off Time: " + p.takeOff().getTime());
		 System.out.println("Passengers during flight: " + p.getPassengers());

		Thread.sleep(1000);
		p.land();
		 System.out.println("Last time landed: " + p.getLastTimeLanded().getTime());
	     System.out.println("Passengers after landing: " + p.getPassengers());

	}

}

class Plane {
    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;
    
    
    Plane(int mp, List<String> p){
    	
    	this.maxPassengers = mp;
    	this.passengers = new ArrayList<>(p);  	
    }
    
    public void setmaxPassengers(int mcPsngrs) {
    	this.maxPassengers = mcPsngrs;
    }
    
    /*public Plane(int maxPassengers) {
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
    }*/
    
    public void onBoard(String passengerName) {
    	if(passengers.size()<maxPassengers)
    		this.passengers.add(passengerName);
    	else
    		System.out.println("Plane is full");
    }
    
    public Date takeOff() {
        this.lastTimeTookOf = new Date();
        return lastTimeTookOf;
    }

    public void land() {
        this.lastTimeLanded = new Date();
        this.passengers.clear();
    }

    public Date getLastTimeLanded() {
        return lastTimeLanded;
    }

    public List<String> getPassengers() {
        return passengers;
    }
}

