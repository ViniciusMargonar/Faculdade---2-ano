package br.ifpr.aula.construtores;

public class TestePessoa {
    public static void main(String[] args) {
        // Para executar precisa estar no método Main
        Pessoa pessoa = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        
        pessoa.nome = "Você sabe quem!";
        pessoa.anoNascimento = 2000;

        System.out.println(pessoa.nome);
        System.out.println(pessoa.anoNascimento);

    }
}
