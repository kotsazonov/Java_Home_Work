import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Set<Laptop> laptopSet = new HashSet<>();

        // Добавим некоторые ноутбуки в множество
        laptopSet.add(new Laptop(8, 512, "Windows", "Black"));
        laptopSet.add(new Laptop(16, 1024, "MacOS", "Silver"));

        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя критерии
        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Введите минимальный размер ОЗУ:");
                int ram = scanner.nextInt();
                laptopSet.removeIf(laptop -> laptop.getRAM() < ram);
                break;
            case 2:
                System.out.println("Введите минимальный объем ЖД:");
                int hdd = scanner.nextInt();
                laptopSet.removeIf(laptop -> laptop.getHDDSize() < hdd);
                break;
            case 3:
                System.out.println("Введите операционную систему:");
                scanner.nextLine();  // consume the newline
                String os = scanner.nextLine();
                laptopSet.removeIf(laptop -> !laptop.getOS().equalsIgnoreCase(os));
                break;
            case 4:
                System.out.println("Введите цвет:");
                scanner.nextLine();  // consume the newline
                String color = scanner.nextLine();
                laptopSet.removeIf(laptop -> !laptop.getColor().equalsIgnoreCase(color));
                break;
            default:
                System.out.println("Неизвестный критерий.");
        }

        System.out.println("Отфильтрованные ноутбуки:");
        for (Laptop laptop : laptopSet) {
            System.out.println(laptop.getOS() + ", " + laptop.getRAM() + "GB RAM, " + laptop.getHDDSize() + "GB HDD, " + laptop.getColor());
        }
    }
}
