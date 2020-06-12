import java.math.BigInteger;

public class Calculator {

    public Calculator(){

    }

    public BigInteger adunare(BigInteger a, BigInteger b){
        BigInteger adunare= a.add(b);
        return adunare;  // sau putem pune simplu " return a+b; "
    }

    public BigInteger scadere(BigInteger a, BigInteger b){
        return a.subtract(b);
    }

    public BigInteger inmultire(BigInteger a, BigInteger b){
        return a.multiply(b);
    }

    public BigInteger impartire(BigInteger a, BigInteger b){
        return a.divide(b);
    }
}
