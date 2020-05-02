public class CarnivorAnimal extends TerestrialAnimal {
    private boolean eatMeat;

    public CarnivorAnimal(String color , int memberNumber,String specimen ,String move,boolean hunt,boolean eatMeat){
        this.color=color;
        this.memberNumber=memberNumber;
        this.specimen=specimen;
        this.move=move;
        this.hunt=hunt;
        this.eatMeat=eatMeat;
    }
    public boolean geteatMeat(){
        return eatMeat;
    }
}
