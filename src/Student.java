public class Student extends Person{
    double gpa;

    public Student(){
        super();
    }

    @Override
    public double getPaymentAmount() {
        if (gpa > 2.67){
            return 36660.00;
        }
        else{
            return 0;
        }
    }

    public Student(String name, String surname, double gpa){
        super(name, surname);
        setGpa(gpa);
    }
    @Override
    public String ToString(){
        return "Student " + super.ToString();
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String GetPosition() {
        return "Student";
    }

    @Override
    public int compareTo(Person person) {
        return Double.compare(this.getPaymentAmount(), person.getPaymentAmount());
    }
}
