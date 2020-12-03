package com.ocp10.pet;

import com.ocp10.pet.entity.Pet;
import com.ocp10.pet.service.PetService;

public class PetStore {
    public static void main(String[] args) {
        PetService service = new PetService();
        Pet[] pets = service.getPets();
        service.print(pets);
        int totalPrice = service.allPrice(pets);
        System.out.printf("Total price: %,d\n", totalPrice);
    }
}
