/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiples.of.pkg3.and.pkg5;

/**
 *
 * @author Austin
 */
public class MultiplesOf3And5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int total =0;
        for(int i = 1;i<10;i++){
            if (i%3==0||i%5==0){
                total = total+i;
            }
        }
        System.out.println(total);
    }
    
}
