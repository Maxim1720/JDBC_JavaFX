module ru.trankwilizator.jdbc_project {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires java.sql;
    requires lombok;

    opens ru.trankwilizator.jdbc_project to javafx.fxml;
    opens ru.trankwilizator.jdbc_project.controller to javafx.fxml;
    opens ru.trankwilizator.jdbc_project.model to javafx.fxml;

    exports ru.trankwilizator.jdbc_project.model;
    exports ru.trankwilizator.jdbc_project;
    exports ru.trankwilizator.jdbc_project.controller to javafx.fxml;
}