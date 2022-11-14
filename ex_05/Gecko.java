public class Gecko {
    private String name = "Unknown";
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int varAge) {
        this.age = varAge;

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
