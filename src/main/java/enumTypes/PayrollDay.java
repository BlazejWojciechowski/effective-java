package enumTypes;

enum PayrollDay {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,
    SATURDAY(PayType.WEEKEND), SUNDAY(PayType.WEEKEND);
    private final PayType payType;

    PayrollDay(PayType payType) {
        this.payType = payType;
    }

    PayrollDay() {
        this(PayType.WEEKDAY);
    }

    double pay(int minutesWorked, double payRate) {
        return payType.pay(minutesWorked, payRate);
    }

    private enum PayType {
        WEEKDAY {
            double overtimePay(int minsWorked, double payRate) {
                return minsWorked <= MINS_PER_SHIFT ? 0 :
                        (minsWorked - MINS_PER_SHIFT) * payRate / 2;
            }
        },
        WEEKEND {
            double overtimePay(int minsWorked, double payRate) {
                return minsWorked * payRate / 2;
            }
        };

        abstract double overtimePay(int mins, double payRate);

        private static final int MINS_PER_SHIFT = 8 * 60;

        double pay(int minsWorked, double payRate) {
            double basePay = minsWorked * payRate;
            return basePay + overtimePay(minsWorked, payRate);
        }
    }
}