
package quicksort;
 
public class QuickSort {

    public static void main(String[] args) {
        
        NewClass q = new NewClass();
        int [] array = {10,60,15,70,20,90};
        System.out.println("Before Sorting");
        for(int i=0;i<array.length;i++)
            System.out.print(array[i]+"\t"); 
        q.quicksort(array, 0, array.length-1);
        System.out.println("\nAfter Sorting");
        for(int i=0;i<array.length;i++)
            System.out.print(array[i]+"\t");        
    }    
}
