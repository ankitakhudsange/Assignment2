/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication16;
import java.util.ArrayList;
import java.util.List;

public class SumOfArray {
    
    static List<int[]> findTriplets(int[] arr) {
        List<int[]> triplets = new ArrayList<>(); 
        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                  
                    if (arr[i] + arr[j] + arr[k] == 0){
                        triplets.add(new int[]{arr[i],arr[j],arr[k]});
                    }
                }
            }
        }
        return triplets;
    }

    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};
        List<int[]> result = findTriplets(arr);
      
        if (result.isEmpty()) {
            System.out.println("No triplets found with sum zero.");
        } else {
            for (int[] t : result) {
                System.out.println(t[0] + ", " + t[1] + ", " + t[2]);
            }
        }
    }
    
}
