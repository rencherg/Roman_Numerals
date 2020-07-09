package com.romannumeral;

public class tonumeral {

    public static String change(int number) {

        //array of strings for the numerals is created
        String numerals[] = new String[4];

        //string of the number
        String num = String.valueOf(number);

        //we only working with numbers less than 10,000 so
        //the the number must only be 4 digits or less
        //null is returned if number is too big.
        if (num.length() > 4) {
            return null;
        }

        //adding zeroes to the beginning if
        //there are less than 4 characters
        if (num.length() < 4) {
            while(num.length() < 4) {
                num = ("0" + num);
            }
        }
        //declaring the return string
        String numeral = " ";


        //big wrapper to get first digit as an int
        int firstDigit = Integer.parseInt(String.valueOf(num.charAt(0)));

        //adds an m for every thousand
        for(int k = 0; k<firstDigit; k++) {
            numeral += "M";
        }

        //checks each digit and adds the correct roman numeral to return string.
        //if zero, then add nothing. if invalid character then return null.
        switch(num.charAt(1)) {
            case ('0'):
                break;
            case ('1'):
                numeral += "C";
                break;
            case ('2'):
                numeral += "CC";
                break;
            case ('3'):
                numeral += "CCC";
                break;
            case ('4'):
                numeral += "CD";
                break;
            case ('5'):
                numeral += "D";
                break;
            case ('6'):
                numeral += "DC";
                break;
            case ('7'):
                numeral += "DCC";
                break;
            case ('8'):
                numeral += "DCCC";
                break;
            case ('9'):
                numeral += "CM";
                break;
            default:
                return null;
        }

        //same here
        switch(num.charAt(2)) {
            case('0'):
                break;
            case('1'):
                numeral += "X";
                break;
            case('2'):
                numeral += "XX";
                break;
            case('3'):
                numeral += "XXX";
                break;
            case('4'):
                numeral += "XL";
                break;
            case('5'):
                numeral += "L";
                break;
            case('6'):
                numeral += "LX";
                break;
            case('7'):
                numeral += "LXX";
                break;
            case('8'):
                numeral += "LXXX";
                break;
            case('9'):
                numeral += "XC";
                break;
            default:
                return null;
        }

        //and here
        switch(num.charAt(3)) {
            case ('0'):
                break;
            case ('1'):
                numeral += "I";
                break;
            case ('2'):
                numeral += "II";
                break;
            case ('3'):
                numeral += "III";
                break;
            case ('4'):
                numeral += "IV";
                break;
            case ('5'):
                numeral += "V";
                break;
            case ('6'):
                numeral += "VI";
                break;
            case ('7'):
                numeral += "VII";
                break;
            case ('8'):
                numeral += "VIII";
                break;
            case ('9'):
                numeral += "IX";
                break;
            default:
                return null;
        }

        //if the program makes it here without returning null,
        // then it returns the roman numeral
        return numeral;
    }

}
