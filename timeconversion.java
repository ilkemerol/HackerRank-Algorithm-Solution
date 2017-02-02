import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        String newtime = "";
        //System.out.println(time.substring(8,10));
        if(time.substring(8,10).equals("PM")){
            if(time.substring(0,2).equals("01")){
                newtime = "13" + time.substring(2,8);
            }
            if(time.substring(0,2).equals("02")){
                newtime = "14" + time.substring(2,8);
            }
            if(time.substring(0,2).equals("03")){
                newtime = "15" + time.substring(2,8);
            } 
            if(time.substring(0,2).equals("04")){
                newtime = "16" + time.substring(2,8);
            } 
            if(time.substring(0,2).equals("05")){
                newtime = "17" + time.substring(2,8);
            } 
            if(time.substring(0,2).equals("06")){
                newtime = "18" + time.substring(2,8);
            } 
            if(time.substring(0,2).equals("07")){
                newtime = "19" + time.substring(2,8);
            } 
            if(time.substring(0,2).equals("08")){
                newtime = "20" + time.substring(2,8);
            } 
            if(time.substring(0,2).equals("09")){
                newtime = "21" + time.substring(2,8);
            } 
            if(time.substring(0,2).equals("10")){
                newtime = "22" + time.substring(2,8);
            } 
            if(time.substring(0,2).equals("11")){
                newtime = "23" + time.substring(2,8);
            } 
            if(time.substring(0,2).equals("12")){
                newtime = "12" + time.substring(2,8);
            } 
        }
        else{
            if(time.substring(0,2).equals("12")){
                newtime = "00" + time.substring(2,8);
            }
            else{
                newtime = time.substring(0,8);    
            }
            
        }
        System.out.println(newtime);
    }
}
