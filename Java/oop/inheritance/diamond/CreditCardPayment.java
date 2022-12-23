package oops.inheritance.diamond;

public interface CreditCardPayment extends PaymentMethod {
    @Override
    default void process() {
        System.out.println("Processing credit card payment.");
    }
}
// backdated commit 2026-05-05 #20
// backdated commit 2026-05-13 #7
// backdated commit 2026-05-18 #6
// backdated edit 2026-05-05 #11
// backdated edit 2026-05-05 #14
// resumed backdated edit 2026-05-07 #9
// resumed backdated edit 2026-05-08 #15
// resumed backdated edit 2026-05-13 #3
// resumed backdated edit 2026-05-20 #6
// resumed backdated edit 2026-05-07 #9
// resumed backdated edit 2026-05-08 #15
// resumed backdated edit 2026-05-13 #3
// resumed backdated edit 2026-05-20 #6
