import java.applet.*;
import java.awt.*;
import java.awt.event.*;


/*
 <applet code="Calculator" width=1000 height = 800>
 </applet>
 */

public class Calculator extends Applet implements ActionListener{
    Button Add;
    Button sub;
    Button mul ;
    Button div;
    TextField op1, op2;
    Label l1, l2, lr, lh, result;
    public void init()
    {
        setLayout(new FlowLayout());

        lh = new Label("Calculator");

         Add = new Button("Add");
         Add.setBounds(1000, 500, 100, 50);
         sub = new Button("sub");
         mul = new Button("mul");
         div = new Button("div");
        
        l1 = new Label("operand 1 : ");
       op1 = new TextField("0",10);
       l2 = new Label("operand 2 ");
       op2  = new TextField("0",10);
       lr = new Label("Result : ");
       result = new Label("0");

        add(lh);

        add(l1);
        add(op1);
        add(l2);
        add(op2);
        add(lr);
        add(result);

        add(Add);
        add(sub);
        add(mul);
        add(div);

        Add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        String o1, o2;
        o1 = op1.getText();
        o2 = op2.getText();

        if(!o1.isEmpty() && !o2.isEmpty())
        {
            if(e.getActionCommand().equals("Add"))
            {
                result.setText(Integer.toString(Integer.parseInt(o1)+Integer.parseInt(o2)));
            }
            else if(e.getActionCommand().equals("sub"))
            {
                result.setText(Integer.toString(Integer.parseInt(o1)-Integer.parseInt(o2)));
            }
            else if(e.getActionCommand().equals("mul"))
            {
                result.setText(Integer.toString(Integer.parseInt(o1)*Integer.parseInt(o2)));
            }
            else if(e.getActionCommand().equals("div"))
            {
                if(Integer.parseInt(o2)==0)
                {
                    result.setText("Connot divide by Zero");
                }
                else{
                    result.setText(Integer.toString(Integer.parseInt(o1)/Integer.parseInt(o2)));
                }
                
            }
        }
        else{
            result.setText("invalid input");
        }
    }
}