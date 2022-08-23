package easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class $283MoveZeroesTest {

    @Test
    void moveZeroes() {
        int[] ints = {0, 1, 2, 0};
        new $283MoveZeroes().moveZeroes(new int[]{0,1,2,0});
        System.out.println(Arrays.toString(ints));
    }
}