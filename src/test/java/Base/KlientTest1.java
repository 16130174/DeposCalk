package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Base.Klient;

class KlientTest1 {

	Klient testingClass;

    @BeforeEach
    void setUp() {
        testingClass = new Klient();
    }
    
    @Test
    void sroc5() {
        assertEquals(70426.66666666667, testingClass.Calk(26500, 90, 5));
    }

    @Test
    void sroc6() {
        assertEquals(438.848254791223, testingClass.Calk(54930, 15430, 7));
    }
    
    @Test
    void sroc7() {
        assertEquals(428.94784995425437, testingClass.Calk(150000, 32790, 10));
    }
    
    @Test
    void sroc8() {
        assertEquals(32670.0, testingClass.Calk(327900, 1200, 10));
    }
    
    @Test
    void sroc9() {
        assertEquals(48885.0, testingClass.Calk(6550, 32, 5));
    }
    

}
