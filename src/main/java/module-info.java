module org.csc325.module5labp1.module5colorchooser {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.csc325.module5labp2.module5colorchooser to javafx.fxml;
    exports org.csc325.module5labp2.module5colorchooser;
}