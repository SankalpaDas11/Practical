public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String address = "Kolkata, India"; //taking address input
		
		// Starting if statement to check if the adress is in kolkata
		if(address.endsWith("India")) {
			
			// Checking if the address is Dunlop
			if(address.contains("Dunlop")) {
				System.out.println("Your city is Dunlop"); // printing result
			} 
			
			// Checking if the address is Newtown
			else if(address.contains("Newtown")) {
				System.out.println("Your city is Newtown"); // printing result
			}
			
			// checking if adress is except the given two places
			else {
				System.out.println(address.split(",")[0]); // printing result after spliting only the 1st portion of input before comma
			}
		}
		
		// starting else to show the address is not in India
		else {
			System.out.println("You are not living in India"); // printing result
		}
	}}

