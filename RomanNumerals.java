public class RomanNumerals {

    public static int parseRoman(final String roman) {
        int number = 0;

        if (roman.equals("I")) {
            number += 1;
        }
        return number;
    }

    public static String toRoman(final int number) {
        String roman = "";

        if (number == 1) {
            roman += "I";
        }
        return roman;
    }

    public static void main(final String... args) {
        assert 0 == parseRoman("");
        assert "".equals(toRoman(0));

        assert 1 == parseRoman("I");
        assert "I".equals(toRoman(1));
    }
}
