# Multiple Inheritance in Java (via Interfaces)

Java does not support multiple inheritance with classes (`class A extends B, C` is invalid).  
But Java supports multiple inheritance of type using interfaces.

## Structure
- Interfaces: `Camera`, `MusicPlayer`
- Class: `SmartPhone implements Camera, MusicPlayer`

## Run
```bash
javac src/oops/inheritance/multiple/*.java
java -cp src oops.inheritance.multiple.SmartPhone
```

## Sample Output
```text
SmartPhone captures a photo.
SmartPhone plays music.
```
# backdated commit 2026-05-06 #14
# backdated commit 2026-05-07 #5
# backdated commit 2026-05-18 #8
# backdated commit 2026-05-20 #1
# backdated edit 2026-05-05 #2
# backdated edit 2026-05-05 #13
# resumed backdated edit 2026-05-20 #10
# resumed backdated edit 2026-05-20 #10
