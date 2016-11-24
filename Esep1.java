
package glava7;

/**
 *
 * @author DMyrzaka
 */
import java.util.Random; 
import java.util.Scanner; 
public class Esep1 { 

public static void main(String[] args) { 
int a[][] = new int[300][300]; 
int buf; 

//Scanner s = new Scanner(System.in); 
Random s = new Random(); 
   // System.out.println("s = "+ s.nextInt(301)); 
    
//System.out.println("m manin engiz->"); 
int m = s.nextInt(301); 
//System.out.println("n manin engiz->"); 
int n = s.nextInt(301); 
System.out.println("massivtin olshemi m = "+m+" n = "+n); 

for (int i=0; i<m; i++) 
for (int j=0; j<n; j++) 
a[i][j] = s.nextInt(101); 

for (int j=0; j<n; j++) 
{ 
buf=a[j][0]; 

a[j][0]=a[j][n-2]; 

a[j][n-2]=buf; 

} 

for (int i=0; i<m; i++){ 

for (int j=0; j<n; j++){ 
System.out.print("a["+i+"]["+j+"]="+a[i][j]+" "); 
} 
System.out.println(); 
} 

} 
} 
