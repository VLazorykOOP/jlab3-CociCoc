import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Input countryName: ");
        String countryName = scan.next();
        System.out.print("Input populationCountry: ");
        int populationCountry = scan.nextInt();

        System.out.print("Input nameKingdom: ");
        String nameKingdom = scan.next();
        System.out.print("Input populationKingdom: ");
        int populationKingdom = scan.nextInt();
        System.out.print("Input monarchKingdom: ");
        String monarchKingdom = scan.next();

        System.out.print("Input nameRepublic: ");
        String nameRepublic = scan.next();
        System.out.print("Input populationRepublic: ");
        int populationRepublic = scan.nextInt();
        System.out.print("Input monarchRepublic: ");
        String monarchRepublic = scan.next();
        System.out.print("Input presidedRepublic: ");
        String presidedRepublic = scan.next();

        System.out.print("Input nameMonarchy: ");
        String nameMonarchy = scan.next();
        System.out.print("Input populationMonarchy: ");
        int populationMonarchy = scan.nextInt();
        System.out.print("Input monarchMonarchy: ");
        String monarchMonarchy = scan.next();
        System.out.print("Input presidedMonarchy: ");
        String presidedMonarchy = scan.next();
        // Створення держави
        Country ukraine = new Country(countryName, populationCountry);

        // Створення королівства
        Kingdom unitedKingdom = new Kingdom(nameKingdom, populationKingdom, monarchKingdom);

        // Створення республіки
        Republic france = new Republic(nameRepublic, populationRepublic, monarchRepublic, presidedRepublic);

        // Створення монархії
        Monarchy japan = new Monarchy(nameMonarchy, populationMonarchy, monarchMonarchy, presidedMonarchy);

        System.out.println(ukraine);
        System.out.println(unitedKingdom);
        System.out.println(france);
        System.out.println(japan);
    }

}
