package com.company;

public class Main {
    public static void main(String[] args) {

        Xirurg xirurg = new Xirurg();
        xirurg.setName("Adham");
        xirurg.setSurname("Mahmudov");
        xirurg.setAge(27);
        xirurg.setJob("Xirurg");
        xirurg.setSalary(1650);
        xirurg.getInfoXirurg();

        System.out.println();

        Lor lor = new Lor();
        lor.setName("Bobur");
        lor.setSurname("Mahmudov");
        lor.setAge(32);
        lor.setJob("Lor");
        lor.getInfoLor();
    }
}
