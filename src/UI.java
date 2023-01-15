import java.util.Scanner;

public class UI {

    /**
     * Mensaje inicial
     * @return opccion elegida por el usuario
     */
    public static int initial(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el modo a implementar");
        System.out.println("");
        System.out.println("1. Encender radio");
        System.out.println("2. Cambiar de frecuencia FM");
        System.out.println("3. Cambiar de frecuencia AM");
        System.out.println("4. Cambiar de emisora FM");
        System.out.println("5. Cambiar de emisora AM");
        System.out.println("6. Guardar emisora en botones");
        System.out.println("7. Seleccionar emisora de botones");
        System.out.println("8. Apagar radio");
        return scanner.nextInt();
    }

    /**
     * Mensaje mandado a consola
     * @param msg mensaje
     */
    public static void show(String msg){
        System.out.println(msg);
    }

    public static int selectFavortie(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el numero de boton ");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        System.out.println("6");
        System.out.println("7");
        System.out.println("8");
        System.out.println("9");
        System.out.println("10");
        System.out.println("11");
        System.out.println("12");
        int op = scanner.nextInt();
        return op;
    }

}
