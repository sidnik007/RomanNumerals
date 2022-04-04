
enum RomanDigit{
    V(5),
    IV(4),
    I(1),
    ;

    public final int value;

    RomanDigit(final int value) {
        this.value = value;
    }
}

public class RomanNumerals {

    public static int parseRoman(String roman) {
        int number = 0;

        for (RomanDigit rd : RomanDigit.values()) {
            while (roman.startsWith(rd.name())) {
                number += rd.value;
                roman = roman.substring(rd.name().length());
            }
        }
        return number;
    }

    public static String toRoman(int number) {
        String roman = "";

        for (RomanDigit rd : RomanDigit.values()) {
            while (number >= rd.value) {
                roman += rd.name();
                number -= rd.value;
            }
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

        assert 5 == parseRoman("V");
        assert "V".equals(toRoman(5));
    }
}
