package Examples;

public class Activity8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
            // Method call with correct input
            Activity8.exceptionTest("Will print to console");
            // Method call with incorrect input
            Activity8.exceptionTest(null); // Exception is thrown here
            Activity8.exceptionTest("Won't execute");
        } catch(CustomException m) {
            System.out.println("Inside catch block: " + m.getMessage());
        }
		
	}

	  static void exceptionTest(String s) throws CustomException {
		// TODO Auto-generated method stub
		 if(s== null) {
	            throw new CustomException("String value is null");
	        } else {
	            System.out.println(s);
	        }
	}

}

class CustomException extends Exception {
	
	private String message;
	
	CustomException(String s){
		this.message = s;
	}
	public String getMessage() {
	    return message;
	}

	
}
