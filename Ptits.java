import java.time.LocalDate;
import java.util.List;

public class Ptits extends Givnost{
    public Ptits(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        super(name, birthDate, vaccinations, illness, owner);
    }
@Override
public void swim(){
    System.out.println("Тонет");
}
@Override
public void toGo(){
    System.out.println("Ходит");
}
    
}