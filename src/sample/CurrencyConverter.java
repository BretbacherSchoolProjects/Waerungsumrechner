package sample;

import java.util.ArrayList;

public class CurrencyConverter {

    //Variables
    final private ArrayList<Currency> dataBase=new ArrayList<>();

    //Constructor
    public CurrencyConverter(){
        dataBase.add(new Currency("Yen", 124.00));
        dataBase.add(new Currency("US Dollar", 1.19));
        dataBase.add(new Currency("Danish Krone", 7.45));
        dataBase.add(new Currency("Croatian Kuna", 7.56));
        dataBase.add(new Currency("North Korean Won", 1068.28));
    }

    //Methods
    public double convert(double v, String s){
        Currency c=searchDB(s);

        return v*c.getValue();
    }
    public void addCurrency(Currency c){
        dataBase.add(c);
    }

    private Currency searchDB(String s){
        for (Currency c:dataBase) {
            if (s.equals(c.getName()))
                return c;
        }
        return null;
    }

}
