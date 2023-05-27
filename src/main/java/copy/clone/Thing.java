package copy.clone;

import java.util.Objects;

public class Thing {
    private final String name;
    private final String address;

    public Thing(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Thing thing = (Thing) o;

        if (!Objects.equals(name, thing.name)) return false;
        return Objects.equals(address, thing.address);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Thing{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
