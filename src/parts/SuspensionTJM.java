package parts;

import interfaces.ISuspension;

public class SuspensionTJM implements ISuspension {

    //sobreescritura
    @Override
    public String tipo() {
        return "Suspencion TJM de 3.5 pulgadas";
    }
}
