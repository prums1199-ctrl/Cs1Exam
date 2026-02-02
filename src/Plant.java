public class Plant {
    public int numWeeksOld;
    public String color;
    public boolean isEdible;

    public Plant(int pnumWeeksOld, String pcolor, boolean pisEdibe){
        numWeeksOld=pnumWeeksOld;
        color=pcolor;
        isEdible=pisEdibe;
    }
    public void printinfo(){
        System.out.println("This plant is "+numWeeksOld+" weeks old");
        System.out.println("The color of this plant is "+color);
        if(isEdible==true){
            System.out.println("This plant is edible");
        }else{
            System.out.println("This plant is not edible");
        }
    }
}
