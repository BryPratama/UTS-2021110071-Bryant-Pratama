package vehicles;

/**
 *
 * @author BRYANT
 */
public class Customer {
    private String customerID;
    private String nama;
    private String alamat;
    private int telepon;

    public Customer(String customerID, String nama, String alamat, int telepon) {
        this.customerID = customerID;
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
    }

    public String getCustomerID() { return customerID; }
    public void setCustomerID(String customerID) { this.customerID = customerID; }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public String getAlamat() { return alamat; }
    public void setAlamat(String alamat) { this.alamat = alamat; }

    public int getTelepon() { return telepon; }
    public void setTelepon(int telepon) { this.telepon = telepon; }
}
