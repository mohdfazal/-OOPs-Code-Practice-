package class2;

public class Main {
    public static void main(String[] args) {
//        ClassRoom st1 = new ClassRoom("Danish" , 11 , 123, "ManojSir" );
//        ClassRoom st2 = new ClassRoom("Zeehsan" , 12 , 124, "ManojSir" );
//        ClassRoom st3 = new ClassRoom("Shafi" , 13 , 125, "ManojSir" );
//        ClassRoom st4 = new ClassRoom("Fazal" , 14 , 126, "ManojSir" );

//       //here teacher name is common for each student and its taking memory and time so here we can use
//        // static keyword use to manage time and memory
        ClassRoom.teacherName = "Manoj Sir";
        ClassRoom st1 = new ClassRoom("Danish" , 11 , 123 );
        ClassRoom st2 = new ClassRoom("Zeehsan" , 12 , 124);
        ClassRoom st3 = new ClassRoom("Shafi" , 13 , 125);
        ClassRoom st4 = new ClassRoom("Fazal" , 14 , 126);
        System.out.println(st1.rollNum);

    }

}
