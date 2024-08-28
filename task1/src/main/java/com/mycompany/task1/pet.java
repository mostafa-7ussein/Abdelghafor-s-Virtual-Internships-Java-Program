/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task1;

/**
 *
 * @author mostafa
 */
public class pet {
    
private String name;
    private int hungerLevel;
    private int happinessLevel;

    public pet(String name) {
        this.name = name;
        this.hungerLevel = 50;
        this.happinessLevel = 50;
    }

    public String getName() {
        return name;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public int getHappinessLevel() {
        return happinessLevel;
    }

    public void feed() {
        if (hungerLevel < 90) {
            hungerLevel += 10;
            happinessLevel -= 5;

            System.out.println(getName() + " has been fed. Hunger level is now: " + getHungerLevel());
                        System.out.println(getName() + " is happy after playing. Happiness level is now: " + getHappinessLevel());

        } else {
            System.out.println(getName() + " is full and cannot eat more.");
        }
    }

    public void play() {
        if (happinessLevel < 90) {
            happinessLevel += 10;
            hungerLevel -=5;
            System.out.println(getName() + " is happy after playing. Happiness level is now: " + getHappinessLevel());
            System.out.println(getName() + " has been fed. Hunger level is now: " + getHungerLevel());

        } else {
            
            
            System.out.println(getName() + " is already very happy.");
        }
    }

    public void checkStatus() {
        System.out.println("Pet Name: " + getName());
        System.out.println("Hunger Level: " + getHungerLevel());
        System.out.println("Happiness Level: " + getHappinessLevel());
    }

    public boolean isCritical() {
        
        return getHungerLevel() <= 0 && getHungerLevel()>=90 || getHappinessLevel() <= 0 &&getHappinessLevel() >= 90;
    }
}
