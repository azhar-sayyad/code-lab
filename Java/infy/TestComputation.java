import jdk.jfr.Timestamp;

class Computation {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int divide(int num1, int num2) {
        return num1 / num2;
    }

}

public class TestComputation {
    Computation comput = new Computation();

    @test
    public void testAdd1() {
        int expected = 5;
        int actual = comput.add(2, 3);
        Assert.assertEquals(expected, actual);
    }

    @test
    public void testAdd2() {
        int expected = 7;
        int actual = comput.add(2, 5);
        Assert.assertEquals(expected, actual);
    }

}
