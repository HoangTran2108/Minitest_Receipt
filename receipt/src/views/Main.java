package views;

import controller.ElectricManager;
import model.Client;
import model.Receipt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
        public static List<Client> clients = new ArrayList<>();
        public static ElectricManager manager = new ElectricManager(clients);
        public static Scanner input = new Scanner(System.in);
        public static int checkInput;

        public static void main(String[] args) {
            do {
                System.out.println("Menu------------------------");
                System.out.println(
                        "1. Tạo danh sách khách hàng\n" +
                                "2. Thêm khách hàng vào danh sách\n" +
                                "3. Hiển thị danh sách khách hàng\n" +
                                "4. In biên lai\n" +
                                "0. Thoát\n");
                checkInput = Integer.parseInt(input.nextLine());
                switch (checkInput) {
                    case 1 -> {
                        System.out.println("Nhập số lượng khách hàng:");
                        int number = Integer.parseInt(input.nextLine());
                        for (int i = 0; i < number; i++) {
                            manager.addClient(addNewClient());
                        }
                    }
                    case 2 -> manager.addClient(addNewClient());
                    case 3 -> manager.display();
                    case 4 -> manager.moneyToPay();
                    case 0 -> System.out.println("Hẹn gặp lại sau.");
                    default -> System.out.println("Vui lòng nhập lại!");
                }
            } while (checkInput != 0);
        }

        public static Client addNewClient() {
            try {
                System.out.println("Nhập tên khách hàng muốn thêm:");
                String name = input.nextLine();
                System.out.println("Nhập số nhà:");
                String homeNumber = input.nextLine();
                System.out.println("Nhập mã số công tơ:");
                String id = input.nextLine();
                System.out.println("Nhập số điện cũ:");
                double oldElectricNumber = Integer.parseInt(input.nextLine());
                System.out.println("Nhập số điện mới:");
                double newElectricNumber = Integer.parseInt(input.nextLine());
                return new Receipt(name, homeNumber, id, oldElectricNumber, newElectricNumber);
            } catch (Exception e) {
                System.out.println(e.getMessage());;
            }
            return null;
        }
}