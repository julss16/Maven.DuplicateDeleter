package com.zipcodewilmington.looplabs;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {


    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);

    }


    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {

        ArrayList<Integer> remove = new ArrayList<>();
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (countDuplicates(array[i]) < maxNumberOfDuplications) {

                remove.add(array[i]);
            }
        }
        return remove.toArray(new Integer[0]);

    }


    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        ArrayList<Integer> remove= new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (countDuplicates(array[i]) != exactNumberOfDuplications) {

               remove.add(array[i]);


            }
        }
        return remove.toArray(new Integer[0]);
    }
}
