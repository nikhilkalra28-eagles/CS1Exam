public class Greenhouse {
    String name;
    boolean sprinklersOn;
    int numberOfFlowers;

    public Greenhouse (){
        System.out.println("Hello World! Good luck on your exams!");

        name = "Planting Parameters at the CSG";
        sprinklersOn = true;
        numberOfFlowers = 31;

        System.out.println("Welcome to " + name + "! It is " + sprinklersOn + " that we are watering plants right now. We have " + numberOfFlowers + " flowers");

        numberOfFlowers = 67;
        System.out.println("Welcome to " + name + "! It is " + sprinklersOn + " that we are watering plants right now. We have " + numberOfFlowers + " flowers");
        randomReplant();
        veggieOfTheDay("Cucumber");
        countFlowers();
        changeTemperature();

        Plant kimPlant = new Plant(3, "orange", true);
        kimPlant.printInfo();

        Plant myPlant = new Plant(67,"blue",true);
        myPlant.printInfo();

        starTriangle(3);
        perimeterTriangle(5);
    }

    public void randomReplant (){
        int randomInt = (int)(Math.random()*15);
        System.out.println("We are replanting " + randomInt + " vegetables today!");
    }

    public void veggieOfTheDay (String veggie){
        System.out.println("Today's chosen veggie is " + veggie);
    }

    public void countFlowers (){
        for (int i = 2; i <= 6; i += 1){
            System.out.println(i);
        }
        for (int i = 20; i <= 110; i += 30){
            System.out.println(i);
        }
        for (int i = 8; i >= 0; i--){
            System.out.println(i);
        }
    }

    public void changeTemperature (){
        double randomNum = Math.random();

        if (randomNum < 0.25){
            System.out.println("The temperature has decreased by 2 degrees");
        }
        else if (randomNum < 0.5){
            System.out.println("The temperature has decreased by 1 degree");
        }
        else if (randomNum < 0.75){
            System.out.println("The temperature has increased by 1 degree");
        }
        else {
            System.out.println("The temperature has increased by 2 degrees");
        }
    }

    public void starTriangle (int size){
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");

    }

    public void perimeterTriangle (int size){
        System.out.println("-");
        System.out.println("--");
        System.out.println("-*-");
        System.out.println("-**-");
        System.out.println("-----");
    }

    public static void main(String[] args) {

        Greenhouse greenhouse = new Greenhouse ();
    }
}
