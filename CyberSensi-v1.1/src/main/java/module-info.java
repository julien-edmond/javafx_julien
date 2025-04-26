module sio.d3.javafx.cybersensi {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens sio.d3.javafx.cybersensi to javafx.fxml;
    exports sio.d3.javafx.cybersensi;
}