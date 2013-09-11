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

    public String handleCommand(String command, String[] params) {
        if (command.equals("help")) {
            String content = "\"rm\"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Allows you to delete a service deployed, rm &lt;Service name&gt;";
            String showTerminal = setCSS(content, "brown");
            return showTerminal;
        } else if (command.equals("date")) {
            return new Date().toString();
        } else if (command.equals("rm")) {
            if (params.length > 0) {
                boolean remove = cj.removeService(params[0]);
                String tResult = setCSS(params[0] + " deleted.", "chartreuse");
                String fResult = setCSS(params[0] + " not found.", "red");
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
