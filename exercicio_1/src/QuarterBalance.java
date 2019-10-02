public class QuarterBalance {
    public static void main(String[] args) {
        int janExpends = 15000;
        int febExpends = 23000;
        int marExpends = 17000;

        int quarterExpends = janExpends + febExpends + marExpends;
        System.out.println("Quarter Expends: " + quarterExpends);

        double monthlyAverage = (double) quarterExpends/3;
        System.out.println("Monthly Average Value = " + monthlyAverage);
    }
}
