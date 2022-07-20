package com.bootcamp;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverTest {
    @Test
    void setup() {
        assertEquals(1,1);
    }

    @Test
    @DisplayName("when plateau size is 5*5 and rover starts from 6,5 northwards")
    void plateau_5_5_rover_6_5_N() {
        assertEquals("Invalid Initial Position",new Rover(5,5,6,5,'N').move("LMLM"));
    }

    @Test
    @DisplayName("when plateau size is 2*2 and rover starts from 1,3 southwards")
    void plateau_2_2_rover_1_3_S() {
        assertEquals("Invalid Initial Position",new Rover(2,2,1,3,'S').move("LMLM"));
    }

}
