package Examples;

public class Activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book b = new MyBook();
		b.SetTitle("Book1");
		System.out.println("The title is: " + b.GetTitle());
	}

}

abstract class Book{
	
	String title;
	abstract void SetTitle(String s);
	public String GetTitle() {
		return title;
	}
}

 class MyBook extends Book {

	@Override
	void SetTitle(String s) {
		title = s;
	}

	
}

		
