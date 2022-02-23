/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ceti
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        test_suma();
        test_resta();
        test_multiplicacion();
        test_division();
        test_suma_tres();
    }
   
    private static int suma(int a, int b) {
        return a+b;
    }
 
    private static int resta(int a, int b) {
        return a-b;
    }
    
    private static int multiplicacion(int a, int b) {
        return a*b;
    }
    
    private static int division(int a, int b) {
        return a/b;
    }
    
    private static int suma_tres(int a, int b, int c) {
        return a+b+c;
    }
    
    static private void test_suma() {
        System.out.println(suma(3, 4));
    }
    
    private static void test_resta() {
        System.out.println(resta(3, 4));
    }
    
    private static void test_multiplicacion() {
        System.out.println(multiplicacion(3, 4));
    }
    
    private static void test_division() {
        System.out.println(division(3, 4));
    }
    
    private static void test_suma_tres() {
        System.out.println(suma_tres(3, 4, 5));
    }
}
