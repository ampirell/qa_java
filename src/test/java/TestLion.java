import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;


@RunWith(MockitoJUnitRunner.class)

public class TestLion {

    private Lion lion;

    @Mock
    Feline feline;

    @Before
    public void setUp(){
        lion = new Lion(feline);
    }

    @Test
    public void testGetKittens(){
        int expectedCount = 1;
        Mockito.when(feline.getKittens()).thenReturn(1);
        Assert.assertEquals(expectedCount,lion.getKittens());
    }

    @Test
    public void testGetFood() throws Exception {
        List<String> whoEatMeat = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(whoEatMeat);
        Assert.assertEquals(lion.getFood(),whoEatMeat);

    }

}
