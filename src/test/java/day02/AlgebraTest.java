package day02;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by apex on 2017-01-03.
 */
public class AlgebraTest {

    @Test
    public void substract(){
        Algebra algebra = new Algebra();

        assertThat("3 - 1 = 2", algebra.sub(3, 1), is(equalTo(2)));
    }



}