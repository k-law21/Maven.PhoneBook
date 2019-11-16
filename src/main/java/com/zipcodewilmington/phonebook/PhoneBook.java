package com.zipcodewilmington.phonebook;

import java.util.*;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {
    private Map<String,List<String>>pBook;

    private List<String>listOfNum = new ArrayList<>();


    public PhoneBook(Map<String, List<String>> map) {
        this.pBook = map;
    }

    public PhoneBook() {

        pBook = new LinkedHashMap<String, List<String>>();
    }

    public void add(String name, String phoneNumber) {
        listOfNum.add(phoneNumber);
        pBook.put(name, listOfNum);
    }

    public void addAll(String name, String... phoneNumbers) {
        pBook.put(name, Arrays.asList(phoneNumbers));

    }

    public void remove(String name) {
        pBook.remove(name);
    }

    public Boolean hasEntry(String name) {
        return pBook.containsKey(name) || listOfNum.contains(name);

    }

    public List<String> lookup(String name) {
        return pBook.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
        String result= "";
        for (Map.Entry<String,List<String>> entry : pBook.entrySet()) {
            result = entry.getKey();
        }
        return result;
    }


    public List<String> getAllContactNames() {
      return new ArrayList<>(pBook.keySet());
    }

    public Map<String, List<String>> getMap() {
        return this.pBook;
    }
}
