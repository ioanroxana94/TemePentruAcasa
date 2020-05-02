public class AirAnimal extends Animal {
    protected int flyingHeight;

    public AirAnimal(String color,int memberNumber,String specimen,int flyingHeight){
        this.color=color;
        this.memberNumber=memberNumber;
        this.specimen=specimen;
        this.flyingHeight=flyingHeight;

    }

    public AirAnimal(){

    }
    public int getFlyingHeight(){
        return flyingHeight;
    }
}
