package oops.objectrelations.aggregation;

public class Professor implements Teachable {
    private final String name;
    private final String subject;

    public Professor(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    @Override
    public void teach() {
        System.out.println(name + " teaches " + subject);
    }
}
// backdated commit 2026-05-07 #16
// backdated commit 2026-05-08 #13
// backdated commit 2026-05-12 #1
// backdated commit 2026-05-12 #16
// backdated commit 2026-05-13 #1
// backdated commit 2026-05-14 #6
// backdated commit 2026-05-18 #3
// backdated commit 2026-05-19 #2
// backdated commit 2026-05-19 #18
// backdated edit 2026-05-05 #1
// backdated edit 2026-05-05 #16
// resumed backdated edit 2026-05-06 #6
// resumed backdated edit 2026-05-13 #7
// resumed backdated edit 2026-05-14 #7
// resumed backdated edit 2026-05-20 #14
// resumed backdated edit 2026-05-06 #6
// resumed backdated edit 2026-05-13 #7
// resumed backdated edit 2026-05-14 #7
// resumed backdated edit 2026-05-20 #14
