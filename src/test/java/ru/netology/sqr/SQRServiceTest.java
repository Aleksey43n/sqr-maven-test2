package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @Test
    void countSqr() {
        SQRService service = new SQRService();
        int min = 200;
        int max = 500;
        int expected = 8;
        int actual = service.countSqr(min, max);

        assertEquals(expected, actual);
    }

    @Test
    void countSqrMin() {
        SQRService service = new SQRService();
        int min = 90;
        int max = 100;
        int expected = 1;
        int actual = service.countSqr(min, max);

        assertEquals(expected, actual);
    }

    @Test
    void countSqrMax() {
        SQRService service = new SQRService();
        int min = 9700;
        int max = 9801;
        int expected = 1;
        int actual = service.countSqr(min, max);

        assertEquals(expected, actual);
    }
}