package com.zipcodewilmington.looplabs;
import com.sun.tools.javac.util.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Arrays.*;

/**
 * Created by leon on 1/25/18.
 */
public abstract class DuplicateDeleter<T> implements DuplicateDeleterInterface<T> {

    protected final T[] array;


    public DuplicateDeleter(T[] intArray) {

        this.array = intArray;

    }

    public int countDuplicates(T duplicate) {

        int count = 0;
       // for (int i = 0; i < array.length; i++) {
        for (T t: array){
            if (duplicate.equals(t)) {
                count++;

            }

            }  return count;

        }



     public T[] removeDuplicates(int maxNumberOfDuplications) {


         int index = 0;
         for (int i = 0; i < array.length; i++) {
             if (countDuplicates(array[i]) < maxNumberOfDuplications) {

                 array[index] = array[i];

             }
         }
         return array;
     }


    public T[] removeDuplicatesExactly(T[] remove, int exactNumberOfDuplications){

        int index=0;
        for (int i = 0; i < array.length; i++) {
            if (countDuplicates(array[i]) != exactNumberOfDuplications) {

                remove[index] = array[i];
                index++;


            }
        }return remove;

        }


     public T[] removeDuplicatesExactly(int exactNumberOfDuplications){

            return removeDuplicatesExactly(this.array, exactNumberOfDuplications);
     }
}

/**   public T[] removeDuplicates(int maxNumberOfDuplications){
 T[] result = array.clone();
 for (int i = maxNumberOfDuplications; i <= array.length; i++) {
 result = removeDuplicatesExactly(i, result);
 }
 return result;
 }


 T[] remove=  (T[]) new Object[array.length];
 int x= remove.length;

 int index=0;
 for (int i = 0; i < array.length; i++) {
 if (countDuplicates(array[i]) < maxNumberOfDuplications) {

 remove[index] = array[i];
 index++;


 }else{
 x--;
 }
 }

 */