package com.designpatter.EstudosDesignPatter.DesignPatterns.Singleton.test;

import com.designpatter.EstudosDesignPatter.DesignPatterns.Singleton.dominio.AircarftSingletonEager;
import com.designpatter.EstudosDesignPatter.DesignPatterns.Singleton.dominio.Aircraft;

public class AircraftSingletonEagerTest01 {
    public static void main(String[] args){
        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat){
        // Basicamente eu bloqueei de qualquer classe instanciar a minha classe, agora essa minha classe está sempre instanciada e utilizando um espaço de memoria
        AircarftSingletonEager aircraft = AircarftSingletonEager.getINSTANCE();
        System.out.println(aircraft.bookSeat(seat));
    }
}