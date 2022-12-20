package oops.inheritance.diamond;

public class CheckoutService implements CreditCardPayment, UPIPayment {
    @Override
    public void process() {
        System.out.println("CheckoutService resolves diamond conflict.");
        CreditCardPayment.super.process();
        UPIPayment.super.process();
    }

    public static void main(String[] args) {
        CheckoutService checkout = new CheckoutService();
        checkout.process();
    }
}
// backdated commit 2026-05-05 #1
// backdated commit 2026-05-06 #7
// backdated commit 2026-05-19 #10
// backdated commit 2026-05-20 #5
// backdated commit 2026-05-21 #5
// backdated edit 2026-05-04 #4
// backdated edit 2026-05-04 #14
// resumed backdated edit 2026-05-08 #2
// resumed backdated edit 2026-05-18 #11
// resumed backdated edit 2026-05-08 #2
// resumed backdated edit 2026-05-18 #11
