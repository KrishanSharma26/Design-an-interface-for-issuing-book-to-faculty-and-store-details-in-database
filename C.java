import java.awt.*;  
import java.awt.event.*;  
import java.applet.*;  
/*
<applet code="C.class" height = 300 width=400>
</applet> */
public class C extends Applet implements ActionListener  
{  
    TextField t1 = new TextField(10);  
    TextField t2 = new TextField(10);  
    TextField t3 = new TextField(10);  
    Label l1 = new Label("Student name=:");  
    Label l2 = new Label("Book no:");  
    Label l3 = new Label("Reg. id:");  
    Button b = new Button("submit");  
    Button b1 = new Button("cancel"); 
    public void init()  
    {  
        t1.setForeground(Color.RED);  
        add(l1);  
        add(t1);  
        add(l2);  
        add(t2);  
        add(l3);  
        add(t3);  
        add(b);  
        add(b1);
        b.addActionListener(this);  
         b1.addActionListener(this); 
    }  
    public void actionPerformed(ActionEvent e)  
    {  
        if(e.getSource() == b)  
        {  
           // String n1=sc.nextLine(t1.getText());  
            int n2 = Integer.parseInt(t2.getText());  
             
        } 
        
} 
}