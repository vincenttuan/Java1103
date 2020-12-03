package com.ocp10.pet;

import com.ocp10.pet.entity.Chihuahua;
import com.ocp10.pet.entity.EDog;
import com.ocp10.pet.entity.Pet;
import com.ocp10.pet.entity.Shiba;
import com.ocp10.pet.service.PetService;

public class PetStore {
    public static void main(String[] args) {
        PetService service = new PetService();
        Pet[] pets = service.getPets();
        service.print(pets);
        int totalPrice = service.allPrice(pets);
        System.out.printf("Total price: %,d\n", totalPrice);
        int totalPriceByShiba = service.getPriceByShiba(pets);
        System.out.printf("Total price(Shiba) : %,d\n", totalPriceByShiba);
        int totalPriceByPet = service.getPriceByPet(pets, EDog.class);
        
    }
}
