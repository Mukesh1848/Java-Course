package oops.inheritance;

public class GrandFather {
    private String name;
    private int age;

    GrandFather(String name, int age) {
        System.out.println("GrandFather Constructor called");
        this.name = name; // This keyword refers to the current object(instance) not to the this
                          // class(GrandFather)
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void workDetails() {
        System.out.println("Retired from work");
    }

}
