package Exception;
class invalidAgeException extends Exception{
	invalidAgeException(String str){
		super(str);
	}
}
public class CustomException {
	public void checkAge(int age) throws invalidAgeException{
		if(age<=18||age>=25) {
			throw new invalidAgeException(" not eligible to enroll");
		}
		else
			System.out.println(" eligible to enroll");
	}
public static void main(String[] args) throws invalidAgeException  {
	CustomException ce =new CustomException();
	ce.checkAge(24);
	
}
}
