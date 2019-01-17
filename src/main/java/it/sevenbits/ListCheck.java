package it.sevenbits;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ListCheck {
    public List listCheck(final List<Set<Integer>> arrayList, Set<Integer> integerSet) {
        List<Set<Integer>> ArrayList = new ArrayList<>(arrayList);
        for (Set aSet : arrayList) {
            for (int i = 0; i < integerSet.size(); i++) {
                if (aSet.contains(integerSet.toArray()[i])) {
                    ArrayList.remove(aSet);
                    break;
                }
            }
        }

        return ArrayList;
    }
}
