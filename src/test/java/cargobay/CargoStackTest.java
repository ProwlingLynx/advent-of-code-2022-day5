package cargobay;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CargoStackTest {
//    There is a pop method, but it is being used by the other methods in the test so I did not deem it worth
//    adding a separate test for the pop method since it's behavior is included in these methods.
    CargoStack<String> testCargoStack;
    @BeforeEach
    void setup(){
        testCargoStack = new CargoStack<>();
    }
    @Test
    void loadCargoContainerToCargoStack() {
//        arrange
        testCargoStack.loadCargoContainerToCargoStack("S");
        testCargoStack.loadCargoContainerToCargoStack("T");
        testCargoStack.loadCargoContainerToCargoStack("Z");

        assertAll(
                () -> assertEquals("Z", testCargoStack.popCargoContainer().getCargo()),
                () -> assertEquals("T", testCargoStack.popCargoContainer().getCargo()),
                () -> assertEquals("S", testCargoStack.popCargoContainer().getCargo())
        );
    }

    @Test
    void peek() {
    }

    @Test
    void addCargoContainer() {
        CargoContainer<String> testCargoContainer = new CargoContainer<>("HI");
        testCargoStack.addCargoContainer(testCargoContainer);
        assertEquals(testCargoContainer, testCargoStack.popCargoContainer());
    }
}