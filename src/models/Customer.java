package models;

import java.util.Date;

public class Customer extends SofkianPerson{

    private int idCustomer;
    private Date registrationDate;
    private boolean vip;
    private static int countCustomer;

    public Customer(Date registrationDate, boolean vip,
                    String name, char gender, int age, String adress) {
        super(name, gender, age, adress);
        this.idCustomer = ++Customer.countCustomer;
        this.registrationDate = registrationDate;
        this.vip = vip;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Customer{");
        sb.append("idCustomer=").append(idCustomer);
        sb.append(", registrationDate=").append(registrationDate);
        sb.append(", vip=").append(vip);
        sb.append(",\n").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
