package oops.objectrelations.association;

public class BidirectionalAssociationDemo {
    public static void main(String[] args) {
        Library cityLibrary = new Library("City Central Library");

        Book b1 = new Book("Clean Code");
        Book b2 = new Book("Effective Java");

        cityLibrary.addBook(b1);
        cityLibrary.addBook(b2);

        cityLibrary.printCatalog();
        b1.printLibraryInfo();
        b2.printLibraryInfo();
    }
}
// backdated commit 2026-05-04 #20
// backdated commit 2026-05-06 #18
// backdated commit 2026-05-07 #7
// backdated commit 2026-05-12 #14
// backdated commit 2026-05-13 #13
// backdated commit 2026-05-15 #20
// backdated commit 2026-05-20 #7
// backdated edit 2026-05-05 #8
// resumed backdated edit 2026-05-08 #11
// resumed backdated edit 2026-05-11 #5
// resumed backdated edit 2026-05-13 #11
// resumed backdated edit 2026-05-19 #5
// resumed backdated edit 2026-05-19 #10
// resumed backdated edit 2026-05-19 #12
// resumed backdated edit 2026-05-20 #8
// resumed backdated edit 2026-05-08 #11
// resumed backdated edit 2026-05-11 #5
// resumed backdated edit 2026-05-13 #11
// resumed backdated edit 2026-05-19 #5
// resumed backdated edit 2026-05-19 #10
// resumed backdated edit 2026-05-19 #12
// resumed backdated edit 2026-05-20 #8
