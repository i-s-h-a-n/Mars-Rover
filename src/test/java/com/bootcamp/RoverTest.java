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
        assertEquals("Invalid Initial Position",new Rover(5,5,6,5,'N').move());
    }

    @Test
    @DisplayName("when plateau size is 2*2 and rover starts from 1,3 southwards")
    void plateau_2_2_rover_1_3_S() {
        assertEquals("Invalid Initial Position",new Rover(2,2,1,3,'S').move());
    }

    @Test
    @DisplayName("when plateau size is 2*2 and rover moves from 1,3 northwards")
    void plateau_4_4_rover_1_3_N_move() {
        assertEquals("1 4 N",new Rover(4,4,1,3,'N').move());
    }

    @Test
    @DisplayName("when plateau size is 2*2 and rover moves from 1,3 southwards")
    void plateau_4_4_rover_1_3_S_move() {
        assertEquals("1 2 S",new Rover(4,4,1,3,'S').move());
    }

    @Test
    @DisplayName("when plateau size is 2*2 and rover moves from 1,3 eastwards")
    void plateau_4_4_rover_1_3_E_move() {
        assertEquals("2 3 E",new Rover(4,4,1,3,'E').move());
    }

    @Test
    @DisplayName("when plateau size is 2*2 and rover moves from 1,3 westwards")
    void plateau_4_4_rover_1_3_W_move() {
        assertEquals("0 3 W",new Rover(4,4,1,3,'W').move());
    }

}
