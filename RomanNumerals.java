public class RomanNumerals {

    public static int parseRoman(String roman) {
        int number = 0;

        String romanDigit;
        int digitValue;
        {
            romanDigit = "IV";
            digitValue = 4;
            while (roman.startsWith(romanDigit)) {
                number += digitValue;
                roman = roman.substring(romanDigit.length());
            }
        }
        {
            romanDigit = "I";
            digitValue = 1;
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

        {
            romanDigit = "IV";
            digitValue = 4;
            while (number >= digitValue) {
                roman += romanDigit;
                number -= digitValue;
            }
        }
        {
            romanDigit = "I";
            digitValue = 1;
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
