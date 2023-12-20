import java.time.LocalDate;
import java.util.List;

public class Kot extends Givnost {
    private int legsCount;

    public Kot(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner,
            int legsCount) {
        super(name, birthDate, vaccinations, illness, owner);
        this.legsCount = legsCount;
    }

    public int getLegsCount() {
        return legsCount;
    }
   @Override
    public void fly(){
    System.out.println("Не может летать");
   }
   @Override
    public void swim(){
        System.out.println("Плавает");
    }
    public void meow(){
        System.out.print("Мяучит");
    }
    
}