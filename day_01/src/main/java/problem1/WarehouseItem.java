package problem1;

import java.util.ArrayList;
import java.util.List;

/*1. Smart Warehouse Management System
Concepts: Generic Classes, Bounded Type Parameters, Wildcards
Problem Statement:
You are developing a Smart Warehouse System that manages different types of items like Electronics, Groceries, and Furniture. The system should be able to store and retrieve items dynamically while maintaining type safety.
Hints:
Create an abstract class WarehouseItem that all items extend (Electronics, Groceries, Furniture).
Implement a generic class Storage<T extends WarehouseItem> to store items safely.
Implement a wildcard method to display all items in storage regardless of their type (List<? extends WarehouseItem>).
*/

// Base class for all warehouse items
abstract class WarehouseItem {
    private int price;
    private String name;

    public WarehouseItem(int price, String name) {
        this.price = price;
        this.name = name;
    }

    // Getters for item properties
    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}

// Item categories extending WarehouseItem
class Electronics extends WarehouseItem {
    public Electronics(int price, String name) {
        super(price, name);
    }
}

class Groceries extends WarehouseItem {
    public Groceries(int price, String name) {
        super(price, name);
    }
}

class Furniture extends WarehouseItem {
    public Furniture(int price, String name) {
        super(price, name);
    }
}

// Generic storage class for warehouse items
class Storage<T extends WarehouseItem> {
    private List<T> list = new ArrayList<>();

    public void add(T item) {
        list.add(item);
    }

    public T remove(int index) {
        if (index >= 0 && index < list.size()) {
            return list.remove(index);
        } else {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
    }

    public T get(int index) {
        return list.get(index);
    }

    public int size() {
        return list.size();
    }

    public List<T> getList() {
        return list;
    }
}

// Utility class for displaying items
class WarehouseUtils {
    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.printf("Item: %s | Price: ₹%d%n", item.getName(), item.getPrice());
        }
    }
}

// Main class to run the system
class Main {
    public static void main(String[] args) {
        // Creating warehouse items
        Electronics phone = new Electronics(10000, "Smartphone");
        Electronics laptop = new Electronics(25000, "Laptop");
        Groceries paneer = new Groceries(100, "Paneer");
        Groceries tofu = new Groceries(40, "Tofu");
        Furniture sofa = new Furniture(15000, "Sofa");
        Furniture table = new Furniture(7000, "Table");

        // Creating storage units
        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        // Adding items to storage
        electronicsStorage.add(phone);
        electronicsStorage.add(laptop);
        groceriesStorage.add(paneer);
        groceriesStorage.add(tofu);
        furnitureStorage.add(sofa);
        furnitureStorage.add(table);

        // Displaying stored items
        System.out.println("\nElectronics:");
        WarehouseUtils.displayItems(electronicsStorage.getList());

        System.out.println("\nGroceries:");
        WarehouseUtils.displayItems(groceriesStorage.getList());

        System.out.println("\nFurniture:");
        WarehouseUtils.displayItems(furnitureStorage.getList());
    }
}
