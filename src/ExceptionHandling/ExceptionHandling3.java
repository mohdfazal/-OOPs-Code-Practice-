package ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandling3 {
    public static void main(String[] args) {
        try{
            Any2 obj = new Any2();
            obj.letDoItAgain();
        }
        catch (ArithmeticException e){
            System.out.println("this is arithmetic exception reason : " + e.getMessage());
        }
        finally {
            System.out.println("this block will code anyhow");
        }
    }
}
// "throw" keyword used to "throw custom exception" and it throw to caller function and
// and its also act like a return statement because it send information related to
// the exception to the caller function
// we use throw keyword when we need to send custom message because when we use
// "throws" keyword in that case we aren't quit sure what's the actual reason of exception
// but using throw keyword we are able to know the reason why this is happening
//for example we are creating a bank application and we define some set of rule to create
// password , enter password or check email so that time if any user put wrong password
// or wrong email so using "throw" keyword we can show custom message like for example
// a user enetring wrong password may be missing some character so with the help this
// "throw" keyword we can throw message so that user can understand whats wrong he is doing
//he will be able to know the reason of the error
class Any2{
    public static void letDoItAgain(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        int a = sc.nextInt();
        if(a == 0){
            throw new ArithmeticException("The value of a is " + a);
        }
        int ans1 = 10/a;

        System.out.println("Enter the value of b : ");
        int b = sc.nextInt();
        if(b == 0){
            throw new ArithmeticException("The value of b is " + b);
        }
        int ans2 = 10/b;

    }
}
 // in "throws" keyword there is no flexibility it might be confused for the reason
// of exception
// but in "throw" keyword" it throw a message so that we get to know the reason of
// reason of exceptio