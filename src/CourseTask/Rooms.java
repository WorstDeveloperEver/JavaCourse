package CourseTask;

import java.util.Scanner;

public class Rooms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter floors count:");
        int floorsCount = scanner.nextInt();

        System.out.println("Enter porches count:");
        int porchesCount = scanner.nextInt();

        System.out.println("Enter room number:");
        int roomNumber = scanner.nextInt();

        // Проверка, есть ли квартира с таким номером в доме
        int roomsPerFloorCount = 4;
        if (roomNumber > (roomsPerFloorCount * floorsCount * porchesCount) || roomNumber <= 0) {
            System.out.println("Wrong room number");
            return;
        }

        // Находим подъезд
        int porchNumber = (roomNumber - 1) / (floorsCount * roomsPerFloorCount) + 1;
        System.out.println("Porch №" + porchNumber);

        // Находим этаж
        int floorNumber = ((roomNumber - (porchNumber - 1) * floorsCount * roomsPerFloorCount) - 1) / roomsPerFloorCount + 1;
        System.out.println("Floor №" + floorNumber);

        // Определяем положение квартиры на площадке
        switch (roomNumber % roomsPerFloorCount) {
            case 0:
                System.out.println("Near right");
                break;
            case 1:
                System.out.println("Near left");
                break;
            case 2:
                System.out.println("Far left");
                break;
            default:
                System.out.println("Far right");
                break;
        }
    }
}
