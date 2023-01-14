import java.util.Scanner;

public class UI {

    public static int initial(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el modo a implementar");
        System.out.println("");
        System.out.println("1. Encender radio");
        System.out.println("2. Cambiar de emisora AM o FM");
        System.out.println("3. Cambiar de emisora");
        System.out.println("4. Seleccionas emisora");
        System.out.println("5. Apagar radio");
        return scanner.nextInt();
    }

    public static void show(String msg){
        System.out.println(msg);
    }


}
