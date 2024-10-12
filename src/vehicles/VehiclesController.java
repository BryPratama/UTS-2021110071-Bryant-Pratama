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

public class VehiclesController implements Initializable {

    @FXML
    private TextField vehicleIDField; 
    @FXML
    private TextField merkField;
    @FXML
    private TextField modelField;
    @FXML
    private TextField tahunProduksiField;
    @FXML
    private TextField hargaField;
    @FXML
    private ListView<String> listViewKendaraan;

    private ObservableList<String> kendaraanList;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        kendaraanList = FXCollections.observableArrayList();
        listViewKendaraan.setItems(kendaraanList);
    }
    @FXML
    private void tambahKendaraan(ActionEvent event) {
        String vehicleID = vehicleIDField.getText();
        String merk = merkField.getText();
        String model = modelField.getText();
        String tahunProduksi = tahunProduksiField.getText();
        String harga = hargaField.getText();

        if (vehicleID.isEmpty() || merk.isEmpty() || model.isEmpty() || tahunProduksi.isEmpty() || harga.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Input Error");
            alert.setHeaderText("Data Tidak Lengkap");
            alert.setContentText("Harap lengkapi semua data kendaraan.");
            alert.showAndWait();
        } else {
            String dataKendaraan = "ID: " + vehicleID + ", Merk: " + merk + ", Model: " + model + ", Tahun: " + tahunProduksi + ", Harga: Rp" + harga;

            kendaraanList.add(dataKendaraan);

            vehicleIDField.clear();
            merkField.clear();
            modelField.clear();
            tahunProduksiField.clear();
            hargaField.clear();
        }
    }
    @FXML
    private void tampilDataKendaraan(ActionEvent event) {
        if (kendaraanList.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Data Kosong");
            alert.setHeaderText(null);
            alert.setContentText("Belum ada kendaraan yang ditambahkan.");
            alert.showAndWait();
        } else {
            listViewKendaraan.refresh();
        }
    }
    @FXML
    private void hapusKendaraan(ActionEvent event) {
        String selectedKendaraan = listViewKendaraan.getSelectionModel().getSelectedItem();
        if (selectedKendaraan != null) {
            kendaraanList.remove(selectedKendaraan); 
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Peringatan");
            alert.setHeaderText("Tidak Ada Kendaraan Dipilih");
            alert.setContentText("Harap pilih kendaraan yang ingin dihapus.");
            alert.showAndWait();
        }
    }
}
