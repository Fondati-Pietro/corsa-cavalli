package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Inizio");

        ArrayList<Cavalli> cavallo = new ArrayList<Cavalli>();
        ArrayList<String> nome = new ArrayList<String>();

        for (int i = 0; i < 20; i++) {
            Cavalli cav = new Cavalli(nome);
            cavallo.add(cav);
        }
        for (int i = 0; i < cavallo.size(); i++) {
            cavallo.get(i).start();
        }
        for (int i = 0; i < cavallo.size(); i++) {
            cavallo.get(i).join();
        }
        for (int i = 1; i < cavallo.size(); i++) {
            System.out.println(i + ": " + nome.get(i));
        }
    }
}