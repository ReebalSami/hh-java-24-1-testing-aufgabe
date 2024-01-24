package neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void addNum() {
        //given
        int a = 1;
        int b = 1;
        int expected = 2;

        //expected
        int actual = Main.addNum(a, b);


        //then
        assertEquals(expected, actual);
    }

    @Test
    void productNum_whenTwoProductTwo_thenReturnFour() {
        //given
        int a = 2;
        int b = 2;
        int expected = 4;

        //expected
        int actual = Main.productNum(a, b);


        //then
        assertEquals(expected, actual);
    }
}