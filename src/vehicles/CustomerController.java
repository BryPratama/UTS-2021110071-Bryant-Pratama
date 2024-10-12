package vehicles;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

public class CustomerController implements Initializable {

    @FXML
    private TextField customerIDField;
    @FXML
    private TextField namaField;
    @FXML
    private TextField alamatField;
    @FXML
    private TextField teleponField; 
    @FXML
    private ListView<String> listViewPelanggan;
    @FXML
    private Button btnTambahPelanggan;
    @FXML
    private Button btnTampilData;
    @FXML
    private Button btnHapusData;

    private ObservableList<String> pelangganList;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        pelangganList = FXCollections.observableArrayList();
        listViewPelanggan.setItems(pelangganList);
    }

    @FXML
    private void tambahklik(ActionEvent event) {
        String customerID = customerIDField.getText();
        String nama = namaField.getText();
        String alamat = alamatField.getText();
        String telepon = teleponField.getText();

        if (customerID.isEmpty() || nama.isEmpty() || alamat.isEmpty() || telepon.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Input Error");
            alert.setHeaderText("Data Tidak Lengkap");
            alert.setContentText("Harap lengkapi semua data pelanggan.");
            alert.showAndWait();
        } else {
            String dataPelanggan = "ID: " + customerID + ", Nama: " + nama + ", Alamat: " + alamat + ", Telepon: " + telepon;

            pelangganList.add(dataPelanggan);

            customerIDField.clear();
            namaField.clear();
            alamatField.clear();
            teleponField.clear();
        }
    }

    @FXML
    private void tampilklik(ActionEvent event) {
        if (pelangganList.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Data Kosong");
            alert.setHeaderText(null);
            alert.setContentText("Belum ada pelanggan yang ditambahkan.");
            alert.showAndWait();
        } else {
            listViewPelanggan.refresh(); 
        }
    }

    @FXML
    private void hapusklik(ActionEvent event) {
        String selectedPelanggan = listViewPelanggan.getSelectionModel().getSelectedItem();
        if (selectedPelanggan != null) {
            pelangganList.remove(selectedPelanggan);
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Peringatan");
            alert.setHeaderText("Tidak Ada Pelanggan Dipilih");
            alert.setContentText("Harap pilih pelanggan yang ingin dihapus.");
            alert.showAndWait();
        }
    }
}
