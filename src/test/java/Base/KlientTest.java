package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Base.Klient;

class KlientTest {


    Klient testingClass;

    @BeforeEach
    void setUp() {
        testingClass = new Klient();
    }

    @Test
    void sroc() {
        assertEquals(30.0, testingClass.Calk(15000, 12000, 10));
    }
    
    @Test
    void sroc1() {
        assertEquals(1380.0, testingClass.Calk(15000, 1200, 10));
    }
    
    @Test
    void sroc2() {
        assertEquals(1380.0, testingClass.Calk(15000, 1200, 10));
    }
  
    @Test
    void sroc3() {
        assertEquals(30.0, testingClass.Calk(15000, 12000, 10));
    }
    
    @Test
    void sroc4() {
        assertEquals(155.3986231401288, testingClass.Calk(265000, 90060, 15));
    }
    
}
