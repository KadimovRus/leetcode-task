package maxProfit;

public class MaxProfit {

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE,pro=0;
        for(int i:prices)
        {
            if(i<min)
                min=i;
            pro=Math.max(pro,i-min);
        }
        return pro;
    }
}
