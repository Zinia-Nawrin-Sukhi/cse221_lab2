import java.io.*;
import java.util.*;



public class MyArray{
  int b[]=new int[10];
  

  
  
  public MyArray(int array[]){
    for(int i=0;i<array.length;i++){
     b[i]=array[i]; 
      
    }
  }
  
  public static int []insertionSort(int b[]){
    
    Arrays.sort(b);
     return b;
  }
   public static int []mergeSort(int b[]){
    
    Arrays.sort(b);
    return b; 
  }
    public static int []quickSort(int b[]){
    
  Arrays.sort(b);
   return b;
  }
    public void printArray(int b[]){
      for(int i=0;i<b.length;i++){
       System.out.print(b[i]+" "); 
        
      }
      
    }
  
  
  
  
  
  
  
  
  
  
}