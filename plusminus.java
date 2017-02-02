import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int zeros = 0;
        int pos = 0;
        int neg = 0;
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            if(arr[arr_i] == 0){
                zeros++;
            }
            if(arr[arr_i] < 0){
                neg++;
            }
            if(arr[arr_i] > 0 && arr[arr_i] != 0){
                pos++;
            }
        }        
        System.out.println((double)pos/n);
        System.out.println((double)neg/n);
        System.out.println((double)zeros/n);
    }
}
