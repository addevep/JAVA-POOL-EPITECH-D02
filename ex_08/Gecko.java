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

    public void work() {
        if (this.energy >= 25) {
            System.out.println("I'm working T.T");
            energy -= 9;
        } else if (this.energy < 25) {
            System.out.println("Heyyy I'm too sleepy, better take a nap !");
            energy += 50;
        }
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

    public void fraternize(Gecko varGecko) {
        if (isGecko(varGecko.name) == true) {
            return;
        } else {
            if (this.getEnergy() >= 30 && varGecko.getEnergy() >= 30) {
                this.energy -= 30;
                System.out.println("I'm going to drink with " + varGecko.getName()+ "!");
                varGecko.energy -= 30;
                System.out.println("I'm going to drink with " + this.getName() + "!");
            } else if (this.getEnergy() < 30 && varGecko.getEnergy() < 30) {
                System.out.println("Not today!");
                System.out.println("Not today!");
            }else if (this.getEnergy() < 30){
                System.out.println("Sorry " + varGecko.name + ", I'm too tired to go out tonight.");
                System.out.println("Oh! That's too bad, another time them!");
            }else if (varGecko.getEnergy() < 30){
                System.out.println("Sorry " + this.name + ", I'm too tired to go out tonight.");
                System.out.println("Oh! That's too bad, another time them!");
            }
        }
    }

    public boolean isGecko(String isName) {
        isName = isName.toUpperCase();
        if (isName.matches("SNAKE") && this.energy >= 10) {
            this.setEnergy(0);
            System.out.printf("LET'S RUN AWAY!!!");
            return true;
        } else if (isName.matches("SNAKE") && this.energy < 10) {
            System.out.println("...");
            return true;
        } else {
        return false;
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
