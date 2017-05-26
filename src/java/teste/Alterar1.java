/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import javax.faces.component.UICommand;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

/**
 *
 * @author Win7
 */
public class Alterar1 implements ActionListener{

    @Override
    public void processAction(ActionEvent ae) throws AbortProcessingException {
        UICommand c = (UICommand)ae.getComponent();
        c.getAttributes().put("style", "color:red");
        Alterar alt = new Alterar();
        alt.process(c);
        //alt.processAction(ae);
    }
    
}
