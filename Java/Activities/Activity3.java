package Examples;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double seconds = 1000000000;

		double EarthSeconds = 31557600;
		double MercurySeconds = 0.2408467*EarthSeconds;
		double VenusSeconds = 0.61519726*EarthSeconds;
		double MarsSeconds = 1.8808158*EarthSeconds;
		double JupiterSeconds = 11.862615*EarthSeconds;
		double SaturnSeconds = 29.447498*EarthSeconds;
		double UranusSeconds = 84.016846*EarthSeconds;
		double NeptuneSeconds = 164.79132*EarthSeconds;
		
		System.out.println("earth " + seconds/EarthSeconds);
		System.out.println("Mercury " + seconds/MercurySeconds);
		System.out.println("Venus " + seconds/VenusSeconds);
		System.out.println("Mars " + seconds/MarsSeconds);
		System.out.println("Jupiter " + seconds/JupiterSeconds);
		System.out.println("Saturn " + seconds/SaturnSeconds);
		System.out.println("Uranus " + seconds/UranusSeconds);
		System.out.println("Neptune " + seconds/NeptuneSeconds);
		
		
	}

}
