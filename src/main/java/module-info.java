module com.example.aplikace_todolist {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.aplikace_todolist to javafx.fxml;
    exports com.example.aplikace_todolist;
}