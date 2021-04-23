class MergeSort{
  public static void printArray(int[] array){
    
    
    for(int i=0;i< array.length;i++){
      System.out.print(array[i]+" "); 
    } 
  
    System.out.println();
  }
  static int[] mergeSort(int[]array){
    if(array.length<=1){
     return array; 
    }
    int midpoint=array.length/2;
  
  int []left=new int[midpoint];
  int []right;
  if(array.length%2==0){
   right=new int[midpoint]; 
  }else{
   right=new int[midpoint+1]; 
  }
  for(int i=0;i<midpoint;i++){
   left[i]= array[i]; 
  }
  for(int j=0;j<right.length;j++){
  right[j]=array[midpoint+j];  
    
  }
  int result[]= new int[array.length];
  left=mergeSort(left);
  right=mergeSort(right);
  result=merge(left,right);
  return result;
}
  static int[]merge(int []left,int[]right){
   int[]result=new int[left.length+right.length]; 
    int leftPointer=0;int rightPointer=0;int resultPointer=0;
    while(leftPointer< left.length || rightPointer< right.length){
      if(leftPointer< left.length && rightPointer< right.length){
        if(left[leftPointer]< right[rightPointer]){
        result[resultPointer++]=left[leftPointer++];
      }
           else{
           result[resultPointer++]=right[rightPointer++];  
           }
      }
           else if(leftPointer<left.length){
           result[resultPointer++]=left[leftPointer++];  
    }
          else if(rightPointer<right.length){
           result[resultPointer++]=right[rightPointer++];  
}
      }
return result;

    }
  
public static void main(String[]args){
  int[] x={5,1,6,2,3,4};
  for(int i=0;i<x.length;i++){
    System.out.print(x[i]+" ");
  }
  int array[]=new int[x.length];
   for(int i=0;i<x.length;i++){
     array[i]=x[i];
    }
   
  //int[] array={5,1,6,2,3,4};
  
  array=mergeSort(array);
  System.out.println();
  System.out.println("soretd array");
  printArray(array);
}
  
}