package static_keyword;

public class Student {
    
    private int id;
    private String name;
    private int age;

    public static int count = 0; // static variable(This count now belongs to the class, not instances)

    // public int count = 0; // Instance variable(This count belongs to each instance of the class) and this will return 1 for every instance of object if adding in constructor.

     static {
        // Static block, it runs when the class is loaded into memory
        // It can be used to initialize static variables or perform any static initialization
        // This block is executed only once when the class is loaded
        // we can perform certain operations that need to be done only once, such as initializing static variables or performing some setup tasks.
        // It is executed before the main method and before any instance of the class is created.
      System.out.println(("this will runs when the class is loaded into memory"));
    }

    public Student() {
        count++; // Increment count whenever a new instance is created
    }

    public int getId() {
       return id;
    }

    public String getName() {
       return name;
    }

    public int getAge() {
       return age;
    }

    public void setId(int id){
      this.id = id;
    }

    public void setName(String name){
      this.name = name;
    }

    public void setAge(int age){
      this.age = age;
    }
}
