// Splits a bill evenly among three friends.
public class Bill3 {
    public static void main(String[] args) {
        String name1 = args[0];
        String name2 = args[1];
        String name3 = args[2];
        double total = Double.parseDouble(args[3]);
        
        double payment = total / 3;
        int roundedPayment = (int) Math.round(payment);

        System.out.println("Dear " + name3 + ", " + name2 + ", and " + name1 + ": pay " + roundedPayment + " Shekels each");
    }
}
