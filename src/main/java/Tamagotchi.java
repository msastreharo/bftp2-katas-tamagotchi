public class Tamagotchi {

    int mood = 4;
    int hunger = 4;
    int energy = 4;

    public String play() {
        energy --;
        hunger --;
        mood ++;
        if (energy == 0) {
            return "(-_-) zZZ";
        } else if (energy < 3) {
            return "(-_-)";
        } else {
            return ":-|";
        }
    }

    public String sleep() {
        energy = energy + 2;
        if (energy < 3) {
            return "(-_-) zZZ";
        } else {
            return ":-|";
        }
    }
}
