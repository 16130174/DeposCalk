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
    

}
