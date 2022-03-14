package com.liv.implimentation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractMapService<T, ID> {
    protected Map<ID,T> map = new HashMap<>();
    T save(ID id, T obj){
        map.put(id,obj);
        return obj;
    }
    List<T> findAll(){
        return new ArrayList<>(map.values());
    }
    T findById(ID id){
        return map.get(id);
    }
    void deleteById(ID id){
        map.remove(id);
    }
    void delete(T obj){
        map.entrySet().removeIf(e-> e.getValue().equals(obj));
    }
}
