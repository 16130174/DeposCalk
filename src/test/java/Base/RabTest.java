package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Base.Rab;

class RabTest {


    Rab testingClass;

    @BeforeEach
    void setUp() {
        testingClass = new Rab();
    }

    @Test
    void summa() {
        assertEquals(105000.0, testingClass.Summa(1, 100000, 5, 12));
    }
    
    @Test
    void summa2() {
        assertEquals(115500.0, testingClass.Summa(1, 110000, 5, 12));
    }
    
    @Test
    void summa3() {
        assertEquals(179585.632602213, testingClass.Summa(0, 100000, 5, 12));
    }
    
    @Test
    void summa4() {
        assertEquals(197544.1958624343, testingClass.Summa(0, 110000, 5, 12));
    }
    
    @Test
    void summa5() {
        assertEquals(158704.0, testingClass.Summa(1, 145600, 12, 9));
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
