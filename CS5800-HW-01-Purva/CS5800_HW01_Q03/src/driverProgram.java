public class driverProgram {
    public static void main(String[] args) {
        // Instructors
        Instructor nima = new Instructor("Nima", "Devarpanah", "6-2009");
        Instructor jiraiya = new Instructor("Jiraiya", "Sensei", "7-0169"); // New instructor for Advanced Software Engineering

        Textbook cleanCode = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");
        Textbook ichaicha = new Textbook("Icha Icha", "Jairaiya", "Hatake Kakashi"); // Second textbook


        Course softwareengineeringcourse = new Course("Computer Software");
        softwareengineeringcourse.addInstructor(nima);
        softwareengineeringcourse.addTextbook(ichaicha);


        System.out.println("=== Course (Initial) ===");
        softwareengineeringcourse.printCourseDetails();

        softwareengineeringcourse.addInstructor(jiraiya);
        softwareengineeringcourse.addTextbook(ichaicha); // Adding the second textbook


        System.out.println("=== Course (Updated) ===");
        softwareengineeringcourse.printCourseDetails();
    }
}
