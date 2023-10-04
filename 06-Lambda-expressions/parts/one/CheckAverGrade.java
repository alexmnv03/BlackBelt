package parts.one;

public class CheckAverGrade implements StudentChecks{

    @Override
    public boolean check(Student student) {
        return student.getAvgGrade() > 14;
    }
    
}
