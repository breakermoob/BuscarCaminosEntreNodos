/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caminos;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author bm
 */
public class Caminos {


    public static void main(String[] args) {
        int mat[][] = new int[4][4];
       
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(i==j)
                {
                mat[i][j] = 0;
                }
                else{
                mat[i][j] = 1;
                }
            }
        }
        
        camino x = new camino();
        Stack v = x.rutas(mat, 2, 3);
        int m = v.size();
        System.out.println(m);
        while(m!=0)
        { 
            System.out.println("2" + "-"+v.pop());
            m--;
        }

    }
    

}
