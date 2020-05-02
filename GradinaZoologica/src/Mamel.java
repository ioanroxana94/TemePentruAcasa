public class Mamel extends TerestrialAnimal {
    private int maxBreeding;

    public Mamel(String color,int memberNumber,String specimen ,String move,boolean hunt,int maxBreeding){
        this.color=color;
        this.memberNumber=memberNumber;
        this.specimen=specimen;
        this.move=move;
        this.hunt=hunt;
        this.maxBreeding=maxBreeding;
    }
    public int getMaxBreeding(){
        return maxBreeding;
    }
    public String bites(){
        return "This animal bites on land if you attack its child";
    }
}
