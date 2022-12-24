package register_ducuments;

import java.util.Date;

public class GoodsContract extends Documents {
  String type;
  int amount;

    public GoodsContract() {
    }

    public GoodsContract(int number, Date dateDoc, String type, int amount) {
        super(number, dateDoc);
        this.type = type;
        this.amount = amount;
    }
    public void save() {
        System.out.println("Номер документа - "+number+", Дата документа - "+DateDoc+", Тип товара - "+type+", Количество товара - "+amount);
    }
}
