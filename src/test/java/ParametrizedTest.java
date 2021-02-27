import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class ParametrizedTest {

    @Parameterized.Parameters
    public static Collection<Object[]> params() {
        return Arrays.asList(new Object[][]{
                {Arrays.asList( 1, 1, 1, 4, 4, 1, 4, 4 ), true},
                {Arrays.asList( 1, 1, 1, 1, 1 ,1), false},
                {Arrays.asList(4 ,4 ,4 ,4), false},
                {Arrays.asList( 1, 4, 4, 1, 1 ,3), false}
        });
    }

    private int[] n1;
    private boolean res;
    private NewArray array;

    public ParametrizedTest(List<Integer> n1,  boolean res) {

        this.n1 = new int[n1.size()];
        this.res = res;
        for(int i = 0;i < this.n1.length;i++){
            this.n1[i] = n1.get(i);
        }
    }
    @Before
    public void init(){
        array = new NewArray();
    }
    @Test
    public void newArrayTest() throws RuntimeException{
        Assert.assertEquals(res, array.haveOneAndFour(n1));
    }

}
