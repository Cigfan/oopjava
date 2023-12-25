import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik", LocalDate.of(1993, 6, 6), new ArrayList<>(), "Chumka", "Boss", 4);
        System.out.println(barsik);
        System.out.println(barsik.getLegsCount());
        Animal eagle = new Eagle("Kesha", LocalDate.of(1993, 6, 6), new ArrayList<>(), "Chumka", "Boss");


        List<Animal> animals = new ArrayList<>();
        animals.add(barsik);
        animals.add(eagle);
        Duck duck = new Duck("Donald", LocalDate.of(1934, 5, 3), new ArrayList<>(), "Flu", "Walter");
        Penguin penguin = new Penguin("Lolo", LocalDate.of(1987, 6, 26), new ArrayList<>(), "Flu", "Gennady");

        VeterinaryClinic clinic = new VeterinaryClinic();
        clinic.addPatients(barsik, eagle, penguin, duck, new Fish("Pepe", LocalDate.of(1997, 2, 6), new ArrayList<>(), "Flu", "Harry"));
        System.out.println(clinic.getPatients());

        System.out.println(clinic.getGoables());
        System.out.println(clinic.getFlyable());
        System.out.println(clinic.getSwimable());

        // Добавлением персонала клиники и проверка методов работы с персоналом
        System.out.println("---------------------------------");

        Nurse nurse1 = new Nurse("Светлана", LocalDate.of(1997, 1, 4),
                "Диетолог", "Москва 1", true);

        Doctor doctor1 = new Doctor("Сергей", LocalDate.of(1990, 4, 14),
                "Травматолог", "Москва 2", null ); // без медсестры

        Doctor doctor2 = new Doctor("Андрей", LocalDate.of(1987, 11, 5),
                "Диетолог", "Москва 3", nurse1); // с медсестрой Светланой
        clinic.addPersonal(doctor1, doctor2, nurse1); // добавляем персонал клиники

        System.out.println(clinic.getAllDoctors()); // выводим всех докторов
        System.out.println(clinic.getAllNurses()); // выводим всех медсестер

        doctor1.toAction(); // проверка переопределенного абстрактного метода
        nurse1.toAction();
        System.out.println(nurse1.getAccessToPharmacy()); // проверка наличия прав у сестры к аптеке

    }
}