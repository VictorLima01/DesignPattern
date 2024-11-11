package com.designpatter.EstudosDesignPatter.DesignPatterns.SingletonLazy.test;

import com.designpatter.EstudosDesignPatter.DesignPatterns.SingletonLazy.dominio.AircarftSingletonLazy;

public class AircraftSingletonLazyTest01 {
    public static void main(String[] args){
        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat){
        // Basicamente eu bloqueei de qualquer classe instanciar a minha classe, agora essa minha classe está sempre instanciada e utilizando um espaço de memoria
        AircarftSingletonLazy aircraft = AircarftSingletonLazy.getINSTANCE();
        System.out.println(aircraft.bookSeat(seat));
    }
}
