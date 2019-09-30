package br.imd.local.main;

import br.imd.local.heap.*;

public class Main {

    public static void main(String[] args) {
        //Heap / Priority Queue
        FilaBanco fila = new FilaBanco();
        Pessoa fulano = new Pessoa("fulano",10);
        Pessoa beltrano = new Pessoa("beltrano",12);
        Pessoa cicrano = new Pessoa("cicrano",13);

        fila.addPessoa(fulano);
        fila.addPessoa(beltrano);
        fila.addPessoa(cicrano);

        fulano.setIdade(70);

       for(int i = 0; i < fila.getSize();i++){
           System.out.println(fila.pessoas[i].getNome() +"("+fila.pessoas[i].getIdade()+" A)" + " esta sendo atendido");
       }

    }
}
