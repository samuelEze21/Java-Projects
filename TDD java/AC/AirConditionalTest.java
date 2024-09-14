package AC;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class AirConditionalTest {

    @Test
    public void testThat_I_have_ACTurnedOn() {
        AirConditional airConditional = new AirConditional();

        airConditional.turnOn();
        assertTrue(airConditional.turnOn(), "The Ac is turned on");
    }

    @Test
    public void testThat_AC_is_Off_when_turned_off() {
        //given
        AirConditional airConditional = new AirConditional();
        //when
        airConditional.turnOff();
        //assert
        assertTrue(airConditional.turnOff(),"The Ac is off");
    }

    @Test
    public void testThat_when_ACisOn_and_TemperatureIncrease_The_cool_Reduces() {
        AirConditional airConditional = new AirConditional();

        airConditional.turnOn();

        // Loop to increase temperature from 24 to 30
        for (int temperature = 24; temperature <= 30; temperature++) {
            airConditional.increaseTemperature();
        }

// Assert that the final temperature is 30
        assertEquals(30, airConditional.getTemperature(), "The temperature should be 30 after increasing from 24, " +
                "and the cooling reduces as you go.");

    }

    @Test
    public void testThat_When_ACisOn_and_TemperatureDecrease_The_cool_Reduces() {

        AirConditional airConditional = new AirConditional();

        airConditional.turnOn();
        for (int temperature = 24; temperature >= 16; temperature--) {
            airConditional.increaseTemperature();
            int currentCoolingLevel = airConditional.getCoolingLevel();

        }
    }

    }
