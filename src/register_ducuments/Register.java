package register_ducuments;

public class Register extends Documents implements Functional{
   private  int[] arrayDocument = new int[10];
   private int a = 0;

    public int[] getArrayDocument() {
        return arrayDocument;
    }

    @Override
    public void save(Documents document) {
        if(a<10) {
        arrayDocument[a] = a;
        a++;
        document.save();

        }
    }

    @Override
    public Documents info() {
        return info();
    }


}
