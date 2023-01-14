import java.util.Scanner;

public class UI {

    public static int initial(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el modo a implementar");
        System.out.println("");
        System.out.println("1. Encender radio / Apagar radio");
        System.out.println("2. Cambiar de frecuencia FM");
        System.out.println("3. Cambiar de frecuencia AM");
        System.out.println("4. Cambiar de emisora ");
        System.out.println("5. Seleccionas emisora");
        return scanner.nextInt();
    }

    public static void show(String msg){
        System.out.println(msg);
    }


}
