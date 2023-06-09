package examplePetSix;

import Enum.Species;
import exampleFamilySix.Pet;
import Pet.Interface.FoulOfInterface;

public class RobotCat extends Pet implements FoulOfInterface {

    public RobotCat(Species species) {
    }

    public RobotCat() {
    }

    public RobotCat(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
    }

    @Override
    public void respond() {
        System.out.println("Привіт, господарю. Я - твій любий кіт Роббі. Після мене не потрібно прибирати!");
    }

    @Override
    public void foul() {
        System.out.println("Потрібно, як справжньому коту зробиту якусь шкоду.");
    }
}

