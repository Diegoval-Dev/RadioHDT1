import java.text.DecimalFormat;

public class ClassRadio implements IRadio{
    private boolean estado = false;
    private int emisoraAM = 520;
    private double emisoraFM = 87.7;


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

    }

    @Override
    public String getFrequence() {
        return null;
    }

    @Override
    public void Forward() {

    }

    @Override
    public void Backward() {

    }

    @Override
    public double getFMActualStation() {
        this.emisoraFM = this.emisoraFM + 0.2;

        return emisoraFM;
    }

    @Override
    public void setFMActualStation(double actualStation) {
    }


    @Override
    public int getAMActualStation() {
        this.emisoraAM = this.emisoraAM + 10;
        return emisoraAM;
    }
    @Override
    public void setAMActualStation(int actualStation) {
    }

    @Override
    public void saveFMStation(double actualStation, int slot) {

    }

    @Override
    public void saveAMStation(int actualStation, int slot) {

    }

    @Override
    public double getFMSlot(int slot) {
        return 0;
    }

    @Override
    public int getAMSlot(int slot) {
        return 0;
    }


}
