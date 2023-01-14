import java.text.DecimalFormat;

public class Main {


    public static ClassRadio classR = new ClassRadio();
    public static void main(String[] args) {
        while(true){
            menu();
        }
    }

    public static void menu(){
        DecimalFormat decimal = new DecimalFormat("0.0");

        UI.show(Status());
        int opcion = UI.initial();

        switch(opcion) {
            case 1:
                classR.on();
                UI.show(Status());
                break;
            case 2:
                if (classR.isOn()) {
                    UI.show("Frecuencia = FM");
                } else {
                    UI.show("Encienda el radio para implementar la acción");
                }
                break;
            case 3:
                if (classR.isOn()) {
                    UI.show("Frecuencia AM");
                } else {
                    UI.show("Encienda el radio para implementar la acción");
                }
                break;
            case 4:
                if (classR.isOn()) {
                UI.show("Frecuencia = FM");
                UI.show("Estación = " +  decimal.format(classR.getFMActualStation()));
                } else {
                    UI.show("Encienda el radio para implementar la acción");
                }
                break;
            case 5:
                if (classR.isOn()) {
                UI.show("Frecuencia = AM");
                UI.show("Estación = " + classR.getAMActualStation());
                } else {
                    UI.show("Encienda el radio para implementar la acción");
                }
                break;


            case 7:
                classR.off();
                UI.show(Status());
                break;

            default:
                UI.show("Error: Número no disponible");
                break;
        }

    }



    public static String Status() {
            String estado2;
            if (classR.isOn()) {
                estado2 = "ESTADO: ENCENDIDO";
            } else {
                estado2 = "ESTADO: APAGADO";
            }
            return estado2;
    }


}