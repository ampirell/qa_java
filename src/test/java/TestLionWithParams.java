import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertThrows;

@RunWith(Parameterized.class)
public class TestLionWithParams {

    String expSex;
    boolean expHasMane;

    public TestLionWithParams(String expSex, boolean expHasMane){
        this.expSex = expSex;
        this.expHasMane = expHasMane;
    }

    @Parameterized.Parameters
    public static Object[][] testData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void testDoesHaveMane() throws Exception {
        Lion lion = new Lion(expSex);
        String ff = "jf";
        boolean actualSex = lion.doesHaveMane();
        Assert.assertEquals(actualSex,expHasMane);
        Exception exception = assertThrows(Exception.class,
                () -> { Lion lion1 = new Lion(ff);
                });
    }

}
