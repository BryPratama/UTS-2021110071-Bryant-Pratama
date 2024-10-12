package vehicles;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;
import java.io.IOException;

public class VehiclesMenuController {

    @FXML
    private AnchorPane contentArea;

    private void loadFXML(String fxmlFile) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
            Node node = loader.load();

            contentArea.getChildren().clear();
            contentArea.getChildren().add(node);

            AnchorPane.setTopAnchor(node, 0.0);
            AnchorPane.setBottomAnchor(node, 0.0);
            AnchorPane.setLeftAnchor(node, 0.0);
            AnchorPane.setRightAnchor(node, 0.0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void showVehicles() {
        loadFXML("Vehicles.fxml"); 
    }

    @FXML
    private void showSales() {
        loadFXML("Sales.fxml");
    }

    @FXML
    private void showCustomer() {
        loadFXML("Customer.fxml");
    }

    @FXML
    private void showPayment() {
        loadFXML("Payment.fxml");
    }
}
