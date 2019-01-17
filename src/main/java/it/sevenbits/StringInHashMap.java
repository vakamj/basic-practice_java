package it.sevenbits;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringInHashMap {

    public Map sumString(final List<String> stringList) {
        Map<Character, Character> hashMap = new HashMap<>();
        for (int i = 0; i < stringList.size(); i++) {
            hashMap.put(stringList.get(i).charAt(0), stringList.get(i).charAt(stringList.size() - 1));
        }
        return hashMap;
    }
}
