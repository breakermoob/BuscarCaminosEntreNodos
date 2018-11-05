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
public class camino {

    ArrayList vec = new ArrayList();
    private int mat[][];

    public Stack rutas(int mat[][], int desde, int hacia) {//Llena un arraylist con nodos adyacentes al nodo de partida tratando de buscar las rutas posibles al nodo de llegada
        Stack caminos = new Stack();
        int tam = mat.length;
        int i = 0;
        int anterior=0;
        while (i < tam)//Obtiene los primeros nodos
        {
            if (mat[desde][i] == 1) {
                vec.add(i);
            }
            i++;
        }

        int dim = vec.size();
        int j = 0;

        while (j < dim) {//Este ciclo avanza por la matriz determinando los caminos y agregando ya sea al vector para continuar buscando o la pila si encuentra alguno.
           
            dim = vec.size();
                        
            String hilera = vec.get(j).toString();

            int tamañoHilera = hilera.length();
            String b = hilera.substring(tamañoHilera - 1);
            int n = Integer.parseInt(b);
            
            if(anterior == 0){anterior = desde;}
            if (n == hacia) {
                caminos.push(hilera);
                
                
            } else {
                int r = 0;
                while (r < tam) {//Este ciclo avanzara por cada nodo
                    
                    if (mat[n][r] == 1 && r!=desde && r!= anterior) {
                        String pos = vec.get(j).toString();
                        vec.add(pos + "-" + r);
                        anterior = n;//Actualiza anterior para que no se devuelva y genere caminos ambigüos
                    }
                    r++;
                }
            }
            j++;
        }

        return caminos;
    }

}
