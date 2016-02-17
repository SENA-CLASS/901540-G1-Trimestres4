package sininyeccion;


import sininyeccion.Motor;

public class Vehiculo {

    private Motor motor = new Motor();
    
    /** @retorna la velocidad del vehículo*/
    public Double enAceleracionDePedal(int presionDePedal) {
        motor.setPresionDePedal(presionDePedal);
        int torque = motor.getTorque();
        Double velocidad = (double)torque*2;
        return velocidad;
    }

}