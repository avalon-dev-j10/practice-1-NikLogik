package ru.avalon.java.dev.j10.labs.factories;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nikitorches
 */
public class Randome {
    
    private int randomeNumber;

    
    public Randome(int randomeNumber){
        this.randomeNumber = randomeNumber;
    }
    
    public int setNumber(){
          return (int) (Math.random() * randomeNumber);
    }
    
}
