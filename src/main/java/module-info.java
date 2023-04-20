module com.likelion.codeup {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.likelion.codeup to javafx.fxml;
    exports com.likelion.codeup;
}