package Examples;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {10, 77, 10, 54, -11, 10};
		int i=0;
		for(int aa:arr) {
			if(aa==10) {
				i++;	
			}
		}
		int j=i*10;
		
		if(j==30) 
			System.out.println(true);
		else
			System.out.println(false);	

	}

}
