import java.util.Scanner;

public class UI {

    public static int initial(){
        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();
    }

    public static void show(String msg){
        System.out.println(msg);
    }


}
