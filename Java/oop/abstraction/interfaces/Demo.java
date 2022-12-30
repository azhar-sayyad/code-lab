package oops.abstraction.interfaces;

public class Demo {
    public static void main(String[] args) {
        PaymentGateway gateway;

        gateway = new UpiPayment();
        gateway.pay(499.0);

        gateway = new CardPayment();
        gateway.pay(999.5);

        gateway = new NetBankingPayment();
        gateway.pay(1500.0);
    }
}
// backdated commit 2026-05-06 #8
// backdated commit 2026-05-12 #12
// backdated commit 2026-05-18 #2
// backdated edit 2026-05-05 #6
// resumed backdated edit 2026-05-11 #6
// resumed backdated edit 2026-05-15 #5
// resumed backdated edit 2026-05-15 #6
// resumed backdated edit 2026-05-18 #8
// resumed backdated edit 2026-05-11 #6
// resumed backdated edit 2026-05-15 #5
// resumed backdated edit 2026-05-15 #6
// resumed backdated edit 2026-05-18 #8
