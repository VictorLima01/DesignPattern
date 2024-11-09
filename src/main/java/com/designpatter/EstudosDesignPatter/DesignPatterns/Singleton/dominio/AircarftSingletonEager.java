package com.designpatter.EstudosDesignPatter.DesignPatterns.Singleton.dominio;

import java.util.HashSet;
import java.util.Set;

public class AircarftSingletonEager {
    // Por ser uma atributo estátio como o INSTANCE e final todas as vezes que chamar a classe AircrafetSingleton
    // ele vai popular a variável INSTANCE automaticamente
    private static final AircarftSingletonEager INSTANCE = new AircarftSingletonEager("787-900");
    private final Set<String> avaliableSeats = new HashSet<>();
    private final String name;

    private AircarftSingletonEager(String name) {
        this.name = name;
    }

    {
        avaliableSeats.add("1A");
        avaliableSeats.add("1B");
    }

    public static AircarftSingletonEager getINSTANCE(){
        return INSTANCE;
    }

    public boolean bookSeat(String seat){
        return avaliableSeats.remove(seat);
    }
}
