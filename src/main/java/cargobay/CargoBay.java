package cargobay;

import java.util.ArrayList;
import java.util.List;

public class CargoBay {

    private List<CargoStack> stackList = new ArrayList<>();


    public void executeInstructions(String instructions){
//        "move 1 from 2 to 1" is the expected string input.
//        move is always at index 0, so we can start at index 4
        
        int indexOfFrom = instructions.indexOf("from");
        String amount = instructions.substring(4, indexOfFrom);
        
        int indexOfTo = instructions.indexOf("to");
        String source = instructions.substring(indexOfFrom + 4, indexOfTo);
        
        String destination = instructions.substring(indexOfTo + 2);

        try{
            int numberOfCargo = Integer.parseInt(amount);
            int cargoSourceIndex = Integer.parseInt(source);
            int cargoDestinationIndex = Integer.parseInt(destination);

            CargoStack sourceCargoStack = stackList.get(cargoSourceIndex - 1);
            CargoStack destinationCargoStack = stackList.get(cargoDestinationIndex - 1);
            Crane.moveCargoFromStackToStack(numberOfCargo, sourceCargoStack, destinationCargoStack);

        } catch (Exception e){
            System.out.println("Something went wrong.");
            e.printStackTrace();
        }

    }
}