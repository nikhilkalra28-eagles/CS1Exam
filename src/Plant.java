public class Plant {
    int numWeeksOld;
    String color;
    boolean isEdible;

    public Plant (int numWeeksOld, String color, boolean isEdible){
        this.numWeeksOld = numWeeksOld;
        this.color = color;
        this.isEdible = isEdible;
    }

    public void printInfo (){
        System.out.println("Number of Weeks Old: " + numWeeksOld);
        System.out.println("Color: " + color);
        System.out.println("Is Edible: " + isEdible);
    }

}
