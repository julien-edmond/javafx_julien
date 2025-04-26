module sio.d3.javafx.julien {
    requires javafx.controls;
    requires javafx.fxml;


    opens sio.d3.javafx.julien to javafx.fxml;
    exports sio.d3.javafx.julien;
}