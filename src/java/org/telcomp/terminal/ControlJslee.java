/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.telcomp.terminal;

import java.util.ArrayList;
import java.util.Iterator;
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

    private static List<String> searchServicesOnJSLEE() {
        boolean exist = false;
        System.out.println("Searching... ");
        webservice.JSLEEorchestrator_Service deleteService = new JSLEEorchestrator_Service();
        List<String> deployedServices = deleteService.getJSLEEorchestratorPort().getDeployedServices();
        return deployedServices;
    }

    private static boolean searchServiceOnJSLEE(java.lang.String arg0) {
        boolean exist = false;
        System.out.println("Searching... ");
        webservice.JSLEEorchestrator_Service deleteService = new JSLEEorchestrator_Service();
        List<String> deployedServices = deleteService.getJSLEEorchestratorPort().getDeployedServices();
        for (Iterator<String> it = deployedServices.iterator(); it.hasNext();) {
            String string = it.next();
            if (string.equalsIgnoreCase(arg0)){
                return true;
            }
        }
        return false;
    }

    private static boolean deleteAllServicesOnJSLEE() {
        boolean result = false;
        System.out.println("Searching... ");
        webservice.JSLEEorchestrator_Service deleteService = new JSLEEorchestrator_Service();
        List<String> deployedServices = deleteService.getJSLEEorchestratorPort().getDeployedServices();
        for (Iterator<String> it = deployedServices.iterator(); it.hasNext();) {
            String string = it.next();
            result = deleteServiceOnJSLEE(string);
        }
        return result;
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

    public String removeAll() {
        String remove = deleteAllServicesOnJSLEE() ? "Services deleted" : "Services were not eliminated";
        return remove;
    }

    public List<String> searchAll() {
        System.out.println("Search all...");
        return searchServicesOnJSLEE();
    }

    public boolean findService(String serviceName) {
        return searchServiceOnJSLEE(serviceName);
    }
}
