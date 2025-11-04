// Splits a bill evenly among three friends.
public class Bill3 {
    public static void main(String[] args) {
        String name1 = args[0];
        String name2 = args[1];
        String name3 = args[2];
        double total = Double.parseDouble(args[3]);

        double payment = total / 3.0;
        payment = Math.round(payment * 10.0) / 10.0; // round to one decimal place

        System.out.println("Dear " + name3 + ", " + name2 + ", and " + name1 +
                           ": pay " + String.format("%.1f", payment) + " Shekels each");
    }
}
