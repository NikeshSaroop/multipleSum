/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiples;

import java.util.ArrayList;

/**
 *
 * @author Nikesh
 */
public class Multiples {

    public static void main(String[] args) 
    {
        
        ArrayList<Integer> x = new ArrayList<Integer>();
        ArrayList<Integer> y = new ArrayList<Integer>();
        int totalthree = 0;
        int totalfive = 0;
        
        int total =0;
        
        for(int temp =0; temp < 1000 ; temp++)
        {
        if(temp % 3 == 0)
        {
            x.add(temp);
            totalthree += temp;
        }
        else if(temp % 5 == 0)
        {
            y.add(temp);
            totalfive += temp;
        }
    }
        
         total = totalfive + totalthree;



        System.out.println("The multiples of 3 or 5 up to 1000 are: " +total);
   
    }
    
}
