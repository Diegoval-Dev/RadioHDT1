import java.text.DecimalFormat;

public class Main {


    public static ClassRadio classR = new ClassRadio();

    /**
     * Manda a llamar al menu
     * @param args
     */
    public static void main(String[] args) {
        while(true){
            menu();
        }
    }

    /**
     * Instrucciones del menu principal
     */
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

            //Faltante opcción 6
            case 6:

            case 7:
                classR.off();
                UI.show(Status());
                break;

            default:
                UI.show("Error: Número no disponible");
                break;
        }

    }

    /**
     * Muestra el estado del radio
     * @return regresa el estado del radio
     */
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