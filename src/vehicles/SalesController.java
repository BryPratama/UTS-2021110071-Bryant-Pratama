package vehicles;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class SalesController implements Initializable {

    @FXML
    private TextField vehicleIDField; 
    @FXML
    private TextField totalPembelianField; 
    @FXML
    private DatePicker saleDatePicker;
    @FXML
    private Button btnSimpanPenjualan;
    @FXML
    private Button btnTampilDataPenjualan;
    @FXML
    private ListView<String> listViewPenjualan;
    private ObservableList<String> penjualanList;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        penjualanList = FXCollections.observableArrayList();
        listViewPenjualan.setItems(penjualanList);
    }

    @FXML
    private void simpanPenjualan(ActionEvent event) {
        String vehicleID = vehicleIDField.getText();
        String totalPembelianStr = totalPembelianField.getText();
        LocalDate saleDate = saleDatePicker.getValue();

        if (vehicleID.isEmpty() || totalPembelianStr.isEmpty() || saleDate == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Input Error");
            alert.setHeaderText("Data Tidak Lengkap");
            alert.setContentText("Harap lengkapi semua data penjualan.");
            alert.showAndWait();
            return;
        }

        String dataPenjualan = "Vehicle ID: " + vehicleID + ", Total Pembelian: Rp" + totalPembelianStr + ", Tanggal: " + saleDate.toString();

        penjualanList.add(dataPenjualan);

        vehicleIDField.clear();
        totalPembelianField.clear();
        saleDatePicker.setValue(null);
    }

    @FXML
    private void tampilDataPenjualan(ActionEvent event) {
        if (penjualanList.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Data Kosong");
            alert.setHeaderText(null);
            alert.setContentText("Belum ada data penjualan yang ditambahkan.");
            alert.showAndWait();
        } else {
            listViewPenjualan.refresh(); 
        }
    }
}
