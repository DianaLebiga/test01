public class Test {
    public static void main(String[] args) {
        System.out.println("Test");
    }

    private String name;
    private String lastName;

    public void printName(){
        name = "Diana";
        System.out.println(name);
    }

    public void printLastName() {
        lastName = "Lebiga";
        System.out.println(lastName);
    }

    public void printAll() {
        System.out.println(name + " " + lastName + " " + " = Java guru");
    }
}
