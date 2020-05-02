public class Main {
    public static void main(String[] args) {
        //Vrem sa creem 2 mamifere 2 ierbivore , 2 carnivore , 5 animale terestre ,2 animale, animale aeriene pradatoare

        //Creem doua animale
        Animal animal1=new Animal("black",2,"maimuta");
        Animal animal2=new Animal("red",4,"tigru");

        //Creem 3 animale terestre
        TerestrialAnimal terestrialAnimal1=new TerestrialAnimal("green",0,"snake","Taras",true);
        TerestrialAnimal terestrialAnimal2=new TerestrialAnimal("grey",4,"Elefant","Merge incet",false);
        TerestrialAnimal terestrialAnimal3=new TerestrialAnimal("black",4,"Panter","Alearga",true);

        //2 carnivore
        CarnivorAnimal carnivorAnimal1=new CarnivorAnimal("grey",4,"wolf","Aleaga",true,true);
        CarnivorAnimal carnivorAnimal2=new CarnivorAnimal("yellow",4,"lion","Alearga",true,true);

        //2 ierbivore

        ErbivorAnimal erbivorAnimal1=new ErbivorAnimal("Orange",4,"deer","Alearga",false,true);
        ErbivorAnimal erbivorAnimal2=new ErbivorAnimal("brown",4,"arici","Merge incet",false,true);

        //2 mamifere
        Mamel mamel1=new Mamel("White",4,"zebra","alearga",false,1);
        Mamel mamel2=new Mamel("Brown",4,"horese","Alearga",false,1);

        // 2 aeriene: una pradatoare si una nepradatoare
        AirPradator AirPradator1= new AirPradator("White", 2, "Vultur", 11 , true);

        //Vrem sa vedem specia mamifer 2
        System.out.println("Specia mamifer 2 este : "+mamel2.getSpecimen());
        //Vrem sa vedem numarul de membru carnivor 1
        System.out.println("Numar de membre carnivor 1 : "+carnivorAnimal1.getMemberNumber() );
        //Vrem sa vedem culoarea animal terestru 3
        System.out.println("Culoarea animalui terestru 3 este : " +terestrialAnimal3.getColor());
        //Vrem sa vedem numar de membre mamifer1
        System.out.println("Numarul de membre al mamiferului 1 este "+mamel1.getMemberNumber());
        //Vrem sa vedem specimenul carnivor 1
        System.out.println("Specia carnivorului 1 este : "+carnivorAnimal1.getSpecimen());
        //Vrem sa vedem numarul de membri erbivor 2
        System.out.println("Numarul membrilor al ierbivorului 2 este : "+erbivorAnimal2.getMemberNumber());

    }
}
