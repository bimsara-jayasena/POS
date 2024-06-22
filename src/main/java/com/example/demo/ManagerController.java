package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;

public class ManagerController {

    @FXML
    private Pane dashboard;
    @FXML
    private Pane inventory;

    @FXML
    private Pane paneAccount;

    @FXML
    private Pane paneSells;






    public void btnDashboardActionPerformed(ActionEvent event){
            show(dashboard);
    }
    public void btnSellsActionPerformed(ActionEvent event){
        show(paneSells);
    }
    public void btnInventoryActionPerformed(ActionEvent event){
       show(inventory);


    }
    public void btnAccountActionPerformed(ActionEvent event){
       show(paneAccount);
    }
    public void btnSettingsActionPerformed(ActionEvent event){

    }

    public void show(Pane element){

        dashboard.setVisible(false);
        paneSells.setVisible(false);
        paneAccount.setVisible(false);
        inventory.setVisible(false);

        element.setVisible(true);
    }
}
