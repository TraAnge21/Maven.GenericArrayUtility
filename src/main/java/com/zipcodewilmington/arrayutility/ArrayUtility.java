package com.zipcodewilmington.arrayutility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

/**
 * Created by leon on 3/6/18.
 */
//public class ArrayUtility {

public class ArrayUtility<SomeType> {
//        private final SomeType[] array;

    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {

        this.array = array;
    }

    public SomeType findOddOccurringValue() {

        return null;

    }

    public SomeType GetMostCommonFromMerge() {

        return null;

    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        int countOccurrence =0;
        for ( int j =0 ; j <= array.length -1; j++) {
            if ( array[j]==(valueToEvaluate)){
                countOccurrence++;
            }
        }
        return countOccurrence;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {



        return null;

    }
}


