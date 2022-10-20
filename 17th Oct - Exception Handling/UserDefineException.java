package Exception;
class UserDefineException extends Exception  
{  
    public UserDefineException(String str)  
    {  
        // Calling constructor of parent Exception class
        super(str);  
    }  
}  
// Class that uses above MyException  
public class UserDefinedException {

	public static void main(String[] args) {
        try  
        {  
            // throw an object of user defined exception  
            throw new UserDefineException("This is user-defined exception");  
        }  
        catch (UserDefineException ude)  
        {  
            System.out.println("Caught the exception");  
            // Print the message from MyException object  
            System.out.println(ude.getMessage());  
        }  
    }  
}  