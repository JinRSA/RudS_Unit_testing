import org.testng.annotations.DataProvider;

public class CalcDataForTests {
    @DataProvider
    public static Object[][] calculateAddEqualsData() {
        return new Object[][]{
                {Integer.MIN_VALUE + 1, Integer.MIN_VALUE, 1},
                {Integer.MIN_VALUE + 1 + 11, Integer.MIN_VALUE + 1, 11},
                {0, -1, 1},
                {Integer.MAX_VALUE - 1, Integer.MAX_VALUE - 1, 0},
                {Integer.MAX_VALUE + 10, Integer.MAX_VALUE, 10}
        };
    }

    @DataProvider
    public static Object[][] calculateMultEqualsData() {
        return new Object[][]{
                {Integer.MIN_VALUE * 1, Integer.MIN_VALUE, 1},
                {(Integer.MIN_VALUE + 1) * 11, Integer.MIN_VALUE + 1, 11},
                {-1, -1, 1},
                {0, Integer.MAX_VALUE - 1, 0},
                {Integer.MAX_VALUE * 10, Integer.MAX_VALUE, 10}
        };
    }

    @DataProvider
    public static Object[][] calculateDivEqualsData() {
        return new Object[][]{
                {Integer.MIN_VALUE / 1, Integer.MIN_VALUE, 1},
                {(Integer.MIN_VALUE + 1) / 11, Integer.MIN_VALUE + 1, 11},
                {-1, -1, 1},
                {Integer.MAX_VALUE - 1, Integer.MAX_VALUE - 1, 1},
                {Integer.MAX_VALUE / 10, Integer.MAX_VALUE, 10}
        };
    }

    @DataProvider
    public static Object[][] calculateSubEqualsData() {
        return new Object[][]{
                {Integer.MIN_VALUE - 1, Integer.MIN_VALUE, 1},
                {Integer.MIN_VALUE + 1 - -11, Integer.MIN_VALUE + 1, -11},
                {-2, -1, 1},
                {Integer.MAX_VALUE - 1, Integer.MAX_VALUE - 1, 0},
                {Integer.MAX_VALUE - 10, Integer.MAX_VALUE, 10}
        };
    }

    @DataProvider
    public static Object[][] calculateAddNotEqualsData() {
        return new Object[][]{
                {Integer.MIN_VALUE, Integer.MIN_VALUE, 1},
                {Integer.MIN_VALUE, Integer.MIN_VALUE + 1, 11},
                {10, -1, 1},
                {Integer.MAX_VALUE, Integer.MAX_VALUE - 1, 0},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, 10}
        };
    }

    @DataProvider
    public static Object[][] calculateMultNotEqualsData() {
        return new Object[][]{
                {1, Integer.MIN_VALUE, 1},
                {Integer.MIN_VALUE + 1, Integer.MIN_VALUE + 1, 11},
                {1, -1, 1},
                {1, Integer.MAX_VALUE - 1, 0},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, 10}
        };
    }

    @DataProvider
    public static Object[][] calculateDivNotEqualsData() {
        return new Object[][]{
                {Integer.MIN_VALUE / 2, Integer.MIN_VALUE, 1},
                {Integer.MIN_VALUE, Integer.MIN_VALUE + 1, 11},
                {1, -1, 1},
                {Integer.MAX_VALUE + 1, Integer.MAX_VALUE - 1, 1},
                {Integer.MAX_VALUE >> 1, Integer.MAX_VALUE, 10}
        };
    }

    @DataProvider
    public static Object[][] calculateSubNotEqualsData() {
        return new Object[][]{
                {-1, Integer.MIN_VALUE, 1},
                {-1, Integer.MIN_VALUE + 1, -11},
                {-1, -1, 1},
                {-1, Integer.MAX_VALUE - 1, 0},
                {-10, Integer.MAX_VALUE, 10}
        };
    }

    @DataProvider
    public static Object[][] calculateIncorrectData() {
        return new Object[][]{
                {"Integer.MIN_VALUE", "Integer.MAX_VALUE"},
                {"0xFF", "0x11"},
                {(char)1, (char)2},
                {Long.MAX_VALUE, Long.MAX_VALUE}
        };
    }
}