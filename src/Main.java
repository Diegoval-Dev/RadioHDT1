import java.lang.reflect.GenericDeclaration;
import java.text.DecimalFormat;

import static java.lang.System.exit;

public class Main {

    //Aqui se instancia la clase radio, borrar y crear una nueva clase radio para calificar
    public static ClassRadio classR = new ClassRadio();


    /**
     * Manda a llamar al menu
     * @param args
     */
    public static void main(String[] args) throws Exception {
        while(true){
            menu();
        }
    }

    /**
     * Instrucciones del menu principal
     */
    public static void menu() throws Exception {



        int opcion = UI.initial();

        switch(opcion) {
            case 1:
                classR.on();
                UI.show(Status());
                break;
            case 2:
                if (classR.isOn()) {
                    if(!classR.getFrequence().equals("FM")){
                        classR.setFrequence("FM");
                    }else{
                        UI.show("La radio ya se encuentra en FM");
                    }
                    UI.show(Status());
                } else {
                    UI.show("Encienda el radio para implementar la acción");
                }
                break;
            case 3:
                if (classR.isOn()) {
                    if(!classR.getFrequence().equals("AM")){
                        classR.setFrequence("AM");
                    }else{
                        UI.show("La radio ya se encuentra en AM");
                    }
                    UI.show(Status());
                } else {
                    UI.show("Encienda el radio para implementar la acción");
                }
                break;
            case 4:
                if (classR.isOn()) {
                    if(classR.getFrequence().equals("FM")){
                        classR.Forward();
                        UI.show(Status());
                    }
                    else{
                        UI.show("Cambie la frecuencia a FM");
                    }
                } else {
                    UI.show("Encienda el radio para implementar la acción");
                }
                break;
            case 5:
                if (classR.isOn()) {
                    if(classR.getFrequence().equals("AM")){
                        classR.Forward();
                        UI.show(Status());
                    }
                    else{
                        UI.show("Cambie la frecuencia a AM");
                    }
                } else {
                    UI.show("Encienda el radio para implementar la acción");
                }
                break;


            case 6:
                if (classR.isOn()) {
                    int op = UI.selectFavortie();
                    if(classR.getFrequence().equals("FM")){
                        classR.saveFMStation(classR.getFMActualStation(), op);
                        UI.show("Emisora guardada en el boton " + op);
                    } else if(classR.getFrequence().equals("AM")) {
                        classR.saveAMStation(classR.getAMActualStation(), op);
                        UI.show("Emisora guardada en el boton " + op);
                    }
                } else {
                    UI.show("Encienda el radio para implementar la acción");
                }
                break;
            case 7:
                if (classR.isOn()) {
                    int op = UI.selectFavortie();
                    if(classR.getFrequence().equals("FM")){
                        classR.setFMActualStation(classR.getFMSlot(op));
                        UI.show(Status());
                    } else if(classR.getFrequence().equals("AM")) {
                        classR.setAMActualStation(classR.getAMSlot(op));
                        UI.show(Status());
                    }
                } else {
                    UI.show("Encienda el radio para implementar la acción");
                }
                break;
            case 8:
                classR.off();
                UI.show(Status());
                break;
            case 9:
                exit(0);

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
        DecimalFormat decimal = new DecimalFormat("0.0");
            String estado2;
            String emisora = "Desconocida";
            if (classR.isOn()) {
                if(classR.getFrequence().equals("FM")){
                    emisora = String.valueOf(decimal.format(classR.getFMActualStation()));
                } else if (classR.getFrequence().equals("AM")) {
                    emisora = String.valueOf(classR.getAMActualStation());
                }
                estado2 = "ESTADO: ENCENDIDO" + " FRECUENCIA: " + classR.getFrequence() + " Emisora: " + emisora;
            } else {
                estado2 = "ESTADO: APAGADO";
            }
            return estado2;
    }


}