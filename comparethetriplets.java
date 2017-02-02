import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int alicepoint = 0;
        int bobpoint = 0;
        if(a0 > b0){
            alicepoint++;
        }
        if(a0 < b0){
            bobpoint++;
        }
        if(a0 == b0){
            //do nothing
        }
        if(a1 > b1){
            alicepoint++;
        }
        if(a1 < b1){
            bobpoint++;
        }
        if(a1 == b1){
            //do nothing
        }
        if(a2 > b2){
            alicepoint++;
        }
        if(a2 < b2){
            bobpoint++;
        }
        if(a2 == b2){
            //do nothing
        }
        System.out.println(alicepoint + " " + bobpoint);
    }
}
