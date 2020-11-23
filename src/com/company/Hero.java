package com.company;

public class Hero {
    private int health;
    private int damage;
    private String skill;
    public Hero(){}


   public Hero (int health, int damage, String skill){
       health = health;
       damage = damage;
       skill = skill;
   }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
