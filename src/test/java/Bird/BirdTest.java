package Bird;

import bird.Bird;
import bird.BirdType;
import bird.Eagle;
import bird.Parrot;
import org.junit.Test;

public class BirdTest {

    @Test
    public void solve() {
        Bird parrot = new Parrot(10, "Green", "Small", "Sharp", BirdType.Parrot);
        parrot.fly();
    }

    @Test
    public void solve1() {
        Bird eagle = new Eagle(20, "Brown", "Medium", "Sharp", BirdType.Eagle);
        eagle.fly();
    }
}