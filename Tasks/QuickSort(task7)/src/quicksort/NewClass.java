
package quicksort;

public class NewClass {
   
    static void quicksort (int[]arr,int low,int high){
        
        if(low>high)
            return;
        int mid = low + (high-low)/2;
        int pivot = arr[mid];
        int i = low;
        int j = high;
        while(i<=j){
            while(arr[i]< pivot)
                i++;
            while(arr[j] > pivot)
                j--;
            if(i<=j){
                int replace = arr[i];
                arr[i] = arr[j];
                arr[j] = replace ;
                i++;
                j--;
            }
        }
        if(low<j)
            quicksort(arr,low,j);
        if(high>i)
            quicksort(arr,i,high);
    }  
}

    



