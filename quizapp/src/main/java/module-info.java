module com.nnh.quizapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.nnh.quizapp to javafx.fxml;
    exports com.nnh.quizapp;
}
