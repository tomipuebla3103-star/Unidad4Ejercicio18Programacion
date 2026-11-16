<img width="447" height="293" alt="image" src="https://github.com/user-attachments/assets/f0ad8cab-5aec-4069-9c9c-e76bb5c457b4" />

 Sistema de Lectura de Sensores Industriales

 Descripción

Este proyecto consiste en desarrollar un sistema de monitoreo de sensores industriales utilizando Java.

El sistema permite administrar diferentes tipos de sensores instalados en una planta de manufactura, como sensores de temperatura, presión y flujo. Cada dispositivo obtiene sus mediciones y las convierte en valores numéricos según sus características.

 Objetivo

Crear una clase abstracta SensorIndustrial que establezca una estructura general para todos los sensores y utilizar el polimorfismo para obtener las métricas de cada dispositivo mediante un método común.

 Clases utilizadas

SensorIndustrial: clase abstracta que contiene los atributos idSensor y estadoOperativo, además del método abstracto leerMetrica().

SensorTemperatura: representa un sensor que mide la temperatura y convierte las señales eléctricas en valores numéricos.

SensorPresion: representa un sensor que mide la presión y realiza su correspondiente conversión.

SensorFlujo: representa un sensor que mide el flujo y obtiene sus mediciones mediante su propia lógica.

PanelControl: administra una lista de sensores y permite solicitar sus lecturas de manera polimórfica.

Main: contiene el método principal, instancia los diferentes sensores y muestra las métricas y estados operativos por consola.

 Conceptos aplicados

Clases abstractas: permiten establecer una estructura común para los sensores.

Herencia: permite que los sensores concretos compartan los atributos y comportamientos de SensorIndustrial.

Polimorfismo: permite solicitar las lecturas de diferentes sensores utilizando una referencia del tipo general.

Sobrescritura de métodos: cada sensor implementa su propia versión de leerMetrica().

Colecciones heterogéneas: permiten almacenar distintos tipos de sensores en una misma lista.

 Funcionamiento

Se crea la clase abstracta SensorIndustrial con sus atributos y método abstracto.

Se desarrollan las clases SensorTemperatura, SensorPresion y SensorFlujo.

Cada sensor implementa su propia conversión de señales eléctricas a valores numéricos.

La clase PanelControl administra los dispositivos y solicita sus mediciones.

En el Main se crean sensores de diferentes tipos y se agregan al panel.

Se realiza un barrido de métricas para obtener las lecturas de todos los sensores.

Finalmente, se muestran los valores obtenidos y el estado operativo de cada dispositivo por consola.

 Tecnologías utilizadas

Java

IntelliJ IDEA

Programación Orientada a Objetos (POO)

 Resultado esperado

El sistema permite monitorear diferentes tipos de sensores industriales desde un único panel de control. Cada dispositivo realiza su propia lectura y conversión de datos, demostrando el funcionamiento del polimorfismo mediante clases abstractas y herencia.
