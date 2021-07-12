import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcTests {
    //region Positive
    @Test(dataProvider = "calculateAddEqualsData", dataProviderClass = CalcDataForTests.class)
    public void testAdd(final Object expected, final Object num1, final Object num2) {
        Object actual = new Calc().add(num1, num2);
        Assert.assertEquals(expected, actual,
                "Значения не равны (должны быть равными)! " + "Фактическое = " + actual + ", ожидаемое = " + expected);
    }

    @Test(dataProvider = "calculateMultEqualsData", dataProviderClass = CalcDataForTests.class, priority = 1)
    public void testMult(final Object expected, final Object num1, final Object num2) {
        Object actual = new Calc().mult(num1, num2);
        Assert.assertEquals(expected, actual,
                "Значения не равны (должны быть равными)! " + "Фактическое = " + actual + ", ожидаемое = " + expected);
    }

    @Test(dataProvider = "calculateDivEqualsData", dataProviderClass = CalcDataForTests.class, priority = 2)
    public void testDiv(final Object expected, final Object num1, final Object num2) {
        Object actual = new Calc().div(num1, num2);
        Assert.assertEquals(expected, actual,
                "Значения не равны (должны быть равными)! " + "Фактическое = " + actual + ", ожидаемое = " + expected);
    }

    @Test(dataProvider = "calculateSubEqualsData", dataProviderClass = CalcDataForTests.class, priority = 3)
    public void testSub(final Object expected, final Object num1, final Object num2) {
        Object actual = new Calc().sub(num1, num2);
        Assert.assertEquals(expected, actual,
                "Значения не равны (должны быть равными)! " + "Фактическое = " + actual + ", ожидаемое = " + expected);
    }

    @Test(dataProvider = "calculateAddNotEqualsData", dataProviderClass = CalcDataForTests.class)
    public void testAddNotEquals(final Object notExpected, final Object num1, final Object num2) {
        Object actual = new Calc().add(num1, num2);
        Assert.assertNotEquals(notExpected, actual,
                "Значения равны (должны быть разными)! " + "Фактическое = " + actual + ", неожидаемое = " + notExpected);
    }

    @Test(dataProvider = "calculateMultNotEqualsData", dataProviderClass = CalcDataForTests.class, priority = 1)
    public void testMultNotEquals(final Object notExpected, final Object num1, final Object num2) {
        Object actual = new Calc().mult(num1, num2);
        Assert.assertNotEquals(notExpected, actual,
                "Значения равны (должны быть разными)! " + "Фактическое = " + actual + ", неожидаемое = " + notExpected);
    }

    @Test(dataProvider = "calculateDivNotEqualsData", dataProviderClass = CalcDataForTests.class, priority = 2)
    public void testDivNotEquals(final Object notExpected, final Object num1, final Object num2) {
        Object actual = new Calc().div(num1, num2);
        Assert.assertNotEquals(notExpected, actual,
                "Значения равны (должны быть разными)! " + "Фактическое = " + actual + ", неожидаемое = " + notExpected);
    }

    @Test(dataProvider = "calculateSubNotEqualsData", dataProviderClass = CalcDataForTests.class, priority = 3)
    public void testSubNotEquals(final Object notExpected, final Object num1, final Object num2) {
        Object actual = new Calc().sub(num1, num2);
        Assert.assertNotEquals(notExpected, actual,
                "Значения равны (должны быть разными)! " + "Фактическое = " + actual + ", неожидаемое = " + notExpected);
    }
//endregion
//region Negative.
    @Test(expectedExceptionsMessageRegExp = "Деление на ноль", priority = 2)
    public void testDivByZero() {
        new Calc().div(1, 0);
    }

    @Test(dataProvider = "calculateIncorrectData", dataProviderClass = CalcDataForTests.class, expectedExceptionsMessageRegExp = "Некорректный ввод", priority = 4)
    public void testIncorrectData(final Object num1, final Object num2) {
        new Calc().add(num1, num2);
        new Calc().mult(num1, num2);
        new Calc().div(num1, num2);
        new Calc().sub(num1, num2);
    }
//endregion
}