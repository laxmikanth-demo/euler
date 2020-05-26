package edu.unicode.parser.dummy;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
*
* 1 0 1 0 1 1 1 0
* */
class Solution {
    public int solution(int[] A) {
        Map<String, Integer> bivalued = new HashMap<>();
        Map<Integer, Integer> distinct = new HashMap<>();

        for(int i=0; i<A.length; i++) {
            int next = i + 1;
            int nextE = -1;
            int currentE = A[i];
            String key = "";
            if(next < A.length) {
                nextE = A[next];
            }

            if(distinct.containsKey(currentE)) {
                Integer count = distinct.get(currentE);
                distinct.put(currentE, count + 1);
            } else {
                distinct.put(currentE, 1);
            }

            if(currentE == nextE) {
                key = "" + currentE + "" + nextE;
                if(bivalued.containsKey(key)) {
                    Integer possibility = bivalued.get(key);
                    bivalued.put(key, possibility + 2);
                } else {
                    bivalued.put(key, 2);
                }
            } else {
                key = "";
                if(currentE > nextE) {
                    key = "" + currentE + "" + nextE;
                    if(bivalued.containsKey(key)) {
                        Integer possibility = bivalued.get(key);
                        bivalued.put(key, possibility + 1);
                    } else {
                        bivalued.put(key, 1);
                    }
                } else {
                    key = "" + nextE + "" + currentE;
                    if(bivalued.containsKey(key)) {
                        Integer possibility = bivalued.get(key);
                        bivalued.put(key, possibility + 1);
                    } else {
                        bivalued.put(key, 1);
                    }
                }
            }
        }
        System.out.println(bivalued.entrySet().stream().filter(e -> !e.getValue().equals(1)).collect(Collectors.toList()));
        return bivalued.entrySet().stream().filter(e -> !e.getValue().equals(1)).map(e -> e.getValue()).reduce(0, Integer::sum);
    }

    public static void main(String a[]) {
        int[] input = {1, 2, 3, 2};
        Solution s = new Solution();
        System.out.println(s.solution(input));
    }
}
