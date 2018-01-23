package Optimize;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * created by xdCao on 2018/1/23
 */

public class FIFO {

    private static final int cacheSize=5;

    LinkedHashMap<Integer,String> lru=new LinkedHashMap<Integer, String>(){
        @Override
        protected boolean removeEldestEntry(Map.Entry eldest) {
            return size()>cacheSize;
        }
    };

    public FIFO() {
    }

    public void set(Integer key,String value){
        lru.put(key, value);
    }

    public String get(Integer key){
        return lru.get(key);
    }

}
