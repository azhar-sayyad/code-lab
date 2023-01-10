package oops.objectrelations.association;

public class Teacher {
    private final String name;

    public Teacher(String name) {
        this.name = name;
    }

    public void teach(Course course) {
        System.out.println(name + " teaches " + course.getTitle());
    }
}
// backdated commit 2026-05-01 #3
// backdated commit 2026-05-13 #3
// backdated commit 2026-05-13 #12
// backdated commit 2026-05-15 #1
// backdated commit 2026-05-20 #2
// resumed backdated edit 2026-05-12 #2
// resumed backdated edit 2026-05-20 #5
// resumed backdated edit 2026-05-20 #11
// resumed backdated edit 2026-05-12 #2
// resumed backdated edit 2026-05-20 #5
// resumed backdated edit 2026-05-20 #11
