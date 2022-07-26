package cd.get.ready.algorithms;

import java.beans.IntrospectionException;
import java.util.HashMap;

public class CountDuplicates {
    /**
     * Example of overloading a function that accepts a Array String
     * @param input
     * @return
     */
    public Integer countDuplicates(String[] input){
        Integer count = 0;
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(String each: input ){
            if(!map.containsKey(each)){
                map.put(each, 1);
            }else{
                map.put(each, map.get(each)+1);
                if(!(map.get(each)>2)) {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * Example of overloading a function that accepts a Array of Integers
     * @param input
     * @return
     */
    public Integer countDuplicates(Integer[] input){
        Integer count = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(Integer each: input ){
            if(!map.containsKey(each)){
                map.put(each, 1);
            }else{
                map.put(each, map.get(each)+1);
                if(!(map.get(each)>2)) {
                    count++;
                }
            }
        }
        return count;
    }
}
