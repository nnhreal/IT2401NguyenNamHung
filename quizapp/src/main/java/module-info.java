module com.nnh.quizapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.nnh.quizapp to javafx.fxml;
    exports com.nnh.quizapp;
}
