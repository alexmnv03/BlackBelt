package game;

public class GameTest {
    
    public static void main(String[] args) {
        
        Schoolar schoolar1 = new Schoolar("ivn", 14);
        Schoolar schoolar2 = new Schoolar("Pit", 15);
        Schoolar schoolar3 = new Schoolar("Ser", 15);
        Schoolar schoolar4 = new Schoolar("Jan", 16);        

        Student student1 = new Student("Ser", 19);
        Student student2 = new Student("Nik", 20);

        Employee employee1 = new Employee("Gab", 27);
        Employee employee2 = new Employee("Han", 29);

        Team<Schoolar> schoolTeam = new Team<>("Drn");
        Team<Student> studentTeam = new Team<>("Stdn");
        Team<Employee> employeeTeam = new Team<>("Empl");
        schoolTeam.addNewParticipant(schoolar1);
        schoolTeam.addNewParticipant(schoolar2);
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        Team<Schoolar> schoolTeam2 = new Team<>("Mast");                
        schoolTeam2.addNewParticipant(schoolar3);
        schoolTeam2.addNewParticipant(schoolar4);

        schoolTeam.playWith(schoolTeam2);


    }
}
