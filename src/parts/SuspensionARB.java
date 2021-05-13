package parts;

import interfaces.ISuspension;

public class SuspensionARB implements ISuspension {

    //sobreescritura
    @Override
    public String tipo() {
        return "Suspencion ARB de 2.5 pulgadas";
    }
}
