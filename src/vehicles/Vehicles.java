/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package vehicles;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author BRYANT
 */
public class Vehicles {
    private String vehicleID;
    private String merk;
    private String model;
    private int tahun;
    private float harga;

    public Vehicles(String vehicleID, String merk, String model, int tahun, float harga) {
        this.vehicleID = vehicleID;
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
        this.harga = harga;
    }

    public String getVehicleID() { return vehicleID; }
    public void setVehicleID(String vehicleID) { this.vehicleID = vehicleID; }

    public String getMerk() { return merk; }
    public void setMerk(String merk) { this.merk = merk; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getTahun() { return tahun; }
    public void setTahun(int tahun) { this.tahun = tahun; }

    public float getHarga() { return harga; }
    public void setHarga(float harga) { this.harga = harga; }
}
