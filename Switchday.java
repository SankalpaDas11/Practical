public class Switchday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int day = 7;
			String dayString = "";
			// Switch expression
			switch(day) {
			// case statement
			case 1: dayString = "1-Sunday";
			break;
			case 2: dayString = "2-Monday";
			break;
			case 3: dayString = "3-Tuesday";
			break;
			case 4: dayString = "4-Wednesday";
			break;
			case 5: dayString = "5-Thursday";
			break;
			case 6: dayString = "6-Friday";
			break;
			case 7: dayString = "7-Saturday";
			break;
			// default statement
			default: System.out.println("Invalid day");
			} 
			System.out.println(dayString);
		} 

	}

