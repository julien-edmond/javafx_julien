module sio.d3.javafx.julienr {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens sio.d3.javafx.julienr to javafx.fxml;
    exports sio.d3.javafx.julienr;
}