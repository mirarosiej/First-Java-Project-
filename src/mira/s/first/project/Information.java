/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mira.s.first.project;


public class Information{ 
    private String PUBLISHSTATE; 
    private String REGION;
    private String GHO; 
    private String WORLDBANKINCOMEGROUP;
    private int YEAR;
    private String COUNTRY; 
   
    public Information(){
       
    }
   
    public int getYEAR(int y){
       return YEAR; 
    }
    
    
    @Override 
    public String toString(){
        return " " + PUBLISHSTATE; 
    }
}

