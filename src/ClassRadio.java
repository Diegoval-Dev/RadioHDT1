public class ClassRadio implements IRadio{
    private boolean estado = false;
    private int emisoraAM = 520;
    private double emisoraFM = 87.7;

    private String frecuencia = "FM";
    private int[] favoritasAM = new int[11];
    private double[] favoritasFM = new double[11];

    /**
     * Metodo para encender la radio
     */
    @Override
    public void on() {
        estado = true;
    }

    /**
     * metodo para apagar la radio
     */
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

    /**
     * Obtiene la frecuencia actual de la radio
     * @return
     */
    @Override
    public String getFrequence() {
        return this.frecuencia;
    }

    /**
     * Avanza una estacion, ya sea en AM o FM
     */
    @Override
    public void Forward() {
        if(this.frecuencia.equals("FM")){
            this.emisoraFM = this.emisoraFM + 0.2;
        } else if (this.frecuencia.equals(("AM"))) {
            this.emisoraAM = this.emisoraAM + 10;
        }
    }

    /**
     * Regresa una estacion
     */
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
     * Obtiene la emisora FM actual
     * @return emisoraFM
     */
    @Override
    public double getFMActualStation() {
        return emisoraFM;
    }

    /**
     * modifica la frecuencia FM actual
     * @param actualStation recibe la frecuencia a poner
     */
    @Override
    public void setFMActualStation(double actualStation) {
        this.emisoraFM = actualStation;
    }
    /**
     *Obtiene la emisora AM actual
     * @return emisoraAM
     */
    @Override
    public int getAMActualStation() {
        return emisoraAM;
    }

    /**
     * Modifica la emisora AM actual
     * @param actualStation la nueva emisora AM
     */
    @Override
    public void setAMActualStation(int actualStation) {
        this.emisoraAM = actualStation;
    }

    /**
     * Guarda una emisora FM en favoritos
     * @param actualStation estacion actual a guardar
     * @param slot subindice a guardar
     */
    @Override
    public void saveFMStation(double actualStation, int slot) {
        this.favoritasFM[slot] = actualStation;
    }

    /**
     * guarda una emisora AM en favoritas
     * @param actualStation emisora actual a guardar
     * @param slot subindice a guardar
     */
    @Override
    public void saveAMStation(int actualStation, int slot) {
        this.favoritasAM[slot] = actualStation;
    }

    /**
     * obtiene la emisora segun el slot que recibe
     * @param slot numero de subindice de la emisora
     * @return la emisora
     */
    @Override
    public double getFMSlot(int slot) {
        return this.favoritasFM[slot];
    }

    /**
     * obtiene la emisora segun el slot que recibe
     * @param slot numero de subindice de la emisora
     * @return la emisora
     */
    @Override
    public int getAMSlot(int slot) {
        return this.favoritasAM[slot];
    }
}
