public class Buy_sell_stock {

    public static int predict_max_profit(int prices[]) {
        int buying_price = Integer.MAX_VALUE, max_profit = 0;

        for (int i = 0; i < prices.length; i++) {
            int selling_price = prices[i]; // today's price

            if (buying_price < selling_price) { // profit
                int profit = selling_price - buying_price; // today's profit
                max_profit = Math.max(max_profit, profit);
            } else {
                buying_price = prices[i];
            }
        }
        return max_profit;
    }
    // public static int print_profit(int price[]) {
    //     int buyingPrice = price[0];
    //     int sellingPrice = 0;
    //     int profit= 0, maxprofit= 0;

    //     for (int i = 0; i < price.length; i++) {
    //         sellingPrice = price[i];
    //         buyingPrice = Math.min(buyingPrice, price[i]);
    //         profit = sellingPrice - buyingPrice;
    //         maxprofit = Math.max(maxprofit, profit);
    //     }

    //     return maxprofit;
    // }
    public static void main(String[] args) {
        int price[] = {7,1,5,3,6,4};
        
        System.out.println(predict_max_profit(price));
    }
}
