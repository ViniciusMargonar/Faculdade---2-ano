package br.ifpr.aula.construtores;

public class Pessoa {
    String nome;
    String idade;
    int anoNascimento;

    public Pessoa(){
        anoNascimento = 1990;
    
    }
    public Pessoa(String nome){
        this(); // Ta chamando o construtor Pessoa.
        this.anoNascimento = 2000;
        this.nome = nome;  // Atribui o valor do parametro para o atributo do objeto ( Nome da pessoa ).
        this.log(); // Boa pratica colocar o this.
    }
    public void log(){
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(anoNascimento);
    }

}
