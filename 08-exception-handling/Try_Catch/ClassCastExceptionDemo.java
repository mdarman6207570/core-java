package day_71_Basic_Exception;

public class ClassCastExceptionDemo {

    // Static method to handle ClassCastException
    public static void handleClassCastException() {
        // Heterogeneous array of objects
        Object[] objects = {"Hello", 123, true, "Java"};

        for (Object obj : objects) {
            try {
                // Attempting to cast each object to String
                String str = (String) obj;
                System.out.println("Casting successful: " + str);
            } catch (ClassCastException e) {
                // User-friendly error message
                System.out.println("ClassCastException: Cannot cast " + obj.getClass().getName() + " to String.");
                // Print stack trace for debugging
                e.printStackTrace();
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        handleClassCastException();
    }
}
