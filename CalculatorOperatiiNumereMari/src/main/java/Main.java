import org.w3c.dom.ls.LSOutput;

import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            Calculator calculator = new Calculator();

            Scanner scanner = new Scanner(System.in);
            System.out.println("Va rugam introguceti primul numar");

            BigInteger primulNumar = scanner.nextBigInteger();
            System.out.println("Va rugam introduceti al doilea numar");

            BigInteger alDoileaNumar = scanner.nextBigInteger();

            System.out.println("Numerele introduse de dumnavoastra sunt: " + primulNumar + "si " + alDoileaNumar);

            BigInteger adunare = calculator.adunare(primulNumar, alDoileaNumar);
            System.out.println("Rezultatul adunarii este " + adunare);

            BigInteger scadere = calculator.scadere(primulNumar, alDoileaNumar);
            System.out.println("Rezultatul scaderii este " + scadere);

            BigInteger inmultire = calculator.inmultire(primulNumar, alDoileaNumar);
            System.out.println("Rezultatul inmultirii este " + inmultire);

            BigInteger impartire = calculator.impartire(primulNumar, alDoileaNumar);
            System.out.println("Rezultatul impartirii este " + impartire);
        } catch (InputMismatchException e) {
            System.out.println("A aparut o exceptie " + e);
        }



    /*  2.sa se citeasca si sa se documenteze despre folosirea enumeratiilor in Java: ce clase exista? + 2 exercitii
        care sa exemplifice folosirea lor

Enumeratia: - este un tip de data folosita pentru a controla valorile posibile ale unei variabile, adica este
             un tip de data ce ne lasa sa alegem doar una dintre mai multe valori posibile (denumite constante) ale
             unei variabile
           - este o clasa speciala care contine in denumire cuvantul cheie "enum"
           - contine un set de constante (sunt declarate implicit public, static si final; nu pot fi modificate si nici suprascrise)
           - constantele sunt urmate de "," virgula; dupa ultima constanta se poate pune ";" sau nu (";" este optional)
             dar daca se pune totusi ";" dupa o constanta => s-a terminat enumerarea constantelor
           - conform conventiilor de nume recomandate de Java, constantele se scriu cu majuscule, dar programul
             ruleaza chiar daca sunt scrise cu litere mici; deci nu e gresit daca se scriu cu litere mici
           - poate exista (poate fi declarata) ca o clasa separata, ori ca o clasa interioara altei clase dar in afara
             oricarei alte metode din clasa respectiva
           - poate contine atribute, metode si constructori
           - enumeratiile NU pot fi folosite pentru crearea de obiecte/ NU pot fi instantiate; singurele instante sunt
             cele definite de propriile constante -> doar pt aceste instante sunt apelati constructorii
           - extinde implicit clasa parinte Enum si nu mai poate extinde alta clasa, dar poate implementa mai multe
             interfete
           - mai multe informatii despre enumeratii sunt in sectiunea 8.9 of The Java™ Language Specification.

           - exemple de clase separate ---> Level
                                       ---> EngineType

     */

        Level myLevel = Level.HIGH;
        System.out.println("Rezultatul este: " + myLevel);
        System.out.println(myLevel.convertToLow());

    }
}

