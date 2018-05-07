package Base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RabTest {

    Rab testingClass;

    @BeforeEach
    void setUp() {
        testingClass = new Rab();
    }

    @AfterEach
    void tearDown() {
        testingClass = null;
    }

    @Test
    void summa() {
        assertEquals(105000.0, testingClass.Summa(1, 100000, 5, 12));
    }
}