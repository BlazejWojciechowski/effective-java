package enumTypes;

public class DemoPlanet {
    public static void main(String[] args) {
        double earthWeight = 185;
        double mass = earthWeight / Planet.EARTH.surfaceGravity();
        for (Planet p : Planet.values())
            System.out.printf("Waga na %s wynosi %f%n",
                    p, p.surfaceWeight(mass));
    }
}