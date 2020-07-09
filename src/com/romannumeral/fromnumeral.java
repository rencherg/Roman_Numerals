package com.romannumeral;

public class fromnumeral {

    public static int change(String num) {

        //changing num to uppercase
        num = num.toUpperCase();

        //length of number
        int length = num.length();

        //Array where number values of the roman numerals will be stored
        int[] newnumeral = new int[length];

        //storing number values of the different characters inside the array
        for(int i = 0; i < length; i++) {

            switch(num.charAt(i)) {
                case('I'):
                    newnumeral[i] = 1;
                    break;
                case('V'):
                    newnumeral[i] = 5;
                    break;
                case('X'):
                    newnumeral[i] = 10;
                    break;
                case('L'):
                    newnumeral[i] = 50;
                    break;
                case('C'):
                    newnumeral[i] = 100;
                    break;
                case('D'):
                    newnumeral[i] = 500;
                    break;
                case('M'):
                    newnumeral[i] = 1000;
                    break;
                default:
                    return 0;
            }

        }

        //declarations
        //a and b check to see if the numbers can be subtracted,
        //or if only the first number can be addeed
        //total counts the total of the numerals
        //check runs the loop
        int a = 0;

        int b = 1;

        int total = 0;

        boolean check = true;

        //method to read through the numbers in the array
        while(check) {

            //if a is longer than the array, then the loop ends
            if (a >= length) {

                check = false;

            }

            //if b is longer than the array, the last number is added to the total
            else if (b >= length) {

                total += newnumeral[a];

                check = false;
            }

            //if the first number is greater than the second, then
            //only the first number is added
            //1 is added to both the numbers
            else if (newnumeral[a] >= newnumeral[b]) {

                total += newnumeral[a];

                a += 1;

                b += 1;

            }

            //if the first number is less, then subtraction occurs then the subtracted
            //second number is added
            //subtracting by less than 1/10 is not allowed
            //2 is added to both the numbers
            else if (newnumeral[b] >= newnumeral[a]) {

                double checkb = newnumeral[b];
                double checka = newnumeral[a];
                if ((checka/checkb)<.1) {
                    return 0;
                }

                int subtract = (newnumeral[b] - newnumeral[a]);

                total += subtract;

                a += 2;

                b += 2;
            }


        }
        //if everthing finishes without returning zero, the total is returned
        return total;

    }

}
