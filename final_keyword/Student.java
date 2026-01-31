package final_keyword;

public class Student extends Test { // this class can not extend Test because Test is declared as final
    // If we try to extend Test, it will cause a compilation error.
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Attempting to override the final method from Test class will cause a
    // compilation error
    // @Override
    // public int sum(int a, int b) {
    // return a + b + 10; // This line would cause a compilation error
    // }
}
