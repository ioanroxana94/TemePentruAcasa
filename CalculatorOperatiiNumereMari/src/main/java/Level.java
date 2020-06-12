public enum Level {

    LOW(5),
    MEDIUM(50.7),
    HIGH(99.9);

    private double value;

     Level (double value){ //Facem un constructor. Nu e nevoie sa mai punem modificatorul de acces deoarece acesta este public by default.
         this.value= value;

    }
    double convertToLow(){
         return value;
    }
}
