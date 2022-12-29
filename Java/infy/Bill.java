package infy;

public class Bill {
    int itemprice;

    public Bill(int itemprice) {
        this.itemprice = itemprice;
    }
    void display(){
        int itemprice = 20;
        System.out.println(itemprice);
    }
    public static void main(String[] args) {
        Bill bill = new Bill(10);
        System.out.println(bill.itemprice);
        bill.display();
    }

}