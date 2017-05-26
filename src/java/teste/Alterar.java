/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import javax.faces.component.UICommand;
import javax.faces.component.UIComponent;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

/**
 *
 * @author Win7
 */

public class Alterar implements ActionListener{

    /**
     * Creates a new instance of Alterar
     */
    public Alterar() {
    }

    @Override
    public void processAction(ActionEvent ae){
        UICommand c = (UICommand)ae.getComponent();
        c.getAttributes().put("style", "font-size:100px");
    }
    public void process(UIComponent ui){
        ui.getAttributes().put("style", "font-size:100px;color:red");
    }
}
