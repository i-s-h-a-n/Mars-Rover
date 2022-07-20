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
    @DisplayName("move northwards when plateau size is 4*4 and rover starts from 1,3")
    void plateau_4_4_rover_1_3_N_move() {
        assertEquals("1 4 N",new Rover(4,4,1,3,'N').move());
    }

    @Test
    @DisplayName("move southwards when plateau size is 4*4 and rover starts from 1,3")
    void plateau_4_4_rover_1_3_S_move() {
        assertEquals("1 2 S",new Rover(4,4,1,3,'S').move());
    }

    @Test
    @DisplayName("move eastwards when plateau size is 4*4 and rover starts from 1,3")
    void plateau_4_4_rover_1_3_E_move() {
        assertEquals("2 3 E",new Rover(4,4,1,3,'E').move());
    }

    @Test
    @DisplayName("move westwards when plateau size is 4*4 and rover starts from 1,3")
    void plateau_4_4_rover_1_3_W_move() {
        assertEquals("0 3 W",new Rover(4,4,1,3,'W').move());
    }

    @Test
    @DisplayName("move northwards when plateau size is 4*4 and rover starts from 1,4")
    void plateau_4_4_rover_1_4_N_move() {
        assertEquals("Invalid Move",new Rover(4,4,1,4,'N').move());
    }

    @Test
    @DisplayName("move southwards when plateau size is 4*4 and rover starts from 1,0")
    void plateau_4_4_rover_1_0_S_move() {
        assertEquals("Invalid Move",new Rover(4,4,1,0,'S').move());
    }

    @Test
    @DisplayName("move eastwards when plateau size is 4*4 and rover starts from 4,0")
    void plateau_4_4_rover_4_0_E_move() {
        assertEquals("Invalid Move",new Rover(4,4,4,0,'E').move());
    }

    @Test
    @DisplayName("move westwards when plateau size is 4*4 and rover starts from 0,0")
    void plateau_4_4_rover_0_0_W_move() {
        assertEquals("Invalid Move",new Rover(4,4,0,0,'W').move());
    }



//    @Test
//    @DisplayName("turn left when plateau size is 4*4 and rover starts from 1,3 northwards")
//    void plateau_4_4_rover_1_3_W_turn_left() {
//        assertEquals("1 3 W",new Rover(4,4,1,3,'N').turnLeft());
//    }

}
