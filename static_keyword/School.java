package static_keyword;

public class School {

    private static School school = new School(); // Creating an instance of School class

    private School() {
        System.out.println("School constructor called"); // now only one instance of School class can be created and we
                                                         // // are already created school instance above.)
    }

    public static School getInstance() {
        return school; // this will return the same instance every time this method is called.
    }

}
