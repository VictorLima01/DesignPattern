package com.designpatter.EstudosDesignPatter.DesignPatterns.dominio;

public class Pessoa {

    private String firstName;
    private String lastName;
    private String userName;
    private String email;

    private Pessoa(String firstName, String lastName, String userName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


    public static class PessoaBuilder{
        private String firstName;
        private String lastName;
        private String userName;
        private String email;

        public PessoaBuilder firstname(String firstName){
            this.firstName = firstName;
            return this;
        }

        public PessoaBuilder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public PessoaBuilder userName(String userName){
            this.userName = userName;
            return this;
        }

        public PessoaBuilder email(String email){
            this.email = email;
            return this;
        }

        // o método nuilder serve para retornar o objeto Pessoa, para que todas as vezes eu quiser o objeto Pessoa
        // eu chamo o método build.
        public Pessoa build(){
            return new Pessoa(firstName, lastName, userName, email);
        }

    }



}
