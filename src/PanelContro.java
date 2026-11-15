public class PanelContro {
    private SensorIndustrial[] sensores;
    private int cantidad;

    public PanelContro() {
        sensores = new SensorIndustrial[10];
        cantidad = 0;
    }

    public void agregarSensor(SensorIndustrial sensor) {
        if (cantidad < sensores.length) {
            sensores[cantidad] = sensor;
            cantidad++;

            System.out.println("Se agrego un sensor al panel.");
        }
    }

    public void realizarBarrido() {

        System.out.println("\n--- BARRIDO DE SENSORES ---");

        for (int i = 0; i < cantidad; i++) {

            System.out.println(sensores[i].leerMetrica());

            sensores[i].mostrarEstado();
        }
    }
}
