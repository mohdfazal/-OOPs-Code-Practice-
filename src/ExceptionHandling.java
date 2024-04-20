import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        int a;
        int b;

           Scanner sc = new Scanner(System.in);
           a = sc.nextInt();
           b = sc.nextInt();

           try {
               int ans = a / b;
               System.out.println(ans);

//               int arr[] = new int[4];
//               for (int i = 0; i <= 4; i++) {
//                   arr[i] = sc.nextInt();
//               }
           }
            catch (ArithmeticException e) {
               System.out.println("This is ArithmeticException  " + e.getMessage());
           }
           catch (ArrayIndexOutOfBoundsException e){
               System.out.println(e.getMessage());
           }
//           catch (Exception e) {
//               System.out.println("this is final exceptio we are getting by " + e.getMessage());
//           }
          finally {
               System.out.println("this block will code anyhow");
           }
        System.out.println("post try catch finally block ");

    }
}
