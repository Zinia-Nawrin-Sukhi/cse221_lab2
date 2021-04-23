/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rubayat.ahmed
 */
public class Sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] a = {99,-5,14,-3,4,1,99};
        int [] b = mergeSort(a,0,6);
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
    
    public static int[] mergeSort(int[]a,int s,int e){
        
        if(s==e){
            return a;
        }
        // divide the array into two halves
        int mid = ((s+e)/2);
        int [] a1 = mergeSort(a,s,mid);
        int [] a2 = mergeSort(a,mid+1,e);
        if(a1==a2){
            int [] mergedArray = merge(a1,s,mid,a2,mid+1,e);
            return mergedArray;
        }else if(a1!=a && a2!=a){
            int [] mergedArray = merge(a1,0,a1.length-1,a2,0,a2.length-1);
            return mergedArray;
        }else if(a1==a && a2!=a){
            int [] mergedArray = merge(a1,s,mid,a2,0,a2.length-1);
            return mergedArray;
        }else{
            int [] mergedArray = merge(a1,0,a1.length-1,a2,mid+1,e);
            return mergedArray;
        }
        
        
    }
    
    public static int[] merge(int[]a1,int sa1,int ea1,int[]a2,int sa2,int ea2){
        // creating the new array
        int len1 = ea1-sa1+1;
        int len2 = ea2-sa2+1;
        int[]c = new int[len1+len2];
        int i = sa1; int j=sa2; int k = 0;
        
        while(k<c.length){
            if(i<=ea1 && j<=ea2){
                if(a1[i]<a2[j]){
                    c[k]=a1[i];
                    i++;
                }else{
                    c[k]=a2[j];
                    j++;
                }
            }else{
                break;
            }
            k++;
        }
        if(i<=ea1){
            while(i<=ea1){
                c[k] = a1[i];
                i++;
                k++;
            }
            
        }else{
            while(j<=ea2){
                c[k] = a2[j];
                j++;
                k++;
            } 
        }
        return c;
    }
    
}
