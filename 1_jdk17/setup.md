
## JDK17
### 接下來要來學習 java 程式的「編譯」與「執行」
- 編譯：將 .java 檔轉成 .class 檔
- 執行：使用 JVM 去跑 .class 檔


1. 安裝 jdk17
2. javac 編譯
3. java 執行

## Hello World 程式
複製到 Main.java
```java

class Main{
    public static void main(String[] args) {
        System.our.println("hello world");
    }
}
```

## Makefile 以及 javac/java 指令
```
run: compile
    java -cp . Main
compile: Main.java
    javac -cp . Main.java
```
`make run`

## 也可以分開執行觀察
```bash
javac -cp . Main.java
```
```bash
java -cp . Main
```