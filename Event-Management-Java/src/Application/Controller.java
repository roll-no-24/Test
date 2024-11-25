package Application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import event.lib.*;
public class Controller implements Initializable {
    private Stage stage;
    private Scene scene;
    private Pane root;
    public void employeeHome(ActionEvent e) throws Exception {
        root = FXMLLoader.load(getClass().getResource("EmployeeHome.fxml"));
        stage =(Stage) ((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
    }
    public void customerHome(ActionEvent e) throws Exception {
        root = FXMLLoader.load(getClass().getResource("CustomerHome.fxml"));
        stage =(Stage) ((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
    }
    public void requestForCorporateEvent(ActionEvent e) throws Exception {
        root = FXMLLoader.load(getClass().getResource("RequestForCorporateEvent.fxml"));
        stage =(Stage) ((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
    }
//    Register for tour start
    public void registerFortourBtn(ActionEvent e) throws Exception {
        root = FXMLLoader.load(getClass().getResource("TourPackageRegistration.fxml"));
        stage =(Stage) ((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
    }
//    Register for tour end
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {}
//   Customer menu button start
    public void customerMenuBtn(ActionEvent e) throws Exception {
        root = FXMLLoader.load(getClass().getResource("CustomerHome.fxml"));
        stage =(Stage) ((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
    }
//  Customer menu button end

//    Employee menu button start
    public void employeeMenuBtn(ActionEvent e) throws Exception {
        root = FXMLLoader.load(getClass().getResource("EmployeeHome.fxml"));
        stage =(Stage) ((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);

    }
//    Employee menu button end

    // Request For Corporate Event start
    @FXML
    private TextField eventTitleRequestForCorporateEvent;
    @FXML
    private TextField contactRequestForCorporateEvent;
    @FXML
    private TextField durationDaysRequestForCorporateEvent;
    @FXML
    private TextField numberOfPeopleRequestForCorporateEvent;
    @FXML
    private DatePicker evntDateRequestForCorporateEvent;
    @FXML
    private Text messageBoxRequestForCorporateEvent;
    public void submitCorporateEvent(ActionEvent event) {
        CorporateEvent event1=new CorporateEvent(eventTitleRequestForCorporateEvent.getText(),contactRequestForCorporateEvent.getText(),evntDateRequestForCorporateEvent.getValue(),
                Integer.parseInt(numberOfPeopleRequestForCorporateEvent.getText()),Integer.parseInt(numberOfPeopleRequestForCorporateEvent.getText()));
        messageBoxRequestForCorporateEvent.setText("Request Submission Successful.\n"+event1);
    }
    // Request For Corporate Event end



//    Register for tourpackage start
    @FXML
    TextField eventIdRegisterForTour;
    @FXML
    TextField contactResgisterForTour;
    @FXML
    TextField numberOfPeopleRegisterForTour;
    @FXML
    Label messgaeBoxRegisterForTour;
    @FXML
    Label allTourEventRegisterForTour;
    public void registerTour(ActionEvent event) {
        messgaeBoxRegisterForTour.setText("Successfully Registered Tour."+eventIdRegisterForTour.getText()+contactResgisterForTour.getText()+numberOfPeopleRegisterForTour.getText());
        allTourEventRegisterForTour.setText("Successfully Registered Tour.");
    }
//    Register for tourpackage end
//    pay bill start
    public void payBillBtn(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("PayBill.fxml"));
        stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
    }
    @FXML
    TextField eventIdForPayBill;
    @FXML
    TextField totalBillForPayBill;
    @FXML
    Text messgaeBoxForPayBill;
    public void findTotalBill(ActionEvent event) {
        totalBillForPayBill.setText("5000 BDT");
        System.out.println(eventIdForPayBill.getText());
    }

    public void payBill(ActionEvent event) {
        messgaeBoxForPayBill.setText("Payment Successful");
        System.out.println(totalBillForPayBill.getText());
    }
//    pay bill end
//    Log Out Start
   @FXML
   private Button logOut;
    @FXML
    private AnchorPane scene_pane;
    public void logOut(ActionEvent event) throws IOException {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Log Out");
        alert.setContentText("Are you sure you want to log out ?");
        if(alert.showAndWait().get() == ButtonType.OK) {
            root = FXMLLoader.load(getClass().getResource("Home.fxml"));
            stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
        }
    }
//    Log Out End
}
