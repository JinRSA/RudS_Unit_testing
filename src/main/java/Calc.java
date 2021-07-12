public class Calc {
    public Object add(final Object num1, final Object num2) {
        int[] numbers = parseNumbers(num1, num2);
        if (numbers == null)
            return null;
        return numbers[0] + numbers[1];
    }

    public Object mult(final Object num1, final Object num2) {
        int[] numbers = parseNumbers(num1, num2);
        if (numbers == null)
            return null;
        return numbers[0] * numbers[1];
    }

    public Object div(final Object num1, final Object num2) {
        int[] numbers = parseNumbers(num1, num2);
        if (numbers == null)
            return null;
        if (numbers[1] == 0) {
            System.out.println("Деление на ноль недопустимо.");
            return numbers[0] < 0 ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY;
        }
        return numbers[0] / numbers[1];
    }

    public Object sub(final Object num1, final Object num2) {
        int[] numbers = parseNumbers(num1, num2);
        if (numbers == null)
            return null;
        return numbers[0] - numbers[1];
    }

    private int[] parseNumbers(Object num1, Object num2) {
        int number1, number2;
        try {
            number1 = Integer.parseInt(num1.toString());
            number2 = Integer.parseInt(num2.toString());
        } catch (NumberFormatException ex) {
            System.out.println("Некорректный ввод. " + num1.getClass().getName() + " и " + num2.getClass().getName());
            return null;
        } catch (ClassCastException ex) {
            System.out.println("Некорректный ввод, неудалось привести к int. " + num1.getClass().getName() + " и " + num2.getClass().getName());
            return null;
        }
        return new int[] { number1, number2 };
    }
}