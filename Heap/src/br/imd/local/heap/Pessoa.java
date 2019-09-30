package br.imd.local.heap;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Pessoa implements ISubject {
    private String nome;
    private int idade;
    private int idade_antiga;
    ArrayList<IObserver> observer;
    public Pessoa(String nome, int idade) {
        this.nome  = nome;
        this.idade = idade;
        observer = new ArrayList<IObserver>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade_antiga = this.idade;
        this.idade = idade;
        notificar();
    }

    @Override
    public void register(IObserver o) {
        this.observer.add(o);
    }

    @Override
    public void unregister(IObserver o) {
        this.observer.remove(o);
    }

    @Override
    public void notificar() {
        for (IObserver i : observer){
            i.update(this,idade_antiga);
            idade_antiga = getIdade();
        }
    }
}
