package day03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stock {

    private List<Double> values;

    public Stock(List<Double> values) {
        this.values = values;
    }

    public double maxProfit(){
        double max = 0;
        for (int i = 0; i < values.size(); i++) {
            max = checkDailyDifferences(max, i);
        }
        return max;
    }


    public double checkDailyDifferences(double max, int i){
            for (int j = i + 1; j < values.size(); j++){
                if (max < values.get(j) - values.get(i)) {
                    max = values.get(j) - values.get(i);
                }
            }
        return max;
    }

    public static void main(String[] args) {
        Stock stock = new Stock(Arrays.asList(1.23,4.35,0.23,4.0,8.4));
        System.out.println(stock.maxProfit());  //8.17

        Stock stock2 = new Stock(Arrays.asList(12.0,2.0,8.0,4.0));
        System.out.println(stock2.maxProfit()); //6.0
    }
}
