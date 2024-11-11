package com.designpatter.EstudosDesignPatter.DesignPatterns.SingletonLazy.dominio;

import com.designpatter.EstudosDesignPatter.DesignPatterns.SingletonEager.dominio.AircarftSingletonEager;

import java.util.HashSet;
import java.util.Set;

public class AircarftSingletonLazy {
    // Por ser uma atributo estátio como o INSTANCE e final todas as vezes que chamar a classe AircrafetSingleton
    // ele vai popular a variável INSTANCE automaticamente
    private static AircarftSingletonLazy INSTANCE;
    private final Set<String> avaliableSeats = new HashSet<>();
    private final String name;

    // Quando se trata do lazy Singleton que é tratar a INSTANCIA NULA, podemos ter problemas caso estiver tratando com multithreads
    // as multithreads podem se perder e chamar a Instancia duas vezes, uma solução seria usar o synchronized.
    // Mas para casos em que o synchronized for usado podemos ter problemas de performance, então o indicado é fazer um lock.
    // Para evitar problemas de permonance seria fazer o seguinte. Reduz a possibilidade de ter duas instancias com essa verificação
    public static AircarftSingletonLazy getINSTANCE(){
        if(INSTANCE == null){
            synchronized (AircarftSingletonLazy.class){
                if (INSTANCE == null){
                    INSTANCE = new AircarftSingletonLazy("787-900");
                }
            }
        }
        return INSTANCE;
    }
    private AircarftSingletonLazy(String name) {
        this.name = name;
    }

    {
        avaliableSeats.add("1A");
        avaliableSeats.add("1B");
    }

    public boolean bookSeat(String seat){
        return avaliableSeats.remove(seat);
    }
}
