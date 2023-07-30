package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> res = new HashMap<>();

        for (Map.Entry<String, Integer> entry : sourceMap.entrySet()) {
            String k = entry.getKey();
            int length = k.length();


            if (res.containsKey(length)) {
                res.get(length).add(k);
            } else {
                Set<String> keysSet = new HashSet<>();
                keysSet.add(k);
                res.put(length, keysSet);
            }
        }

        return res;

    }
}
