package model;

public class Receipt extends Client{
    private double oldElectricNumber;
    private double newElectricNumber;

    public Receipt(String name, String homeNumber, String id, double oldElectricNumber, double newElectricNumber) {
        super(name, homeNumber, id);
        this.oldElectricNumber = oldElectricNumber;
        this.newElectricNumber = newElectricNumber;
    }

    public double getOldElectricNumber() {
        return oldElectricNumber;
    }

    public void setOldElectricNumber(double oldElectricNumber) {
        this.oldElectricNumber = oldElectricNumber;
    }

    public double getNewElectricNumber() {
        return newElectricNumber;
    }

    public void setNewElectricNumber(double newElectricNumber) {
        this.newElectricNumber = newElectricNumber;
    }

    @Override
    public String toString() {
        return "[" + "Họ và tên chủ hộ: " + getName() +
                ", Số nhà: " + getHomeNumber() +
                ", Mã số công tơ " + getId() +
                ", Số điện cũ: " + oldElectricNumber +
                ", Số điện mới: " + newElectricNumber +
                ']';
    }
}
