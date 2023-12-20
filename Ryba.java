import java.time.LocalDate;
import java.util.List;

public class Ryba extends Givnost{

private String color;
public Ryba(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner, String color) {
        super(name, birthDate, vaccinations, illness, owner);
    this.color = color;
}   
public String getColor(){
    return color;
}
@Override
public void toGo(){
    System.out.println("Не ходит");
}
@Override
public void fly(){
    System.out.println("Не летает");
}
public void bubble(){
    System.out.println("Пускает пузыри");
}

}