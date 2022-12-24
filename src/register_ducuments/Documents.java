package register_ducuments;

import java.util.Date;

public abstract class Documents {

    int number;
    Date  DateDoc;


    public Documents(int number, Date dateDoc) {
        this.number = number;
        DateDoc = dateDoc;
    }

    public Documents() {
    }
    public void save() {

    }

}


