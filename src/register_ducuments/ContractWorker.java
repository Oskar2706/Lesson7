package register_ducuments;

import java.util.Date;

public class ContractWorker extends Documents{
    int contractEndDate;
    String nameWorker;

    public ContractWorker(int number, Date dateDoc, int contractEndDate, String nameWorker) {
        super(number, dateDoc);
        this.contractEndDate = contractEndDate;
        this.nameWorker = nameWorker;
    }

    public ContractWorker() {
    }
    public void save() {
        System.out.println("Номер документа - "+number+", Дата документа - "+DateDoc+", Имя сотрудника - "+nameWorker+", Дата окончания контракта - "+contractEndDate);
    }
}
