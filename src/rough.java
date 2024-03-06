
import org.w3c.dom.ls.LSOutput;

import java.nio.channels.Channel;
import java.util.*;

public class rough {

    public static void main(String[] args) {
        char[] s = new char[]{'c','d','j','f','u','i','t','h','c'};
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c: s){
            if(!map.containsKey(c)){
                map.put(c,1);
            }
            else{
                map.put(c,map.get(c)+1);
            }
        }
        
        for(Map.Entry<Character,Integer> set : map.entrySet()){
            if(set.getValue()== 1){
                System.out.println(set.getKey());
            }
        }



        System.out.println(map);
    }
}
