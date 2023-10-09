/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lect5_inheritance2;

/**
 *
 * @author USER
 */
public class Lect5_inheritance2 {

    // Inheritance terms 
    // base,super and parent 
    // respectively have derived, sub aand child 
    
    //extend keyword --> syntax 
    
    //inheritance is one way propersition --> inherits from a parent 
    
    // advantages 
    
    int Value = 5000;
    int ValueTwo = 2000;

    /**
     * @param args the command line arguments
     */
    
    static class Second extends Lect5_inheritance2  // extends enables it to inherite attriubutes from other classes
    {
        public void someMethod()
        {
            this.Value = 999;
            System.out.println(Value);
            System.out.println(super.Value);
        }
    }
    
    
    public static void main(String[] args) {
        //more minheritance 
        
        Second s = new Second ();
        s.someMethod();
        
    }
    
}
