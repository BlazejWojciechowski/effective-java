package exercises;

public class HumanDemo {
    public static void main(String[] args) {
        Human h1 = HumanService.supHUm.apply(20, "Tomek");

        System.out.println(h1.getAge() + " " + h1.getName());
    }
}
