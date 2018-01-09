package com;

/**
 * template method pattern base class
 * don't call us we'll call you - by extending and implementing abstract methods
 * Created by Mahmut on 1/7/2018.
 */

public abstract class Trip {

    /**
     *skeleton algorithm method
     */
    public final void performTrip() {
        doComingTransport();
        doFirstDay();
        doSecondDay();
        doThirdDay();
        hook();
        doReturningTransport();
    }

    public void doComingTransport() {
        System.out.println("We are getting guests with our service");
    }

    public abstract void doFirstDay();

    public abstract void doSecondDay();

    public abstract void doThirdDay();

    public abstract void doReturningTransport();

    public void hook() {

    }


}
