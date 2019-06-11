package exception;

@SuppressWarnings("serial")
public class AadharNotFoundException extends Exception {
public AadharNotFoundException()
{
	System.out.println("Aadhar number not found.");
}
}
