package com.example;

import java.util.ArrayList;

public class Cavalli extends Thread{
    int meta;
    ArrayList<String> cavalli;

    public Cavalli(ArrayList<String> c) {
        meta = 50;
        this.cavalli = c;
    }

    public void run(){
        for (int i = 0; i < meta; i++) {
            try {
                Thread.sleep((int) (Math.random() * 1000));
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        cavalli.add(this.getName());
    }
    
    
}
