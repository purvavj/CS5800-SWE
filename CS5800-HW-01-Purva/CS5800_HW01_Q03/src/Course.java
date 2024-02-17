import java.util.ArrayList; // Import the ArrayList class

public class Course {
    private final String courseName;
    private final ArrayList<Instructor> instructors = new ArrayList<>();
    private final ArrayList<Textbook> textbooks = new ArrayList<>();

    // Constructor
    public Course(String courseName) {
        this.courseName = courseName;
    }

    // Method to add an instructor
    public void addInstructor(Instructor instructor) {
        instructors.add(instructor);
    }

    // Method to add a textbook
    public void addTextbook(Textbook textbook) {
        textbooks.add(textbook);
    }

    // Print function
    public void printCourseDetails() {
        System.out.println("Course Name: " + courseName);
        for (int i = 0; i < instructors.size(); i++) {
            Instructor instructor = instructors.get(i);
            System.out.println("Instructor: " + instructor.getFirstName() + " " + instructor.getLastName() + ", Office: " + instructor.getOfficeNumber());

            // Check if there is a corresponding textbook for the current instructor
            if (i < textbooks.size()) {
                Textbook textbook = textbooks.get(i);
                System.out.println("Textbook: " + textbook.getTitle() + " by " + textbook.getAuthor());
            }
        }
    }
}
