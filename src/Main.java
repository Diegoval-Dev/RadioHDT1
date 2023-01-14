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
                classR.on();
                UI.show(Status());
                break;
            case 2:
                if(classR.isOn()){
                    UI.show("SE CAMBIO A FM");
                }else{
                    UI.show("Encienda el radio para implementar la acción");
                }
                break;


            case 6:
                classR.off();
                UI.show(Status());
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