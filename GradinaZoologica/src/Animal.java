public class Animal {
    protected String color;
    protected int memberNumber;
    protected String specimen;

    public Animal(String color,int memberNumber,String specimen){
        this.color=color;
        this.specimen=specimen;
        this.memberNumber=memberNumber;
        //initializat

    }
    public Animal(){

    }
    public String getColor(){
        return color;
    }
    public  int getMemberNumber(){
        return memberNumber;
    }
    public String getSpecimen(){
        return specimen;
    }
    public String bites(){
        return "This animal bites : ";
    }

}
