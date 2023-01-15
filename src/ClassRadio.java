public class ClassRadio implements IRadio{
    private boolean estado = false;
    private int emisoraAM = 520;
    private double emisoraFM = 87.7;

    private String frecuencia = "FM";

    private int[] favoritasAM = new int[11];
    private double[] favoritasFM = new double[11];


    @Override
    public void on() {
        estado = true;
    }


    @Override
    public void off() {
        estado = false;
    }

    /***
     * Este metodo nos indica si la radio esta encendida o apagada
     * @return true si la radio esta encendida y false cuando la radio este apagada
     */
    @Override
    public boolean isOn() {
        return estado;
    }

    /***
     * Este metodo nos ayuda a establecer la frecuencia, recibe un parametro llamado freq que puede "AM" o "FM"
     * @param freq La frecuencia la cual puede ser AM o FM, de lo contrario error.
     */
    @Override
    public void setFrequence(String freq) throws Exception {
        this.frecuencia = freq;
    }

    @Override
    public String getFrequence() {
        return this.frecuencia;
    }

    @Override
    public void Forward() {
        if(this.frecuencia.equals("FM")){
            this.emisoraFM = this.emisoraFM + 0.2;
        } else if (this.frecuencia.equals(("AM"))) {
            this.emisoraAM = this.emisoraAM + 10;
        }
    }

    @Override
    public void Backward() {
        if(this.frecuencia.equals("FM")){
            if(emisoraFM >= 0.02){
                this.emisoraFM = this.emisoraFM - 0.2;
            }
            else{
                /*aqui tiraria una exepcion de que la frecuencia no puede ser negativa, pero
                como no estaba contemplado solo lo deje en blanco
                */
            }
        } else if (this.frecuencia.equals(("AM"))) {
            if(emisoraAM >= 10){
                this.emisoraAM = this.emisoraAM - 10;
            }
            else {
                /*aqui tiraria una exepcion de que la frecuencia no puede ser negativa, pero
                como no estaba contemplado solo lo deje en blanco
                */
            }
        }
    }

    /**
     * aumenta la emision en multiplos de 0.2
     * @return emisoraFM
     */
    @Override
    public double getFMActualStation() {
        return emisoraFM;
    }

    @Override
    public void setFMActualStation(double actualStation) {
        this.emisoraFM = actualStation;
    }


    /**
     * aumenta la emision en multiplos de 10
     * @return emisoraAM
     */
    @Override
    public int getAMActualStation() {
        return emisoraAM;
    }


    @Override
    public void setAMActualStation(int actualStation) {
        this.emisoraAM = actualStation;
    }

    @Override
    public void saveFMStation(double actualStation, int slot) {
        this.favoritasFM[slot] = actualStation;
    }

    @Override
    public void saveAMStation(int actualStation, int slot) {
        this.favoritasAM[slot] = actualStation;
    }

    @Override
    public double getFMSlot(int slot) {
        return this.favoritasFM[slot];
    }

    @Override
    public int getAMSlot(int slot) {
        return this.favoritasAM[slot];
    }


}
