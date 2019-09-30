package br.imd.local.heap;

public interface ISubject {
    public void register(IObserver o);
    public void unregister(IObserver o);
    public void notificar(Pessoa self);
}
