package com.designpatter.EstudosDesignPatter.DesignPatterns.DTO;

import com.designpatter.EstudosDesignPatter.DesignPatterns.Builder.dominio.Pessoa;
import com.designpatter.EstudosDesignPatter.DesignPatterns.Factory.dominio.Country;
import com.designpatter.EstudosDesignPatter.DesignPatterns.Factory.dominio.Currency;
import com.designpatter.EstudosDesignPatter.DesignPatterns.Factory.dominio.CurrencyFactory;
import com.designpatter.EstudosDesignPatter.DesignPatterns.SingletonEager.dominio.Aircraft;

public class DataTransferObjectTest01 {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft("777");
        Country country = Country.BRAZIL;
        Currency currency = CurrencyFactory.newCurrency(country);
        Pessoa pessoa = new Pessoa.PessoaBuilder()
                .firstname("Victor")
                .lastName("Lima")
                .userName("victorlima")
                .email("victor.lima@gmail.com.br")
                .build();
        ReportDto reportDto = ReportDto.ReportDtoBuilder.builder()
                .aircraftName(aircraft.getName())
                .country(country)
                .currency(currency)
                .personName(pessoa.getFirstName())
                .build();

        System.out.println("Report: " + reportDto.toString());
    }
}
