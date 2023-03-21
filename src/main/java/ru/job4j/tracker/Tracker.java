package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] listByName = new Item[size];
        int newSize = 0;
        for (int i = 0; i < size; i++) {
            Item item = items[i];
            if (key.equals(item.getName())) {
                listByName[i] = item;
                newSize++;
            }
        }
        return Arrays.copyOf(listByName, newSize);
    }

    private int indexOf(int id) {
        int rls = -1;
        for (int i = 0; i < size; i++) {
            if (items[i].getId() == id) {
                rls = i;
                break;
            }
        }
        return rls;
    }

    public boolean replace(int id, Item item) {
        boolean rls = indexOf(id) != -1;
        if (rls) {
            item.setId(id);
            items[indexOf(id)] = item;
        }
        return rls;
    }

    public boolean delete(int id) {
        boolean rls = indexOf(id) != -1;
        if (rls) {
            System.arraycopy(items, indexOf(id) + 1, items, indexOf(id), size - indexOf(id) - 1);
            items[size - 1] = null;
            size--;
        }
        return rls;
    }
}




