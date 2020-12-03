package com.ocp10.pet.service;

import com.ocp10.pet.entity.Chihuahua;
import com.ocp10.pet.entity.EDog;
import com.ocp10.pet.entity.Pet;
import com.ocp10.pet.entity.Shiba;

public class PetService {
    // 取得目前所有的寵物(Pet), 庫存 !
    public Pet[] getPets() {
        Pet[] pets = {
            new Chihuahua(15000),
            new Chihuahua(20000),
            new Shiba(26000),
            new Shiba(18000),
            new Shiba(12000),
            new EDog(300),
            new EDog(300),
        };
        return pets;
    }
    
    // 取得所有寵物的價格
    public int allPrice(Pet[] pets) {
        int sum = 0;
        for(Pet pet : pets) {
            sum += pet.getPrice();
        }
        return sum;
    }
    
    // 印出寵物資料
    public void print(Pet[] pets) {
        for(Pet pet : pets) {
            String className = pet.getClass().getSimpleName();
            int price = pet.getPrice();
            System.out.printf("%s 價格: %d  飲食:", className, price);
            pet.eat();
        }
    }
}
