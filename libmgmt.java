import java.awt.*;                                              
import java.awt.event.*;
import java.awt.font.*; 
import javax.swing.*;
import java.sql.*;

class libmgmt implements ActionListener
{
	Frame f;
	Frame f1;
	Frame fm;
	Frame fm2;
	Frame fm3;
	Frame fm4;
	Frame fm5;
	Frame fm6;
	Frame fm7;
	Frame fm8;
        Frame fm9;
      

       
	
	JTextField t1=new JTextField(30);
	JPasswordField t2=new JPasswordField(30);
	JLabel la1;
        JTextField tf1=new JTextField(10);
	JTextField tf2=new JTextField(20);
	JTextField tf3=new JTextField(20);	
	JTextField tf4=new JTextField(40);
	JTextField tf5=new JTextField(40);
	JTextField tf6=new JTextField(30);
	JTextField tf7=new JTextField(15);
	JTextField tf8=new JTextField(10);
	JTextField tf9=new JTextField(10);

	JTextField tf10=new JTextField(20);
	JTextField tf11=new JTextField(15);
	JTextField tf12=new JTextField(40);
	JTextField tf13=new JTextField(20);
	JTextField tf14=new JTextField(5);

	JTextField tf15=new JTextField(50);
	JTextField tf16=new JTextField(50);
	JTextField tf17=new JTextField(50);
	JTextField tf18=new JTextField(50);

	JTextField tf19=new JTextField(50);
	JTextField tf20=new JTextField(50);
	JTextField tf21=new JTextField(50);
	JTextField tf22=new JTextField(50);
	JTextField tf23=new JTextField(50);
	JTextField tf24=new JTextField(50);
	
	JTextField tf25=new JTextField(10);
	JTextField tf26=new JTextField(10);
	JTextField tf27=new JTextField(50);
	JTextField tf28=new JTextField(50);
	JTextField tf29=new JTextField(50);
	JTextField tf30=new JTextField(50);
	JTextField tf31=new JTextField(50);
	JTextField tf32=new JTextField(50);
	JTextField tf33=new JTextField(50);
	String user="library";
	String pass="books";
	
	public libmgmt()
	{
		try
		{
			PreparedStatement p1;
            			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            			Connection con=DriverManager.getConnection("jdbc:odbc:my_database");
				System.out.println("**DataBase Connection Established**");
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
	}

	public void c()
	{
		f1=new Frame("Login");
		JLabel h=new JLabel("Please Login To Continue");
		JLabel la1=new JLabel("Username");
		JLabel la2=new JLabel("Password");
		JButton b=new JButton("Submit");
		JLabel l = new JLabel(new ImageIcon("black1.jpg"));
		l.setLayout(null);
		f1.add(l);
		JLabel ll = new JLabel(new ImageIcon("images[10].jpg"));
		l.setSize(1366,768);
		ll.setBounds(860,180,260,260);
		b.addActionListener(this);
		b.setBackground(Color.BLUE);
		b.setForeground(Color.WHITE);
		f1.setLayout(null);
		h.setBounds(350,20,900,80);
		la1.setBounds(380,250,250,40);
		la1.setForeground(Color.WHITE);
		la2.setBounds(380,330,250,40);
		la2.setForeground(Color.WHITE);
		t1.setBounds(590,250,250,40);
		t1.setForeground(Color.BLACK);
		t2.setBounds(590,330,250,40);
		t2.setForeground(Color.BLACK);
		b.setBounds(580,480,200,50);
		l.add(la1);
		l.add(t1);
		l.add(la2);
		l.add(t2);
		l.add(b);
		l.add(h);
		l.add(ll);
		f1.setSize(1366,768);
		f1.setVisible(true);
		f1.setLayout(null);
		Font ff1=new Font("Lucida Handwriting",Font.PLAIN,30);
		Font ff=new Font("Harrington",Font.PLAIN,50);
		h.setFont(ff);
		la1.setFont(ff1);
		la2.setFont(ff1);
    		t1.setFont(ff1);
		t2.setFont(ff1);
                b.setFont(ff1);
		h.setForeground(Color.WHITE);
		f1.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent we){f1.dispose();}});		
	}
	public void actionPerformed(ActionEvent ae)
	{
		System.out.println("Button"  + " "+ ae.getActionCommand() +  " pressed.");
	
		if(ae.getActionCommand().equals("Exit"))
		{
			System.exit(0);
		}
		if(ae.getActionCommand().equals("Submit"))
		{	
			String u=t1.getText();
			String pa=t2.getText();
			if(u.equals(user) && pa.equals(pass))
			{
				f1.setVisible(false);
				f = new Frame("Library");
				JLabel la1=new JLabel("Tech Careers Library");
				la1.setBounds(220,250,1200,130);
				f.add(la1);
                              if(ae.getActionCommand().equals("Exit"))
		               {
			           System.exit(0);
                               }
				JLabel l = new JLabel(new ImageIcon("black1.jpg"));
				Font f1=new Font("Harrington",Font.BOLD,90);
				la1.setFont(f1);
				la1.setForeground(Color.WHITE);
				f.add(l);
				l.add(la1);
				MenuBar mb = new MenuBar(); 
				Menu m1 = new Menu("Manage");
				Menu m2=new Menu("Options");
				MenuItem mi1 = new MenuItem("Book Entry");
				MenuItem mi2 = new MenuItem("Member Entry");
				MenuItem mi3 = new MenuItem("Issue Book");
				MenuItem mi4 = new MenuItem("Return Book");
				MenuItem mi5 = new MenuItem("Exit");
				MenuItem mi6=new MenuItem("Remove Book");
				MenuItem mi7=new MenuItem("Remove Member");
				MenuItem mi8=new MenuItem("Update Book Details");
				MenuItem mi9=new MenuItem("Update Member Details");
				MenuItem mi10=new MenuItem("Show Book Details");
                             
                                mi1.addActionListener(this);
				mi2.addActionListener(this);
				mi3.addActionListener(this);
				mi4.addActionListener(this);
				mi5.addActionListener(this);
				mi6.addActionListener(this);
				mi7.addActionListener(this);
				mi8.addActionListener(this);
				mi9.addActionListener(this);
				mi10.addActionListener(this);
				
                                  
				f.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent we){f.dispose();}});
				m1.add(mi1);
				m1.add(mi2);
				m1.add(mi3);
				m1.add(mi4);
				m1.addSeparator();
				m1.add(mi5);
				m2.add(mi6);
				m2.add(mi7);
				m2.add(mi8);
				m2.add(mi9);
				m2.add(mi10);
                                
				mb.add(m1);
				mb.add(m2);
				f.setLayout(null);
				l.setSize(1366,740);
				f.setSize(1366,768);
				f.setMenuBar(mb);
				f.setVisible(true);
			}
			else
			{
				System.out.println("Incorrect username or password");	
				Frame fm=new Frame("Dialog");
				JDialog d=new JDialog();
				d.setUndecorated(true);
				JOptionPane.showMessageDialog(fm,"Incorrect username or password !");
				d.setVisible(true);
			}
		}
		
		if(ae.getActionCommand().equals("Book Entry"))
		{
			fm=new Frame("Add Books");
			JLabel l=new JLabel(new ImageIcon("black1.jpg"));
			fm.add(l);
			JButton b1=new JButton("Add Book");
			JButton b2=new JButton("Refresh");
			JLabel lb1=new JLabel("Book Number");
			JLabel lb2=new JLabel("ISBN Number");
			JLabel lb3=new JLabel("Subject");
			JLabel lb4=new JLabel("Name of Book");
			JLabel lb5=new JLabel("Author");
			JLabel lb6=new JLabel("Publisher");
			JLabel lb7=new JLabel("Edition");
			JLabel lb8=new JLabel("Copies");
			JLabel lb9=new JLabel("Cost");
			lb1.setBounds(410,80,320,30);
			lb2.setBounds(410,130,320,30);
			lb3.setBounds(410,180,320,30);	
			lb4.setBounds(410,230,320,30);
			lb5.setBounds(410,280,320,30);
			lb6.setBounds(410,330,320,20);
			lb7.setBounds(410,380,320,30);
			lb8.setBounds(410,430,320,30);
			lb9.setBounds(410,480,320,30);
			tf1.setBounds(680,80,250,30);
			tf2.setBounds(680,130,250,30);
			tf3.setBounds(680,180,250,30);
			tf4.setBounds(680,230,250,30);
			tf5.setBounds(680,280,250,30);
			tf6.setBounds(680,330,250,30);
			tf7.setBounds(680,380,250,30);
			tf8.setBounds(680,430,250,30);
			tf9.setBounds(680,480,250,30);
			b1.setBounds(500,650,170,40);
			b2.setBounds(700,650,170,40);
			b1.addActionListener(this);
			b2.addActionListener(this);
			fm.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent we){fm.dispose();}});
			fm.add(l);
			l.add(lb1);
			l.add(tf1);
			l.add(lb2);
			l.add(tf2);
			l.add(lb3);
			l.add(tf3);
			l.add(lb4);
			l.add(tf4);
			l.add(lb5);
			l.add(tf5);
			l.add(lb6);
			l.add(tf6);
			l.add(lb7);
			l.add(tf7);
			l.add(lb8);
			l.add(tf8);
			l.add(lb9);
			l.add(tf9);
			l.add(b1);
			l.add(b2);		
			l.setSize(1366,740);
			fm.setLayout(null);
			fm.setSize(1366,768);
			lb1.setForeground(Color.WHITE);
			tf1.setForeground(Color.BLACK);
			lb2.setForeground(Color.WHITE);
			tf2.setForeground(Color.BLACK);
			lb3.setForeground(Color.WHITE);
			tf3.setForeground(Color.BLACK);
			tf4.setForeground(Color.BLACK);
			lb4.setForeground(Color.WHITE);
			lb5.setForeground(Color.WHITE);
			tf5.setForeground(Color.BLACK);
			lb6.setForeground(Color.WHITE);
			tf6.setForeground(Color.BLACK);
			lb7.setForeground(Color.WHITE);
			tf7.setForeground(Color.BLACK);
			lb8.setForeground(Color.WHITE);
			tf8.setForeground(Color.BLACK);
			lb9.setForeground(Color.WHITE);
			tf9.setForeground(Color.BLACK);
			b1.setForeground(Color.WHITE);
			b2.setForeground(Color.WHITE);
			b1.setBackground(Color.BLUE);
			b2.setBackground(Color.BLUE);
			
			Font fff=new Font("Lucida Handwriting",Font.PLAIN,20);
			l.setFont(fff);
			lb1.setFont(fff);
			lb2.setFont(fff);
			lb3.setFont(fff);
			lb4.setFont(fff);
			lb5.setFont(fff);
			lb6.setFont(fff);
			lb7.setFont(fff);
			lb8.setFont(fff);
			lb9.setFont(fff);
			tf1.setFont(fff);
			tf2.setFont(fff);
			tf3.setFont(fff);
			tf4.setFont(fff);
			tf5.setFont(fff);
			tf6.setFont(fff);
			tf7.setFont(fff);
			tf8.setFont(fff);
			tf9.setFont(fff);
			b1.setFont(fff);
			b2.setFont(fff);
		
			fm.setVisible(true);
			//fm.setLocationRelativeTo(null);
				
		}
		if(ae.getActionCommand().equals("Add Book"))
		{

			String b=tf1.getText();
			String i=tf2.getText();
			String s=tf3.getText();
			String n=tf4.getText();
			String a=tf5.getText();
			String pu=tf6.getText();
			String e=tf7.getText();
			String c=tf8.getText();
			String co=tf9.getText();
			if(b.equals(""))
			{
				System.out.println("Enter book number");
				Frame fr1=new Frame("Dialog");
				JDialog d=new JDialog();
				d.setUndecorated(true);
				JOptionPane.showMessageDialog(fr1,"Enter the book number !");
				d.setVisible(true);
			}
			else
			if(i.equals(""))
			{
				System.out.println("Enter ISBN number");
				Frame fr2=new Frame("Dialog");
				JDialog d=new JDialog();
				d.setUndecorated(true);
				JOptionPane.showMessageDialog(fr2,"Enter the ISBN number !");
				d.setVisible(true);
			}
			else if(s.equals(""))
			{
				System.out.println("Enter subject");
				Frame fr3=new Frame("Dialog");
				JDialog d=new JDialog();
				d.setUndecorated(true);
				JOptionPane.showMessageDialog(fr3,"Enter subject !");
				d.setVisible(true);
			}
			else
			if(n.equals(""))
			{
				System.out.println("Enter name of book");
				Frame fr4=new Frame("Dialog");
				JDialog d=new JDialog();
				d.setUndecorated(true);
				JOptionPane.showMessageDialog(fr4,"Enter name of book !");
				d.setVisible(true);
			}
			else
			if(a.equals(""))
			{
				System.out.println("Enter author");
				Frame fr5=new Frame("Dialog");
				JDialog d=new JDialog();
				d.setUndecorated(true);
				JOptionPane.showMessageDialog(fr5,"Enter author !");
				d.setVisible(true);
			}
			else if(pu.equals(""))
			{
				System.out.println("Enter publisher");
				Frame fr6=new Frame("Dialog");
				JDialog d=new JDialog();
				d.setUndecorated(true);
				JOptionPane.showMessageDialog(fr6,"Enter publisher !");
				d.setVisible(true);
			}
			else
			if(e.equals(""))
			{
				System.out.println("Enter edition");
				Frame fr7=new Frame("Dialog");
				JDialog d=new JDialog();
				d.setUndecorated(true);
				JOptionPane.showMessageDialog(fr7,"Enter edition !");
				d.setVisible(true);
			}
			else
			if(c.equals(""))
			{
				System.out.println("Enter copies");
				Frame fr8=new Frame("Dialog");
				JDialog d=new JDialog();
				d.setUndecorated(true);
				JOptionPane.showMessageDialog(fr8,"Enter copies !");
				d.setVisible(true);
			}
			else
			if(co.equals(""))
			{
				System.out.println("Enter cost");
				Frame fr9=new Frame("Dialog");
				JDialog d=new JDialog();
				d.setUndecorated(true);
				JOptionPane.showMessageDialog(fr9,"Enter cost !");
				d.setVisible(true);
			}
			else 
			{
				try
				{
					Connection con=DriverManager.getConnection("jdbc:odbc:my_database");
					PreparedStatement  p=con.prepareStatement("insert into book_entry values(?,?,?,?,?,?,?,?,?)");
					p.setString(1,b);
					p.setInt(2,Integer.parseInt(i));
					p.setString(3,s);
					p.setString(4,n);
					p.setString(5,a);
					p.setString(6,pu);
					p.setString(7,e);
					p.setInt(8,Integer.parseInt(c));
					p.setInt(9,Integer.parseInt(co));
					p.executeUpdate();
					System.out.println("Data Entered Successfully !");
					Frame fm=new Frame("Dialog");
					JDialog d=new JDialog();
					d.setUndecorated(true);
					JOptionPane.showMessageDialog(fm,"Data entered successfully !");
					d.setVisible(true);
				}
				catch(Exception e1)
				{
					System.out.println(e1);
					Frame fr5=new Frame("Dialog");
					JDialog d=new JDialog();
					d.setUndecorated(true);
					JOptionPane.showMessageDialog(fr5,"Error !");
					d.setVisible(true);
				}
			}
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
			tf4.setText("");
			tf5.setText("");
			tf6.setText("");
			tf7.setText("");
			tf8.setText("");
			tf9.setText("");
			tf10.setText("");
			tf11.setText("");
			tf12.setText("");
			tf13.setText("");
			tf14.setText("");
			tf15.setText("");
			tf16.setText("");
			tf17.setText("");
			tf18.setText("");
			tf19.setText("");
			tf20.setText("");
			tf21.setText("");
			tf22.setText("");
			tf23.setText("");
			tf24.setText("");
		}
		if(ae.getActionCommand().equals("Member Entry"))
		{		
			fm2=new Frame("Register Yourself");
			JLabel l=new JLabel(new ImageIcon("black1.jpg"));
			fm2.add(l);
			l.setSize(1366,740);
			JLabel lb1=new JLabel("Student Id");
			JLabel lb2=new JLabel("Roll Number");
			JLabel lb3=new JLabel("Name");
			JLabel lb4=new JLabel("Branch");
			JLabel lb5=new JLabel("Year");
			JButton b1=new JButton("Add Member");
			JButton b2=new JButton("Refresh");
			lb1.setBounds(410,100,320,30);
			lb2.setBounds(410,170,320,30);
			lb3.setBounds(410,240,320,30);
			lb4.setBounds(410,310,320,30);
			lb5.setBounds(410,380,320,30);
			tf10.setBounds(680,100,250,50);
			tf11.setBounds(680,170,250,50);
			tf12.setBounds(680,240,250,50);
			tf13.setBounds(680,310,250,50);
			tf14.setBounds(680,380,250,50);
			b1.setBounds(400,600,260,40);
			b2.setBounds(750,600,260,40);
			b1.addActionListener(this);
			b2.addActionListener(this);
			fm2.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent we){fm2.dispose();}});
			l.add(lb1);
			l.add(tf10);
			l.add(lb2);
			l.add(tf11);
			l.add(lb3);
			l.add(tf12);
			l.add(lb4);
			l.add(tf13);
			l.add(lb5);
			l.add(tf14);
			l.add(b1);
			l.add(b2);
			lb1.setForeground(Color.WHITE);
			tf10.setForeground(Color.BLACK);
			lb2.setForeground(Color.WHITE);
			tf11.setForeground(Color.BLACK);
			lb3.setForeground(Color.WHITE);
			tf12.setForeground(Color.BLACK);
			tf13.setForeground(Color.BLACK);
			lb4.setForeground(Color.WHITE);
			lb5.setForeground(Color.WHITE);
			tf14.setForeground(Color.BLACK);
			b1.setForeground(Color.WHITE);
			b2.setForeground(Color.WHITE);
			b1.setBackground(Color.BLUE);
			b2.setBackground(Color.BLUE);
			Font ff=new Font("Lucida Handwriting",Font.PLAIN,30);
			Font ff1=new Font("Lucida Handwriting",Font.PLAIN,20);
			lb1.setFont(ff);
			lb2.setFont(ff);
			lb3.setFont(ff);
  			lb4.setFont(ff);
			lb5.setFont(ff);
			tf10.setFont(ff1);
			tf11.setFont(ff1);
			tf12.setFont(ff1);
			tf13.setFont(ff1);
			tf14.setFont(ff1);
			b1.setFont(ff);
			b2.setFont(ff);
			fm2.setLayout(null);
			fm2.setSize(1366,768);
			fm2.setVisible(true);
		}
		if(ae.getActionCommand().equals("Add Member"))
		{
			String si=tf10.getText();
			String r=tf11.getText();
			String na=tf12.getText();
			String b=tf13.getText();
			String y=tf14.getText();
			if(si.equals(""))
			{
				System.out.println("Enter Student id");
				Frame fr1=new Frame("Dialog");
				JDialog d=new JDialog();
				d.setUndecorated(true);
				JOptionPane.showMessageDialog(fr1,"Enter Student Id !");
				d.setVisible(true);
			}
			else if(r.equals(""))
			{
				System.out.println("Enter Roll number");
				Frame fr2=new Frame("Dialog");
				JDialog d=new JDialog();
				d.setUndecorated(true);
				JOptionPane.showMessageDialog(fr2,"Enter Roll number !");
				d.setVisible(true);
			}
			else if(na.equals(""))
			{
				System.out.println("Enter Name");
				Frame fr3=new Frame("Dialog");
				JDialog d=new JDialog();
				d.setUndecorated(true);
				JOptionPane.showMessageDialog(fr3,"Enter Name !");
				d.setVisible(true);
			}
			else if(b.equals(""))
			{
				System.out.println("Enter branch");
				Frame fr4=new Frame("Dialog");
				JDialog d=new JDialog();
				d.setUndecorated(true);
				JOptionPane.showMessageDialog(fr4,"Enter branch !");
				d.setVisible(true);
			}	
			else if(y.equals(""))
			{	
				System.out.println("Enter year");
				Frame fr5=new Frame("Dialog");
				JDialog d=new JDialog();
				d.setUndecorated(true);
				JOptionPane.showMessageDialog(fr5,"Enter year !");
				d.setVisible(true);
			}	
			else
			{
				try
				{
					Connection con=DriverManager.getConnection("jdbc:odbc:my_database");
					PreparedStatement  p=con.prepareStatement("insert into user_entry values(?,?,?,?,?)");
					p.setString(1,si);
					p.setInt(2,Integer.parseInt(r));
					p.setString(3,na);
					p.setString(4,b);
					p.setInt(5,Integer.parseInt(y));
					p.executeUpdate();
					System.out.println("Data Entered Successfully !");
					Frame fm=new Frame("Dialog");
					JDialog d=new JDialog();
					d.setUndecorated(true);
					JOptionPane.showMessageDialog(fm,"Data entered successfully !");
					d.setVisible(true);
				}
				catch(Exception e1)
				{
					System.out.println(e1);
					Frame fr5=new Frame("Dialog");
					JDialog d=new JDialog();
					d.setUndecorated(true);
					JOptionPane.showMessageDialog(fr5,"Error !");
					d.setVisible(true);
				}
			}
		}
		if(ae.getActionCommand().equals("Issue Book"))
		{	
			fm3=new Frame("Issue Books");
			JLabel l=new JLabel(new ImageIcon("black1.jpg"));
                        fm3.add(l);
			l.setSize(1366,740);
			JLabel l1=new JLabel("Book Number");
			JLabel l2=new JLabel("Roll Number");
			JLabel l3=new JLabel("Issue Date");
			JLabel l4=new JLabel("Due Date");
			JButton b1=new JButton("Issue");
			JButton b2=new JButton("Refresh");
			fm3.setLayout(null);
			l1.setBounds(410,100,250,50);
			l2.setBounds(410,170,250,50);
			l3.setBounds(410,240,250,50);
			l4.setBounds(410,310,250,50);
			tf15.setBounds(680,100,250,50);
			tf16.setBounds(680,170,250,50);
			tf17.setBounds(680,240,250,50);
			tf18.setBounds(680,310,250,50);
			b1.setBounds(400,450,190,50);
			b2.setBounds(700,450,190,50);
			b1.addActionListener(this);
			b2.addActionListener(this);
			fm3.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent we){fm3.dispose();}});
			l.add(l1);
			l.add(tf15);
			l.add(l2);
			l.add(tf16);
			l.add(l3);
			l.add(tf17);
			l.add(l4);
			l.add(tf18);
			l.add(b1);
			l.add(b2);
			Font f=new Font("Lucida Handwriting",Font.PLAIN,30);
			Font f1=new Font("Lucida Handwriting",Font.PLAIN,20);
			l1.setFont(f);
			l2.setFont(f);
			l3.setFont(f);
			l4.setFont(f);
			tf15.setFont(f1);
			tf16.setFont(f1);
			tf17.setFont(f1);
			tf18.setFont(f1);
			b1.setFont(f);
			b2.setFont(f);
			l1.setForeground(Color.WHITE);
			tf15.setForeground(Color.BLACK);
			l2.setForeground(Color.WHITE);
			tf16.setForeground(Color.BLACK);
			l3.setForeground(Color.WHITE);
			tf17.setForeground(Color.BLACK);
			tf18.setForeground(Color.BLACK);
			l4.setForeground(Color.WHITE);
			b1.setForeground(Color.WHITE);
			b1.setBackground(Color.BLUE);
			b2.setForeground(Color.WHITE);
			b2.setBackground(Color.BLUE);
			fm3.setSize(1366,768);
			fm3.setVisible(true);
		}
		if(ae.getActionCommand().equals("Issue"))
		{
			String b=tf15.getText();
			String r=tf16.getText();
			String is=tf17.getText();
			String du=tf18.getText();
			if(b.equals(""))
			{
				System.out.println("Enter book number");
				Frame fr1=new Frame("Dialog");
				JDialog d=new JDialog();
				d.setUndecorated(true);
				JOptionPane.showMessageDialog(fr1,"Enter the book number !");
				d.setVisible(true);
			}
			else if(r.equals(""))
			{
				System.out.println("Enter Roll number");
				Frame fr2=new Frame("Dialog");
				JDialog d=new JDialog();
				d.setUndecorated(true);
				JOptionPane.showMessageDialog(fr2,"Enter Roll number !");
				d.setVisible(true);
			}
			else if(is.equals(""))	
			{
				System.out.println("Enter subject");
				Frame fr3=new Frame("Dialog");
				JDialog d=new JDialog();
				d.setUndecorated(true);
				JOptionPane.showMessageDialog(fr3,"Enter subject !");
				d.setVisible(true);
			}
			else if(du.equals(""))
			{
				System.out.println("Enter name of book");
				Frame fr4=new Frame("Dialog");
				JDialog d=new JDialog();
				d.setUndecorated(true);
				JOptionPane.showMessageDialog(fr4,"Enter name of book !");
				d.setVisible(true);
			}	
			else
			{	
				try
				{
					Connection con=DriverManager.getConnection("jdbc:odbc:my_database");
					PreparedStatement  p=con.prepareStatement("insert into issue_of_books values(?,?,?,?)");
					p.setString(1,b);
					PreparedStatement stmt = con.prepareStatement("select bookno from book_entry where bookno='"+b+"'");
                        				stmt.execute();  
               					ResultSet resultSet = stmt.getResultSet(); 
                					boolean recordFound = resultSet.next();
                					if (recordFound) 
					{  
						System.out.println("Book found");
						System.out.println(resultSet.getString("bookno"));
						p.setInt(2,Integer.parseInt(r));
						p.setString(3,is);
						p.setString(4,du); 
						p.executeUpdate();
						System.out.println("Book Issued !");
						Frame fm=new Frame("Dialog");
						JDialog d=new JDialog();
						d.setUndecorated(true);
						JOptionPane.showMessageDialog(fm,"Book issued !");
						d.setVisible(true);
					} 
					else 
					{ 
						System.out.println("Book not in records !");
						Frame fm=new Frame("Dialog");
						JDialog d=new JDialog();
						d.setUndecorated(true);
						JOptionPane.showMessageDialog(fm,"Book not in records !");
					}
				}
				catch(Exception e1)
				{
					System.out.println(e1);
					Frame fr5=new Frame("Dialog");
					JDialog d=new JDialog();
					d.setUndecorated(true);
					JOptionPane.showMessageDialog(fr5,"Error !");
					d.setVisible(true);
				}
			}
		}
		if(ae.getActionCommand().equals("Return Book"))
		{
			fm4=new Frame("Return of Books");
			JLabel l=new JLabel(new ImageIcon("black1.jpg"));
			fm4.add(l);
			l.setSize(1366,740);
			JLabel l1=new JLabel("Book Number");
			JLabel l2=new JLabel("Roll Number");
			JLabel l3=new JLabel("Issue Date");
			JLabel l4=new JLabel("Due Date");
			JLabel l5=new JLabel("Return Date");
			JLabel l6=new JLabel("Fine");
			JButton b1=new JButton("Return");
			JButton b2=new JButton("Refresh");
			fm4.setLayout(null);
			l1.setBounds(410,130,320,30);
			l2.setBounds(410,180,320,30);
			l3.setBounds(410,230,320,30);	
			l4.setBounds(410,280,320,30);
			l5.setBounds(410,330,320,30);
			l6.setBounds(410,380,320,20);
			tf24.setBounds(680,130,250,40);
			tf25.setBounds(680,180,250,40);
			tf26.setBounds(680,230,250,40);
			tf27.setBounds(680,280,250,40);
			tf28.setBounds(680,330,250,40);
			tf29.setBounds(680,380,250,40);
			b1.setBounds(500,550,170,40);
			b2.setBounds(700,550,170,40);
			b1.addActionListener(this);
			b2.addActionListener(this);
			fm4.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent we){fm4.dispose();}});
			l.add(l1);
			l.add(tf24);
			l.add(l2);
			l.add(tf25);
			l.add(l3);
			l.add(tf26);
			l.add(l4);
			l.add(tf27);
			l.add(l5);
			l.add(tf28);
			l.add(l6);
			l.add(tf29);
			l.add(b1);
			l.add(b2);
			
			l1.setForeground(Color.WHITE);
			tf24.setForeground(Color.BLACK);
			l2.setForeground(Color.WHITE);
			tf25.setForeground(Color.BLACK);
			l3.setForeground(Color.WHITE);
			tf26.setForeground(Color.BLACK);
			tf27.setForeground(Color.BLACK);
			l4.setForeground(Color.WHITE);
			l5.setForeground(Color.WHITE);
			tf28.setForeground(Color.BLACK);
			l6.setForeground(Color.WHITE);
			tf29.setForeground(Color.BLACK);
			b1.setForeground(Color.WHITE);
			b2.setForeground(Color.WHITE);
			b1.setBackground(Color.BLUE);
			b2.setBackground(Color.BLUE);
			
			Font fff=new Font("Lucida Handwriting",Font.PLAIN,30);
			Font ff=new Font("Lucida Handwriting",Font.PLAIN,20);
			l1.setFont(fff);
			l2.setFont(fff);
			l3.setFont(fff);
			l4.setFont(fff);
			l5.setFont(fff);
			l6.setFont(fff);
			tf24.setFont(ff);
			tf25.setFont(ff);
			tf26.setFont(ff);
			tf27.setFont(ff);
			tf28.setFont(ff);
			tf29.setFont(ff);
			b1.setFont(fff);
			b2.setFont(fff);
			fm4.setVisible(true);
			fm4.setSize(1366,768);
		}
		if(ae.getActionCommand().equals("Return"))
		{
			String b=tf19.getText();
			String r=tf20.getText();
			String re=tf23.getText();
			String f=tf24.getText();
			if(b.equals(""))
			{
				System.out.println("Enter book number");
				Frame fr1=new Frame("Dialog");
				JDialog d=new JDialog();
				d.setUndecorated(true);
				JOptionPane.showMessageDialog(fr1,"Enter the book number !");
				d.setVisible(true);
			}
			else if(r.equals(""))
			{
				System.out.println("Enter Roll number");
				Frame fr2=new Frame("Dialog");
				JDialog d=new JDialog();
				d.setUndecorated(true);
				JOptionPane.showMessageDialog(fr2,"Enter Roll Number !");
				d.setVisible(true);
			}
			else if(tf21.getText()=="")
			{
				System.out.println("Book is not issued");
				Frame fr3=new Frame("Dialog");
				JDialog d=new JDialog();
				d.setUndecorated(true);
				JOptionPane.showMessageDialog(fr3,"Book is not issued !");
				d.setVisible(true);
			}
		/*	else if(tf22.getText()=="")
			{
				System.out.println("Enter due date");
				Frame fr4=new Frame("Dialog");
				JDialog d=new JDialog();
				d.setUndecorated(true);
				JOptionPane.showMessageDialog(fr4,"Enter due date !");
				d.setVisible(true);
			}	*/
			else if(re.equals(""))
			{
				System.out.println("Enter return date");
				Frame fr6=new Frame("Dialog");
				JDialog d=new JDialog();
				d.setUndecorated(true);
				JOptionPane.showMessageDialog(fr6,"Enter return date !");
				d.setVisible(true);
			}
			else if(f.equals(""))
			{
				System.out.println("Enter fine");
				Frame fr7=new Frame("Dialog");
				JDialog d=new JDialog();
				d.setUndecorated(true);
				JOptionPane.showMessageDialog(fr7,"Enter fine !");
				d.setVisible(true);
			}	
			else
			{
				try
				{
					Connection con=DriverManager.getConnection("jdbc:odbc:my_database");
					PreparedStatement  p=con.prepareStatement("insert into return_of_books values(?,?,?,?,?,?)");
					PreparedStatement st=con.prepareStatement("select * from issue_of_books where bookno='"+ b + "'");
					p.setString(1,b);
					p.setInt(2,Integer.parseInt(r));
					st.execute();  
               					ResultSet rs = st.getResultSet(); 
                					boolean recordFound = rs.next();
                					if (recordFound) 
					{	
						System.out.println(rs.getString("bookno"));
                                               // DateFormat format=new SimpleDateFormat("YYYY--MMMM--DD");
                                                //JFormattedTextField dateTextField=new JFormattedTextField(format);
						tf21.setText(rs.getString("issuedate"));
						tf22.setText(rs.getString("duedate"));
						p.setString(3,tf21.getText());
						p.setString(4,tf22.getText());
						p.setString(5,re);
						p.setInt(6,Integer.parseInt(f));
						p.executeUpdate();
						System.out.println("Book Returned !");
						Frame fm=new Frame("Dialog");
						JDialog d=new JDialog();
						d.setUndecorated(true);
						JOptionPane.showMessageDialog(fm,"Book returned !");
						d.setVisible(true);
					}
					else 
					{ 
						System.out.println("Book not in records !");
						Frame fm=new Frame("Dialog");
						JDialog d=new JDialog();
						d.setUndecorated(true);
						JOptionPane.showMessageDialog(fm,"Book not in records !");
					}
				}
				catch(Exception e1)
				{
					System.out.println(e1);
					Frame fr5=new Frame("Dialog");
					JDialog d=new JDialog();
					d.setUndecorated(true);
					JOptionPane.showMessageDialog(fr5,"Error !");
					d.setVisible(true);
				}
			}
		}
		if(ae.getActionCommand().equals("Remove Book"))
		{
			fm5=new Frame("Remove Books");
			JLabel l=new JLabel(new ImageIcon("black1.jpg"));
			fm5.add(l);
			JLabel lb1=new JLabel("Enter the Book number");
			JButton b1=new JButton("Remove book");
			lb1.setBounds(200,150,450,40);
			tf25.setBounds(740,150,250,40);
			b1.setBounds(480,400,300,50);
			b1.addActionListener(this);
			fm5.setLayout(null);
			fm5.setSize(1366,768);
			l.add(lb1);
			l.add(tf25);
			l.add(b1);
			Font f=new Font("Lucida Handwriting",Font.PLAIN,30);
			Font f1=new Font("Lucida Handwriting",Font.PLAIN,20);
			lb1.setFont(f);
			tf25.setFont(f1);
			b1.setFont(f);
			lb1.setForeground(Color.WHITE);
			tf26.setForeground(Color.BLACK);
			b1.setForeground(Color.WHITE);
			b1.setBackground(Color.BLUE);
			l.setSize(1366,740);
			fm5.setVisible(true);
			fm5.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent we){fm5.dispose();}});
		}
		if(ae.getActionCommand().equals("Remove book"))
		{
			String b=tf25.getText();
			if(b.equals(""))
			{
				System.out.println("Enter book number");
				Frame fr1=new Frame("Dialog");
				JDialog d=new JDialog();
				d.setUndecorated(true);
				JOptionPane.showMessageDialog(fr1,"Enter the book number !");
				d.setVisible(true);
			}
			else
			{
				try
				{
					Connection con=DriverManager.getConnection("jdbc:odbc:my_database");
					PreparedStatement  p=con.prepareStatement("delete from book_entry where book_entry.bookno=?");
					PreparedStatement st=con.prepareStatement("select bookno from book_entry where bookno='"+ b + "'");
					st.execute();  
               					ResultSet rs = st.getResultSet(); 
                					boolean recordFound = rs.next();
                					if (recordFound) 
					{
						System.out.println(rs.getString("bookno"));
						p.setString(1,b);
						p.executeUpdate();
						System.out.println("Book Removed !");
						Frame fm=new Frame("Dialog");
						JDialog d=new JDialog();
						d.setUndecorated(true);
						JOptionPane.showMessageDialog(fm,"Book removed !");
						d.setVisible(true);
					}
					else
					{

						System.out.println("Book not in records !");
						Frame fm=new Frame("Dialog");
						JDialog d=new JDialog();
						d.setUndecorated(true);
						JOptionPane.showMessageDialog(fm,"Book not in records !");
					}

				}
				catch(Exception e1)
				{
					System.out.println(e1);
					Frame fr5=new Frame("Dialog");
					JDialog d=new JDialog();
					d.setUndecorated(true);
					JOptionPane.showMessageDialog(fr5,"Error !");
					d.setVisible(true);
				}
			}
		}
		if(ae.getActionCommand().equals("Remove Member"))
		{
			fm6=new Frame("Remove Student");
			JLabel l=new JLabel(new ImageIcon("black1.jpg"));
			fm6.add(l);
			l.setSize(1366,740);
			JLabel lb1=new JLabel("Enter Student Roll no.");
			JButton b1=new JButton("Remove member");
			lb1.setBounds(250,190,400,40);
			tf26.setBounds(750,190,250,40);
			b1.setBounds(500,410,300,50);
			b1.addActionListener(this);
			fm6.setLayout(null);
			fm6.setSize(1366,768);
			l.add(lb1);
			l.add(tf26);
			l.add(b1);
			Font f=new Font("Lucida Handwriting",Font.PLAIN,30);
			Font f1=new Font("Lucida Handwriting",Font.PLAIN,20);
			lb1.setFont(f);
			tf26.setFont(f1);
			b1.setFont(f1);
			lb1.setForeground(Color.WHITE);
			tf26.setForeground(Color.BLACK);
			b1.setForeground(Color.WHITE);
			b1.setBackground(Color.BLUE);
			fm6.setVisible(true);
			fm6.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent we){fm6.dispose();}});
		}
		if(ae.getActionCommand().equals("Remove member"))
		{
			String r=tf26.getText();
			if(r.equals(""))
			{
				System.out.println("Enter roll number");
				Frame fr1=new Frame("Dialog");
				JDialog d=new JDialog();
				d.setUndecorated(true);
				JOptionPane.showMessageDialog(fr1,"Enter Roll number !");
				d.setVisible(true);
			}
			else
			{
				try
				{
					Connection con=DriverManager.getConnection("jdbc:odbc:my_database");
					PreparedStatement  p=con.prepareStatement("delete from user_entry where user_entry.rollno=?");
					PreparedStatement st=con.prepareStatement("select rollno from user_entry where rollno='"+ r + "'");
					st.execute();  
               					ResultSet rs = st.getResultSet(); 
                					boolean recordFound = rs.next();
                					if (recordFound) 
					{
						System.out.println(rs.getString("rollno"));
						p.setString(1,r);
						p.executeUpdate();
						System.out.println("Member Removed !");
						Frame fm=new Frame("Dialog");
						JDialog d=new JDialog();
						d.setUndecorated(true);
						JOptionPane.showMessageDialog(fm,"Member removed !");
						d.setVisible(true);
					}
					else
					{
						System.out.println("Member not in records !");
						Frame fm=new Frame("Dialog");
						JDialog d=new JDialog();
						d.setUndecorated(true);
						JOptionPane.showMessageDialog(fm,"Member not in records !");
					}
				}
				catch(Exception e1)
				{
					System.out.println(e1);
					Frame fr5=new Frame("Dialog");
					JDialog d=new JDialog();
					d.setUndecorated(true);
					JOptionPane.showMessageDialog(fr5,"Error !");
					d.setVisible(true);
				}
			}
		}
		if(ae.getActionCommand() == "Refresh")
		{
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
			tf4.setText("");
			tf5.setText("");
			tf6.setText("");
			tf7.setText("");
			tf8.setText("");
			tf9.setText("");
			tf10.setText("");
			tf11.setText("");
			tf12.setText("");
			tf13.setText("");
			tf14.setText("");
			tf15.setText("");
			tf16.setText("");
			tf17.setText("");
			tf18.setText("");
			tf19.setText("");
			tf20.setText("");
			tf21.setText("");
			tf22.setText("");
			tf23.setText("");
			tf24.setText("");

		}
		if(ae.getActionCommand().equals("Update Book Details"))
		{
			fm7=new Frame("Modify Book Details");		
			JButton b1=new JButton("Update");
			JLabel lb1=new JLabel("Book Number");
			JLabel lb2=new JLabel("Publisher");
			JLabel lb3=new JLabel("Edition");
			JLabel lb4=new JLabel("Copies");
			JLabel lb5=new JLabel("Cost");
			
			
			lb1.setBounds(410,130,320,30);
			lb2.setBounds(410,180,320,30);
			lb3.setBounds(410,230,320,30);	
			lb4.setBounds(410,280,320,30);
			lb5.setBounds(410,330,320,30);
			tf27.setBounds(680,130,250,30);
			tf28.setBounds(680,180,250,30);
			tf29.setBounds(680,230,250,30);
			tf30.setBounds(680,280,250,30);
			tf31.setBounds(680,330,250,30);
			b1.setBounds(520,520,170,40);
			JLabel l=new JLabel(new ImageIcon("black1.jpg"));
			fm7.add(l);
			b1.addActionListener(this);
			fm7.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent we){fm7.dispose();}});
			l.add(lb1);
			l.add(tf27);
			l.add(lb2);
			l.add(tf28);
			l.add(lb3);
			l.add(tf29);
			l.add(lb4);
			l.add(tf30);
			l.add(lb5);
			l.add(tf31);
			l.add(b1);		
			fm7.setLayout(null);
			fm7.setSize(1366,768);
			l.setSize(1366,740);
			lb1.setForeground(Color.WHITE);
			tf27.setForeground(Color.BLACK);
			lb2.setForeground(Color.WHITE);
			tf28.setForeground(Color.BLACK);
			lb3.setForeground(Color.WHITE);
			tf29.setForeground(Color.BLACK);
			tf30.setForeground(Color.BLACK);
			lb4.setForeground(Color.WHITE);
			lb5.setForeground(Color.WHITE);
			tf31.setForeground(Color.BLACK);
			b1.setForeground(Color.WHITE);
			b1.setBackground(Color.BLUE);
			Font fff=new Font("Lucida Handwriting",Font.PLAIN,20);
			l.setFont(fff);
			lb1.setFont(fff);
			lb2.setFont(fff);
			lb3.setFont(fff);
			lb4.setFont(fff);
			lb5.setFont(fff);
			tf27.setFont(fff);
			tf28.setFont(fff);
			tf29.setFont(fff);
			tf30.setFont(fff);
			tf31.setFont(fff);
			b1.setFont(fff);
			fm7.setVisible(true);
			
		}
		if(ae.getActionCommand().equals("Update"))
		{
			String b=tf27.getText();
			String pu=tf28.getText();
			String e=tf29.getText();
			String c=tf30.getText();
			String co=tf31.getText();
			if(b.equals(""))
			{
				System.out.println("Enter book number");
				Frame fr1=new Frame("Dialog");
				JDialog d=new JDialog();
				d.setUndecorated(true);
				JOptionPane.showMessageDialog(fr1,"Enter the book number !");
				d.setVisible(true);
			}
			else if(pu.equals(""))
			{
				System.out.println("Enter publisher");
				Frame fr6=new Frame("Dialog");
				JDialog d=new JDialog();
				d.setUndecorated(true);
				JOptionPane.showMessageDialog(fr6,"Enter publisher !");
				d.setVisible(true);
			}
			else if(e.equals(""))
			{
				System.out.println("Enter edition");
				Frame fr7=new Frame("Dialog");
				JDialog d=new JDialog();
				d.setUndecorated(true);
				JOptionPane.showMessageDialog(fr7,"Enter edition !");
				d.setVisible(true);
			}
			else if(c.equals(""))
			{
				System.out.println("Enter copies");
				Frame fr8=new Frame("Dialog");
				JDialog d=new JDialog();
				d.setUndecorated(true);
				JOptionPane.showMessageDialog(fr8,"Enter copies !");
				d.setVisible(true);
			}
			else if(co.equals(""))
			{
				System.out.println("Enter cost");
				Frame fr9=new Frame("Dialog");
				JDialog d=new JDialog();
				d.setUndecorated(true);
				JOptionPane.showMessageDialog(fr9,"Enter cost !");
				d.setVisible(true);
			}	
			else
			{
				try
				{
					Connection con=DriverManager.getConnection("jdbc:odbc:my_database");
					PreparedStatement  p=con.prepareStatement("update book_entry SET  publisher=?,edition=?,copies=?,cost=? WHERE bookno=?");
					PreparedStatement st=con.prepareStatement("select bookno from book_entry where bookno='"+ b + "'");
					st.execute();  
               					ResultSet rs = st.getResultSet(); 
                					boolean recordFound = rs.next();
                					if (recordFound) 
					{
						System.out.println(rs.getString("bookno"));
						p.setString(1,pu);
						p.setString(2,e);
						p.setString(3,c);
						p.setString(4,co);
						p.setString(5,b);
						p.executeUpdate();
						System.out.println("Data Updated !");
						Frame fm=new Frame("Dialog");
						JDialog d=new JDialog();
						d.setUndecorated(true);
						JOptionPane.showMessageDialog(fm,"Data updated !");
						d.setVisible(true);
					}
					else
					{
						System.out.println("Book not in records !");
						Frame fm=new Frame("Dialog");
						JDialog d=new JDialog();
						d.setUndecorated(true);
						JOptionPane.showMessageDialog(fm,"Book not in records !");
					}	
				}
				catch(Exception e1)
				{
					System.out.println(e1);
					Frame fr5=new Frame("Dialog");
					JDialog d=new JDialog();
					d.setUndecorated(true);
					JOptionPane.showMessageDialog(fr5,"Error !");
					d.setVisible(true);
				}
			}
		}
		if(ae.getActionCommand().equals("Update Member Details"))
		
		{	fm8=new Frame("Modify Member Details");		
			JButton b1=new JButton("Change");
			JLabel lb1=new JLabel("Student Id");
			JLabel lb2=new JLabel("Roll Number");
			
			lb1.setBounds(410,150,250,40);
			lb2.setBounds(410,250,250,40);	
			tf32.setBounds(680,150,250,40);
			tf33.setBounds(680,250,250,40);
			b1.setBounds(540,400,240,50);
			
			JLabel l=new JLabel(new ImageIcon("black1.jpg"));
			fm8.add(l);
			b1.addActionListener(this);
			fm8.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent we){fm8.dispose();}});
			l.add(lb1);
			l.add(tf32);
			l.add(lb2);
			l.add(tf33);
			l.add(b1);		
			fm8.setLayout(null);
			Font f1=new Font("Lucida Handwriting",Font.BOLD,30);
			lb1.setFont(f1);
			lb1.setForeground(Color.WHITE);
			lb2.setFont(f1);
			lb2.setForeground(Color.WHITE);
			Font f3=new Font("Lucida Handwriting",Font.PLAIN,20);
			tf32.setFont(f3);
			tf33.setFont(f3);
			b1.setFont(f1);
			b1.setBackground(Color.BLUE);
			b1.setForeground(Color.WHITE);
			fm8.setSize(1366,768);
			l.setSize(1366,740);
			fm8.setVisible(true);
		}
		if(ae.getActionCommand().equals("Change"))
		{
			String s=tf32.getText();
			String r=tf33.getText();
			if(s.equals(""))
			{
				System.out.println("Enter Student id");
				Frame fr1=new Frame("Dialog");
				JDialog d=new JDialog();
				d.setUndecorated(true);
				JOptionPane.showMessageDialog(fr1,"Enter StudentId !");
				d.setVisible(true);
			}
			else if(r.equals(""))
			{
				System.out.println("Enter Roll number");
				Frame fr1=new Frame("Dialog");
				JDialog d=new JDialog();
				d.setUndecorated(true);
				JOptionPane.showMessageDialog(fr1,"Enter Roll number !");
				d.setVisible(true);
			}		
			else
			{
				try
				{
					Connection con=DriverManager.getConnection("jdbc:odbc:my_database");
					PreparedStatement  p=con.prepareStatement("update user_entry SET  studentid=? WHERE rollno=?");
					PreparedStatement st=con.prepareStatement("select rollno from user_entry where rollno='"+ r + "'");
					st.execute();  
               					ResultSet rs = st.getResultSet(); 
                					boolean recordFound = rs.next();
                					if (recordFound) 
					{
						System.out.println(rs.getString("rollno"));
						p.setString(1,s);
						p.setInt(2,Integer.parseInt(r));
						p.executeUpdate();
						System.out.println("Data Updated !");
						Frame fm=new Frame("Dialog");
     						JDialog d=new JDialog();
						d.setUndecorated(true);
						JOptionPane.showMessageDialog(fm,"Data updated !");
						d.setVisible(true);
					}
					else
					{
						System.out.println("Member not in records !");
						Frame fm=new Frame("Dialog");
						JDialog d=new JDialog();
						d.setUndecorated(true);
						JOptionPane.showMessageDialog(fm,"Member not in records !");
					}

				}
				catch(Exception e1)
				{
					System.out.println(e1);
					Frame fr5=new Frame("Dialog");
					JDialog d=new JDialog();
					d.setUndecorated(true);
					JOptionPane.showMessageDialog(fr5,"Error !");
					d.setVisible(true);
				}
			}
		}
		if(ae.getActionCommand().equals("Show Book Details"))
		{
		 		Frame fm9=new Frame("show");
				Label lb=new Label("Bookno");
				lb.setBounds(249,180,94,20);
                                Label lb1=new Label("ISBNno");
				lb1.setBounds(344,180,94,20);
                                Label lb2=new Label("Subjct");
				lb2.setBounds(439,180,93,20);
                                Label lb3=new Label("Bookname");
				lb3.setBounds(533,180,94,20);
                                Label lb4=new Label("Author");
				lb4.setBounds(628,180,94,20);
                                Label lb5=new Label("Publisher");
				lb5.setBounds(723,180,93,20);
                                Label lb6=new Label("Edition");
				lb6.setBounds(817,180,93,20);
                                Label lb7=new Label("Copies");
				lb7.setBounds(911,180,93,20);
                                Label lb8=new Label("Cost");
				lb8.setBounds(1005,180,94,20);
                                 Label lb9=new Label("BOOK DETAILS");
				lb9.setBounds(480,100,400,50);


				Object [][]data = new String [100][100];
				int col=10;
				int r=0;
				/**************************Table DAta*****************************/
				try
				{
					Connection con=DriverManager.getConnection("jdbc:odbc:my_database");
					PreparedStatement st=con.prepareStatement("select * from book_entry");
					st.execute();  
               				ResultSet rs = st.getResultSet(); 
                			boolean recordFound = rs.next();
                			if (recordFound) 
					{	System.out.println("Record Found");
						while(rs.next())
						{	for(int c=0;c<col;c++)
							{	if(c==0)
								{	data[r][c]=rs.getString("bookno");
								}
								if(c==1)
								{	data[r][c]=rs.getString("isbnno");
								}
								if(c==2)
								{	data[r][c]=rs.getString("subjct");
								}
                                                                if(c==3)
								{	data[r][c]=rs.getString("nameofbook");
								}
							        if(c==4)
								{	data[r][c]=rs.getString("author");
								}
								if(c==5)
								{	data[r][c]=rs.getString("publisher");
								}
								if(c==6)
								{	data[r][c]=rs.getString("edition");
								}
                                                                if(c==7)
								{	data[r][c]=rs.getString("copies");
								}
								if(c==8)
								{	data[r][c]=rs.getString("cost");
								}	
						

							}
							r++;
						}	
					}
					else
					{	System.out.println("Record Not Found");
					}

				}
				catch(Exception e1)
				{
					System.out.println(e1);
					Frame fr5=new Frame("Dialog");
					JDialog d=new JDialog();
					d.setUndecorated(true);
					JOptionPane.showMessageDialog(fr5,"Error !");
					d.setVisible(true);
				}
                              


				/****************************************************************/
			
                               
                                 Object column [] ={"bookno","isbnno","subjct","nameofbook","author","publisher","edition","copies","cost"};
				JTable jt = new JTable(data,column);
				jt.setBounds(250,200,850,500);
				//fm9.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent ae){fm9.dispose();}});
				JLabel l=new JLabel(new ImageIcon("black1.jpg"));
                                fm9.add(l);
                                l.setSize(1366,740);
				l.add(jt);
				l.add(lb);
                                l.add(lb1);
                                l.add(lb2);
                                l.add(lb3);
                                l.add(lb4);
				l.add(lb5);
                                l.add(lb6);
                                l.add(lb7);
                                l.add(lb8);
                                l.add(lb9);
                                Font ft=new Font("Harrington",Font.BOLD,50);
                                lb9.setFont(ft);
				fm9.setSize(1366,768);
                                
				fm9.setLayout(null);
				
 				fm9.setVisible(true);
						
		}
                   }
                  
		
	public static void main(String args[ ])
	{
		libmgmt obj=new libmgmt();
		obj.c();
                
	}
}