package comparing.equalsHashcode;


import java.util.Comparator;

import static java.util.Comparator.comparingInt;

public class PhoneNumber {
    private final short areaCode, prefix, lineNum;
    private int hashCode;

    public PhoneNumber(short areaCode, short prefix, short lineNum) {
        this.areaCode = rangeCheck(areaCode, 999, "nr kierunkowy");
        this.prefix = rangeCheck(prefix, 999, "prefiks");
        this.lineNum = rangeCheck(lineNum, 9999, "numer linii");
    }

    private static short rangeCheck(int val, int max, String arg) {
        if (val < 0 || val > max)
            throw new IllegalArgumentException(arg + ": " + val);
        return (short) val;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof PhoneNumber))
            return false;
        PhoneNumber pn = (PhoneNumber) o;
        return pn.lineNum == lineNum && pn.prefix == prefix
                && pn.areaCode == areaCode;
    }

    @Override
    public int hashCode() {
        int result = hashCode;
        if (result == 0) {
            result = Short.hashCode(areaCode);
            result = 31 * result + Short.hashCode(prefix);
            result = 31 * result + Short.hashCode(lineNum);
            hashCode = result;
        }
        return result;
    }

    @Override
    public String toString() {
        return String.format("%03d-%03d-%04d",
                areaCode, prefix, lineNum);
    }

    private static final Comparator<PhoneNumber> COMPARATOR =
            comparingInt((PhoneNumber pn) -> pn.areaCode)
                    .thenComparingInt(pn -> pn.prefix)
                    .thenComparingInt(pn -> pn.lineNum);

    public int compareTo(PhoneNumber pn) {
        return COMPARATOR.compare(this, pn);
    }
}