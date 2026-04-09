// POJO -> plan old java object

// POJO stands for Plain Old Java Object. It is a term used to describe a Java class that follows simple conventions and does not depend on any specific frameworks or libraries.

// A POJO typically contains private fields with corresponding getter and setter methods, and it may also include additional methods for behaviour.


// Key characteristics of a POJO class include:

// 1. Attributes (Fields):
//   private String name;
//   private int age;

// 2. Constructors:
// public Person() {
//     // Default constructor
// }

// public Person(String name, int age) {
//     this.name = name;
//     this.age = age;
// }


// 3. Getter and Setter Methods:

// 4. Encapsulation:

// The private fields and the public getter/setter methods ensure encapsulation. Encapsulation restricts direct access to the internal state of an object, promoting data integrity and code maintainability.

// 5. No Business Logic:

// POJOs typically do not contain complex business logic. They are meant to represent data structures rather than implement extensive functionality.

// 6. Serializable (Optional):

// Depending on the use case, a POJO class may implement the Serializable interface. This allows instances of the class to be serialized (converted to byte streams) for various purposes like storage or network transmission.

// 7. No Dependency on Frameworks:

// True to its name, a POJO should not have dependencies on external frameworks or libraries. It adheres to standard Java practices, making it portable and versatile.

// 8. Testing and Mocking:

// POJOs are easily testable since they do not have dependencies on external frameworks or services. This makes it simpler to write unit tests and mock the POJO’s behaviour as needed.



public class PojoClass {
    // Private fields (attributes)
    private int studentId;
    private String firstName;
    private String lastName;
    private int age;

    // Constructors
    public PojoClass() {
        // Default constructor
    }

    public PojoClass(int studentId, String firstName, String lastName, int age) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Getter and Setter methods
    public int getStudentId() {
        return studentId;
    }  
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
  
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // toString method for easy debugging
    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}