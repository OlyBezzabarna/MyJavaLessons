package exampleHumanSix;

import Enum.Species;
import exampleFamilySix.Family;
import exampleFamilySix.Human;
import exampleFamilySix.Pet;
import examplePetSix.Dog;
import examplePetSix.DomesticCat;
import org.jetbrains.annotations.NotNull;

public final class Man extends Human {

    public Man() {
    }

    public Man(String name, String surname, int year, Family family) {
        super(name, surname, year, family);
    }

    @Override
    public void greetPet() {
        DomesticCat pet = new DomesticCat("Боня", 4, 5,
                new String[]{"любит спать целый день", "и гулять всю ночь"});
        System.out.println("Привіт мій рижик " + pet.getNickName());
    }

    public void feedTheFish() {
        System.out.println("Піду нагодую свою золотеньку " + Species.FISH.getSpecies());
    }
}
