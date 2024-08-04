import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;


@RunWith(MockitoJUnitRunner.class)
public class TestFeline {

    @Spy
    Feline feline;

    @Test
    public void testEatMeat() throws Exception {
        List<String> whoEatMeat = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(feline.eatMeat(),whoEatMeat);
    }

    @Test
    public void testGetFamily() {
        String expectedFamily = "Кошачьи";
        String result = feline.getFamily();
        Assert.assertEquals(expectedFamily, result);
    }

    @Test
    public void testGetKittensWithoutParams() {
        int expectedCount = 1;
        Assert.assertEquals(expectedCount, feline.getKittens());
    }

    @Test
    public void testGetKittensWithParams() {
        int expectedCountFromParams = 4;
        Assert.assertEquals(expectedCountFromParams, feline.getKittens(expectedCountFromParams));
    }
}
