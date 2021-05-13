package parts;

import interfaces.IMotor;

public class MotorCincoMilcc implements IMotor {

    //sobreescritura
    @Override
    public String tipo() {
        return "Motor 5000 cc";
    }
}
