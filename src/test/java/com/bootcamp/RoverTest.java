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
        assertEquals("Invalid Initial Position",new Rover(5,5,6,5,'N').moveOneStep());
    }

    @Test
    @DisplayName("when plateau size is 2*2 and rover starts from 1,3 southwards")
    void plateau_2_2_rover_1_3_S() {
        assertEquals("Invalid Initial Position",new Rover(2,2,1,3,'S').moveOneStep());
    }

    @Test
    @DisplayName("moveOneStep northwards when plateau size is 4*4 and rover starts from 1,3")
    void plateau_4_4_rover_1_3_N_move() {
        assertEquals("1 4 N",new Rover(4,4,1,3,'N').moveOneStep());
    }

    @Test
    @DisplayName("moveOneStep southwards when plateau size is 4*4 and rover starts from 1,3")
    void plateau_4_4_rover_1_3_S_move() {
        assertEquals("1 2 S",new Rover(4,4,1,3,'S').moveOneStep());
    }

    @Test
    @DisplayName("moveOneStep eastwards when plateau size is 4*4 and rover starts from 1,3")
    void plateau_4_4_rover_1_3_E_move() {
        assertEquals("2 3 E",new Rover(4,4,1,3,'E').moveOneStep());
    }

    @Test
    @DisplayName("moveOneStep westwards when plateau size is 4*4 and rover starts from 1,3")
    void plateau_4_4_rover_1_3_W_move() {
        assertEquals("0 3 W",new Rover(4,4,1,3,'W').moveOneStep());
    }

    @Test
    @DisplayName("moveOneStep northwards when plateau size is 4*4 and rover starts from 1,4")
    void plateau_4_4_rover_1_4_N_move() {
        assertEquals("Invalid Move",new Rover(4,4,1,4,'N').moveOneStep());
    }

    @Test
    @DisplayName("moveOneStep southwards when plateau size is 4*4 and rover starts from 1,0")
    void plateau_4_4_rover_1_0_S_move() {
        assertEquals("Invalid Move",new Rover(4,4,1,0,'S').moveOneStep());
    }

    @Test
    @DisplayName("moveOneStep eastwards when plateau size is 4*4 and rover starts from 4,0")
    void plateau_4_4_rover_4_0_E_move() {
        assertEquals("Invalid Move",new Rover(4,4,4,0,'E').moveOneStep());
    }

    @Test
    @DisplayName("moveOneStep westwards when plateau size is 4*4 and rover starts from 0,0")
    void plateau_4_4_rover_0_0_W_move() {
        assertEquals("Invalid Move",new Rover(4,4,0,0,'W').moveOneStep());
    }


    @Test
    @DisplayName("turn left when plateau size is 4*4 and rover starts from 1,3 northwards")
    void plateau_4_4_rover_1_3_N_turn_left() {
        assertEquals("1 3 W",new Rover(4,4,1,3,'N').turnLeft());
    }

    @Test
    @DisplayName("turn left when plateau size is 4*4 and rover starts from 1,3 southwards")
    void plateau_4_4_rover_1_3_S_turn_left() {
        assertEquals("1 3 E",new Rover(4,4,1,3,'S').turnLeft());
    }

    @Test
    @DisplayName("turn left when plateau size is 4*4 and rover starts from 1,3 eastwards")
    void plateau_4_4_rover_1_3_E_turn_left() {
        assertEquals("1 3 N",new Rover(4,4,1,3,'E').turnLeft());
    }

    @Test
    @DisplayName("turn left when plateau size is 4*4 and rover starts from 1,3 westwards")
    void plateau_4_4_rover_1_3_W_turn_left() {
        assertEquals("1 3 S",new Rover(4,4,1,3,'W').turnLeft());
    }

    @Test
    @DisplayName("turn right when plateau size is 4*4 and rover starts from 1,3 northwards")
    void plateau_4_4_rover_1_3_N_turn_right() {
        assertEquals("1 3 E",new Rover(4,4,1,3,'N').turnRight());
    }

    @Test
    @DisplayName("turn right when plateau size is 4*4 and rover starts from 1,3 southwards")
    void plateau_4_4_rover_1_3_S_turn_right() {
        assertEquals("1 3 W",new Rover(4,4,1,3,'S').turnRight());
    }

    @Test
    @DisplayName("turn right when plateau size is 4*4 and rover starts from 1,3 eastwards")
    void plateau_4_4_rover_1_3_E_turn_right() {
        assertEquals("1 3 S",new Rover(4,4,1,3,'E').turnRight());
    }

    @Test
    @DisplayName("turn right when plateau size is 4*4 and rover starts from 1,3 westwards")
    void plateau_4_4_rover_1_3_W_turn_right() {
        assertEquals("1 3 N",new Rover(4,4,1,3,'W').turnRight());
    }

    @Test
    @DisplayName("when plateau size is 5*5 and rover starts from 1,2 northwards")
    void plateau_5_5_rover_1_2_N() {
        assertEquals("1 3 N",new Rover(5,5,1,2,'N').moveOnPath("LMLMLMLMM"));
    }

    @Test
    @DisplayName("when plateau size is 5*5 and rover starts from 3,3 eastwards")
    void plateau_5_5_rover_3_3_E() {
        assertEquals("5 1 E",new Rover(5,5,3,3,'E').moveOnPath("MMRMMRMRRM"));
    }

}
