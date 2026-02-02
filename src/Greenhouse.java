public class Greenhouse {
    public String name;
    public boolean sprinklersOn;
    public int numOfFlowers;
    public int randomInt;
    public double randomNum;

    Plant kimPlant,myPlant;

    public static void main(String[] args) {
        Greenhouse app = new Greenhouse();
    }
    public Greenhouse(){
        System.out.println("Hello World! Good luck on your exams!");
        name="Planting Parameters at the CSG";
        sprinklersOn=true;
        numOfFlowers=54;
        System.out.println("Welcome to "+name+"! It is "+sprinklersOn+" that we are watering plants right now. We have "+numOfFlowers+" flowers!" );
        randomReplant();
        veggieOfTheDay("Broccoli");
        countFlowers();
        changeTemperature();
        kimPlant=new Plant(3,"orange",true);
        kimPlant.printinfo();
        myPlant=new Plant(5,"red",false);
        starTriangle(5);

    }
    public void randomReplant(){
       randomInt = (int)(Math.random()*16);
        System.out.println("We are replanting "+randomInt+" vegetables today!");

    }
    public void veggieOfTheDay(String veggie){
        System.out.println("Today's chosen veggie is "+veggie);
    }
    public void countFlowers(){
        for(int i=2;i<=6;i++){
            System.out.println(i);
        }
        for(int t=20;t<=110;t=t+30){
            System.out.println(t);
        }
        for(int p=8;p>=0;p--){
            System.out.print(p+",");
        }
        System.out.println("------");
    }
    public void changeTemperature(){
        randomNum=(double)(Math.random()*1);

        if(randomNum<0.25){
            System.out.println("The temperature has decreased by 2 degrees");
        }
        if(randomNum==0.25||randomNum<0.5){
            System.out.println("The temperature has decreased by 1 degree");
        }
        if(randomNum==0.5||randomNum<0.75){
            System.out.println("The temperature has increased by 1 degree");
        }
        if(randomNum==0.75||randomNum<1){
            System.out.println("The temperature has increased by 2 degrees");
        }
    }
    public void starTriangle(int size){
        for(int x = 0; x < size; x++) {
            System.out.println();


            for (int i = 0; i <= x; i++) {

                System.out.print("*");


            }
        }


        }
    public void perimeterTriangle(int size){

    }
}
