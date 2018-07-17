package eu.silikonsenke.billhates.model;

import java.time.ZonedDateTime;

public class State {
    private void State() {}

    private static State INSTANCE = new State();

    public static State getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new State();
        }
        return INSTANCE;
    }

    private ZonedDateTime Systemzeit;

    public void setSystemzeit(ZonedDateTime systemzeit) {
        Systemzeit = systemzeit;
    }


}
