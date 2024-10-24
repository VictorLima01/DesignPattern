package com.designpatter.EstudosDesignPatter.DesignPatterns.test;

import com.designpatter.EstudosDesignPatter.DesignPatterns.dominio.Pessoa;

public class BuilderPatternTest01 {

    public static void main(String[] args){
        //new Pessoa("Victor", "Lima", "victorlima", "victor.lima@gmail.com");
       Pessoa build = new Pessoa.PessoaBuilder()
               .firstname("Victor")
               .lastName("Lima")
               .userName("victorlima")
               .email("victor.lima@gmail.com.br")
               .build();

       System.out.println(build);
    }
}
