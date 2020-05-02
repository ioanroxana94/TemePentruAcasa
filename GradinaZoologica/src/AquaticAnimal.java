public class AquaticAnimal  extends Animal{
    private int deep;

    public AquaticAnimal(String color,int memberNumber,String specimen,int deep){
        this.color=color;
        this.memberNumber=memberNumber;
        this.specimen=specimen;
        this.deep=deep;

    }
    public int getDeep(){
        return deep;
    }
}
