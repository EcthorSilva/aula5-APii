package controller;

import model.ListaCad;

public class UsaCad {
    public static void main(String[] args) {
        ListaCad c1 = new ListaCad();

        
        c1.addNewCad(10);
        c1.addNewCad(20);
        c1.plotar();
    }
}
