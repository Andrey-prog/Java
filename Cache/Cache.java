package com.company;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Cache<E>{

    private int cacheSize;
    private LinkedHashMap<E, Integer> table;

    public Cache(int size){
        cacheSize = size;
        table = new LinkedHashMap<>(cacheSize);
    }

    void addToCache(Scanner scanner){

        E str = null;
        int value = 1;
        while (scanner.hasNext()) {
            value = 1;
            str = (E) scanner.next();

            if (table.containsKey(str)) {
                value = table.get(str);
                value++;
                table.replace(str, value);
            }
            else{
                if (table.size() < cacheSize) {
                    table.put(str,value);
                } else{
                    int minimum = 1;
                    for (int i : table.values()){
                        if (i < minimum){
                            minimum = i;
                        }
                    }
                    for (E i : table.keySet()){
                        if (table.get(i) == minimum){
                            table.remove(i);
                            break;
                        }
                    }
                    table.put(str,value);
                }
            }
        }
    }

    void printCache(){
        System.out.println(table);
    }

}
