package com.zipcodewilmington.arrayutility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/**
 * Created by leon on 3/6/18.
 */
//public class ArrayUtility {

public class ArrayUtility<SomeType> {
//        private final SomeType[] array;

    private final SomeType[] initialArray;

    public ArrayUtility(SomeType[] initialArray) {

        this.initialArray = initialArray;
    }

    public SomeType CountDuplicatesinMerge() {


        return null;

    }

    public SomeType GetMostCommonFromMerge() {

        return null;

    }


    public SomeType [] RemoveValue(SomeType valueToRemove) {

        List<SomeType> listAfterRemoval = new ArrayList<>();
        ArrayUtility<SomeType> list = new ArrayUtility<>(initialArray);
       for( SomeType memberArray : initialArray) {
           if (!(memberArray.equals(valueToRemove))) {
               listAfterRemoval.add(memberArray);
           }
       }


//        return null;

    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        int countOccurrence =0;
        for ( int j =0 ; j <= initialArray.length -1; j++) {
            if ( initialArray[j]==(valueToEvaluate)){
                countOccurrence++;
            }
        }
        return countOccurrence;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {



        return null;

    }
}


