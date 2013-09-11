/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.telcomp.terminal;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.Date;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author javier
 */
@ManagedBean
@SessionScoped
public class TerminalController {

    private ControlJslee cj;

    public TerminalController() {
        cj = new ControlJslee();
    }

    public String setCSS(String content, String color) {
        String showTerminal = "<a style=\"color: " + color + "; font-weight: 600;\">" + content + "</a>";
        return showTerminal;
    }
    
    public String addSpace(int n){
        String space = "";
        for (int i = 0; i < n; i++) {
            space = space + "&nbsp;";
        }
        return space;
    }
            

    public String handleCommand(String command, String[] params) {
        if (command.equals("help")) {
            String rm = "\"rm\"" + addSpace(10) + "Allows you to delete a service deployed, rm &lt;Service name&gt;";
            String show = "\"show\"" + addSpace(6) + "Shows you all the deployed services";
            String erase = "\"erase\"" + addSpace(5) + "Removes all deployed services, rm &lt;Service name&gt;";
            String find = "\"find\"" + addSpace(8) + "Finds a deployed service, find &lt;Service name&gt;";
            String content = rm + "<br />" + erase + "<br />" + show + "<br />" + find ;
            String showTerminal = setCSS(content, "orange");
            return showTerminal;
        } else if (command.equals("rm")) {
            if (params.length > 0) {
                boolean remove = cj.removeService(params[0]);
                String tResult = setCSS(params[0] + " deleted.", "green");
                String fResult = setCSS(params[0] + " service not found.", "red");
                String result = remove ? tResult : fResult;
                return result;
            } else {
                return params[0] + "not found.";
            }
        } else if (command.equals("find")) {
            if (params.length > 0) {
                boolean remove = cj.findService(params[0]);
                String tResult = setCSS(params[0] + " service exists", "green");
                String fResult = setCSS(params[0] + " service not found.", "red");
                String result = remove ? tResult : fResult;
                return result;
            } else {
                return params[0] + "not found.";
            }
        } else if (command.equals("date")) {
            return new Date().toString();
        } else if (command.equals("show")) {
            return setCSS("" + cj.searchAll(), "black");
        } else if (command.equals("erase")) {
            return setCSS("" + cj.removeAll(), "blue");
        } else {
            return command + " not found";
        }
    }
}
