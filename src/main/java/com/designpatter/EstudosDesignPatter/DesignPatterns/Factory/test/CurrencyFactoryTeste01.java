package com.designpatter.EstudosDesignPatter.DesignPatterns.Factory.test;

import com.designpatter.EstudosDesignPatter.DesignPatterns.Factory.dominio.Country;
import com.designpatter.EstudosDesignPatter.DesignPatterns.Factory.dominio.Currency;
import com.designpatter.EstudosDesignPatter.DesignPatterns.Factory.dominio.CurrencyFactory;

public class CurrencyFactoryTeste01 {
    public static void main(String[] args){
        Currency currency = CurrencyFactory.newCurrency(Country.BRAZIL);
        System.out.println(currency.getSymbol());
    }
}
