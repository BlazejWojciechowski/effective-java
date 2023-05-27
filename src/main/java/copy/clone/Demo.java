package copy.clone;

public class Demo {
    public static void main(String[] args) {
        Thing[] thing1 = new Thing[]{new Thing("Blazej", "lakowa")};
        Thing[] things = new Thing[]{new Thing("Bartek", "warszawska")};
        Thing[] thCopy = new Thing[0];

        System.out.println(thing1[0].getName() + " " + thing1[0].getAddress());

        System.out.println(thing1.equals(things));
        System.out.println(thing1.hashCode());
        System.out.println(things.hashCode());

        things = Array.values();
        System.out.println(thing1.equals(things));
        System.out.println(thing1.hashCode());
        System.out.println(things.hashCode());

        thing1 = Array.values();
        System.out.println(thing1.equals(things));
        System.out.println(thing1.hashCode());
        System.out.println(things.hashCode());
    }
}
