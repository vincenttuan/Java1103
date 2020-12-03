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
}
