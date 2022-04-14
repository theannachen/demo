module com.theannachen.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.theannachen.demo to javafx.fxml;
    exports com.theannachen.demo;
}