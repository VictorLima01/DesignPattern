package com.designpatter.EstudosDesignPatter.DesignPatterns.SingletonLazy.test;

import com.designpatter.EstudosDesignPatter.DesignPatterns.SingletonLazy.dominio.AircarftSingletonLazy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AircraftSingletonLazyTest01 {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        bookSeat("1A");
        bookSeat("1A");
        //É possível desativar o contrutor da classe de privado para publiuco da seguinte forma abaixo:
        // Lembrando que é uma prática ruim que não deve ser feita
        Constructor<AircarftSingletonLazy> constructor = AircarftSingletonLazy.class.getDeclaredConstructor(String.class);
        constructor.setAccessible(true);
        AircarftSingletonLazy aircarftSingletonLazy = constructor.newInstance("787-900");
        System.out.println(aircarftSingletonLazy);
    }

    private static void bookSeat(String seat){
        // Basicamente eu bloqueei de qualquer classe instanciar a minha classe, agora essa minha classe está sempre instanciada e utilizando um espaço de memoria
        AircarftSingletonLazy aircraft = AircarftSingletonLazy.getINSTANCE();
        System.out.println(aircraft.bookSeat(seat));
    }
}
