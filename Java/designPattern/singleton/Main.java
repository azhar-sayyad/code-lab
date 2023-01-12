package designPattern.singleton;

public class Main {
    public static void main(String[] args) {
        Single s = Single.getInstance();
        Single s2 = Single.getInstance();

        for(int i = 0; i<5; i++){
            Single.getInstance();
        }

        // Both references point to the same object.
        System.out.println("Same instance? " + (s == s2));
    }
}
// backdated commit 2026-05-01 #13
// backdated commit 2026-05-04 #14
// backdated commit 2026-05-13 #4
// backdated commit 2026-05-13 #9
// backdated commit 2026-05-15 #2
// backdated commit 2026-05-20 #6
// backdated commit 2026-05-20 #8
// resumed backdated edit 2026-05-11 #3
// resumed backdated edit 2026-05-20 #7
// resumed backdated edit 2026-05-11 #3
// resumed backdated edit 2026-05-20 #7
