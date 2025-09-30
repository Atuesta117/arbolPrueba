module com.arboles {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.arboles to javafx.fxml;
    exports com.arboles;
}