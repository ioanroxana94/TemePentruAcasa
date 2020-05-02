import com.sun.security.jgss.GSSUtil;

import java.util.EmptyStackException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 32;
        int y = 68;
        int z = 56;

        int a = 25;
        int b = 50;
        int c = 85;

        String text = "In physics, string theory is a theoretical framework in which the point-like particles of particle physics are replaced by one-dimensional objects called strings. It describes how these strings propagate through space and interact with each other.";
        String text2 = "On distance scales larger than the string scale, a string looks just like an ordinary particle, with its mass, charge, and other properties determined by the vibrational state of the string. In string theory, one of the many vibrational states of the string corresponds to the graviton, a quantum mechanical particle that carries gravitational force.";
        String text3 = "Java is a general-purpose programming language that is class-based, object-oriented, and designed to have as few implementation dependencies as possible";
        String text4 = "The frequency spectrum of 5G is divided into millimeter waves, mid-band, and low-band. Low-band uses a similar frequency range as the predecessor, 4G. 5G millimeter wave is the fastest, with actual speeds often being 1–2 Gbit/s down.";
        //Write a Java program to find the smallest number among three numbers.
        numarCelMaiMic(x, y, z);

        //Write a Java program that takes three numbers as input to calculate and print the average of the numbers. 
        int sum = a + b + c;
        double medie = 3;
        System.out.println("Suma celor trei numere este " + sum);
        double averageNumbers = averageNumbers(sum, medie);
        System.out.println("Media aritmetica a celor trei numere este " + averageNumbers); //Am folosit double deoarece suma numerelor mele este numar zecimal

        //Write a Java program to display the middle character of a string.
        char middleChar = middleChar(text4);
        System.out.println("Caracterul din mijloc este: " + middleChar);

        //Write a Java program to count all words in a string.
        int numaraCuvinte = numaraCuvinte(text);
        System.out.println("Numarul de cuvinte din text este " + numaraCuvinte);


        //Write a Java program to print characters between two characters (i.e. A to P ) from a text
        cuvinteMijloc(text2);

        //Write a Java program start with an integer n, divide n by 2 if n is even or multiply by 3 and add 1 if n is odd, repeat the process until n = 1.
        int n = 155;
        int number = number(n);
        System.out.println(number);

        //Write a Java program to test if an array of integers contains an element 10 next to 10 or an element 20 next to 20
        int[] numereAlese = {10, 10, 5, 9, 20, 20};
        containsElement(numereAlese);

        //Write a Java program to find the numbers greater than the average of the numbers of a given array.
        int[] numbersArray = {5, 3, 8, 2, 10};
        int sum2 = 0;
        averageNumbers3(numbersArray, sum2);

        //Write a Java program to check if the value 20 appears three times in an array
        int[] numbersArray2 = {2, 20, 5, 20, 6, 20};
        int count = 0;
        int value = 20;
        numberPosition(numbersArray2, count, value);

        //Write a Java program to add all the digits of a given positive integer until the result has a single digit.
        int newNumber = 246;
        int sum3 = 0;
        int sumDigits = sumDigits(newNumber, sum3);
        System.out.println("Rezultatul acestui exxercitiu este: " + sumDigits);

        //Write a Java program to check if a positive number is a palindrome or not.
        int palidromeNumber = 252, reversedInteger = 0, remainder, originalInteger;
        originalInteger = palidromeNumber;
        rezultatPalidrome(palidromeNumber, reversedInteger, originalInteger);

        //Write a Java program to check if a string is a palindrome or not.
        String palidrome = "radar";
        if (isPalidrome(palidrome)) {
            System.out.println("Yes, it is a palidrome");
        } else {
            System.out.println("No, it is not a palidrome");
        }

        //Write a Java program to compute the sum of first n given prime numbers.
        int sumaPrime = 1;
        int count2 = 0;
        int numberN = 0;

        while (count2 < 100) {
            numberN++;
            if (numberN % 2 != 0) {
                // aflam daca numarul este unul par
                if (primeNumbers(numberN)) {
                    sumaPrime += numberN;
                }
            }
            count2++;
        }
        System.out.println("Sum of the prime numbers till 100 : " + sumaPrime);

        //Write a Java program to find the find the word from the middle of a given string. 
        middleString(text4);

        //Write a Java program to print the characters on positions that are multiple of 5 BUT NOT multiple of 10
        //
        //Write a Java program to read a string and if the first or last characters are ’s’ or ’e’, return the string without the words from odd positions.
        stringPosition(text3);

        //Write a Java program to count the number of words ending that have more than 2 vowels

        wordsVowels(text2);

        //Write a Java program to count all “,” and spaces in a text
        int countSpaces = countSpaces(text3);
        System.out.println("Numarul de spatii si <,> este :" + countSpaces);

        //Write a Java program to replace all spaces from a string with “;” if the space is on an even position and with “|” if the space is on an odd position from a given string.
        replaceSpaces(text3);

    }

    public static void numarCelMaiMic(int x, int y, int z) {
        if (x <= y && x <= z) {
            System.out.println(x + " este cel mai mic numar");
        } else if (y <= x && y <= z) {
            System.out.println(y + " este cel mai mic numar");
        } else {
            System.out.println(z + " este cel mai mic numar ");
        }
    }

    public static double averageNumbers(int sum, double medie) {
        double averageNumbers = sum / medie;
        return averageNumbers;
    }

    public static int numaraCuvinte(String text) {
        int sumaString = 0;
        String[] cuvinte = text.split(" ");
        for (int cursor = 0; cursor < cuvinte.length; cursor++) {
            if (cuvinte[cursor].startsWith("") || cuvinte[cursor].endsWith("")) {
                sumaString++;
                System.out.println(cuvinte[cursor]);
            }
        }
        return sumaString;
    }

    public static char middleChar(String text4) {
        int stringLength = text4.length();
        int middle = stringLength / 2;
        char caracter = text4.charAt(middle);
        return caracter;

    }


    public static void cuvinteMijloc(String text2) {
        int pozitieCaracter = text2.indexOf('a');
        System.out.println("Pozitia literei 'a' este " + pozitieCaracter);
        int pozitieCaracter2 = text2.indexOf('p');
        System.out.println("Pozitia literei 'p' este " + pozitieCaracter2);
        String caractereMijloc = text2.substring(7, 86);
        System.out.println("Caracterele dintre literele A si P sunt " + caractereMijloc);
    }

    public static int number(int n) {
        int number = n;
        while (n != 1) {
            if (n % 2 == 0) {
                System.out.println("Numarul este par asa ca facem urmatoarea operatie:" + n / 2);
            } else {
                System.out.println("Numarul este impar asa ca facem urmatoarea operatie:" + (3 * n + 1));
            }
            n--;
        }
        return number;
    }

    public static void containsElement(int[] numereAlese) {
        boolean found1010 = false;
        boolean found2020 = false;
        for (int i = 0; i < numereAlese.length - 1; i++) {
            if (numereAlese[i] == 10 && numereAlese[i + 1] == 10) {
                found1010 = true;
            } else {
                found1010 = false;
            }
            if (numereAlese[i] == 20 && numereAlese[i + 1] == 20) {
                found2020 = true;
            } else {
                found2020 = false;
            }
        }
        System.out.println(found1010);
        System.out.println(found2020);
        System.out.println(found1010 != found2020);

    }

    public static void averageNumbers3(int numbersArray[], int sum2) {
        for (int cursor = 0; cursor < numbersArray.length; cursor++) {
            sum2 = sum2 + numbersArray[cursor];
        }
        int average2 = sum2 / numbersArray.length;
        System.out.println("The average of the arrays is: " + average2);
        System.out.println("The numbers in the array that are greater than the average are: ");
        for (int cursor = 0; cursor < numbersArray.length; cursor++) {
            if (numbersArray[cursor] > average2) {
                System.out.println(numbersArray[cursor]);
            }
        }
    }

    public static void numberPosition(int numbersArray2[], int count, int value) {
        for (int cursor = 0; cursor < numbersArray2.length; cursor++) {
            if (numbersArray2[cursor] != value && numbersArray2[cursor + 1] != value) {
                count = 1;
            }
        }
        if (count == 0) {
            System.out.println(String.valueOf(true));
        } else {
            System.out.println(String.valueOf(false));
        }
    }

    public static int sumDigits(int newNumber, int sum3) {
        while (newNumber > 0 || sum3 > 10) {
            if (newNumber == 0) {
                newNumber = sum3;
                sum3 = 0;
            }
            sum3 += newNumber % 10;
            newNumber /= 10;
        }
        return sum3;
    }

    public static void rezultatPalidrome(int palidromeNumber, int reversedInteger, int originalInteger) {
        while (palidromeNumber != 0) {
            int remainder = palidromeNumber % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            palidromeNumber /= 10;
        }
        if (originalInteger == reversedInteger) {
            System.out.println(originalInteger + " is a palidrome number");
        } else {
            System.out.println(originalInteger + " is not a palidrome number");
        }
    }

    public static boolean isPalidrome(String palidrome) {
        int i = 0, j = palidrome.length() - 1;
        while (i < j) {
            if (palidrome.charAt(i) != palidrome.charAt(j)) {
                return false;
            } else {
                return true;
            }
        }
        return isPalidrome(palidrome);
    }

    public static boolean primeNumbers(int numberN) {
        for (int i = 2; i * i <= numberN; i++) {
            if (numberN % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void middleString(String text4) {
        int middleWord = 0;
        String[] arrayOfWords = text4.split(" ");
        for (int i = 0; i < arrayOfWords.length; i++) {
            middleWord = arrayOfWords.length / 2;

        }
        System.out.println("Cuvantul din mijloc este : " + arrayOfWords[middleWord]);
    }


    public static void stringPosition(String text3) {
        char caracter = ' ';
        if (text3.startsWith("s") || text3.startsWith("e") || text3.endsWith("s") || text3.endsWith("e")) {
            for (int i = 1; i < text3.length() - 1; i += 2) {
                caracter = text3.charAt(i);
                System.out.print(caracter);
            }
        }
    }



    public static void wordsVowels( String text2) {
        int wordCount = 0;
        String[] strArray = text2.split("");
        for (int i = 0; i < strArray.length; i++) {
            int vCount = 0;
            String[] vocals = {"a", "e", "i", "o", "u"};
            for (int j = 0; j < vocals.length; j++) {
                if (strArray[i].contains(vocals[j])) {
                    vCount++;
                }
                if (vCount > 2) {
                    wordCount++;
                    break;
                }
            }
        }
        System.out.println("Numarul de cuvinte care are mai mult de doua vocale este : " + wordCount);     // Nu inteleg de ce rezultatul acestui exercitiu mi-l afiseaza legat de rezultatul exercitiului precedent.
    }


    public static int countSpaces(String text3) {
        int spaceCount = 0;
        for (int cursor = 0; cursor <= text3.length() - 1; cursor++) {
            char caracterCautat = text3.charAt(cursor);
            if (caracterCautat == ' ' || caracterCautat == ',') {
                spaceCount++;
            }
        }

        return spaceCount;
    }

    public static void replaceSpaces(String text3) {
        int spaceCount2 = 0;
        String[] cuvinte = text3.split(" ");
        for (int cursor = 0; cursor < cuvinte.length; cursor++) {
            if (cuvinte[cursor].startsWith("") || cuvinte[cursor].endsWith("")) {
                spaceCount2++;
            }
        }
        if (spaceCount2 % 2 == 0) {
            String resultSpaces = text3.replace(" ", ";");
            System.out.println(resultSpaces);

        } else {
            String resultSpaces = text3.replace(" ", "|");
            System.out.println(resultSpaces);
        }
    }
}
