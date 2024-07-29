import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertThrows;

public class TestAnimal {

    Animal animal = new Animal();

    @Test
    public void testGetFamily(){
        String expFamily = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        Assert.assertEquals(animal.getFamily(),expFamily);
    }

    @Test
    public void testGetFood() throws Exception {
        List<String> whoEatPlant = List.of("Трава", "Различные растения");
        Assert.assertEquals(animal.getFood("Травоядное"), whoEatPlant);
        List<String> whoEatMeat = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(animal.getFood("Хищник"),whoEatMeat);
        Exception exception = assertThrows(Exception.class,
                () -> { animal.getFood("Ничего не ест");
                });

    }
}
