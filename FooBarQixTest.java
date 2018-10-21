import org.junit.Assert;
import org.junit.Test;

public class FooBarQixTest {

    @Test
    public void compute() {
        Assert.assertEquals(FooBarQix.compute("13"), "Foo");
        Assert.assertEquals(FooBarQix.compute("15"), "FooBarBar");
        Assert.assertEquals(FooBarQix.compute("27"), "FooQix");
        Assert.assertEquals(FooBarQix.compute("33"), "FooFooFoo");
        Assert.assertEquals(FooBarQix.compute("51"), "FooBar");
        Assert.assertEquals(FooBarQix.compute("53"), "BarFoo");
    }
}
