import java.awt.*;
import java.awt.event.*;
class CelFahr implements ActionListener{
Frame f;
Font ff;
Label l1,l2;
TextField t1,t2;
Button b1,b2,b3;
CelFahr(){
f=new Frame();
f.setBackground(Color.CYAN);
f.setLayout(null);
ff=new Font("Times new Roman",Font.BOLD,20);
l1=new Label("CELSIUS");
l1.setBounds(100,80,200,50);
f.add(l1);
l1.setFont(ff);

t1=new TextField(10);
t1.setBounds(80,130,160,30);
f.add(t1);
t1.setFont(ff);

l2=new Label("FAHRENHEIT");
l2.setBounds(100,180,200,50);
f.add(l2);
l2.setFont(ff);

t2=new TextField(10);
t2.setBounds(80,230,160,30);
f.add(t2);
t2.setFont(ff);

b1=new Button("Calculate C to F");
b1.setBounds(30,330,320,50);
f.add(b1);
b1.setFont(ff);

b2=new Button("Calculate F to C");
b2.setBounds(30,430,320,50);
f.add(b2);
b2.setFont(ff);

b3=new Button("REFRESH");
b3.setBounds(120,520,100,20);
f.add(b3);
b3.setFont(ff);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);

f.setSize(400,600);
f.setVisible(true);
}

public void actionPerformed(ActionEvent e){
if(e.getSource()==b1){
double x=Double.parseDouble(t1.getText());
t2.setText(String.valueOf( (x)*(1.8)+32) );
	}


else if(e.getSource()==b2){
double x=Double.parseDouble(t2.getText());
t1.setText(String.valueOf((x-32)*0.5));
}


else if(e.getSource()==b3){
t1.setText("");
t2.setText("");

}
}
public static void main(String[] args){
CelFahr obj=new CelFahr();
}


}