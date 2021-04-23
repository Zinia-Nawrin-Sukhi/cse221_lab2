class QuickSort{
  public static void printArray(int[] array){
    
    for(int i=0;i< array.length;i++){
      System.out.print(array[i]+" "); 
    }
    System.out.println();
  }
 
      public int partition(int array[],int low,int high){
   int pivot=array[low];
     int i=low;
     for(int j=low+1;j<high;j++){
       
      if(pivot>=array[j]){
        i++;
      int temp1=array[i];
      array[i]=array[j];
      array[j]=temp1;
      }
      }
   
     int temp2=array[i];
   array[i]=array[low];
   array[low]=temp2;
    return i;  
    }

    public void sort(int array[],int low,int high){
      if(low<high){
       int k=partition(array,low ,high); 
       sort(array,low,k);
       sort(array,k+1,high);
      }
    }
    
   public static void main(String args[]) 
    { 
        int array[] = {10, 3, 5, 55, 11, 8}; 
        int n = array.length; 
  
        QuickSort ob = new QuickSort(); 
        ob.sort(array, 0, n); 
  
        System.out.println("sorted array"); 
        printArray(array); 
    } 
  
}