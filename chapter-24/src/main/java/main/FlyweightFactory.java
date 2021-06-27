package main;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class FlyweightFactory {
    Map<String, Flyweight> pool;

    public FlyweightFactory() {
        pool = new TreeMap<>();
    }
    
    public Flyweight getFlyweight(String key) {
        Optional<Flyweight> opt = Optional.ofNullable(pool.get(key));
        Flyweight ret = opt.orElseGet(() -> {
            Flyweight flyweight = new Flyweight(key);
            pool.put(key, flyweight);
            System.out.println("새로 생성 : " + key);
            return pool.get(key);
        });
        
        return ret;
    }
}
