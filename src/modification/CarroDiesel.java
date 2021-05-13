package modification;

import interfaces.IMotor;
import interfaces.IRelacionesDiferenciales;
import interfaces.ISuspension;

public class CarroDiesel extends Carro{

    public final IMotor motor;
    public final IRelacionesDiferenciales relaciones;
    public final ISuspension suspension;

    //inyeccion de dependecia
    public CarroDiesel(IMotor motor, IRelacionesDiferenciales relaciones, ISuspension suspension){
        this.motor = motor;
        this.relaciones = relaciones;
        this.suspension = suspension;
        System.out.println("Carro de Diesel");
    }

    //Sobreescritura
    public void tipoCarroOffRoad(){
        System.out.println(motor.tipo());
        System.out.println(relaciones.tipo());
        System.out.println(suspension.tipo());
    }
}
