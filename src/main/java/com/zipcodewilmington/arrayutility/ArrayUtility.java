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

    private SomeType[] initialArray;

    public ArrayUtility(SomeType[] initialArray) {

        this.initialArray = initialArray;
    }


    public Integer countDuplicatesInMerge(SomeType[] arrToMerge, SomeType value) {
        ArrayUtility <SomeType > list = new ArrayUtility<>(initialArray);
        Integer countDuplicates =0;
        for ( SomeType memberArray : initialArray) {
            if ( memberArray.equals(value)) {
                countDuplicates++;
            }
        }
        for ( SomeType memberArray : arrToMerge) {
            if ( memberArray.equals(value)) {
                countDuplicates++;
            }
        }
        return countDuplicates;

    }



    public SomeType getMostCommonFromMerge() {


        return null;

    }





    public SomeType [] removeValue(SomeType valueToRemove) {

        SomeType[] listAfterRemoval = Arrays.copyOf(initialArray, initialArray.length - getNumberOfOccurrences(valueToRemove));
//      ArrayUtility<SomeType> list = new ArrayUtility<>(initialArray);

        for (int k = 0, m = 0; k < initialArray.length; k++) {
            if (initialArray[k] != valueToRemove) {
                listAfterRemoval[m] = initialArray[k];
                m++;
            } else {
                continue;
            }
        }
        return listAfterRemoval;
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


}


