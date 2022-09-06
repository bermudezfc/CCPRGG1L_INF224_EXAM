public class App {
    public static void main(String[] args) throws Exception {

        // Object and Properties
        Student Fortune = new Student();
        
        Fortune.surname = "Bermudez";
        Fortune.firstName = "Fortune Raphael";
        Fortune.middleInitial = 'C';
        Fortune.dateOfBirth = "September 22, 2004";
        Fortune.studentNumber = 2022106868;
        Fortune.studentEmailAddress = "bermudezfc@students.national-u.edu.ph";
        Fortune.iAmAwesome = true;

        Fortune.sayMyStudentNumber();
        Fortune.sayMyEmailAddress();
        Fortune.amIAwesome();

        



        
    }
}
