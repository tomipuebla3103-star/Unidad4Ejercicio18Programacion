public class SensorPresion extends SensorIndustrial{
    private double senalElectrica;

    public SensorPresion(int idSensor, boolean estadoOperativo, double senalElectrica) {
        super(idSensor, estadoOperativo);
        this.senalElectrica = senalElectrica;
    }

    @Override
    public String leerMetrica() {
        double presion = senalElectrica * 5;

        return "Presion: " + presion + " bar";
    }
}
