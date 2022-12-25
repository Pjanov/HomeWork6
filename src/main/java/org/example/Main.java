package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Laptop> laptops = new ArrayList<>();

    public static void main(String[] args) {

        laptops.add(new Laptop(36_731f,
                "Asus",
                "Windows 11",
                "14 дюймов",
                "серый",
                "Full HD",
                "Intel Pentium Gold",
                "4 гб",
                "256 гб"));

        laptops.add(new Laptop(42_435f,
                "Acer",
                "Windows 10",
                "15.6 дюймов",
                "черный",
                "Full HD",
                "Intel Core i3",
                "4 гб",
                "128 гб"));

        laptops.add(new Laptop(71_225f,
                "Acer",
                "Windows 11",
                "14 дюймов",
                "серый",
                "Full HD",
                "Intel Core i7",
                "8 гб",
                "256 гб"));

        laptops.add(new Laptop(53_265f,
                "Lenovo",
                "Windows 11",
                "14 дюймов",
                "серый",
                "Full HD",
                "Intel Core i5",
                "8 гб",
                "512 гб"));

        laptops.add(new Laptop(58_385f,
                "Asus",
                "Windows 11",
                "14 дюймов",
                "серый",
                "Full HD",
                "Intel Core i5",
                "8 гб",
                "512 гб"));

        getByParameter(laptops, parameterRequest());

    }
    /**
     * <h3>Запрос параметров у пользователя</h3>
     *
     * @return строку
     */
    private static String parameterRequest() {
        Scanner sc = new Scanner(System.in);
        System.out.print("По какому параметру вывести ноутбуки: ");
        String res = sc.nextLine();
        sc.close();
        return res;
    }

    /**
     * <h3>Вывести элемент коллекции по параметру</h3>
     *
     * @param coll      коллекция
     * @param parameter параметр
     */
    private static void getByParameter(ArrayList<Laptop> coll, String parameter) {
        for (int i = 0; i < coll.size(); i++) {
            if (coll.get(i).infoLaptop().contains(parameter)) {
                System.out.println(coll.get(i));
            }
        }
    }
}