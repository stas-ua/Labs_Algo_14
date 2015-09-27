/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labs_algo_14;

/**
 *
 * @author admin
 */
public class SortHelper {

    public static void insSort(Student[] arr, boolean asc) {
        Student curr;
        for (int i = 1; i < arr.length; i++) {
            curr = arr[i];
            int j = i - 1;            
            while (j >= 0 && (asc?curr.getGroupNumber()<arr[j].getGroupNumber():curr.getGroupNumber()>arr[j].getGroupNumber())) {
                arr[j + 1] = arr[j];
                j--;
            }            
            arr[j + 1] = curr;
        }
    }

}
