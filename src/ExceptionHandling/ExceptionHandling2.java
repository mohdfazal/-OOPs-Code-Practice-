package ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandling2{
    public static void main(String[] args) {
        try{
            //There is nothing like parent child things we are just using this terminology just get the transparent
            // understanding of throwing exception just understanding " CALLER METHOD(PARENT) AND CALLED METHOD(CHILD)
            //creating obj of class "ExceptionHandling.DoIt"
            DoIt obj = new DoIt();
            // here "letsRockTogether()" is "child" or "called" function and might "throws" an ArithmeticException
            obj.letsRockTogether();
        }
        catch (ArithmeticException e){
            System.out.println("This is the " + e.getMessage() + " Exception");
        } finally {
            System.out.println("this block will code anyhow");
        }
    }

}
class DoIt{
    //There is nothing like parent child things we are just using this terminology just get the transparent
    // understanding of throwing exception just understanding " CALLER METHOD(PARENT) AND CALLED METHOD(CHILD)

    //we already know the below function named "letsRockTogether()" we have created might be "throws" an exception that is
    // ArithmeticException here we can just throw this exception to parent class if parents class already handled there then
    // we just need to pass this exception to parent class ( here parent class is "ExceptionHandling.ExceptionHandling2" ) from child class
    // ( here child class is "ExceptionHandling.DoIt" ) then parent class will handle this exception there
    // and the reason why we are doing this is like we need to write code in a good way because to write "try and catch"
    // block in every function or method isn't a good practice

    public static void letsRockTogether() throws ArithmeticException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int ans = 10/a;
    }

}
