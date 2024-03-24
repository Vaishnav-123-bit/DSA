import java.util.*;

/* HashMap methods -----> 
 * 
 *  1.put
 *  2.containsKey
 *  3.get
 *  4.for loop 
 *            for(Map.Entry<Integer,Inetger> e : map.entrySet())  ----------> getKey getValue
 *  */





public class Hashing{
    public static void main(String[] args) {
        //unordered map getting result unordered                                    
        HashMap<String,Integer> map=new HashMap<>();

        //insertion
        map.put("A",30);
        map.put("b",50);

        //if key already exists value is updated 
        System.out.println(map);


        //Search  containsKey
        if(map.containsKey("A")){
            System.out.println("hello");
        }else{
            System.out.println("world");
        }



        //get a value
        System.out.println(map.get("A")); 


        for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.println("keys ->" + e.getKey());
        }
    }
}