package neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test

    void addNum_whenOnePlusOne_ThenReturnTwo() {
        //given
        int a = 1;
        int b = 1;
        int expected = 2;

        //expected
        int actual = Main.addNum(a, b);


        //then
        assertEquals(expected, actual);
    }



}
