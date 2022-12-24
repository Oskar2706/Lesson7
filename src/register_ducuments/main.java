package register_ducuments;


import java.util.Arrays;
import java.util.Date;

public class main {
    public static void main(String[] args) {
        Documents documents1 = new FinancialInvoice(11,new Date(11,10,22), 30,40);
        Documents documents2 = new ContractWorker(12,new Date(22,11,23),121223," vasya");
        Documents documents3 = new GoodsContract(13,new Date(12,10,15),"Home", 3);
        Register register=new Register();
        register.save(documents1);
        register.save(documents2);
        register.save(documents3);
        System.out.println(Arrays.toString(register.getArrayDocument()));


    }
}
