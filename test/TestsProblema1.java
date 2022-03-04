import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestsProblema1 {

    @Test
    public void problema1Test() {
        Problema1 problema1 = new Problema1();
        String expected = problema1.numerosEntre1y2();
        String actual = "12Fizz4BuzzFizz78FizzBuzz11Fizz1314Fizzbuzz1617Fizz19Buzz";
        Assertions.assertEquals(expected, actual);
    }


}
