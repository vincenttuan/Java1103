package com.ocp6;

public class SetMeal {
    private Hamburger hamburger;
    private SideMeal sideMeal;
    private Drink drink;

    public SetMeal(Hamburger hamburger, SideMeal sideMeal, Drink drink) {
        this.hamburger = hamburger;
        this.sideMeal = sideMeal;
        this.drink = drink;
    }

    public Hamburger getHamburger() {
        return hamburger;
    }

    public void setHamburger(Hamburger hamburger) {
        this.hamburger = hamburger;
    }

    public SideMeal getSideMeal() {
        return sideMeal;
    }

    public void setSideMeal(SideMeal sideMeal) {
        this.sideMeal = sideMeal;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String toString() {
        return "SetMeal{" + "hamburger=" + hamburger + ", sideMeal=" + sideMeal + ", drink=" + drink + '}';
    }
    
}
