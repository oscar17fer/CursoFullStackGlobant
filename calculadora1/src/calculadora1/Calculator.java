/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora1;

/**
 *
 * @author HP
 */
public class Calculator {
    public int add(int a, int b){
        return a+b;
    }
    public  int subtract(int a, int b){
        return a-b;
    }
    public int multiply(int a, int b){
        return a*b;
    }
    public int divide(int a, int b){
        if (b == 0){
            throw new IllegalArgumentException("Cannot divide by Zero!");
    }
        return a / b;
    }
}
