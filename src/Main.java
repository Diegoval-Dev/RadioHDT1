public class Main {

    public static ClassRadio classR = new ClassRadio();
    public static void main(String[] args) {
        while(true){
            menu();
        }
    }

    public static void menu(){
        UI.show(Status());
        int opcion = UI.initial();
        switch(opcion){
            case 1:
                classR.isOn();
                UI.show(Status());
                break;
            case 2:
                classR.isOn();
                    UI.show("SE CAMBIO A FM");
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