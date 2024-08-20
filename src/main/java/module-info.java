module br.edu.ifpr.ads.visao.simujavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens br.edu.ifpr.ads.visao to javafx.fxml;
    exports br.edu.ifpr.ads.visao;
}