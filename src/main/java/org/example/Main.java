package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static ArrayList<Laptop> laptops = new ArrayList<>();

    public static void main(String[] args) {

        Laptop[] laptop = new Laptop[5];
        laptop[0] = new Laptop(36.731f,
                "Asus",
                "Windows 11",
                "14 дюймов",
                "серый",
                "Full HD",
                "Intel Pentium Gold",
                "4 гб",
                "256 гб");

        laptop[1] = new Laptop(42.435f,
                "Acer",
                "Windows 10",
                "15.6 дюймов",
                "черный",
                "Full HD",
                "Intel Core i3",
                "4 гб",
                "128 гб");

        laptop[2] = new Laptop(71.200f,
                "Acer",
                "Windows 11",
                "14 дюймов",
                "серый",
                "Full HD",
                "Intel Core i7",
                "8 гб",
                "256 гб");

        laptop[3] = new Laptop(53.200f,
                "Lenovo",
                "Windows 11",
                "14 дюймов",
                "серый",
                "Full HD",
                "Intel Core i5",
                "8 гб",
                "512 гб");

        laptop[4] = new Laptop(58.385f,
                "Asus",
                "Windows 11",
                "14 дюймов",
                "серый",
                "Full HD",
                "Intel Core i5",
                "8 гб",
                "512 гб");

        laptops.addAll(Arrays.asList(laptop));
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