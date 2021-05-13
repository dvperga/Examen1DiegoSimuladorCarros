package parts;

import interfaces.IMotor;

public class MotorSeisMilcc implements IMotor {

    //sobreescritura
    @Override
    public String tipo() {
        return "Motor 6000 cc";
    }
}
