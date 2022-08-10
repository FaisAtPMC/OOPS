package oops;

// Inheritance

public class MarkSheet extends Calculator{
    private final int id;
    private final int TOTAL_MARKS = 600;
    private int marksObtained;

    // Constructor
    public MarkSheet(int id) {
        this.id = id;
    }
    public void printResult() {
        System.out.println("Result of " + getStudentName());
        setMarksObtained();
        System.out.println("You scored " + getPercent(marksObtained,TOTAL_MARKS) + "%");
    }

    // If else
    private void setMarksObtained() {
       if (id == 1) marksObtained = 495;
       else if (id == 2) marksObtained = 450;
       else if (id == 3) marksObtained = 500;
       else if (id == 4) marksObtained = 343;
       else if (id == 5) marksObtained = 543;
       else marksObtained = 0;
    }
    // Switch Statement
    private String getStudentName() {
       switch(id) {
           case 1 : return "Faisal";
           case 2 : return "Afzal";
           case 3 : return "Amaan";
           case 4 : return "Faizan";
           case 5 : return "Saeema";
           default: return "Enter Id between 1 to 5";
       }
    }
    @Override
    public void terminate() {
        System.out.println("See you in the next Semester");
        System.exit(0);
    }


}
