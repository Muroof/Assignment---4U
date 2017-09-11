/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ranam3235
 */
public class A1Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variables for population, year, and growth value
        double population = 6;
        int year = 1999;
        double growth = 1.4;
        
        // while the population is less than 10B
        while (population < 10) {
            population = population * growth;
            // add a year everytime population is multiplied by growth peryear
            year = year + 1;
        }
        // print year the population exceeded 10 billion
        System.out.println("The population will have exceeded 10 billion in the year: " + year);
    }
}
