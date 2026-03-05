package arrays;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    
    public void removeDuplicatesBruteForce(int[] arr) {
        
        int n = arr.length;
        Set<Integer> s = new HashSet<>();
        
        for(int i = 0; i < n; i++) {
            s.add(arr[i]);
        }
        
        int index = 0;
        for(int i : s) {
            arr[index] = i;
            index++;
        }
        
        for(int i = 0; i < index; i++) {
            System.out.print(arr[i]+",");
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {4,3,2,4,5,5,3,56};
        
        RemoveDuplicates rd = new RemoveDuplicates();
        rd.removeDuplicatesBruteForce(arr);
    }
}