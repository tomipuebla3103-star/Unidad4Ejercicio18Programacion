public class SensorTemperatura extends SensorIndustrial{

    private double senalElectrica;

    public SensorTemperatura(int idSensor, boolean estadoOperativo, double senalElectrica) {
        super(idSensor, estadoOperativo);
        this.senalElectrica = senalElectrica;
    }

    @Override
    public String leerMetrica() {
        double temperatura = senalElectrica * 10;

        return "Temperatura: " + temperatura + " °C";
    }
}
