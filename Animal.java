import java.time.LocalDate;
import java.util.List;

public abstract class Animal {
    protected String name;
    protected LocalDate birthDate;
    protected List<String> vaccination;
    protected String illness;
    protected String ownerName;
    protected String type;

    public Animal(String name, LocalDate birthDate, List<String> vaccination, String illness, String ownerName) {
        this.name = name;
        this.birthDate = birthDate;
        this.vaccination = vaccination;
        this.illness = illness;
        this.ownerName = ownerName;
        this.type = getClass().getSimpleName();
    }
    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public List<String> getVaccination() {
        return vaccination;
    }

    public String getIllness() {
        return illness;
    }

    public String getOwnerName() {
        return ownerName;
    }
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", vaccination=" + vaccination +
                ", illness='" + illness + '\'' +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}