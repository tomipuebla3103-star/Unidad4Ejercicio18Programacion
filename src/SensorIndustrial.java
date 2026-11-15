public abstract class SensorIndustrial {
    protected int idSensor;
    protected boolean estadoOperativo;

    public SensorIndustrial(int idSensor, boolean estadoOperativo) {
        this.idSensor = idSensor;
        this.estadoOperativo = estadoOperativo;
    }

    public abstract String leerMetrica();

    public void mostrarEstado() {
        System.out.println("Sensor " + idSensor +
                " - Estado operativo: " +
                (estadoOperativo ? "Activo" : "Inactivo"));
    }
}
