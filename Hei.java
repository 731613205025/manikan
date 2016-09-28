/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hei;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Hei {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
  System.out.println("ENTER THE NUMBER OF STUDENTS: ");
  Scanner s=new Scanner(System.in);
  int n=s.nextInt();
  double[] Arr=new double[n];
  System.out.println("ENTER THE HEIGHTS: ");
  for(int i=0;i<n;i++)
   {
     Arr[i]=s.nextDouble();
    }
  Arrays.sort(Arr);
  System.out.println("<<<4th TALLEST HEIGT IS:  "+Arr[n-4]+"  >>>");
  for(int i=1;i<=n;i++)
     System.out.println("\n"+i+"th TALLEST HEIGHT IS:"+Arr[n-i]);
 }
}
    

