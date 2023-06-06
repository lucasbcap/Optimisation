module com.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires java.datatransfer;
    requires java.desktop;

    opens com.example.tp1 to javafx.fxml;
    exports com.example.tp1;

    opens com.example.tp2 to javafx.fxml;
    exports com.example.tp2;
}