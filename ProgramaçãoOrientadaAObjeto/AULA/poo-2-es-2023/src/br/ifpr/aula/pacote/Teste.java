package br.ifpr.aula.pacote;

public class Teste {
    int x;
    public static void main(String[] args){

        Teste table = new Teste();
        Jogador simaoPerdedor = new Jogador();
        System.out.println(table.x); // table.x objeto acessa o atributo X
        table.imprimir(); // dentro de um metodo static nao consegue acessar o atributo (nao consegue usar this.x)
        
        //String corCabelo = simaoPerdedor.getcorCabelo();
        simaoPerdedor.setcorCabelo(("Azul"));
    }
    public void imprimir(){
        System.out.println(this.x);
    }
}
