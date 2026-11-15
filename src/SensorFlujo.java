public class SensorFlujo extends SensorIndustrial{
    private double senalElectrica;

    public SensorFlujo(int idSensor, boolean estadoOperativo, double senalElectrica) {
        super(idSensor, estadoOperativo);
        this.senalElectrica = senalElectrica;
    }

    @Override
    public String leerMetrica() {
        double flujo = senalElectrica * 20;

        return "Flujo: " + flujo + " L/min";
    }
}
