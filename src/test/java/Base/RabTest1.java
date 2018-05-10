package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Base.Rab;

class RabTest1 {


    Rab testingClass;

    @BeforeEach
    void setUp() {
        testingClass = new Rab();
    }
    
    @Test
    void summa6() {
        assertEquals(316227.66148680047, testingClass.Summa(0, 145600, 12, 9));
    }
    
    @Test
    void summa7() {
        assertEquals(70010.78390953124, testingClass.Summa(0, 65490, 9, 3));
    }
    
    @Test
    void summa8() {
        assertEquals(66963.525, testingClass.Summa(1, 65490, 9, 3));
    }
    
    @Test
    void summa9() {
        assertEquals(9846875.0, testingClass.Summa(1, 9453000, 10, 5));
    }
    
    @Test
    void summa10() {
        assertEquals(1.1593471338719502E7, testingClass.Summa(0, 9453000, 10, 5));
    }

}
