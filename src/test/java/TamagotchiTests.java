import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class TamagotchiTests {

    Tamagotchi tamagotchi = new Tamagotchi();

    @Test
    void tamagotchiIsTiredAfterPlaying() {
        tamagotchi.play();
        assertThat(tamagotchi.play(), equalTo("(-_-)"));
    }

    @Test
    void tamagotchiIsNormalWhenNotPlaying() {
        assertThat(tamagotchi.play(), equalTo(":-|"));
    }

    @Test
    void tamagotchiGoesToSleepWhenEnergyEqualsZero() {
        tamagotchi.play();
        tamagotchi.play();
        tamagotchi.play();
        assertThat(tamagotchi.play(), equalTo("(-_-) zZZ"));
    }

    @Test
    void tamagotchisEnergyAugmentatesWhenSleeping() {
        assertThat(tamagotchi.sleep(), equalTo(":-|"));
    }

    // In progress!

}
