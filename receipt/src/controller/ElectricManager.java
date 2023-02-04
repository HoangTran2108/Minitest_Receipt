package controller;

import model.Client;
import model.Receipt;

import java.util.List;
import java.util.Scanner;

public class ElectricManager {
    List<Client> clients;

    public ElectricManager(List<Client> clients) {
        this.clients = clients;
    }
    public void addClient(Client client) {
        clients.add(client);
    }

    public void display() {
        for (Client client : clients) {
            System.out.println(client);
        }
    }

    public void moneyToPay() {
        System.out.print("Nhập mã số công tơ khách hàng muốn thanh toán tiền: ");
        Scanner input = new Scanner(System.in);
        double totalMoney;
        String id = input.nextLine();
        for (Client client : clients) {
            if (id.equals(client.getId()) && client instanceof Receipt && (((Receipt) client).getNewElectricNumber() > ((Receipt) client).getOldElectricNumber())) {
                totalMoney = (((Receipt) client).getNewElectricNumber()- ((Receipt) client).getOldElectricNumber())*750;
                System.out.println(client);
                System.out.println("Tổng tiền điện là: " + totalMoney);
            } else {
                System.out.println("Vui lòng kiểm tra lại");
            }
        }
    }
}
