package register_ducuments;

import java.util.Date;

public class FinancialInvoice extends Documents{
    int monthlyTotal;
    int departmentCode;

    public FinancialInvoice(int number, Date dateDoc, int monthlyTotal, int departmentCode) {
        super(number, dateDoc);
        this.monthlyTotal = monthlyTotal;
        this.departmentCode = departmentCode;
    }

    public FinancialInvoice() {
    }
    public void save() {
        System.out.println("Итоговая сумма за месяц - "+monthlyTotal+", Дата документа - "+DateDoc+
                ", Номер документа - "+number+", Код департамента"+departmentCode);
    }
}
