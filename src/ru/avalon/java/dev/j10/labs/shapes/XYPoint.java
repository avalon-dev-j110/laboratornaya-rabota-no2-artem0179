/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs.shapes;

/**
 *
 * @author рпи
 */
public class XYPoint implements Point {
    private float x, y;

    public XYPoint (float x, float y){
        this.x = x;
        this.y = y;
    }
    
        
    @Override
    public float getX() {
        return x;
    }

    @Override
    public float getY() {
       return y;
    }
    
    
    
    
    
}
