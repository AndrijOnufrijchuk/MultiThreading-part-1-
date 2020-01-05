package com.example.getReady;
import  java.lang.System;


class Check {
    public static void main(String [] args) {


        System.out.println("Starting thread...");
        Thread thread3 = new GuessANumber(24);
        thread3.start();
        try {
            thread3.join();
        } catch (InterruptedException e) {
            System.out.println("Thread error." + e);
        }
        System.out.println("Starting thread...");
        Thread thread4 = new GuessANumber(92);

        thread4.start();
        System.out.println("main() is ending...");
    }
}