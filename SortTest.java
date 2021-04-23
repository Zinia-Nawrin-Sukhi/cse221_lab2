import java.io.*;
  import java.util.*;



public class SortTest{
  public static void main(String[]args){
    int a[]= {3, 5 , 10, 23, 25, 8, 7, 9, 50, 47};
    MyArray m=new MyArray(a);
    m.insertionSort(a);
    
     m.mergeSort(a);
     
      m.quickSort(a);
       m.printArray(a);
  }
  
  
  
  
}