/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paola Xochitl Carrillo Ortiz 1850693
 */
public class PRINCIPAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + ",");
            sum += i;
        }
        System.out.println("  ");
        System.out.println("El resultado de la suma es " + sum);
        
    }
    
}
