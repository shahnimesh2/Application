package com.flattenArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Created by nshah on 7/29/2018.
 */
public class Application {
    public List<Integer> flattenArray(Object[] nestedArray) {

        if (nestedArray == null) return null;

        List<Integer> flattenedArray = new ArrayList<Integer>();

        for (Object i : nestedArray) {
            if (i instanceof Integer) {
                flattenedArray.add((Integer) i);
            } else {
                flattenedArray.addAll(flattenArray((Object[]) i));
            }
        }
        return flattenedArray;
    }
}
