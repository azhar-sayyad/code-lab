package designPrincipal.KISS;

public class KISSDemo {

    // Overcomplicated style
    private static String complexGrade(int marks) {
        return switch (marks / 10) {
            case 10, 9, 8 -> "A";
            case 7, 6 -> "B";
            case 5 -> "C";
            default -> "D";
        };
    }

    // KISS style
    private static String simpleGrade(int marks) {
        if (marks >= 80) return "A";
        if (marks >= 60) return "B";
        if (marks >= 50) return "C";
        return "D";
    }

    public static void main(String[] args) {
        int marks = 74;
        System.out.println("Complex version grade: " + complexGrade(marks));
        System.out.println("Simple version grade : " + simpleGrade(marks));
    }
}
// backdated commit 2026-05-04 #19
// backdated commit 2026-05-11 #8
// backdated commit 2026-05-12 #11
// backdated commit 2026-05-15 #9
// backdated commit 2026-05-20 #12
// resumed backdated edit 2026-05-08 #17
// resumed backdated edit 2026-05-15 #13
// resumed backdated edit 2026-05-18 #16
// resumed backdated edit 2026-05-19 #2
// resumed backdated edit 2026-05-08 #17
// resumed backdated edit 2026-05-15 #13
// resumed backdated edit 2026-05-18 #16
// resumed backdated edit 2026-05-19 #2
