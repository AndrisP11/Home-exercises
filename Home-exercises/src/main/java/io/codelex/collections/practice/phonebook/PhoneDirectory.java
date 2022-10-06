package io.codelex.collections.practice.phonebook;


import java.util.TreeMap;

public class PhoneDirectory {
    TreeMap<String, String> phoneBook = new TreeMap<>();

    public void putNumberTreeMap(String name, String number) {
        if (name == null || number == null) {
            throw new IllegalArgumentException("name and number cannot be null");
        }

        if (phoneBook.containsKey(name) && phoneBook.containsValue(number)) {
            throw new IllegalArgumentException("name and number already in the phonebook");
        } else if (phoneBook.containsKey(name)) {
            phoneBook.replace(name, phoneBook.get(name), number);
        } else {
            phoneBook.put(name, number);
        }
    }

    public String findTreeMap(String name) {
        return phoneBook.get(name);
    }

    @Override
    public String toString() {
        return "PhoneDirectory{" +
                "phoneBook=" + phoneBook +
                '}';
    }
}
