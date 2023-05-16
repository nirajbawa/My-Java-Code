import java.applet.*;
import java.awt.*;

/*
    <applet code="p_5_adding_controls" width="500" height="500">
    </applet>
 */

public class p_5_adding_controls extends Applet{
    Button button = new Button("click me");
    TextField textField = new TextField("hello");
    Checkbox checkbox1 = new Checkbox("java");
    Checkbox checkbox2 = new Checkbox("python");
    CheckboxGroup cbg = new CheckboxGroup();
    Checkbox cb1 = new Checkbox("Male", cbg, false);
    Checkbox cb2 = new Checkbox("Female", cbg, true);
    public void init()
    {
        add(button);
        add(textField);
        add(checkbox1);
        add(checkbox2);
        add(cb1);
        add(cb2);
        
    }
}