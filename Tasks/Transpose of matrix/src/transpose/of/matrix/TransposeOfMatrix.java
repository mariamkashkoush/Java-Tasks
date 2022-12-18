/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transpose.of.matrix;
import java.util.Scanner ;

/**
 *
 * @author Lenovo 320
 */
public class TransposeOfMatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int i , j ;
        int Matrix [][] = new int [2][2];
        for (i=0;i<Matrix.length;i++)
            for (j=0 ; j<Matrix[0].length ; j++){
            System.out.println("Enter The Element");
            Matrix [i][j] = input.nextInt() ;
            }
         for (i=0;i<Matrix.length;i++)
            for (j=0 ; j<Matrix[0].length ; j++){
            System.out.println("The Matrix " + Matrix[i][j]);
            }
         for (i=0;i<Matrix.length;i++)
            for (j=0 ; j<Matrix[0].length ; j++){
            System.out.println("The Transpose " + Matrix[j][i]);
            }
         
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        int i , j ;
//        int Matrix[][]={{1,2,3},{4,5,6}};
//        int Transpose [][] = new int [3][2];
//        for ( i=0;i<2;i++){
//        for ( j=0;j<3;j++){
//        Transpose[i][j]=Matrix[j][i];
//        }
//        }
//          
//    System.out.println("The Transpose : ");
//        for ( i=0;i<2;i++){
//        for ( j=0;j<3;j++){
//            System.out.print(Transpose[j][i] + " ");
//        }
//        }
        // TODO code application logic here
    }
    
}
