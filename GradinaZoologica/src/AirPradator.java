public class AirPradator extends AirAnimal {
    protected boolean hunt;

    public AirPradator(String color,int memberNumber,String specimen,int flyingHeight, boolean hunt){

        this.color= color;
        this.memberNumber= memberNumber;
        this.specimen= specimen;
        this.hunt= hunt;
        this.flyingHeight=flyingHeight;
    }
    public AirPradator(){

    }

    public int getflyingHeight(){
        return flyingHeight;
    }

    public boolean gethunt(){
        System.out.println("This animal does hunt");
        return hunt;
    }
}
