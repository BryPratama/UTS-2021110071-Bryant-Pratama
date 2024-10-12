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
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class PaymentController implements Initializable {

    @FXML
    private TextField paymentIDField; 
    @FXML
    private TextField jenisPembayaranField; 
    @FXML
    private TextField jumlahPembayaranField; 
    @FXML
    private DatePicker tanggalPembayaranField; 
    @FXML
    private ListView<String> listViewPembayaran; 

    private ObservableList<String> pembayaranList;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        pembayaranList = FXCollections.observableArrayList();
        listViewPembayaran.setItems(pembayaranList);
    }

    @FXML
    private void tambahklik(ActionEvent event) {
        String paymentID = paymentIDField.getText();
        String jenisPembayaran = jenisPembayaranField.getText();
        String jumlahPembayaran = jumlahPembayaranField.getText();
        LocalDate tanggalPembayaran = tanggalPembayaranField.getValue();

        if (paymentID.isEmpty() || jenisPembayaran.isEmpty() || jumlahPembayaran.isEmpty() || tanggalPembayaran == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Input Error");
            alert.setHeaderText("Data Tidak Lengkap");
            alert.setContentText("Harap lengkapi semua data pembayaran.");
            alert.showAndWait();
        } else {
            String dataPembayaran = "ID: " + paymentID + ", Jenis: " + jenisPembayaran + ", Jumlah: Rp" + jumlahPembayaran + ", Tanggal: " + tanggalPembayaran.toString();

            pembayaranList.add(dataPembayaran);
            paymentIDField.clear();
            jenisPembayaranField.clear();
            jumlahPembayaranField.clear();
            tanggalPembayaranField.setValue(null);
        }
    }

    @FXML
    private void tampilklik(ActionEvent event) {
        if (pembayaranList.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Data Kosong");
            alert.setHeaderText(null);
            alert.setContentText("Belum ada pembayaran yang ditambahkan.");
            alert.showAndWait();
        } else {
            listViewPembayaran.refresh();
        }
    }

    @FXML
    private void hapusklik(ActionEvent event) {
        String selectedPembayaran = listViewPembayaran.getSelectionModel().getSelectedItem();
        if (selectedPembayaran != null) {
            pembayaranList.remove(selectedPembayaran); 
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Peringatan");
            alert.setHeaderText("Tidak Ada Pembayaran Dipilih");
            alert.setContentText("Harap pilih pembayaran yang ingin dihapus.");
            alert.showAndWait();
        }
    }
}
