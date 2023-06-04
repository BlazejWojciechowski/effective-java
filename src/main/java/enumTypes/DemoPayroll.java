package enumTypes;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public class DemoPayroll {
    public static void main(String[] args) {
        String input;
        double payRate;
        double salary = 0;

        List<PayrollDay> payrollDays = Arrays.asList(
                PayrollDay.MONDAY, PayrollDay.TUESDAY, PayrollDay.WEDNESDAY, PayrollDay.THURSDAY,
                PayrollDay.FRIDAY, PayrollDay.SATURDAY, PayrollDay.SUNDAY
        );

        input = JOptionPane.showInputDialog("Podaj stawkę");
        payRate = Double.parseDouble(input);
        for (PayrollDay pd : payrollDays) {
            input = JOptionPane.showInputDialog("Ile minut przepracowałeś w " + pd.name());
            int mins = Integer.parseInt(input);
            salary += pd.pay(mins, payRate);
        }
        JOptionPane.showMessageDialog(null, ("Zarobiłeś w tym tygodniu " + salary));
    }
}