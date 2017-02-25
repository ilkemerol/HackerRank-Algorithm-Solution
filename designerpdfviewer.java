import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 26;
        int h[] = new int[n];
        for(int h_i=0; h_i < n; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        

        
        int max = 0;
        int _length = word.length();
        for(int i = 0; i < _length ; i++){
            if(word.substring(i,i+1).equals("a")){
                if(h[0] > max){
                    max = h[0];
                }
            }
            else if(word.substring(i,i+1).equals("b")){
                if(h[1] > max){
                    max = h[1];
                }
            }
            else if(word.substring(i,i+1).equals("c")){
                if(h[2] > max){
                    max = h[2];
                }
            }
            else if(word.substring(i,i+1).equals("d")){
                if(h[3] > max){
                    max = h[3];
                }
            }
            else if(word.substring(i,i+1).equals("e")){
                if(h[4] > max){
                    max = h[4];
                }
            }
            else if(word.substring(i,i+1).equals("f")){
                if(h[5] > max){
                    max = h[5];
                }
            }
            else if(word.substring(i,i+1).equals("g")){
                if(h[6] > max){
                    max = h[6];
                }
            }
            else if(word.substring(i,i+1).equals("h")){
                if(h[7] > max){
                    max = h[7];
                }
            }
            else if(word.substring(i,i+1).equals("i")){
                if(h[8] > max){
                    max = h[8];
                }
            }
            else if(word.substring(i,i+1).equals("j")){
                if(h[9] > max){
                    max = h[9];
                }
            }
            else if(word.substring(i,i+1).equals("k")){
                if(h[10] > max){
                    max = h[10];
                }
            }
            else if(word.substring(i,i+1).equals("l")){
                if(h[11] > max){
                    max = h[11];
                }
            }
            else if(word.substring(i,i+1).equals("m")){
                if(h[12] > max){
                    max = h[12];
                }
            }
            else if(word.substring(i,i+1).equals("n")){
                if(h[13] > max){
                    max = h[13];
                }
            }
            else if(word.substring(i,i+1).equals("o")){
                if(h[14] > max){
                    max = h[14];
                }
            }
            else if(word.substring(i,i+1).equals("p")){
                if(h[15] > max){
                    max = h[15];
                }
            }
            else if(word.substring(i,i+1).equals("q")){
                if(h[16] > max){
                    max = h[16];
                }
            }
            else if(word.substring(i,i+1).equals("r")){
                if(h[17] > max){
                    max = h[17];
                }
            }
            else if(word.substring(i,i+1).equals("s")){
                if(h[18] > max){
                    max = h[18];
                }
            }
            else if(word.substring(i,i+1).equals("t")){
                if(h[19] > max){
                    max = h[19];
                }
            }
            else if(word.substring(i,i+1).equals("u")){
                if(h[20] > max){
                    max = h[20];
                }
            }
            else if(word.substring(i,i+1).equals("v")){
                if(h[21] > max){
                    max = h[21];
                }
            }
            else if(word.substring(i,i+1).equals("w")){
                if(h[22] > max){
                    max = h[22];
                }
            }
            else if(word.substring(i,i+1).equals("x")){
                if(h[23] > max){
                    max = h[23];
                }
            }
            else if(word.substring(i,i+1).equals("y")){
                if(h[24] > max){
                    max = h[24];
                }
            }
            else if(word.substring(i,i+1).equals("z")){
                if(h[25] > max){
                    max = h[25];
                }
            } 
        }
        //System.out.println(max);
        System.out.println(_length*max);
    }
}
