
public class course {

    private String[] courseCodes = { "C programmer", "DEVOPS",};
    private int[] marks = { 81, 92 };

    public void displayStudentMarks() {
        System.out.println("Course Name \t Marks Obtained");

        for (int i = 0; i < courseCodes.length; i++) {

                System.out.println(courseCodes[i] + "\t\t\t" + marks[i]);
        }
    }

}
