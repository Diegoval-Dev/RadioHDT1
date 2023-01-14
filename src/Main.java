public class Main {

    public static ClassRadio classR = new ClassRadio();
    public static void main(String[] args) {
        while(true){

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