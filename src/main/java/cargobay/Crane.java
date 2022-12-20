package cargobay;

import java.util.ArrayList;
import java.util.List;

class Crane {
    static void moveCargoFromStackToStack(int amountOfCargo, CargoStack sourceStack, CargoStack destinationStack){
        while(amountOfCargo > 0){
            CargoContainer cargo = sourceStack.popCargoContainer();
            destinationStack.addCargoContainer(cargo);
        }
    }
}
