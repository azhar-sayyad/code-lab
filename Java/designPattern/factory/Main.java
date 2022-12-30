package designPattern.factory;

public class Main {
    public static void main(String[] args) {
        PaymentMethod p = new NetBankPayment();
        p.pay();

        p = new CardPayment();
        p.pay();

        p = new UPIPayment();
        p.pay();

        PaymentMethod factory = PaymentFactory.getPayment("card");
        factory.pay();

        factory = PaymentFactory.getPayment("cash");
        factory.pay();
    }
}
// backdated commit 2026-05-14 #4
// backdated commit 2026-05-18 #13
// backdated commit 2026-05-21 #2
// backdated edit 2026-05-04 #13
// resumed backdated edit 2026-05-08 #14
// resumed backdated edit 2026-05-12 #4
// resumed backdated edit 2026-05-14 #8
// resumed backdated edit 2026-05-08 #14
// resumed backdated edit 2026-05-12 #4
// resumed backdated edit 2026-05-14 #8
