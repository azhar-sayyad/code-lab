# Diamond Problem in Java

Diamond inheritance happens when two paths provide the same method to one class.

Java avoids class-based diamond ambiguity by not allowing multiple class inheritance.
With interfaces, if two interfaces provide the same default method, the implementing class must override it.

## Structure
- `PaymentMethod` (base interface)
- `CreditCardPayment` and `UPIPayment` extend `PaymentMethod`
- `CheckoutService` implements both and resolves conflict in `process()`

## Run
```bash
javac src/oops/inheritance/diamond/*.java
java -cp src oops.inheritance.diamond.CheckoutService
```

## Sample Output
```text
CheckoutService resolves diamond conflict.
Processing credit card payment.
Processing UPI payment.
```
# backdated commit 2026-05-08 #8
# backdated commit 2026-05-11 #5
# backdated commit 2026-05-15 #4
# backdated commit 2026-05-18 #18
# backdated commit 2026-05-21 #1
# backdated edit 2026-05-04 #16
# backdated edit 2026-05-05 #7
# backdated edit 2026-05-06 #4
# resumed backdated edit 2026-05-08 #10
# resumed backdated edit 2026-05-15 #3
# resumed backdated edit 2026-05-08 #10
# resumed backdated edit 2026-05-15 #3
