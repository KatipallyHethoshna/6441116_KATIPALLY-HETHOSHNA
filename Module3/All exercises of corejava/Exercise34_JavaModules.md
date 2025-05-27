// Note: Java Modules need proper directory and file structure to compile and run.
// This is a placeholder for instructions.

1. Create module com.utils with module-info.java exporting a utility class.
2. Create module com.greetings that requires com.utils.
3. Compile using `javac -d out --module-source-path src $(find src -name "*.java")`
4. Run using `java --module-path out -m com.greetings/com.greetings.Main`
