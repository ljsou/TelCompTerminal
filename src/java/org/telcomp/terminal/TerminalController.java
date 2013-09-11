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

    public String handleCommand(String command, String[] params) {
        if (command.equals("help")) {

            String content = "\"rm\"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Allows you to delete a service deployed, rm &lt;Service name&gt;";
            String showTerminal = "<a style=\"color: brown; font-weight: 700;\">" + content + "</a>";
            return showTerminal;
           
        } else if (command.equals("date")) {
            return new Date().toString();
        } else if (command.equals("rm")) {
            if (params.length > 0) {
                boolean remove = cj.removeService(params[0]);
                String tResult = "<a style=\"color: chartreuse; font-weight: 700;\">" + params[0] + " deleted." + "</a>";
                String fResult = "<a style=\"color: red; font-weight: 700;\">" + params[0] + " not found." + "</a>";
                String result = remove ? tResult : fResult;
                return result;
            } else {
                return params[0] + "not found.";
            }

        } else {
            return command + " not found";
        }
    }
}
