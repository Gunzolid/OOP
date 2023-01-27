/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week4;

/**
 *
 * @author coc
 */
public class Pokemon {
    
    private String name;
    private double cp;
    
    public Pokemon(String name, double cp){
        this.name = name;
        this.cp = cp;
    }
    
    public Pokemon(){
        this.name = "";
        this.cp = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCp() {
        return cp;
    }

    public void setCp(double cp) {
        this.cp = cp;
    }
   
    public void showDetail(){
        System.out.println("Name: " + this.name);
        System.out.println("CP  : " + this.cp);
    }

}


