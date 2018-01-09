package com.password;

import com.Trip;

/**
 * Created by Mahmut on 1/7/2018.
 */
public class TourB extends Trip {

    public void doFirstDay() {
        System.out.println("Tour B - day1");
    }

    public void doSecondDay() {
        System.out.println("Tour B - day2");

    }

    public void doThirdDay() {
        System.out.println("Tour B - day3");

    }

    public void doReturningTransport() {
        System.out.println("Tour B - returning Transport vehicle is plane");
    }

    public void hook(){
        specialService();
    }

    private void specialService(){
        System.out.println("Special service of Tour B");
    }
}
