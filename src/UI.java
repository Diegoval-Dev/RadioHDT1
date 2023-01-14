import java.util.Scanner;

public class UI {

    public static int initial(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el modo a implementar");
        System.out.println("");
        System.out.println("1. Encender radio");
        System.out.println("2. Cambiar de frecuencia FM");
        System.out.println("3. Cambiar de frecuencia AM");
        System.out.println("4. Cambiar de emisora FM");
        System.out.println("5. Cambiar de emisora AM");
        System.out.println("6. Guardar emisora");
        System.out.println("7. Apagar radio");
        return scanner.nextInt();
    }

    public static void show(String msg){
        System.out.println(msg);
    }


}
