public class Gecko {
    private String name = "Unknown";
    private int age;
    private int energy = 100;

    public String getName() {
        return name;
    }

    public void setAge(int varAge) {
        this.age = varAge;

    }

    public int getAge() {
        return age;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int stam) {
        this.energy = stam;
    }

    public void status() {
        switch(age){
            case 0:
                System.out.println("Unborn Gecko");
                break;
            case 1,2:
                System.out.println("Baby Gecko");
                break;
            case 3,4,5,6,7,8,9,10:
                System.out.println("Adult Gecko");
                break;
            case 11,12,13:
                System.out.println("Old Gecko");
                break;
            default:
                System.out.println("Impossible Gecko");
                break;
        }
    }

    public void hello(String str) {
        System.out.println("Hello " + str + ", I'm " + name + "!");
    }
    public void hello(int nb) {
        if (nb < 1) {

        } else {
            while (nb != 0) {
                System.out.println("Hello, I'm " + name + "!");
                nb--;
            }
        }
    }

    public void eat(String food) {
        food = food.toUpperCase();
        if (food.matches("MEAT")) {
            System.out.println("Yummy!");
            energy += 10;
            if (energy > 100) {
                this.setEnergy(100);
            }

        } else if (food.matches("VEGETABLE")) {
            System.out.println("Erk!");
            energy -= 10;
            if (energy < 0) {
                this.setEnergy(0);
            }
        } else {
            System.out.println("I can't eat this!");
        }
    }

    public Gecko(String varName, int varAge) {
        name = varName;
        age = varAge;
        System.out.println("Hello "+ name +"!");
    }

    public Gecko(String varName) {
        name = varName;
        System.out.println("Hello "+ name +"!");
    }

    public Gecko() {
        System.out.println("Hello!");
    }

}
