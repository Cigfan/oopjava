import java.time.LocalDate;
import java.util.List;

public class Givnost {
    protected String name;
    protected LocalDate birthDate;
    protected List <String> vaccinations;
    protected String illness;
    protected String owner;

    public Givnost(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        this.name = name;
        this.birthDate = birthDate;
        this.vaccinations = vaccinations;
        this.illness = illness;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public List<String> getVaccinations() {
        return vaccinations;
    }

    public String getIllness() {
        return illness;
    }

    public String getOwner() {
        return owner;
    }

    protected void wakeup (){
        System.out.println("Животное проснулось !!");
    }

    protected void wakeup (int time){
        System.out.println("Животное проснулось в " + time);
    }

    protected void eat (){
        System.out.println("Животное ест");
    }

    protected void play (){
        System.out.println("Животное играется");
    }

    protected void sleep () {
        System.out.println("Животное спит");
    }
    protected void fly(){
        System.out.println("Животное летает");
    }

    protected void swim(){
      System.out.println("Животное плавает");  
    }
    
    protected void toGo(){
        System.out.println("Животное бегает"); 
    }
    
    public void lifeCycle() {
        wakeup();
        eat();
        sleep();
   
    }

    @Override
    public String toString() {
        return "Givnost{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", vaccinations=" + vaccinations +
                ", illness='" + illness + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}