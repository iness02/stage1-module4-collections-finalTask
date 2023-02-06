package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer,Set<String>> mapFromKeys = new HashMap<>();
        int length=0;
        for(String key:sourceMap.keySet()){
            length=key.length();
            Set<String> numbers=new HashSet<>();
            for(String key1:sourceMap.keySet()){
                if(key1.length()==length){
                    numbers.add(key1);
                }
            }
            mapFromKeys.put(length,numbers);
        }
        return mapFromKeys;
    }
}
