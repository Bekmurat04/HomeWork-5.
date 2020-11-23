package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(20);
        boss.setDamage(10);
        boss.setDefenceType("allMight");
        System.out.println(boss.getHealth() + " " + boss.getDamage() + " " + boss.getDefenceType());

    }
    

}
