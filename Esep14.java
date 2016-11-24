/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package glava7;

/**
 *
 * @author DMyrzaka
 */
import java.util.Random;
class Esep14 {
	public static void main(String[] args) {
		int[][] a=new int[7][7];
		int[] b=new int[7];
		
		boolean f;
		int i=0,j=0;
		Random r=new Random();
	for (i=0;i < a.length;i++){
    for (j=0;j < a[i].length;j++){
          	a[i][j]=r.nextInt(100)-25;
          	}
         	}
     System.out.println("Исходный массив:");
    	for ( i=0;i < a.length;i++,System.out.println()){
    	for (j=0;j < a[i].length;j++){
    	System.out.print(a[i][j]+"  ");
    	}}
    	for ( i=0;i < a.length;i++){
	      f=true;
	      j=2;
	      do{
	    	  if(a[i][j]<=a[i][j-1]){f=false;}
	    	  else{j=j+1;}
	    	  if(f){b[i]=1;}
	    	  else{b[i]=0;}
	     }while(j<=a.length && f);
    	}
    	System.out.println();
    	for (i=0;i < a.length;i++){
    		System.out.print(b[i]+"  ");
    	}
}
}

