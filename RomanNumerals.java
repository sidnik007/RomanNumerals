enum RomanDigit{
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

        String romanDigit;
        int digitValue;
        RomanDigit rd;
        {
            rd = RomanDigit.IV;
            romanDigit = rd.name();
            digitValue = rd.value;
            while (roman.startsWith(romanDigit)) {
                number += digitValue;
                roman = roman.substring(romanDigit.length());
            }
        }
        {
            rd = RomanDigit.I;
            romanDigit = rd.name();
            digitValue = rd.value;
            while (roman.startsWith(romanDigit)) {
                number += digitValue;
                roman = roman.substring(romanDigit.length());
            }
        }
        return number;
    }

    public static String toRoman(int number) {
        String roman = "";

        String romanDigit;
        int digitValue;
        RomanDigit rd;
        {
            rd = RomanDigit.IV;
            romanDigit = rd.name();
            digitValue = rd.value;
            while (number >= digitValue) {
                roman += romanDigit;
                number -= digitValue;
            }
        }
        {
            rd = RomanDigit.I;
            romanDigit = rd.name();
            digitValue = rd.value;
            while (number >= digitValue) {
                roman += romanDigit;
                number -= digitValue;
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
    }
}
