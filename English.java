
public class English implements Greetings{
	public English()
	{
		System.out.println("English Class constructor is being called");
		morning();
		afternoon();
		evening();
	}

	public static void main(String[] args) {
		new English();
		new Hindi();
		

	}

	@Override
	public void morning() {
		System.out.println("Good Morning");
		
	}

	@Override
	public void afternoon() {
		System.out.println("Good Afternoon");
		
	}

	@Override
	public void evening() {
		System.out.println("Good Evening");
		
	}

}
 class Hindi extends English
 {
	 public Hindi()
	 {
		System.out.println("Hindi Class constructor is being called");
		morning();
		afternoon();
		evening();
	 }
	 @Override
	 public void morning() {
		System.out.println("Shubh Prabhaat");
			
	}

	@Override
	public void afternoon() {
		System.out.println("Shubh Dopahar");
			
	}

	@Override
	public void evening() {
		System.out.println("Susandhya");
		
	}
 
 }
