public class FlipCoin {
    public static void main(String[] args) {
        int tail =0;
        int head = 0;

        for(int i = 1; i<=100; i++){
            double randomNo = Math.random();
            if(randomNo<0.5){
                tail++;
            } else{
                head++;
            }
        }
        double tailPercentage = (double)tail/100 * 100;
        double headPercentage = (double)head/100 * 100;
        System.out.println(tailPercentage);
        System.out.println(headPercentage);
    }
}
