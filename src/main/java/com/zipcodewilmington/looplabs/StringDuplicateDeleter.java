package com.zipcodewilmington.looplabs;

import java.util.ArrayList;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {

    public StringDuplicateDeleter(String[] intArray) {

        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {

        ArrayList<String> remove = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (countDuplicates(array[i]) < maxNumberOfDuplications) {

                remove.add(array[i]);
            }
        }
        return remove.toArray(new String[0]);
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        ArrayList<String> remove= new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (countDuplicates(array[i]) != exactNumberOfDuplications) {

                remove.add(array[i]);


            }
        }
        return remove.toArray(new String[0]);
    }
}
