package modification;


import parts.*;

public class Run {

    public static void main(String[] args) {


        //Polimorfismo y composicion se aplica en todas las lineas.
        new CarroDiesel(new MotorCincoMilcc(), new RelacionesDiferencialCuatroPuntoNueve(), new SuspensionARB()).tipoCarroOffRoad();
        new CarroDiesel(new MotorCincoMilcc(), new RelacionesDiferencialCuatroPuntoSiete(), new SuspensionARB()).tipoCarroOffRoad();
        new CarroDiesel(new MotorCincoMilcc(), new RelacionesDiferencialCuatroPuntoSiete(), new SuspensionTJM()).tipoCarroOffRoad();
        new CarroDiesel(new MotorCincoMilcc(), new RelacionesDiferencialCuatroPuntoNueve(), new SuspensionTJM()).tipoCarroOffRoad();

        System.out.println("-------------------------------------------------------------------------");

        new CarroDiesel(new MotorSeisMilcc(), new RelacionesDiferencialCuatroPuntoNueve(), new SuspensionARB()).tipoCarroOffRoad();
        new CarroDiesel(new MotorSeisMilcc(), new RelacionesDiferencialCuatroPuntoSiete(), new SuspensionARB()).tipoCarroOffRoad();
        new CarroDiesel(new MotorSeisMilcc(), new RelacionesDiferencialCuatroPuntoSiete(), new SuspensionTJM()).tipoCarroOffRoad();
        new CarroDiesel(new MotorSeisMilcc(), new RelacionesDiferencialCuatroPuntoNueve(), new SuspensionTJM()).tipoCarroOffRoad();
    }
}
