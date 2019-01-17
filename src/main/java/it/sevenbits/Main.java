package it.sevenbits;

import java.util.*;

public class Main {
    public static void main(final String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(000, "rabbit");
        hashMap.put(101, "cat");
        hashMap.put(110, "fox");
        Set<Integer> keySet = hashMap.keySet();
        Collection<String> collection = hashMap.values();
        System.out.println(keySet);
        System.out.println(collection);

        StringInHashMap sumStringInHashMap = new StringInHashMap();
        List list = new ArrayList();
        list.add("abc");
        list.add("def");
        list.add("hij");
        System.out.println(sumStringInHashMap.sumString(list));

        Set<Integer> elementSetList1 = new HashSet<>();
        elementSetList1.add(1);
        elementSetList1.add(2);
        elementSetList1.add(4);

        Set<Integer> elementSetList2 = new HashSet<>();
        elementSetList2.add(3);
        elementSetList2.add(7);
        elementSetList2.add(10);

        List<Set<Integer>> setList = new ArrayList<>();
        setList.add(elementSetList1);
        setList.add(elementSetList2);

        Set<Integer> givenSet = new HashSet<>();
        givenSet.add(2);
        givenSet.add(9);

        ListCheck checkSet = new ListCheck();
        System.out.println(checkSet.listCheck(setList, givenSet));
    }
}
