package com.ffbit.game_of_life;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RulesTest {

    @Test
    public void itShouldLiveWhenThereAreTwoNeighbours() throws Exception {
        Field field = new Field(3);
        field.setLive(0, 0);
        field.setLive(0, 1);

        field.setLive(1, 1);

        assertTrue("cell should be alive", field.isAlive(1, 1));
    }

    @Test
    public void itShouldLiveWhenThereAreThreeNeighbours() throws Exception {
        Field field = new Field(3);
        field.setLive(0, 0);
        field.setLive(0, 1);
        field.setLive(0, 2);

        field.setLive(1, 1);

        assertTrue("cell should be alive", field.isAlive(1, 1));
    }

    @Test
    public void itShouldDeadWhenThereIsOneNeighbour() throws Exception {
        Field field = new Field(3);
        field.setLive(0, 1);

        field.setLive(1, 1);

        assertFalse("cell should be dead", field.isAlive(1, 1));
    }

}
