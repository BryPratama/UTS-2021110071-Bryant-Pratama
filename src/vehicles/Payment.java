/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicles;

/**
 *
 * @author BRYANT
 */
public class Payment {
    private String paymentID;
    private String jenisPembayaran;
    private float jumlahPembayaran;
    private String tanggalPembayaran;

    public Payment(String paymentID, String jenisPembayaran, float jumlahPembayaran, String tanggalPembayaran) {
        this.paymentID = paymentID;
        this.jenisPembayaran = jenisPembayaran;
        this.jumlahPembayaran = jumlahPembayaran;
        this.tanggalPembayaran = tanggalPembayaran;
    }

    public String getPaymentID() { return paymentID; }
    public void setPaymentID(String paymentID) { this.paymentID = paymentID; }

    public String getJenisPembayaran() { return jenisPembayaran; }
    public void setJenisPembayaran(String jenisPembayaran) { this.jenisPembayaran = jenisPembayaran; }

    public float getJumlahPembayaran() { return jumlahPembayaran; }
    public void setJumlahPembayaran(float jumlahPembayaran) { this.jumlahPembayaran = jumlahPembayaran; }

    public String getTanggalPembayaran() { return tanggalPembayaran; }
    public void setTanggalPembayaran(String tanggalPembayaran) { this.tanggalPembayaran = tanggalPembayaran; }
}

