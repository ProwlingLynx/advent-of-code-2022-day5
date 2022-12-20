package cargobay;

import java.util.Stack;

class CargoStack<T> {
    private final Stack<CargoContainer<T>> cargoStack = new Stack<>();

    void loadCargoContainerToCargoStack(T cargo){
        CargoContainer<T> cargoContainer = new CargoContainer<>(cargo);
        cargoStack.add(cargoContainer);
    }
    T peek(){
        return cargoStack.peek().getCargo();
    }
    void addCargoContainer(CargoContainer<T> cargoContainer){
        cargoStack.add(cargoContainer);
    }
    CargoContainer<T> popCargoContainer(){
        return cargoStack.pop();
    }
    int getSize(){
        return cargoStack.size();
    }
}
