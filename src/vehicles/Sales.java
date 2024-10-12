package vehicles;

public class Sales {
    private String saleID;
    private String vehicleID;
    private String saleDate;
    private int totalPembelian;

    public Sales(String saleID, String vehicleID, String saleDate, int totalPembelian) {
        this.saleID = saleID;
        this.vehicleID = vehicleID;
        this.saleDate = saleDate;
        this.totalPembelian = totalPembelian;
    }

    public String getSaleID() { return saleID; }
    public void setSaleID(String saleID) { this.saleID = saleID; }

    public String getVehicleID() { return vehicleID; }
    public void setVehicleID(String vehicleID) { this.vehicleID = vehicleID; }

    public String getSaleDate() { return saleDate; }
    public void setSaleDate(String saleDate) { this.saleDate = saleDate; }

    public int getTotalPembelian() { return totalPembelian; }
    public void setTotalPembelian(int totalPembelian) { this.totalPembelian = totalPembelian; }

    @Override
    public String toString() {
        return "ID Penjualan: " + saleID + 
               ", Vehicle ID: " + vehicleID + 
               ", Tanggal: " + saleDate + 
               ", Total Pembelian: Rp" + totalPembelian;
    }
}
