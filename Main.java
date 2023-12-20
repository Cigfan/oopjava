import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        Kot kot = new Kot("Mura", LocalDate.of(
                1993, 6, 6),
                new ArrayList<>(), "Chumka", "Boss", 4);
        Ptits ptits = new Ptits("Kesha", LocalDate.of(
                1996, 6, 6),
                new ArrayList<>(), "Chumka", "Boss");        
        Ryba ryba = new Ryba("Tasha", LocalDate.of(2021,2,3), 
        new ArrayList<>(),"HEZ", "Vasilisa Pupkina", "golden");

        List<Givnost> givnost = new ArrayList<>();
        givnost.add(kot);
        givnost.add(ptits);
        givnost.add(ryba);

        kot.swim();
        kot.fly();
        ptits.swim();
        ptits.toGo();
        ryba.toGo();
        ryba.fly();

    }
}