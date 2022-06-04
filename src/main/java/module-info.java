module com.oubari.tpjdbc4 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.oubari.tpjdbc4 to javafx.fxml;
    exports com.oubari.tpjdbc4;
}