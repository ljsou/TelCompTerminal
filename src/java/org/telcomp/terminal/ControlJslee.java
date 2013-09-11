/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.telcomp.terminal;

import java.util.ArrayList;
import java.util.List;
import webservice.JSLEEorchestrator_Service;

/**
 *
 * @author javier
 */
public class ControlJslee {

    public ControlJslee() {
    }

    private static boolean deleteServiceOnJSLEE(java.lang.String arg0) {
        System.out.println("Service Name to delete: " + arg0);
        webservice.JSLEEorchestrator_Service deleteService = new JSLEEorchestrator_Service();
        return deleteService.getJSLEEorchestratorPort().deleteService(arg0);
    }

    private static boolean searchServiceOnJSLEE() {
        boolean exist = false;
        System.out.println("Searching... ");
        webservice.JSLEEorchestrator_Service deleteService = new JSLEEorchestrator_Service();
        List<String> deployedServices = deleteService.getJSLEEorchestratorPort().getDeployedServices();
        for (String service : deployedServices) {
            System.out.println(service);
        }
        return exist;
    }

    private static String setJsonGraphToJSEEOrchestrate(java.lang.String arg0, String name) {
        System.out.println("setJsonGraph " + arg0);
        webservice.JSLEEorchestrator_Service jslees = new JSLEEorchestrator_Service();
        return jslees.getJSLEEorchestratorPort().orchestrateService(arg0, name, true);
    }

    public boolean removeService(String serviceName) {
        System.out.println("Removing service: " + serviceName);
        return deleteServiceOnJSLEE(serviceName);
    }
    
    public void removeAll(){
        
    }
    
    public void searchAll(){
        System.out.println("Search all...");
        searchServiceOnJSLEE();
    }
}
