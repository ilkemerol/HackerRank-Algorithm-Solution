import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        
        long _1 = b+c+d+e;
        long _2 = a+c+d+e;
        long _3 = a+b+d+e;
        long _4 = a+b+c+e;
        long _5 = a+b+c+d;
        
        //System.out.println (_1 + " " + _2 + " " + _3 + " " + _4 + " " + _5);
        long min = 0;
        long max = 0;
        //min
        if(_1 <= _2 && _1 <= _3 && _1 <= _4 && _1 <= _5){
            min = _1;
        }
        else if(_2 <= _3 && _2 <= _4 && _2 <= _5){
            min = _2;
        }
        else if( _3 <= _4 && _3 <= _5){
            min = _3;
        }
        else if(_4 <= _5){
            min = _4;
        }
        else{
            min = _5;
        }
        //max
        if(_1 >= _2 && _1 >= _3 && _1 >= _4 && _1 >= _5){
            max = _1;
        }
        else if(_2 >= _3 && _2 >= _4 && _2 >= _5){
            max = _2;
        }
        else if( _3 >= _4 && _3 >= _5){
            max = _3;
        }
        else if(_4 >= _5){
            max = _4;
        }
        else{
            max = _5;
        }
        
        System.out.println(min + " " + max);
        
    }
}
