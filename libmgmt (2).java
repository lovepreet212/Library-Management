import java.awt.*;
import java.awt.event.*;
import java.awt.font.*; 
import javax.swing.*;
import java.sql.*;

class libmgmt implements ActionListener
{
	Color mouve=new Color(190,80,131);
	Color green=new Color(138,180,41);
	Color skin=new Color(241,201,171);
	Color blue=new Color(41,171,214);
	Color gray=new Color(192,192,192);
	Color teal=new Color(64,128,128);
	Color purple=new Color(155,55,255);
	Color brown=new Color(170,74,74);

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

	TextField t1=new TextField(30);
	TextField t2=new TextField(30);
	TextField tf1=new TextField(10);
	TextField tf2=new TextField(20);
	TextField tf3=new TextField(20);	
	TextField tf4=new TextField(40);
	TextField tf5=new TextField(40);
	TextField tf6=new TextField(30);
	TextField tf7=new TextField(15);
	TextField tf8=new TextField(10);
	TextField tf9=new TextField(10);

	TextField tf10=new TextField(20);
	TextField tf11=new TextField(15);
	TextField tf12=new TextField(40);
	TextField tf13=new TextField(20);
	TextField tf14=new TextField(5);

	TextField tf15=new TextField(50);
	TextField tf16=new TextField(50);
	TextField tf17=new TextField(50);
	TextField tf18=new TextField(50);

	TextField tf19=new TextField(50);
	TextField tf20=new TextField(50);
	TextField tf21=new TextField(50);
	TextField tf22=new TextField(50);
	TextField tf23=new TextField(50);
	TextField tf24=new TextField(50);
	
	TextField tf25=new TextField(10);
	TextField tf26=new TextField(10);
	TextField tf27=new TextField(50);
	TextField tf28=new TextField(50);
	TextField tf29=new TextField(50);
	TextField tf30=new TextField(50);
	TextField tf31=new TextField(50);
	TextField tf32=new TextField(50);
	TextField tf33=new TextField(50);
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
		Label la1=new Label("Username");
		Label la2=new Label("Password");
		Button b=new Button("Submit");
		f1.setIconImage(new ImageIcon("book.png").getImage());
		b.addActionListener(this);
		f1.setBackground(blue);
		f1.setForeground(mouve);
		f1.setLayout(null);
		la1.setBounds(50,60,90,30);
		la2.setBounds(50,100,80,30);
		t1.setBounds(150,60,100,30);
		t2.setBounds(150,100,100,30);
		b.setBounds(130,150,70,30);
		f1.add(la1);
		f1.add(t1);
		f1.add(la2);
		f1.add(t2);
		f1.add(b);
		f1.setSize(350,200);
		f1.setVisible(true);
		f1.setLocationRelativeTo(null);
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
				f = new Frame("Library");
				Label l1=new Label("Library Management");
				f.setBackground(skin);
				f.add(l1);
				f.setIconImage(new ImageIcon("book.png").getImage());
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
				Font font1=new Font("Monospaced", Font.BOLD,50);
				l1.setFont(font1);	
				mi1.addActionListener(this);
				mi2.addActionListener(this);
				mi3.addActionListener(this);
				mi4.addActionListener(this);
				mi5.addActionListener(this);
				mi6.addActionListener(this);
				mi7.addActionListener(this);
				mi8.addActionListener(this);
				mi9.addActionListener(this);
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
				mb.add(m1);
				mb.add(m2);
				f.setForeground(teal);
				f.setLayout(null);
				l1.setBounds(80,200,700,80);
				f.setSize(700,500);
				f.setMenuBar(mb);
				f.setResizable(false);
				f.setVisible(true);
				f.setLocationRelativeTo(null);
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
			fm.setIconImage(new ImageIcon("book.png").getImage());
			Button b1=new Button("Add Book");
			Button b2=new Button("Refresh");
			Label lb1=new Label("Book Number");
			Label lb2=new Label("ISBN Number");
			Label lb3=new Label("Subject");
			Label lb4=new Label("Name of Book");
			Label lb5=new Label("Author");
			Label lb6=new Label("Publisher");
			Label lb7=new Label("Edition");
			Label lb8=new Label("Copies");
			Label lb9=new Label("Cost");
			lb1.setBounds(50,60,90,30);
			lb2.setBounds(50,100,80,30);
			lb3.setBounds(50,140,80,30);	
			lb4.setBounds(50,180,80,30);
			lb5.setBounds(280,60,80,30);
			lb6.setBounds(280,100,80,30);
			lb7.setBounds(280,140,80,30);
			lb8.setBounds(280,180,80,30);
			lb9.setBounds(50,220,80,30);
			tf1.setBounds(150,60,100,30);
			tf2.setBounds(150,100,100,30);
			tf3.setBounds(150,140,100,30);
			tf4.setBounds(150,180,100,30);
			tf5.setBounds(360,60,100,30);
			tf6.setBounds(360,100,100,30);
			tf7.setBounds(360,140,100,30);
			tf8.setBounds(360,180,100,30);
			tf9.setBounds(150,220,100,30);
			b1.setBounds(170,310,70,30);
			b2.setBounds(260,310,70,30);
			b1.addActionListener(this);
			b2.addActionListener(this);
			fm.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent we){fm.dispose();}});
			fm.add(lb1);
			fm.add(tf1);
			fm.add(lb2);
			fm.add(tf2);
			fm.add(lb3);
			fm.add(tf3);
			fm.add(lb4);
			fm.add(tf4);
			fm.add(lb5);
			fm.add(tf5);
			fm.add(lb6);
			fm.add(tf6);
			fm.add(lb7);
			fm.add(tf7);
			fm.add(lb8);
			fm.add(tf8);
			fm.add(lb9);
			fm.add(tf9);
			fm.add(b1);
			fm.add(b2);		
			fm.setLayout(null);
			fm.setForeground(purple);
			fm.setBackground(gray);
			fm.setSize(600,450);
			fm.setVisible(true);
			fm.setLocationRelativeTo(null);
				
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
		}
		if(ae.getActionCommand().equals("Member Entry"))
		{		
			fm2=new Frame("Register Yourself");
			fm2.setIconImage(new ImageIcon("book.png").getImage());
			Label lb1=new Label("Student Id");
			Label lb2=new Label("Roll Number");
			Label lb3=new Label("Name");
			Label lb4=new Label("Branch");
			Label lb5=new Label("Year");
			fm2.setIconImage(new ImageIcon("book.png").getImage());
			fm2.setLocationRelativeTo(null);
			Button b1=new Button("Add Member");
			Button b2=new Button("Refresh");
			lb1.setBounds(50,60,90,30);
			lb2.setBounds(50,100,90,30);
			lb3.setBounds(50,140,80,30);
			lb4.setBounds(50,180,80,30);
			lb5.setBounds(50,220,80,30);
			tf10.setBounds(150,60,100,30);
			tf11.setBounds(150,100,100,30);
			tf12.setBounds(150,140,100,30);
			tf13.setBounds(150,180,100,30);
			tf14.setBounds(150,220,100,30);
			b1.setBounds(100,300,80,30);
			b2.setBounds(200,300,80,30);
			b1.addActionListener(this);
			b2.addActionListener(this);
			fm2.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent we){fm2.dispose();}});
			fm2.add(lb1);
			fm2.add(tf10);
			fm2.add(lb2);
			fm2.add(tf11);
			fm2.add(lb3);
			fm2.add(tf12);
			fm2.add(lb4);
			fm2.add(tf13);
			fm2.add(lb5);
			fm2.add(tf14);
			fm2.add(b1);
			fm2.add(b2);
			fm2.setLayout(null);
			fm2.setForeground(purple);
			fm2.setBackground(gray);
			fm2.setSize(500,350);
			fm2.setVisible(true);
			fm2.setLocationRelativeTo(null);
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
			fm3.setIconImage(new ImageIcon("book.png").getImage());
			fm3.setLocationRelativeTo(null);
			Label l1=new Label("Book Number");
			Label l2=new Label("Roll Number");
			Label l3=new Label("Issue Date");
			Label l4=new Label("Due Date");
			fm3.setIconImage(new ImageIcon("book.png").getImage());
			Button b1=new Button("Issue");
			Button b2=new Button("Refresh");
			fm3.setLayout(null);
			fm3.setForeground(purple);
			fm3.setBackground(gray);
			l1.setBounds(60,70,100,30);
			l2.setBounds(60,110,100,30);
			l3.setBounds(60,150,100,30);
			l4.setBounds(60,190,100,30);
			tf15.setBounds(200,70,100,30);
			tf16.setBounds(200,110,100,30);
			tf17.setBounds(200,150,100,30);
			tf18.setBounds(200,190,100,30);
			b1.setBounds(90,250,50,30);
			b2.setBounds(170,250,60,30);
			b1.addActionListener(this);
			b2.addActionListener(this);
			fm3.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent we){fm3.dispose();}});
			fm3.add(l1);
			fm3.add(tf15);
			fm3.add(l2);
			fm3.add(tf16);
			fm3.add(l3);
			fm3.add(tf17);
			fm3.add(l4);
			fm3.add(tf18);
			fm3.add(b1);
			fm3.add(b2);
			fm3.setSize(500,370);
			fm3.setVisible(true);
			fm3.setLocationRelativeTo(null);
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
					PreparedStatement stmt = con.prepareStatement("select book_no from book_entry where book_no='"+b+"'");
                        				stmt.execute();  
               					ResultSet resultSet = stmt.getResultSet(); 
                					boolean recordFound = resultSet.next();
                					if (recordFound) 
					{  
						System.out.println("Book found");
						System.out.println(resultSet.getString("book_no"));
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
			fm4.setIconImage(new ImageIcon("book.png").getImage());
			Label l1=new Label("Book Number");
			Label l2=new Label("Roll Number");
			Label l3=new Label("Issue Date");
			Label l4=new Label("Due Date");
			Label l5=new Label("Return Date");
			Label l6=new Label("Fine");
			fm4.setIconImage(new ImageIcon("book.png").getImage());
			fm4.setLocationRelativeTo(null);
			Button b1=new Button("Return");
			Button b2=new Button("Refresh");
			fm4.setLayout(null);
			fm4.setForeground(purple);
			fm4.setBackground(gray);
			l1.setBounds(60,70,100,30);
			l2.setBounds(60,110,100,30);
			l3.setBounds(60,150,100,30);
			l4.setBounds(60,190,100,30);
			l5.setBounds(60,230,100,30);
			l6.setBounds(60,270,100,30);
			tf19.setBounds(200,70,100,30);
			tf20.setBounds(200,110,100,30);
			tf21.setBounds(200,150,100,30);
			tf22.setBounds(200,190,100,30);
			tf23.setBounds(200,230,100,30);
			tf24.setBounds(200,270,100,30);
			b1.setBounds(90,320,50,30);
			b2.setBounds(170,320,60,30);
			b1.addActionListener(this);
			b2.addActionListener(this);
			fm4.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent we){fm4.dispose();}});
			fm4.add(l1);
			fm4.add(tf19);
			fm4.add(l2);
			fm4.add(tf20);
			fm4.add(l3);
			fm4.add(tf21);
			fm4.add(l4);
			fm4.add(tf22);
			fm4.add(l5);
			fm4.add(tf23);
			fm4.add(l6);
			fm4.add(tf24);
			fm4.add(b1);
			fm4.add(b2);
			fm4.setVisible(true);
			fm4.setSize(500,370);
			fm4.setLocationRelativeTo(null);
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
					PreparedStatement st=con.prepareStatement("select * from issue_of_books where book_no='"+ b + "'");
					p.setString(1,b);
					p.setInt(2,Integer.parseInt(r));
					st.execute();  
               					ResultSet rs = st.getResultSet(); 
                					boolean recordFound = rs.next();
                					if (recordFound) 
					{	
						System.out.println(rs.getString("book_no"));
						tf21.setText(rs.getString("issue_date"));
						tf22.setText(rs.getString("due_date"));
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
			fm5.setIconImage(new ImageIcon("book.png").getImage());
			Label lb1=new Label("Enter the Book number");
			Button b1=new Button("Remove book");
			lb1.setBounds(30,70,150,30);
			tf25.setBounds(180,70,100,30);
			b1.setBounds(100,120,100,30);
			b1.addActionListener(this);
			fm5.setLayout(null);
			fm5.setBackground(Color.pink);
			fm5.setForeground(brown);
			fm5.setSize(350,200);
			fm5.add(lb1);
			fm5.add(tf25);
			fm5.add(b1);
			fm5.setResizable(false);
			fm5.setVisible(true);
			fm5.setLocationRelativeTo(null);
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
					PreparedStatement  p=con.prepareStatement("delete from book_entry where book_entry.book_no=?");
					PreparedStatement st=con.prepareStatement("select book_no from book_entry where book_no='"+ b + "'");
					st.execute();  
               					ResultSet rs = st.getResultSet(); 
                					boolean recordFound = rs.next();
                					if (recordFound) 
					{
						System.out.println(rs.getString("book_no"));
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
			fm6.setIconImage(new ImageIcon("book.png").getImage());
			Label lb1=new Label("Enter Student Roll no.");
			Button b1=new Button("Remove member");
			lb1.setBounds(30,70,150,30);
			tf26.setBounds(180,70,100,30);
			b1.setBounds(100,120,130,30);
			b1.addActionListener(this);
			fm6.setLayout(null);
			fm6.setBackground(Color.pink);
			fm6.setForeground(brown);
			fm6.setSize(350,200);
			fm6.add(lb1);
			fm6.add(tf26);
			fm6.add(b1);
			fm6.setResizable(false);
			fm6.setVisible(true);
			fm6.setLocationRelativeTo(null);
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
					PreparedStatement  p=con.prepareStatement("delete from user_entry where user_entry.roll_no=?");
					PreparedStatement st=con.prepareStatement("select roll_no from user_entry where roll_no='"+ r + "'");
					st.execute();  
               					ResultSet rs = st.getResultSet(); 
                					boolean recordFound = rs.next();
                					if (recordFound) 
					{
						System.out.println(rs.getString("roll_no"));
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
			Button b1=new Button("Update");
			Label lb1=new Label("Book Number");
			Label lb2=new Label("Publisher");
			Label lb3=new Label("Edition");
			Label lb4=new Label("Copies");
			Label lb5=new Label("Cost");
			
			lb1.setBounds(50,60,80,30);
			lb2.setBounds(50,100,80,30);
			lb3.setBounds(50,140,80,30);	
			lb4.setBounds(50,180,80,30);
			lb5.setBounds(50,220,80,30);
			tf27.setBounds(150,60,100,30);
			tf28.setBounds(150,100,100,30);
			tf29.setBounds(150,140,100,30);
			tf30.setBounds(150,180,100,30);
			tf31.setBounds(150,220,100,30);
			b1.setBounds(120,270,50,30);
			
			fm7.setIconImage(new ImageIcon("book.png").getImage());
			b1.addActionListener(this);
			fm7.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent we){fm7.dispose();}});
			fm7.add(lb1);
			fm7.add(tf27);
			fm7.add(lb2);
			fm7.add(tf28);
			fm7.add(lb3);
			fm7.add(tf29);
			fm7.add(lb4);
			fm7.add(tf30);
			fm7.add(lb5);
			fm7.add(tf31);
			fm7.add(b1);		
			fm7.setLayout(null);
			fm7.setForeground(brown);
			fm7.setBackground(Color.pink);
			fm7.setSize(400,350);
			fm7.setVisible(true);
			fm7.setLocationRelativeTo(null);
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
					PreparedStatement  p=con.prepareStatement("update book_entry SET  publisher=?,edition=?,copies=?,cost=? WHERE book_no=?");
					PreparedStatement st=con.prepareStatement("select book_no from book_entry where book_no='"+ b + "'");
					st.execute();  
               					ResultSet rs = st.getResultSet(); 
                					boolean recordFound = rs.next();
                					if (recordFound) 
					{
						System.out.println(rs.getString("book_no"));
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
		{
			fm8=new Frame("Modify Member Details");		
			Button b1=new Button("Change");
			Label lb1=new Label("Student Id");
			Label lb2=new Label("Roll Number");
			
			lb1.setBounds(50,60,80,30);
			lb2.setBounds(50,100,80,30);	
			tf32.setBounds(150,60,100,30);
			tf33.setBounds(150,100,100,30);
			b1.setBounds(120,190,50,30);
			
			fm8.setIconImage(new ImageIcon("book.png").getImage());
			b1.addActionListener(this);
			fm8.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent we){fm8.dispose();}});
			fm8.add(lb1);
			fm8.add(tf32);
			fm8.add(lb2);
			fm8.add(tf33);
			fm8.add(b1);		
			fm8.setLayout(null);
			fm8.setForeground(brown);
			fm8.setBackground(Color.pink);
			fm8.setSize(300,250);
			fm8.setVisible(true);
			fm8.setLocationRelativeTo(null);
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
					PreparedStatement  p=con.prepareStatement("update user_entry SET  student_id=? WHERE roll_no=?");
					PreparedStatement st=con.prepareStatement("select roll_no from user_entry where roll_no='"+ r + "'");
					st.execute();  
               					ResultSet rs = st.getResultSet(); 
                					boolean recordFound = rs.next();
                					if (recordFound) 
					{
						System.out.println(rs.getString("roll_no"));
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
	}
	public static void main(String args[ ])
	{
		libmgmt obj=new libmgmt();
		obj.c();
	}
}
