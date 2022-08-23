public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=1;
		for(int i =  1; i <= 4; i++) {
			for (int j = 1; j <=i ; j++) {
				System.out.print(c);
				c++;
				if (c==10) {
					break;
				}
			} System.out.println(" ");
		} 
	}

}