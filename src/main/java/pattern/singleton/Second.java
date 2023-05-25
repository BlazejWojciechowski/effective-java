package pattern.singleton;

import java.io.ObjectStreamException;

public class Second {
    public static final Second INSTANCE = new Second();

    private Second() {
    }

    public static Second getInstance() {
        return INSTANCE;
    }

    public void leaveTheBuilding() {
    }

    // Metoda readResolve zapewnia zachowanie właściwości singleton
    private Object readResolve() throws ObjectStreamException {
        /*
         * Zwraca jedyny obiekt Elvis i pozwala procesowi zbierania nieużytków
         * na zajęcie dublującymi się obiektami klasy Elvis.
         */
        return INSTANCE;
    }
}