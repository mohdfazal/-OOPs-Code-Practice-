//package ExceptionHandling;
//
//import java.util.Scanner;
//
//public class ExceptionHandling4 {
//    public static void main(String[] args) {
//        try {
//            CustomException obj = new CustomException();
//            obj.whenWillTsunamiCome();
//        }
//        catch (TsunamiException e){
//            System.out.println(e.getMessage());
//        }
//    }
//}
//
//class CustomException{
//    public void whenWillTsunamiCome() throws ExceptionHandling4{
//        Scanner sc = new Scanner(System.in);
//        int waterLever = sc.nextInt();
//        if(waterLever > 100){
//            throw new TsunamiException("Bhaaaagoooo!!!!!! Sunaai aa gyi hai");
//        }
//    }
//
//
//}
//
//class TsunamiException extends ExceptionHandling4{
//        public TsunamiException(String message){
//            super(message);
//        }
//}



package ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandling4 {
    public static void main(String[] args) {
        try {
            CustomException obj = new CustomException();
            obj.whenWillTsunamiCome();
        }
        catch (TsunamiException e){
            System.out.println(e.getMessage());
        }
    }
}

class CustomException{
    public void whenWillTsunamiCome() throws TsunamiException{
        Scanner sc = new Scanner(System.in);
        int waterLever = sc.nextInt();
        if(waterLever > 100){
            throw new TsunamiException("Bhaaaagoooo!!!!!! Sunaai aa gyi hai");
        }
    }


}

class TsunamiException extends Exception{
    public TsunamiException(String message){
        super(message);
    }
}