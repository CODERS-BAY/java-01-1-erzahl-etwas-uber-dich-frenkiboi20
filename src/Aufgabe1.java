import java.time.LocalDate;

public class Aufgabe1 {

    public static void main(String[] args) {

        byte age = 41;
        String surname = "Jakob";
        char gender = 'm';
        String name = "Penninger";
        LocalDate born = LocalDate.of(1979, 8, 24);
        boolean isMarried = true;

        System.out.println(age + "," + surname + "," + gender + ", " + name + ", " + born + ", " + isMarried);
    }
}