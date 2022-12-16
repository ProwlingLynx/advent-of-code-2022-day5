package cargobay;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class CargoContainerTest {
    @Test
    void getCargo(){
        String expected = "T";
        CargoContainer<String> testContainer = new CargoContainer("T");
        String actual = testContainer.getCargo();
        assertEquals(expected, actual);
    }
}