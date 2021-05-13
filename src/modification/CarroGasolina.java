package modification;

import interfaces.IMotor;
import interfaces.IRelacionesDiferenciales;
import interfaces.ISuspension;

public class CarroGasolina extends Carro{

    //inmutacion
    public final IMotor motor;
    public final IRelacionesDiferenciales relaciones;
    public final ISuspension suspension;

    //inyeccion de dependencia
    public CarroGasolina(IMotor motor, IRelacionesDiferenciales relaciones, ISuspension suspension){
        this.motor = motor;
        this.relaciones = relaciones;
        this.suspension = suspension;
        System.out.println("Carro de Gasolina");
    }

    //Sobreescritura
    public void tipoCarroOffRoad(){
        motor.tipo();
        relaciones.tipo();
        suspension.tipo();
    }
}
