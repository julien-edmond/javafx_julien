module sio.d3.javafx.julienr {
    requires javafx.controls;
    requires javafx.fxml;

    //Gestion de la BDD
    requires java.persistence;
    requires java.sql;
    requires org.hibernate.orm.core;


    opens sio.d3.javafx.julienr to javafx.fxml;
    exports sio.d3.javafx.julienr;
}