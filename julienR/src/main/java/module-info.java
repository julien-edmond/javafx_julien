module sio.d3.javafx.julienr {
    requires javafx.controls;
    requires javafx.fxml;


    opens sio.d3.javafx.julienr to javafx.fxml;
    exports sio.d3.javafx.julienr;
}