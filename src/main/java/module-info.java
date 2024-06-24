module org.example.javafx{
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens org.example.javafx to javafx.graphics, javafx.fxml;
    // permission error
    opens org.example.javafx.controller to javafx.graphics, javafx.fxml;
    exports org.example.javafx;
    exports org.example.javafx.entity;
}