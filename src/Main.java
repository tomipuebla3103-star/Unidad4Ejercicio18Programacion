//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    PanelContro panel = new PanelContro();

    SensorTemperatura temperatura = new SensorTemperatura(1, true, 3.5);

    SensorPresion presion = new SensorPresion(2, true, 4.2);

    SensorFlujo flujo = new SensorFlujo(3, false, 2.5);

    panel.agregarSensor(temperatura);
    panel.agregarSensor(presion);
    panel.agregarSensor(flujo);

    panel.realizarBarrido();
}
