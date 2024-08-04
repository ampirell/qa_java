import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;



@RunWith(MockitoJUnitRunner.class)
public class TestCat {

    private Cat cat;

    @Mock
    Feline feline;

    @Before
    public void setUp(){
        cat = new Cat(feline);
    }


    @Test
    public void testGetFood() throws Exception {

        List<String> whoEatMeat = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(whoEatMeat);
        Assert.assertEquals(cat.getFood(),whoEatMeat);
    }

    @Test
    public void testGetSound(){
        //Cat cat = new Cat(feline);
        Assert.assertEquals(cat.getSound(), "Мяу");
    }
}