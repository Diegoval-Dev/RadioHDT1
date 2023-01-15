import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassRadioTest {
    private boolean estado = false;
    private int emisoraAM = 520;
    private double emisoraFM = 87.7;

    private String frecuencia = "FM";
    private int[] favoritasAM = new int[11];
    private double[] favoritasFM = new double[11];
    @Test
    void on() {
        estado = true;
        System.out.println("estado:" + estado);
    }

    @Test
    void off() {
    }

    @Test
    void isOn() {
    }

    @Test
    void setFrequence() {
    }

    @Test
    void getFrequence() {
    }

    @Test
    void forward() {
        frecuencia = "AM";
        if(this.frecuencia.equals("FM")){
            System.out.println("frecuencia anterior: " + emisoraFM);
            this.emisoraFM = this.emisoraFM + 0.2;
            System.out.println("frecuencia nueva: " + emisoraFM);
        } else if (this.frecuencia.equals(("AM"))) {
            System.out.println("frecuencia anterior: " + emisoraAM);
            this.emisoraAM = this.emisoraAM + 10;
            System.out.println("frecuencia: " + emisoraAM);
        }
    }

    @Test
    void backward() {
        frecuencia = "AM";
        if(this.frecuencia.equals("FM")){
            if(emisoraFM >= 0.02){
                System.out.println("Emisora anterior: " + emisoraFM);
                this.emisoraFM = this.emisoraFM - 0.2;
                System.out.println("Emisora posterior: "+emisoraFM);
            }
            else{
                /*aqui tiraria una exepcion de que la frecuencia no puede ser negativa, pero
                como no estaba contemplado solo lo deje en blanco
                */
            }
        } else if (this.frecuencia.equals(("AM"))) {
            if(emisoraAM >= 10){
                System.out.println("Emisora anterior: " + emisoraAM);
                this.emisoraAM = this.emisoraAM - 10;
                System.out.println("Emisora posterior: "+emisoraAM);
            }
            else {
                /*aqui tiraria una exepcion de que la frecuencia no puede ser negativa, pero
                como no estaba contemplado solo lo deje en blanco
                */
            }
        }
    }

    @Test
    void getFMActualStation() {
    }

    @Test
    void setFMActualStation() {
    }

    @Test
    void getAMActualStation() {
    }

    @Test
    void setAMActualStation() {
    }

    @Test
    void saveFMStation() {
    }

    @Test
    void saveAMStation() {
    }

    @Test
    void getFMSlot() {
    }

    @Test
    void getAMSlot() {
    }
}