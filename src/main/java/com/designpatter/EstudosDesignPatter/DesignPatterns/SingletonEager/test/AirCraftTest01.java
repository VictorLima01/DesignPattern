package com.designpatter.EstudosDesignPatter.DesignPatterns.SingletonEager.test;

import com.designpatter.EstudosDesignPatter.DesignPatterns.SingletonEager.dominio.Aircraft;

public class AirCraftTest01 {
    public static void main(String[] args){
        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat){
        Aircraft aircraft = new Aircraft("787-900");
        System.out.println(aircraft.bookSeat(seat));
    }
}
