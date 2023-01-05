package designPrincipal.YAGNI;

class OverEngineeredReportService {
    public void export(String format, String content) {
        if ("PDF".equalsIgnoreCase(format)) {
            System.out.println("Exporting PDF: " + content);
        } else if ("CSV".equalsIgnoreCase(format)) {
            System.out.println("Exporting CSV: " + content);
        } else if ("XML".equalsIgnoreCase(format)) {
            System.out.println("Exporting XML: " + content);
        } else {
            System.out.println("Unsupported format");
        }
    }
}

class CurrentNeedReportService {
    public void exportPdf(String content) {
        System.out.println("Exporting PDF: " + content);
    }
}

public class YAGNIDemo {
    public static void main(String[] args) {
        OverEngineeredReportService oldStyle = new OverEngineeredReportService();
        oldStyle.export("PDF", "Monthly sales");

        CurrentNeedReportService yagniStyle = new CurrentNeedReportService();
        yagniStyle.exportPdf("Monthly sales");
    }
}
// backdated commit 2026-05-01 #8
// backdated commit 2026-05-06 #3
// backdated commit 2026-05-07 #15
// backdated commit 2026-05-11 #1
// backdated commit 2026-05-15 #19
// backdated commit 2026-05-19 #5
// backdated commit 2026-05-19 #9
