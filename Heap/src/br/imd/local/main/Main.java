package br.imd.local.main;

import br.imd.local.heap.*;

public class Main {

    public static void main(String[] args) {
        //Heap / Priority Queue
        FilaBanco fila = new FilaBanco();
        Pessoa fulano = new Pessoa("fulano",10);
        Pessoa beltrano = new Pessoa("beltrano",12);
        Pessoa cicrano = new Pessoa("cicrano",13);
        Pessoa vovo = new Pessoa("vovo",80);

        fila.addPessoa(fulano);
        fila.addPessoa(beltrano);
        fila.addPessoa(cicrano);
        fila.addPessoa(vovo);

        fulano.setIdade(70);

       while (fila.getSize() != 0){
           System.out.println(fila.pessoas[0].getNome() +"("+fila.pessoas[0].getIdade()+" A)" + " esta sendo atendido");
           fila.remove();
       }

    }
}
