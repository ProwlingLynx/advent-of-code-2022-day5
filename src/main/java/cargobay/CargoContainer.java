package cargobay;

public class CargoContainer <T>{
    private final T cargo;
    CargoContainer (T cargo){
        this.cargo = cargo;
    }
    T getCargo(){
        return cargo;
    }
}
