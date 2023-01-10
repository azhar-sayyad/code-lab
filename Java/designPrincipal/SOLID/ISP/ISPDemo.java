package designPrincipal.SOLID.ISP;

interface Printable {
    void print(String fileName);
}

interface Scannable {
    void scan(String fileName);
}

class BasicPrinter implements Printable {
    public void print(String fileName) {
        System.out.println("Printing: " + fileName);
    }
}

class MultiFunctionPrinter implements Printable, Scannable {
    public void print(String fileName) {
        System.out.println("MFP printing: " + fileName);
    }

    public void scan(String fileName) {
        System.out.println("MFP scanning: " + fileName);
    }
}

public class ISPDemo {
    public static void main(String[] args) {
        Printable basic = new BasicPrinter();
        basic.print("resume.pdf");

        MultiFunctionPrinter mfp = new MultiFunctionPrinter();
        mfp.print("report.pdf");
        mfp.scan("id-card.jpg");
    }
}
// backdated commit 2026-05-05 #7
// backdated commit 2026-05-06 #13
// backdated commit 2026-05-12 #5
// backdated commit 2026-05-21 #9
// backdated commit 2026-05-21 #13
// backdated edit 2026-05-06 #2
// resumed backdated edit 2026-05-13 #1
// resumed backdated edit 2026-05-13 #1
