package org.innay;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;


public class TriangleTest
{
    static Logger logger = LoggerFactory.getLogger(TriangleTest.class);

    @Test
    @DisplayName("Testing if 3 sides can build triangle")
    public void isThisTriangleTest() {
        logger.info("isThisTriangleTest started");
        assertTrue( Triangle.isThisTriangle(3, 4, 5) );
        assertTrue( Triangle.isThisTriangle(3, 4, 3) );
        assertFalse( Triangle.isThisTriangle(3, 4, 7) );
        assertFalse( Triangle.isThisTriangle(3, 4, 8) );
        assertFalse( Triangle.isThisTriangle(-1, 4, 8) );
    }

    @Test
    @DisplayName("Testing Area function")
    public void getSquareTest() {
        logger.info("getSquareTest started");

        assertEquals(6, Triangle.getArea(3, 4, 5));
        assertEquals(20, Triangle.getArea(5, 10, 8));
        assertEquals(8, Triangle.getArea(4, 4, 5));
        assertEquals(20, Triangle.getArea(6, 7, 8));

        assertNotEquals(21, Triangle.getArea(6, 7, 8));
    }


}
