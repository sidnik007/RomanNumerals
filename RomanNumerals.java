public class RomanNumerals {

    public static int parseRoman(String roman) {
        int number = 0;

        while (roman.startsWith("IV")) {
            number += 4;
            roman = roman.substring("IV".length());
        }

        while (roman.startsWith("I")) {
            number += 1;
            roman = roman.substring("I".length());
        }
        return number;
    }

    public static String toRoman(int number) {
        String roman = "";

        while (number >= 4) {
            roman += "IV";
            number -= 4;
        }

        while (number >= 1) {
            roman += "I";
            number -= 1;
        }
        return roman;
    }

    public static void main(final String... args) {
        assert 0 == parseRoman("");
        assert "".equals(toRoman(0));

        assert 1 == parseRoman("I");
        assert "I".equals(toRoman(1));

        assert 2 == parseRoman("II");
        assert "II".equals(toRoman(2));

        assert 4 == parseRoman("IV");
        assert "IV".equals(toRoman(4));
    }
}
