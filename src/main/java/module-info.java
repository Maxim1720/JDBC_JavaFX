module ru.trankwilizator.jdbc_project {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
            requires com.dlsc.formsfx;
                        
    opens ru.trankwilizator.jdbc_project to javafx.fxml;
    exports ru.trankwilizator.jdbc_project;
}