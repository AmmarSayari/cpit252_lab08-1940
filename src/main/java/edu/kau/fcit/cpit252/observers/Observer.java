package edu.kau.fcit.cpit252.observers;

public abstract class Observer {

    private String receiver;
    public abstract void notify(String massage);

    public Observer(String receiver){

        this.receiver = receiver;

    }
}
