package cps.clients.controllers.employee;

import cps.utilities.ConstsEmployees;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

// TODO: Auto-generated Javadoc
/**
 * The Class CustomerServiceEnteryController.
 */
public class CustomerServiceEnteryController  extends EmployeeBaseController{

	@FXML
    private Label Headline;
	
    /**
     * On manage complaints.
     *Set the scene where Customer service employee can manage the complaints 
     * @param event the event
     */
    @FXML
    void OnManageComplaints(ActionEvent event) 
    {
    	myControllersManager.SetScene(ConstsEmployees.ManageComplaints, ConstsEmployees.CustomerServiceEntery);
    }

    /**
     * On save parking spot.
     *Set the scene where Customer service employee reserve a parking spot 
     * @param event the event
     */
    @FXML
    void OnSaveParkingSpot(ActionEvent event) 
    {
    	myControllersManager.SetScene(ConstsEmployees.ReserveParkingSpot, ConstsEmployees.CustomerServiceEntery);

    }
    
    /**
     * On back.
     *Sets the Previews scene
     * @param event the event
     */
    @FXML
    void OnBack(ActionEvent event) 
    {
	LogOut();
	
    	myControllersManager.Back(PreviousScene,ConstsEmployees.ParkingLotWorkerEntery );
    }
    
    /**
     * On manage customer.
     *Set the scene where Customer service employee can do some changes in the customer account
     * @param event the event
     */
    @FXML
    void OnManageCustomer(ActionEvent event) 
    {
    	myControllersManager.SetScene(ConstsEmployees.ManageCustomer, ConstsEmployees.CustomerServiceEntery);

    }
    
}
