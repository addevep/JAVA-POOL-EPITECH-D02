public class Gecko {
    private String name = "Unknown";

    public String getName() {
        return name;
    }

    public Gecko(String varName) {
        name = varName;
        System.out.println("Hello "+ name +"!");
    }

    public Gecko() {
        System.out.println("Hello!");
    }
    
}
