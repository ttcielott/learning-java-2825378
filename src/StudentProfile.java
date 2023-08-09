public class StudentProfile {
    String firstName;
    String lastName;
    int yearToGraduate;
    double GPA;
    String declaredMajor;

    public StudentProfile(String firstName,
                          String lastName,
                          int yearToGraduate,
                          double GPA,
                          String declaredMajor){
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearToGraduate = yearToGraduate;
        this.GPA = GPA;
        this.declaredMajor = declaredMajor;
    }

    public void incrementGradutionYear(){
        yearToGraduate = yearToGraduate + 1;
    }

    public String getFullName(){
        return (firstName + " " + lastName);
    }

    public String convertToUkGrades(){
        if (GPA == 4.0){
          return "First class honours";
        } else if (GPA >= 3.3) {
            return "Upper-second class honours";
        } else if (GPA >= 2.7) {
            return "Lower-second class honours";
        } else if (GPA >= 2.0) {
            return "Third class honours";
        } else {
            return "Ordinary/Unclassified";
        }
    }
}

