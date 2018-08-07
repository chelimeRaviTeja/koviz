import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import javax.swing.table.*;
import java.util.logging.Level;
import java.util.logging.Logger;
class LogIn  implements ActionListener
{
Frame f,f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11,f12,f13;
TextField t1,t2,t21,t22,t31;
JPasswordField tz211=new JPasswordField(20);
JPasswordField pa=new JPasswordField(20);
JPasswordField pa1=new JPasswordField(20);
JPasswordField pa2=new JPasswordField(20);
JPasswordField pa3=new JPasswordField(20);
//tz2.setEchoChar('*');
//tz2.setActionCommand(ok);
TextField t[]=new TextField[50];
TextField t77[]=new TextField[50];
Button b1,b2,b31,b29,b61,b62,b63,b64,b65,b007,b07;
Choice mc5;
String n3,w3,n4,w4,x4,x3,z3,z4,zz2,zz1,nn3,nn4,ww3,ww4,nn10,nn5,ww5;

Label l1,l2,l3,l4,l7,l18,L21,L22,L23,L41,L42,l8,l9,l10;

			// DataBase Variables
				String n1,n7,n10,w1,w7;
				int id,id1;




Panel panel=new Panel();
Panel panel1=new Panel();
Panel panel2=new Panel();
Panel panel3=new Panel();
Panel panel4=new Panel();
				int c=0;
				//hitam variable
				Button bh,bh2,bh5,bh6;
  				TextField th[];
 			 	//Frame fh1,fh2,fh3,fh4;
  				Label lh[],lh1[],lh2[],lh3[],lh4[],lh5[],lh6,lh7;
				Frame fh1=new Frame();
				Frame fh2=new Frame();
				Frame fh3=new Frame();
				Frame fh4=new Frame();

								//Myclass1 variables
								//Frame fm,fm1,fm2,fm3,fm4;
								int am,zm;
								
								JRadioButton jrm[],jrm1[],jrm2[],jrm3[],jrm4[],jrm5[],jrm6[],jrm7[],jrm8[];
								Button bm1,bm2,bm3[],bm4[],bm5,bm6,bm7,bm8,bm30,bm31;
								TextField tm[],tm1[],tm2[],tm3[],tm4[],tm5[];
								Label Lm[],Lm1[],Lm2[],Lm3[],Lm4[],Lm5[],Lm6[],lm5,lm7,lm8;
							
								ButtonGroup bgm2[]=new ButtonGroup[400];
								Frame fm=new Frame();
								Frame fm1=new Frame();
								Frame fm2=new Frame();
								Frame fm3=new Frame();
			// blanks var	
				//Frame fb,fb1,fb2,fb3,fb4;
				Button bb1,bb2,bb3,bb4,bb5,bbb6;
				TextField tb[],tb1[],tb2[];
				Label Lb[],Lb1[],Lb2[],Lb3[],Lb4[],lb7,lb5,lb6;
				int count,mark;
				Frame fb=new Frame();
				Frame fb2=new Frame();
				Frame fb1=new Frame();
				Frame fb3=new Frame();
				Frame fb4=new Frame();				

									//Button management
									int rq=0,rq1=0,rq2=0,rq3=0,rq4=0;
	LogIn()
	{
	
	f=new Frame();
	f1=new Frame();
	f2=new Frame();
	f3=new Frame();
	f4=new Frame();
	f5=new Frame();
	f6=new Frame();
	f8=new Frame();
	f9=new Frame();
	f10=new Frame();
	f11=new Frame();
	t1=new TextField();
	t2=new TextField();
	
				Label l[]=new Label[15];
				Label l77[]=new Label[15];
				for(int i=1;i<10;i++)
				{
				t[i]=new TextField();
				}
				for(int i=1;i<15;i++)
				{
				l[i]=new Label();
				}
				for(int i=1;i<15;i++)
				{
				l77[i]=new Label();
				}
				
	l1=new Label("KOVIZ LOGIN");
	l2=new Label("User Id");
	l3=new Label("Password");
	l4=new Label(":::::   New To Koviz   :::::");
	b1=new Button("LogIn");
	b2=new Button("SignUp");
	t1.setBounds(190,110,150,20);
	tz211.setBounds(190,150,150,20);
	b1.setBounds(230,190,50,20);
	b2.setBounds(205,310,50,20);
	l1.setBounds(140,60,300,20);
	l2.setBounds(100,110,80,20);
	l3.setBounds(100,150,80,20);
	l4.setBounds(120,280,250,20);
	f.setLayout(null);
		   try{
		  	 Font font = new Font("Serif", Font.BOLD, 25);
			 Font font1 = new Font("Serif", Font.BOLD, 15);
			 Font font2 = new Font("Serif", Font.BOLD, 15);
			 Font font3 = new Font("Serif", Font.BOLD, 20);
		         l1.setFont(font);
			 l2.setFont(font1);
			 l3.setFont(font2);
			 l4.setFont(font3);
		       }catch(Exception e){}

				//f.setContentPane(new JLabel(new ImageIcon("Masters.png")));
				
  	f.setBackground(Color.GRAY);

	f.add(t1);
	f.add(tz211);
	f.add(b1);
	f.add(l1);
	f.add(l2);
	f.add(l3);
	f.add(l4);
	f.add(b2);
	b1.addActionListener(this);
	b2.addActionListener(this);
	f.setSize(470,450);
	f.setVisible(true);
	}
public void actionPerformed(ActionEvent d)
{

		if(d.getActionCommand()=="LogIn") 
		{
		
		zz2=t1.getText();
		zz1=tz211.getText();
		//f.setVisible(false);
		PreparedStatement pst=null;
		PreparedStatement pst1=null;
		Connection con1=null;
		Connection con2=null;
	    try{
	    con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","12345");
	    pst=con1.prepareStatement("select * from faculty");
	    ResultSet rs=pst.executeQuery();
	    System.out.println("abcd");
	    while(rs.next())
	    	{
            	 n3=rs.getString(4);
		 n4=rs.getString(5);
		
		 if(n3.equals(zz2)&&n4.equals(zz1))
		 {
			x3=n3;
			x4=n4;
			nn5=rs.getString(3);
			 nn3=rs.getString(2);
		 	 nn4=rs.getString(8);
		 	 nn10=rs.getString(10);
			System.out.println(x3);
			System.out.println(x4);
		 }
            	
		System.out.println(n3);
            	}
	    con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","12345");
	    pst1=con2.prepareStatement("select * from student");
	   
	    ResultSet rs1=pst1.executeQuery();
	    while(rs1.next())
	    	 {
		 w3=rs1.getString(4);
		 w4=rs1.getString(5);
		 
		 if(w3.equals(zz2)&&w4.equals(zz1))
		 {
			z3=w3;
			z4=w4;
			ww5=rs1.getString(3);
			ww3=rs1.getString(2);
		 	ww4=rs1.getString(8);
			System.out.println(z3);
			System.out.println(z4);
			System.out.println(ww5);
		 }
		 }
            
       	       }catch(SQLException e){
		Logger lgr=Logger.getLogger(LogIn.class.getName());
			lgr.log(Level.SEVERE, e.getMessage(), e);		
		}




           


        	
		//int z1=Integer.parseInt(zz1);
		//String rx="sad";
		        	
				
		Label l1,l2,l3,l4,l5,l6;		
	//(z.equals(w3))&&(z1==w4)
			if((zz2.equals(z3))&&(zz1.equals(z4)))
			{	
			f.setVisible(false);
			f3.setVisible(false);

			f5.setVisible(true);
			panel1.setBounds(5,80,120,620);    
        		panel1.setBackground(Color.CYAN);
			Button b1=new Button("Join Group");
	  		b1.setBounds(5,30,110,25);    
        		b1.setBackground(Color.green);   
        		Label b2=new Label("   Groups Joined");  
			b2.setBounds(5,70,110,35); 
			b2.setBackground(Color.pink);   
        		panel1.add(b1); panel1.add(b2);
			panel1.setLayout(null);  
			b1.addActionListener(this);
			f5.add(panel1);	
			f5.setSize(700,700); 
        	 	f5.setLayout(null);

			panel2.setBounds(5,5,690,75);    
        		panel2.setBackground(Color.gray);
			Button bz1=new Button("Group Ranking");
			bz1.setForeground(Color.white);
	  		bz1.setBounds(300,40,110,25);    
        		bz1.setBackground(Color.gray);
			Button b3=new Button("((|))");
			b3.setForeground(Color.white);
	  		b3.setBounds(630,40,50,25);    
        		b3.setBackground(Color.gray);    
        		Label bz2=new Label("   koviZ"); 
			try{
		   	 Font font = new Font("Serif", Font.BOLD, 35);
		   	 bz2.setFont(font);
		   	 }catch(Exception e){System.out.println("yolo");}
			
			Button bz20=new Button(ww3); 
			try{
		   	 Font font = new Font("Serif", Font.BOLD, 23);
		   	 bz20.setFont(font);
		   	 }catch(Exception e){System.out.println("yolo");}
			bz20.setBounds(468,40,115,25);
			bz20.setBackground(Color.gray);
			bz20.setForeground(Color.white);
			bz20.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ee){
			  
        		f12=new Frame(); 
			Label ls=new Label("PROFILE"); 
			Label ls1=new Label("Name    :");
			Label ls2=new Label("Status   :");
			Label ls3=new Label("College :"); 
			Label ls4=new Label(ww3); 
			Label ls5=new Label("Student"); 
			Label ls6=new Label(ww4);
        		 
			ls.setBounds(150,70,200,20); 
			ls1.setBounds(130,220,80,20); 
			ls2.setBounds(130,250,80,20); 
			ls3.setBounds(130,280,80,20); 
			ls4.setBounds(210,220,80,20); 
			ls5.setBounds(210,250,80,20);  
			ls6.setBounds(210,280,80,20); 
		        
        		
			
					
	
				try{
				   Font font = new Font("Serif", Font.BOLD, 25);
				   Font font1 = new Font("Serif", Font.BOLD, 18);

		        	   ls.setFont(font);
					ls1.setFont(font1);
					ls2.setFont(font1);
					ls3.setFont(font1);
				   }catch(Exception e){}



			ImageIcon icon2= new ImageIcon("stu.jpg");
               		JLabel e1 = new JLabel( icon2, JLabel.CENTER);
			e1.setBounds(160,100,100,100);
			f12.add(e1);
 
	f12.add(ls);
	f12.add(ls1);
	f12.add(ls2);
	f12.add(ls3);
	f12.add(ls4);
	f12.add(ls5);
	f12.add(ls6);
	
        f12.setSize(400,400);    
        f12.setLayout(null);    
        f12.setVisible(true);    

			
			}});
			bz2.setForeground(Color.white); 
			bz2.setBounds(45,24,150,60); 
			//bz2.setBackground(Color.pink);   
			ImageIcon icon21= new ImageIcon("logo.jpg");
                	JLabel e11 = new JLabel( icon21, JLabel.CENTER);
			e11.setBounds(25,20,35,60);
			ImageIcon icon22= new ImageIcon("stu.jpg");
               		JLabel e12 = new JLabel( icon22, JLabel.CENTER);
			e12.setBounds(430,20,35,60);
			panel2.add(e12);
			panel2.add(e11);
        		panel2.add(bz1); panel2.add(bz2); panel2.add(bz20); panel2.add(b3);
			panel2.setLayout(null);  
			bz1.addActionListener(this);
			b3.addActionListener(this);
			f5.add(panel2);	
			
			
			panel4.setBounds(575,80,120,620);    
        		panel4.setBackground(Color.CYAN);
			Label bz29=new Label("Achivements"); 
			try{
		   	 Font font = new Font("Serif", Font.BOLD, 20);
		   	 bz29.setFont(font);
		   	 }catch(Exception e){System.out.println("yolo");}
			  
			bz29.setBounds(2,30,110,30); 
			bz29.setBackground(Color.green);
			    
			panel4.setLayout(null);  
			panel4.add(bz29);
			f5.add(panel4);
			

			Label bp2=new Label("Posts"); 
			try{
		   	 Font font = new Font("Serif", Font.BOLD, 30);
		   	 bp2.setFont(font);
		   	 }catch(Exception e){System.out.println("yolo");}
			bp2.setBounds(150,90,150,60);
			f5.add(bp2);
			
			
			


		}	



				else if((zz2.equals(x3))&&zz1.equals(x4))
				{
				f.setVisible(false);
				f3.setVisible(true);
			panel.setBounds(5,80,120,620);    
        		panel.setBackground(Color.CYAN);
			Button b1=new Button("Create Group");
	  		b1.setBounds(5,30,110,25);    
        		b1.setBackground(Color.green);   
        		Label b2=new Label("  Groups created");  
			b2.setBounds(5,70,110,35); 
			b2.setBackground(Color.pink);   
        		panel.add(b1); panel.add(b2);
			panel.setLayout(null);  
			b1.addActionListener(this);
			f3.add(panel);	
			f3.setSize(700,700); 
        	 	f3.setLayout(null);

			panel3.setBounds(5,5,690,75);    
        		panel3.setBackground(Color.gray);
			Button bz1=new Button("Student Scores");
			bz1.setForeground(Color.white);
	  		bz1.setBounds(300,40,110,25);    
        		bz1.setBackground(Color.gray);
			Button b3=new Button("(|)");
			b3.setForeground(Color.white);
	  		b3.setBounds(630,40,50,25);    
        		b3.setBackground(Color.gray);    
        		Label bz2=new Label("   koviZ"); 
			try{
		   	 Font font = new Font("Serif", Font.BOLD, 35);
		   	 bz2.setFont(font);
		   	 }catch(Exception e){System.out.println("yolo");}
			
			Button bz21=new Button(nn3); 
			try{
		   	 Font font = new Font("Serif", Font.BOLD, 23);
		   	 bz21.setFont(font);
		   	 }catch(Exception e){System.out.println("yolo");}
			bz21.setBounds(468,40,115,25);
			bz21.setBackground(Color.gray);
			bz21.setForeground(Color.white);
			bz21.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ee){
			
				Frame f13= new Frame("Profile");    
          			
				
        			   
        			   
        			  
				Label lf=new Label("PROFILE"); 
				Label lf1=new Label("Name    :");
				Label lf2=new Label("Status   :");
				Label lf3=new Label("College :");  
        			 
				lf.setBounds(145,70,200,20); 
				lf1.setBounds(130,220,80,20); 
				lf2.setBounds(130,250,80,20); 
				lf3.setBounds(130,280,80,20);
				Label lf8=new Label(nn3); 
				Label lf9=new Label(nn10); 
				Label lf10=new Label(nn4);
        			lf8.setBounds(210,220,80,20); 
				lf9.setBounds(210,250,150,20); 
				lf10.setBounds(210,280,80,20); 
			          
        			
				
				
	
				try{
				   Font font = new Font("Serif", Font.BOLD, 25);
				   Font font1 = new Font("Serif", Font.BOLD, 18);
		        	   lf.setFont(font);
					lf1.setFont(font1);
					lf2.setFont(font1);
					lf3.setFont(font1);
				   }catch(Exception e){}



			ImageIcon icon2= new ImageIcon("123.png");
               		JLabel e1 = new JLabel( icon2, JLabel.CENTER);
			e1.setBounds(160,100,100,100);
			f13.add(e1);

         
	f13.add(lf);
	f13.add(lf1);
	f13.add(lf2);
	f13.add(lf3);
	f13.add(lf8);
	f13.add(lf9);
	f13.add(lf10);
	
        f13.setSize(400,400);    
        f13.setLayout(null);    
        f13.setVisible(true); 


			}});
			bz2.setForeground(Color.white); 
			bz2.setBounds(45,24,150,60); 
			//bz2.setBackground(Color.pink);   
			ImageIcon icon21= new ImageIcon("logo.jpg");
                	JLabel e11 = new JLabel( icon21, JLabel.CENTER);
			e11.setBounds(25,20,35,60);
			ImageIcon icon22= new ImageIcon("fac.jpg");
               		JLabel e12 = new JLabel( icon22, JLabel.CENTER);
			e12.setBounds(430,20,35,60);
			panel3.add(e12);
			panel3.add(e11);
        		panel3.add(bz1); panel3.add(bz2); panel3.add(bz21); panel3.add(b3);
			panel3.setLayout(null);  
			bz1.addActionListener(this);
			b3.addActionListener(this);
			f3.add(panel3);	
			
			
			panel4.setBounds(575,80,120,620);    
        		panel4.setBackground(Color.CYAN);
			Label bz29=new Label("Achivements"); 
			try{
		   	 Font font = new Font("Serif", Font.BOLD, 20);
		   	 bz29.setFont(font);
		   	 }catch(Exception e){System.out.println("yolo");}
			  
			bz29.setBounds(2,30,110,30); 
			bz29.setBackground(Color.green);
			    
			panel4.setLayout(null);  
			panel4.add(bz29);
			f3.add(panel4);
			

			Label bp2=new Label("Manage Groups"); 
			try{
		   	 Font font = new Font("Serif", Font.BOLD, 30);
		   	 bp2.setFont(font);
		   	 }catch(Exception e){System.out.println("yolo");}
			bp2.setBounds(150,90,300,60);
			f3.add(bp2);

           
         
        
					
					
				}	

			else 
			{
			f.setVisible(true);
			try{
			   l7=new Label("Entered user name or password wrong");
			   l7.setForeground(Color.pink);
			   l7.setBounds(80,230,400,23);
			   Font font = new Font("Serif", Font.BOLD, 20);
		   	   l7.setFont(font);
			   t1.setText("");
			   tz211.setText("");	  
		           }catch(Exception e){}
			   f.add(l7);			
			}
			
			
			


		}

	else if(d.getActionCommand()=="SignUp")
	{
		f.setVisible(false);
		Button b,b11,b2;
	  	f1.setLayout(null);
		b=new Button("Faculty");		
	 	b11=new Button("Student");	
    		b2=new Button("Back");	
		b.setBounds(140,240,80,20);
		b11.setBounds(270,240,80,20);

		b2.setBounds(50,50,40,20);
 		ImageIcon icon = new ImageIcon("123.png");
                JLabel b1 = new JLabel( icon, JLabel.CENTER);
		b1.setBounds(115,120,120,120);
		f1.add(b1);


		ImageIcon icon2= new ImageIcon("Screenshot_81.png");
                JLabel e1 = new JLabel( icon2, JLabel.CENTER);
		e1.setBounds(265,120,100,100);
		f1.add(e1);

		f1.setVisible(true);
		f1.setSize(500,500);
		f1.add(b);
		f1.add(b11);
		f1.add(b2);

		b.addActionListener(this);
		b11.addActionListener(this);
		b2.addActionListener(this);
	}



		else if(d.getActionCommand()=="((|))")
		{
		f5.setVisible(false);
		f.setVisible(true);
		t1.setText("");
		tz211.setText("");
		l7.setText("");
		ww3="";
		
		}

		else if(d.getActionCommand()=="(|)")
		{
		f3.setVisible(false);
		f.setVisible(true);
		t1.setText("");
		tz211.setText("");
		l7.setText("");
		nn3="";
		
		}

	
		else if(d.getActionCommand()=="Done")
		{
		f.setVisible(true);
		f1.setVisible(false);
		f2.setVisible(false);
		f4.setVisible(false);
		int ar=0;
			try {

               	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","12345");
			 PreparedStatement pst1=con.prepareStatement("select * from faculty");
			ResultSet rs1=pst1.executeQuery();
	    		while(rs1.next())
	    	 	{
			ar=rs1.getInt(1);
			System.out.println(ar);
			}
                   PreparedStatement ps=con.prepareStatement("insert into faculty values(?,?,?,?,?,?,?,?,?,?)");
                 
       		  
           	  
 	        String k2=t[1].getText();
		String k3=t[2].getText();	
		String k4=t[3].getText();	
		String kk5=t[4].getText();
		
		String kk6=t[5].getText();
		
		String kk7=t[6].getText();					
		//int k7=Integer.parseInt(kk7);
		String k8=t[7].getText();	
		String k9=t[8].getText();
		String k10=t[9].getText();
		//String k11=t[10].getText();
		//String k12=t[11].getText();
		int ar1=ar+1;
		ps.setInt(1,ar1);
		ps.setString(2,k2);
                ps.setString(3,k3);
		ps.setString(4,k4);
                ps.setString(5,kk5);
                ps.setString(6,kk6);
                ps.setString(7,kk7);
		ps.setString(8,k8);
                ps.setString(9,k9);
		ps.setString(10,k10);
               
                
		int k=ps.executeUpdate();
	        

               } catch(SQLException ex) {
			Logger lgr=Logger.getLogger(LogIn.class.getName());
			lgr.log(Level.SEVERE, ex.getMessage(), ex);		

		}


			t1.setText("");
			t2.setText("");
			l7.setText("");

       	}

			else if(d.getActionCommand()=="Back")
			{

			f.setVisible(true);
			f1.setVisible(false);
			t1.setText("");
			t2.setText("");
			l7.setText("");
			}

       				else if(d.getActionCommand()=="Faculty")
				{
				
				f1.setVisible(false);
				
				Button b1;
				Label l[]=new Label[15];
				for(int i=1;i<12;i++)
				{
				t[i]=new TextField();
				}
				for(int i=1;i<15;i++)
				{
				l[i]=new Label();
				}
			l[1]=new Label("FACULTY PROFILE");
			l[2]=new Label("First Name");
			l[3]=new Label("Last Name");
			l[4]=new Label("User Name");
			l[5]=new Label("Password");
			l[6]=new Label("Re-Enter Password");
			l[7]=new Label("Mobile Number");
			l[8]=new Label("College Name");
			l[9]=new Label("Branch");
			l[10]=new Label("Profession");
	
			b1=new Button("Done");
			t[1].setBounds(250,100,200,20);
			t[2].setBounds(250,140,200,20);
			t[3].setBounds(250,180,200,20);
			pa.setBounds(250,220,200,20);
			pa1.setBounds(250,260,200,20);
			t[6].setBounds(300,300,150,20);
			t[7].setBounds(250,340,200,20);
			t[8].setBounds(250,380,200,20);
			t[9].setBounds(250,420,200,20);
			l[1].setBounds(165,40,300,20);
			l[2].setBounds(100,100,100,20);
			l[3].setBounds(100,140,100,20);
			l[4].setBounds(100,180,100,20);
			l[5].setBounds(100,220,150,20);
			l[6].setBounds(100,260,120,20);
			l[7].setBounds(100,300,100,20);
			l[8].setBounds(100,340,100,20);
			l[9].setBounds(100,380,100,20);
			l[10].setBounds(100,420,100,20);
			b1.setBounds(250,460,50,20);
			f2.setLayout(null);
		for(int i=1;i<12;i++)
		{
		f2.add(t[i]);
		}
		for(int i=1;i<15;i++)
		{
		f2.add(l[i]);
		}
		f2.add(b1);
		f2.add(pa);
		f2.add(pa1);
			try{
			   Font font = new Font("Serif", Font.BOLD, 25);
			   l[1].setFont(font);
			   }catch(Exception e){}

				   
					Choice mc=new Choice();
     					 mc.add("91+");
     					 mc.add("81+");
      					 mc.add("22+");
      					 mc.add("38+");
      					 mc.setBounds(250,300,50,20);
					 f2.add(mc);

				        /* mc5 = new Choice();
					   mc5.add("Managing Director & Professor");
     					   mc5.add("Professional Commun Teacher");
      					   mc5.add("Professor");
      					   mc5.add("Assistant Professor");
					   mc5.add("Teacher");
					   mc5.add("Lecturer");
				           mc5.setBounds(250,420,200,20);
				           f2.add(mc5);*/

					 
	      	b1.addActionListener(this);
		f2.setSize(500,500);
		f2.setVisible(true);

		//Button b5=new Button("Back");
		//b5.setBounds(200,420,50,20);
		//f2.add(b5);
		//b5.addActionListener(this);
		
		}



				else if(d.getActionCommand()=="Student")
				{
				f1.setVisible(false);
				Button b1;
				Label l77[]=new Label[15];
				for(int i=1;i<12;i++)
				{
				t77[i]=new TextField();
				}
				for(int i=1;i<15;i++)
				{
				l77[i]=new Label();
				}

			l77[1]=new Label("STUDENT PROFILE");
			l77[2]=new Label("First Name");
			l77[3]=new Label("Last Name");
			l77[4]=new Label("User ID");
			l77[5]=new Label("Password");
			l77[6]=new Label("Re-Enter Password");
			l77[7]=new Label("Mobile Number");
			l77[8]=new Label("College Name");
			l77[9]=new Label("Branch");
			l77[10]=new Label("Student");
	
			b1=new Button("Register");
			t77[1].setBounds(250,100,200,20);
			t77[2].setBounds(250,140,200,20);
			t77[3].setBounds(250,180,200,20);
			pa2.setBounds(250,220,200,20);
			pa3.setBounds(250,260,200,20);
			t77[6].setBounds(300,300,150,20);
			t77[7].setBounds(250,340,200,20);
			t77[8].setBounds(250,380,200,20);
			//t[9].setBounds(250,260,40,20);
			l77[1].setBounds(165,40,300,20);
			l77[2].setBounds(100,100,100,20);
			l77[3].setBounds(100,140,100,20);
			l77[4].setBounds(100,180,100,20);
			l77[5].setBounds(100,220,150,20);
			l77[6].setBounds(100,260,120,20);
			l77[7].setBounds(100,300,100,20);
			l77[8].setBounds(100,340,100,20);
			l77[9].setBounds(100,380,100,20);
			b1.setBounds(250,420,50,20);
			f4.setLayout(null);
		
		/*char x[]=pa2.getPassword();
		int ip=0;
		char x1[]=pa3.getPassword();
		int xl,xl1;
		xl=x.length;
		xl1=x1.length;
		if(xl==xl1)
		{
			while(ip<xl)
			{
				if(x[ip]==x1[ip])
				ip++;
				else
				{
				Label px=new Label("Password not Matched");
				px.setBounds(460,260,200,20);
				f4.add(px);
				}	
			}
			
		}*/
		
		for(int i=1;i<12;i++)
		{
		f4.add(t77[i]);
		}
		for(int i=1;i<15;i++)
		{
		f4.add(l77[i]);
		}
		f4.add(b1);
		f4.add(pa2);
		f4.add(pa3);
			try{
			   Font font = new Font("Serif", Font.BOLD, 25);
			   l77[1].setFont(font);
			   }catch(Exception e){}

  				         Choice mc = new Choice();
     					 mc.add("91+");
     					 mc.add("81+");
      					 mc.add("22+");
      					 mc.add("38+");
   					 mc.setBounds(250,300,50,20);
					 f4.add(mc);

					 
	        b1.addActionListener(this);
		f4.setSize(500,500);
		f4.setVisible(true);

		
		}






			else if(d.getActionCommand()=="Register")
			{
			
			f.setVisible(true);
			f1.setVisible(false);
			f2.setVisible(false);
			f4.setVisible(false);

				int ar=0;
			   try {
			         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","12345");
			 PreparedStatement pst1=con.prepareStatement("select * from student");
			ResultSet rs1=pst1.executeQuery();
	    		while(rs1.next())
	    	 	{
			ar=rs1.getInt(1);
			System.out.println(ar);
			}
                   PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?,?,?,?,?,?,?)");
			
           		
		
		String kk2=t77[1].getText();
		String kk3=t77[2].getText();	
		String kk4=t77[3].getText();	
		String kkk5=t77[4].getText();
		
		String kkk6=t77[5].getText();
		
		String kkk7=t77[6].getText();
		//int  kk7=Integer.parseInt(kkk7);
		String kk8=t77[7].getText();	
		String kk9=t77[8].getText();
		String kk10="Student";
		//String kk11=t[10].getText();
		//String kk12=t[11].getText();
			int ar1=ar+1;
		ps.setInt(1,ar1);
		ps.setString(2,kk2);
                ps.setString(3,kk3);
		ps.setString(4,kk4);
                ps.setString(5,kkk5);
                ps.setString(6,kkk6);
                ps.setString(7,kkk7);
		ps.setString(8,kk8);
                ps.setString(9,kk9);
		ps.setString(10,kk10);
               
                
		int k=ps.executeUpdate();

           
            
       	
	    

        			} catch (SQLException ex) {
			Logger lgr=Logger.getLogger(LogIn.class.getName());
			lgr.log(Level.SEVERE, ex.getMessage(), ex);		
			}
	
			t1.setText("");
			t2.setText("");
			l7.setText("");
			
					
			}




		
			else if(d.getActionCommand()=="Create Group")
			{
			
	 		b29=new Button("CreateGroup");
			t21=new TextField(100);
			t22=new TextField(100);
			L21=new Label("Enter Group Name");
			L22=new Label("Enter Group ID");
			L23=new Label("Create a Group" );
			f8.setLayout(null);
			b29.setBounds(170,190,100,20);
			t21.setBounds(240,100,100,20);
			t22.setBounds(240,140,100,20);
			L21.setBounds(80,100,150,20);
			L22.setBounds(80,140,150,20);
			L23.setBounds(120,50,300,30);
				try{
		   		    Font font = new Font("Serif", Font.BOLD, 25);
		   		    L23.setFont(font);
		   	           }catch(Exception e){}
		
			try{
			    Font font = new Font("Serif", Font.BOLD, 15);
			    L21.setFont(font);
		   	    L22.setFont(font);
			   }catch(Exception e){}


	f8.add(t21);
	f8.add(t22);
	f8.add(L21);
	f8.add(L22);
	f8.add(L23);
	f8.add(b29);
	b29.addActionListener(this);
	f8.setSize(400,300);
	f8.setVisible(true);

			t1.setText("");
			t2.setText("");
			l7.setText("");
			

  		}

			else if(d.getActionCommand()=="Join Group")
			{
			
			b31=new Button("JoinGroup");
			t31=new TextField(100);
			L41=new Label("Join a Group" );
			L42=new Label("Enter Group ID");
			f9.setLayout(null);
			b31.setBounds(170,190,100,20);
			t31.setBounds(220,140,150,20);
			L41.setBounds(135,80,150,30);
			L42.setBounds(80,140,150,20);
	
				try{
				   Font font = new Font("Serif", Font.BOLD, 25);
		   		   L41.setFont(font);
		   		   }catch(Exception e){}
		
				try{
		   		    Font font = new Font("Serif", Font.BOLD, 15);
		      		    L42.setFont(font);
	           		   }catch(Exception e){}

			b31.addActionListener(this);
			f9.add(t31);
			f9.add(L41);
			f9.add(L42);
			f9.add(b31);
			f9.setSize(400,300);
			f9.setVisible(true);	
		}






			else if(d.getActionCommand()=="CreateGroup")
			{
		        f8.setVisible(false);
			String sp=t21.getText();
			b07=new Button(sp);
			b07.setBounds(5,110,110,35); 
			b07.setBackground(Color.yellow); 
			b07.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ee){l18=new Label("Create a new Post");
			f10= new Frame("Creating a new Post");
			

			b61=new Button("Conduct Match The Following");
			b61.setBounds(100,100,200,30); 
			b61.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ee){
			//hitam h=new hitam();
			f10.setVisible(false);
		bh=new Button("Conduct");
		bh2=new Button("Submit");
		bh5=new Button("Show Results");
                th=new TextField[22];
 		lh=new Label[8];
		lh1=new Label[12];
		lh2=new Label[12];
		lh3=new Label[12];
		lh4=new Label[12];
		lh5=new Label[12];
		

                	for(int i=0;i<8;i++)
			{
 			lh[i]=new Label();
			}

				for(int n=0;n<12;n++)
				{
					lh1[n]=new Label();
				}
				for(int n=0;n<12;n++)
				{
					lh2[n]=new Label();
				}
				for(int n=0;n<12;n++)
				{
					lh3[n]=new Label();
				}
				for(int n=0;n<12;n++)
				{
					lh4[n]=new Label();
				}
				for(int n=0;n<12;n++)
				{
					lh5[n]=new Label();
				}
				lh[7]=new Label("Match The Following");


		for(int i=0;i<22;i++)
		{
			th[i]=new TextField(20); 
		}
		

		// layout setting for textfield

 		fh1.setLayout(null);
		 th[0].setBounds(100,100,120,20);
                 th[1].setBounds(100,130,120,20);
                 th[2].setBounds(100,160,120,20);
		 th[3].setBounds(100,190,120,20);
		 th[4].setBounds(100,220,120,20);
		 th[5].setBounds(230,100,20,20);
		 th[6].setBounds(230,130,20,20);
		 th[7].setBounds(230,160,20,20);
		 th[8].setBounds(230,190,20,20);
		 th[9].setBounds(230,220,20,20);
		 th[10].setBounds(300,100,120,20);
		 th[11].setBounds(300,130,120,20);
		 th[12].setBounds(300,160,120,20);
		 th[13].setBounds(300,190,120,20);
		 th[14].setBounds(300,220,120,20);
		 th[15].setBounds(300,250,120,20);
		 th[16].setBounds(300,280,120,20);
			 
                  lh1[6].setBounds(80,320,130,20);
                  lh1[6].setText("Give Answers:");
			Font font1 = new Font("Serif", Font.BOLD, 15);
		        lh1[6].setFont(font1);
			fh1.add(lh1[6]);

			int aa=210,bb=320,cc=20,dd=20;
			for(int z=17;z<22;z++)
			{
			 th[z].setBounds(aa,bb,cc,dd);
                                 aa=aa+35;
			fh1.add(th[z]);
			}




 
		// layout setting for label printing question numbers
			
		int aaa=70,bbb=100,ccc=20,ddd=20;
			for(int z=0;z<5;z++)
			{
			 lh1[z].setBounds(aaa,bbb,ccc,ddd);
                                 bbb=bbb+30;
			lh1[z].setText(""+(z+1)+".")	;
			Font font2 = new Font("Serif", Font.BOLD, 15);
		        lh1[z].setFont(font2);
			fh1.add(lh1[z]);
			
			}
			
			//title set
                     fh1.setTitle("KOVIZ");
			
                     fh2.setTitle("KOVIZ");

			// layout setting for label
		 lh[0].setBounds(270,100,100,20);
                 lh[1].setBounds(270,130,100,20);
                 lh[2].setBounds(270,160,100,20);
		 lh[3].setBounds(270,190,100,20);
		 lh[4].setBounds(270,220,100,20);
		 lh[5].setBounds(270,250,100,20);
		 lh[6].setBounds(270,280,100,20);
		 lh[7].setBounds(135,40,350,40);	
		
			// for adding textfield on frame1
			for(int i=0;i<5;i++)
				{
				 fh1.add(th[i]);
				}
			
			for(int i=10;i<17;i++)
				{
				 fh1.add(th[i]);
				}
         	// setting alphabet order for answers with label
                 lh[0].setText("a.");
                 lh[1].setText("b.");
                 lh[2].setText("c.");
		 lh[3].setText("d.");
		 lh[4].setText("e.");	
		 lh[5].setText("f.");
		 lh[6].setText("g.");

			// for adding label	
                      for(int i=0;i<7;i++)
			{
				Font font3 = new Font("Serif", Font.BOLD, 15);
		        	lh[i].setFont(font3);
				fh1.add(lh[i]);
			}


				
				   Font font = new Font("Serif", Font.BOLD, 25);
		        	   lh[7].setFont(font);
				   









		// layout setting for button
               bh.setBounds(310,360,55,20);

		fh1.setBackground(Color.CYAN);
		fh1.setVisible(true);
		
		fh1.setSize(490,420);
		
                fh1.add(bh);
        	fh1.add(lh[7]);
        	// making button to listen what we say
               

			bh.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ee){
			fh1.setVisible(false);
			rq=rq+1;
			bh6=new Button("Take test MTF TIME:5MIN"); 
			}});		




			}});
			

b62=new Button("Conduct Blanks");
b62.setBounds(100,140,200,30);
b62.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ee){

	
	f10.setVisible(false);
		
				
				
				bb2=new Button("OK");
				
				
				bb5=new Button("Back");
				tb=new TextField[50];
				Lb=new Label[50];
				tb1=new TextField[50];
				Lb1=new Label[50];
				tb2=new TextField[50];
				Lb2=new Label[50];
				Lb3=new Label[50];
				Lb4=new Label[50];
				lb7=new Label();
						
	 			
				Lb[0]=new Label();
				Lb[0].setText("ENTER NUMBER OF BLANKS ");
				Font font = new Font("Serif", Font.ITALIC, 20);
		        	Lb[0].setFont(font); 
				Lb[0].setBounds(50,120,260,20);
				tb[0]=new TextField(100);
				tb[0].setBounds(320,120,30,20);

				fb.setLayout(null);
				fb1.setLayout(null);
				bb2.setBounds(330,160,40,20);
				fb.add(Lb[0]);
				fb.add(tb[0]);
				
				fb.add(bb2);
				fb.setTitle("Koviz");
				fb.setBackground(Color.CYAN);
				fb1.setBackground(Color.CYAN);
				
				fb.setSize(500,400);
				fb.setVisible(true);
				
		


	
				bb2.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ee){

			
				fb.setVisible(false);
				bb1=new Button("Conduct");
				fb2.setVisible(true);
				fb2.setSize(750,600);
				fb2.setBackground(Color.CYAN);
				fb2.setLayout(null);
				lb5=new Label("Enter Questions To Conduct Test");
				lb5.setBounds(70,80,400,40);
				Font font6 = new Font("Serif", Font.BOLD, 25);
		        	lb5.setFont(font6); 
				fb2.add(lb5);
				int a=Integer.parseInt(tb[0].getText());
				int b=80,c=160,d=470,e=20;
					for(int i=1;i<=a;i++)
					{
					tb[i]=new TextField(100);
					tb[i].setBounds(b,c,d,e);
					c=c+40;
					fb2.add(tb[i]);
					}
				int bb=50,cc=160,dd=20,ebe=20;
					for(int i=1;i<=a;i++)
					{
					Lb[i]=new Label();
					Lb[i].setBounds(bb,cc,dd,ebe);
					Font font1 = new Font("Serif", Font.BOLD, 15);
		        		Lb[i].setFont(font1); 
					cc=cc+40;
					Lb[i].setText(i+".");
					fb2.add(Lb[i]);
					}
				int ab=610,ac=160,ad=100,ae=20;
					for(int i=1;i<=a;i++)
					{
					tb1[i]=new TextField(100);
					tb1[i].setBounds(ab,ac,ad,ae);
					ac=ac+40;
					fb2.add(tb1[i]);
					}
				int abb=570,acc=160,add=40,aee=20;
					for(int i=1;i<=a;i++)
					{
					Lb1[i]=new Label();
					Lb1[i].setBounds(abb,acc,add,aee);
					Font font2 = new Font("Serif", Font.BOLD, 15);
		        		Lb1[i].setFont(font2); 
					acc=acc+40;
					Lb1[i].setText("ANS:");
					fb2.add(Lb1[i]);
					}

				
				bb1.setBounds(590,(c+30),90,20);
				bb5.setBounds(20,40,50,20);
				Font font3 = new Font("Serif", Font.BOLD, 15);
		        	bb5.setFont(font3);
				fb2.add(bb1);
				
					
					bb1.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ee){
					fb2.setVisible(false);
					System.out.println("yo");
					rq1=rq1+1;
					bbb6 =new Button("Take test MTF TIME:5MIN"); 
					}});


				fb2.add(bb5);
					bb5.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ee){
					
						fb2.setVisible(false);
						fb.setVisible(true);
					}});

				

			}});
		

		
 				
			

					
			
			}});
			

b63=new Button("Conduct Multiple Choice Questions"); 
b63.setBounds(100,180,200,30);
b63.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ee){

	f10.setVisible(false);
	
	
	
	
	
	
	
	
	jrm=new JRadioButton[400];
	jrm1=new JRadioButton[400];
	jrm2=new JRadioButton[400];
	jrm3=new JRadioButton[400];
	jrm4=new JRadioButton[400];
	jrm5=new JRadioButton[400];
	jrm6=new JRadioButton[400];
	jrm7=new JRadioButton[400];
	jrm8=new JRadioButton[400];



				for(int i=0;i<400;i++)
				{
					jrm5[i]=new JRadioButton("",false);
					jrm6[i]=new JRadioButton("b",true);
					jrm7[i]=new JRadioButton("",false);
					jrm8[i]=new JRadioButton("",false);
				}
	bm3=new Button[10];
	bm4=new Button[100];
	Lm6=new Label[50];
	
	//t6=new TextField[100];


	bm1=new Button("OK");
	bm2=new Button("Conduct");
	bm5=new Button("Submit");
	
	tm=new TextField[50];
	Lm=new Label[50];
	tm1=new TextField[50];
	Lm1=new Label[50];
	tm2=new TextField[50];
	Lm2=new Label[50];
	tm3=new TextField[50];
	Lm3=new Label[50];
	tm4=new TextField[50];
	Lm4=new Label[50];
	tm5=new TextField[50];
	Lm5=new Label[50];
	Lm[0]=new Label();
	Lm[0].setText("ENTER NUMBER OF QUESTIONS ");
	Font font = new Font("Serif", Font.ITALIC, 20);
	Lm[0].setFont(font);
	Lm[0].setBounds(50,120,300,20);
	tm[0]=new TextField(100);
	tm[0].setBounds(350,120,30,20);	
	fm.setBackground(Color.CYAN);
	//f.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("1.jpg")))));
	
	
	
	fm.setLayout(null);
	fm1.setLayout(null);
	bm1.setBounds(360,160,40,20);
	fm.add(Lm[0]);
	fm.add(tm[0]);
	fm.add(bm1);
	fm.setTitle("Choose The Correct Answers");
	
	
	fm.setSize(500,400);
	fm.setVisible(true);
   	
	
	bm1.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ee){
		String ak;
		fm.setVisible(false);
		
		fm2.setVisible(true);
		fm2.setSize(750,600);
		fm2.setBackground(Color.CYAN);
		fm2.setLayout(null);
		lm5=new Label("Enter Questions To Conduct Test");
		lm5.setBounds(70,80,400,40);
		Font font6 = new Font("Serif", Font.BOLD, 25);
		lm5.setFont(font6); 
		fm2.add(lm5);
		bm6=new Button("Back");
		am=Integer.parseInt(tm[0].getText());
		int b=100,c=160,d=450,e=20;
				for(int i=1;i<=am;i++)
				{
					tm[i]=new TextField(100);
					tm[i].setBounds(b,c,d,e);
					c=c+120;
					fm2.add(tm[i]);
				}
		int bb=80,cc=160,dd=20,eme=20;
				for(int i=1;i<=am;i++)
				{
					Lm[i]=new Label();
					Lm[i].setBounds(bb,cc,dd,eme);
					cc=cc+120;
					Lm[i].setText(i+".");
					fm2.add(Lm[i]);
				}
			


			//Options
				int aab=160,aac=200,aad=100,aae=20;
				for(int i=1;i<=am;i++)
				{
					tm2[i]=new TextField(100);
					tm2[i].setBounds(aab,aac,aad,aae);
					aac=aac+120;
					fm2.add(tm2[i]);
				}



				int aabb=130,aacc=200,aadd=20,aaee=20;
				 
				int cabb=300,cacc=200,cadd=20,caee=20;
				//ButtonGroup bg2=new ButtonGroup(); 
				int dabb=130,dacc=240,dadd=20,daee=20;
				//ButtonGroup bg3=new ButtonGroup(); 
				int eabb=300,eacc=240,eadd=20,eaee=20;
				//ButtonGroup bgm4=new ButtonGroup();
				ButtonGroup bgm1[]=new ButtonGroup[400];
								
				for(int i=1;i<=am;i++)
				{
					jrm1[i]=new JRadioButton();
					jrm2[i]=new JRadioButton();
					jrm3[i]=new JRadioButton();
					jrm4[i]=new JRadioButton();
					jrm1[i].setBounds(aabb,aacc,aadd,aaee);
					jrm2[i].setBounds(cabb,cacc,cadd,caee);
					jrm3[i].setBounds(dabb,dacc,dadd,daee);
					jrm4[i].setBounds(eabb,eacc,eadd,eaee);
					aacc=aacc+120;
					cacc=cacc+120;
					dacc=dacc+120;
					eacc=eacc+120;
					jrm1[i].setText("a");
					jrm2[i].setText("b");
					jrm3[i].setText("c");
					jrm4[i].setText("d");
					bgm1[i]=new ButtonGroup();
					bgm1[i].add(jrm1[i]);
					bgm1[i].add(jrm2[i]);
					bgm1[i].add(jrm3[i]);
					bgm1[i].add(jrm4[i]);
					fm2.add(jrm1[i]);
					fm2.add(jrm2[i]);
					fm2.add(jrm3[i]);
					fm2.add(jrm4[i]);
				}
			


				int cab=340,cac=200,cad=100,cae=20;
				for(int i=1;i<=am;i++)
				{
					tm3[i]=new TextField(100);
					tm3[i].setBounds(cab,cac,cad,cae);
					cac=cac+120;
					fm2.add(tm3[i]);
				}
				




		int dab=160,dac=240,dad=100,dae=20;
				for(int i=1;i<=am;i++)
				{
					tm4[i]=new TextField(100);
					tm4[i].setBounds(dab,dac,dad,dae);
					dac=dac+120;
					fm2.add(tm4[i]);
				}
				
				

		int eab=340,eac=240,ead=100,eae=20;
				for(int i=1;i<=am;i++)
				{
					tm5[i]=new TextField(100);
					tm5[i].setBounds(eab,eac,ead,eae);
					eac=eac+120;
					fm2.add(tm5[i]);
				}
				 
				

			
				//b2.setBounds(550,(eacc-70),80,20);
				bm2.setBounds(550,100,80,20);
				
				bm6.setBounds(20,40,50,20);
				Font font3 = new Font("Serif", Font.BOLD, 15);
		        	bm6.setFont(font3);
				fm2.add(bm6);
			
			
				fm2.add(bm2);
					bm6.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ee){
				
						 fm2.setVisible(false);
						 fm.setVisible(true);
						 tm[0].setText("");
					}});
				bm2.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ee){
				fm2.setVisible(false);
				rq2=rq2+1;
				bm8=new Button("Take test MCQ TIME:5MIN"); 
				}});
		
		
		}});

			
	
	
}});
			b64=new Button("Conduct True or False"); 
			b64.setBounds(100,220,200,30);
			b64.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ee){
			f10.setVisible(false);
			}});
			b65=new Button("Conduct Live class");  
			//CheckboxGroup cb = new CheckboxGroup(); 
        		//Checkbox checkbox1 = new Checkbox("Match The Following",cb,true);  
        		       		 
        		b65.setBounds(100,260,200,30);
			b65.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ee){
			f10.setVisible(false);
			}});
			l18.setBounds(80,50,250,50) ;
		 		try{
		   		    Font font = new Font("Serif", Font.BOLD, 30);
		   		    l18.setFont(font);
		   		   }catch(Exception e){System.out.println("yolo");}
       		  
		 f10.add(l18); 
	 	 f10.add(b61); 
		 f10.add(b62);
		 f10.add(b63);
		 f10.add(b64);
		 f10.add(b65); 
        	 f10.setSize(400,400);  
        	 f10.setLayout(null);  
        	 f10.setVisible(true);  
		 }});
			
       		 panel.add(b07); 
		 t1.setText("");
		t2.setText("");
		l7.setText("");
		f8.setVisible(false);
		}

	
			else if(d.getActionCommand()=="JoinGroup")
			{
			f9.setVisible(false);
			String pq=t21.getText();
			String zr=t22.getText();
			int az=Integer.parseInt(zr);
			String zr1=t31.getText();
			int at=Integer.parseInt(zr1);
			System.out.println(az);
			System.out.println(pq);
				if(at==az)
				{
				b007=new Button(pq);
				b007.setBounds(5,110,110,35);
				System.out.println(az);
				System.out.println(at);
				b007.setBackground(Color.yellow);
				panel1.add(b007);	
				}
				else
				   {	
				   f9.setVisible(true);
				   Label lk=new Label("Enter Valid Group ID");
				   lk.setBounds(140,220,150,20);
				   f9.add(lk);
			    	   }
			b007.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ee){
			
			
			f5.setVisible(true);
			panel1.setBounds(5,80,120,620);    
        		panel1.setBackground(Color.CYAN);
			Button b1=new Button("Join Group");
	  		b1.setBounds(5,30,110,25);    
        		b1.setBackground(Color.green);   
        		Label b2=new Label("   Groups Joined");  
			b2.setBounds(5,70,110,35); 
			b2.setBackground(Color.pink);   
        		panel1.add(b1); panel1.add(b2);
			panel1.setLayout(null);  
			b1.addActionListener(this);
			f5.add(panel1);	
			f5.setSize(700,700); 
        	 	f5.setLayout(null);

			panel2.setBounds(5,5,690,75);    
        		panel2.setBackground(Color.gray);
			Button bz1=new Button("Group Ranking");
			bz1.setForeground(Color.white);
	  		bz1.setBounds(300,40,110,25);    
        		bz1.setBackground(Color.gray);
			Button b3=new Button("((|))");
			b3.setForeground(Color.white);
	  		b3.setBounds(630,40,50,25);    
        		b3.setBackground(Color.gray);    
        		Label bz2=new Label("   koviZ"); 
			try{
		   	 Font font = new Font("Serif", Font.BOLD, 35);
		   	 bz2.setFont(font);
		   	 }catch(Exception e){System.out.println("yolo");}
			
			Button bz20=new Button(ww3); 
			try{
		   	 Font font = new Font("Serif", Font.BOLD, 23);
		   	 bz20.setFont(font);
		   	 }catch(Exception e){System.out.println("yolo");}
			bz20.setBounds(468,40,115,25);
			bz20.setBackground(Color.gray);
			bz20.setForeground(Color.white);
			bz20.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ee){
			  
        		f12=new Frame(); 
			Label ls=new Label("PROFILE"); 
			Label ls1=new Label("Name    :");
			Label ls2=new Label("Status   :");
			Label ls3=new Label("College :"); 
			Label ls4=new Label(ww3); 
			Label ls5=new Label("Student"); 
			Label ls6=new Label(ww4);
        		 
			ls.setBounds(150,70,200,20); 
			ls1.setBounds(130,220,80,20); 
			ls2.setBounds(130,250,80,20); 
			ls3.setBounds(130,280,80,20); 
			ls4.setBounds(210,220,80,20); 
			ls5.setBounds(210,250,80,20);  
			ls6.setBounds(210,280,80,20); 
		        
        		
			
					
	
				try{
				   Font font = new Font("Serif", Font.BOLD, 25);
				   Font font1 = new Font("Serif", Font.BOLD, 18);

		        	   ls.setFont(font);
					ls1.setFont(font1);
					ls2.setFont(font1);
					ls3.setFont(font1);
				   }catch(Exception e){}



			ImageIcon icon2= new ImageIcon("stu.jpg");
               		JLabel e1 = new JLabel( icon2, JLabel.CENTER);
			e1.setBounds(160,100,100,100);
			f12.add(e1);
 
	f12.add(ls);
	f12.add(ls1);
	f12.add(ls2);
	f12.add(ls3);
	f12.add(ls4);
	f12.add(ls5);
	f12.add(ls6);
	
        f12.setSize(400,400);    
        f12.setLayout(null);    
        f12.setVisible(true);    

			
			}});
			bz2.setForeground(Color.white); 
			bz2.setBounds(45,24,150,60); 
			//bz2.setBackground(Color.pink);   
			ImageIcon icon21= new ImageIcon("logo.jpg");
                	JLabel e11 = new JLabel( icon21, JLabel.CENTER);
			e11.setBounds(25,20,35,60);
			ImageIcon icon22= new ImageIcon("stu.jpg");
               		JLabel e12 = new JLabel( icon22, JLabel.CENTER);
			e12.setBounds(430,20,35,60);
			panel2.add(e12);
			panel2.add(e11);
        		panel2.add(bz1); panel2.add(bz2); panel2.add(bz20); panel2.add(b3);
			panel2.setLayout(null);  
			bz1.addActionListener(this);
			b3.addActionListener(this);
			f5.add(panel2);	
			
			
			panel4.setBounds(575,80,120,620);    
        		panel4.setBackground(Color.CYAN);
			Label bz29=new Label("Achivements"); 
			try{
		   	 Font font = new Font("Serif", Font.BOLD, 20);
		   	 bz29.setFont(font);
		   	 }catch(Exception e){System.out.println("yolo");}
			  
			bz29.setBounds(2,30,110,30); 
			bz29.setBackground(Color.green);
			    
			panel4.setLayout(null);  
			panel4.add(bz29);
			f5.add(panel4);
			

			Label bp2=new Label("Posts"); 
			try{
		   	 Font font = new Font("Serif", Font.BOLD, 30);
		   	 bp2.setFont(font);
		   	 }catch(Exception e){System.out.println("yolo");}
			bp2.setBounds(150,90,150,60);
			f5.add(bp2);
			
			if(rq==1)
			{
			bh6.setBounds(150,c+150,300,100);
			f5.add(bh6);
			


			bh6.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ee){
					
				lh6=new Label("Match The Following");
				lh6.setBounds(135,40,350,40);
				Font font5 = new Font("Serif", Font.BOLD, 25);
		        	lh6.setFont(font5);
				
				   String a[]=new String[5];
				   
				  
		
					for(int j=0;j<5;j++)
					{
			  		a[j]=th[j].getText();
					}
				   int aa=100,bb=100,cc=120,dd=20;
               				for(int z=0;z<5;z++)
					{
			 		lh2[z].setBounds(aa,bb,cc,dd);
                                 	bb=bb+30;
					lh2[z].setText(a[z]);
					Font font = new Font("Serif", Font.BOLD, 15);
		        		lh2[z].setFont(font);
					fh2.add(lh2[z]);
					}
			
     				   String r[]=new String[25];
	 
     					for(int k=10;k<17;k++)
					{
					 r[k]=th[k].getText();
					}
         	
					
				int ehe=290,ff=100,gg=120,hh=20;
 			for(int v=0,ra=10;v<7&&ra<17;v++,ra++)
			{
			 lh3[v].setBounds(ehe,ff,gg,hh);
			 ff=ff+30;
			 lh3[v].setText(r[ra]);
			 Font font1 = new Font("Serif", Font.BOLD, 15);
		         lh3[v].setFont(font1);
			 fh2.add(lh3[v]);
			}
				for(int ii=5;ii<10;ii++)
				{
				 fh2.add(th[ii]);
				}
		int aaa=70,bbb=100,ccc=20,ddd=20;
			for(int z=0;z<5;z++)
			{
			 lh4[z].setBounds(aaa,bbb,ccc,ddd);
                         bbb=bbb+30;
			 lh4[z].setText(""+(z+1)+".");
			 Font font2 = new Font("Serif", Font.BOLD, 15);
		         lh4[z].setFont(font2);
			 fh2.add(lh4[z]);
			}
		 
                
		int rk=270,rk1=100,rk2=20,rk3=20;
			for(int zz=0;zz<7;zz++)
			{
			
			lh5[zz].setBounds(rk,rk1,rk2,rk3);
			rk1=rk1+30;
			}


		 lh5[0].setText("a.");
                 lh5[1].setText("b.");
                 lh5[2].setText("c.");
		 lh5[3].setText("d.");
		 lh5[4].setText("e.");	
		 lh5[5].setText("f.");
		 lh5[6].setText("g.");
			for(int mk=0;mk<7;mk++)
			{
			Font font4 = new Font("Serif", Font.BOLD, 15);
		        lh5[mk].setFont(font4);
			fh2.add(lh5[mk]);
			}
			 
		   	 bh2.setBounds(350,320,50,20);
			 fh2.add(bh2);
		fh2.setBackground(Color.CYAN);
		fh2.setLayout(null);
		fh2.setVisible(true);
		fh2.setSize(500,400);
		fh2.add(lh6);
			bh2.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ee){
			fh1.setVisible(false);
		fh2.setVisible(false);
		
    		  int i=5,rt=17;
		  count=0;
                	 while(i<10&&rt<22)
		 	 {
                      	String sa=th[i].getText();
			String ca=th[rt].getText();
			
			//System.out.println(sa);
			//System.out.println(ca);
				if(sa.equalsIgnoreCase(ca))
                         	{
				count++;
				}
				i++;
				rt++;
 				}
				lh7=new Label("Submitted Successfully");
				//l7.setForeground(Color.green);
				lh7.setBounds(100,180,350,40);
				Font font5 = new Font("Serif", Font.BOLD, 30);
		        	lh7.setFont(font5);


			fh3.setBackground(Color.CYAN);
			fh3.setLayout(null);
			bh5.setBounds(190,260,100,25);
			Font font6 = new Font("Serif", Font.BOLD, 15);
		        bh5.setFont(font6);
			fh3.setVisible(true);
			fh3.setSize(500,500);
		        
			fh3.add(lh7);
			fh3.add(bh5);
			bh5.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ee){
					fh3.setVisible(false);
					fh4.setVisible(true);
					fh4.setSize(400,400);
					fh4.setBackground(Color.CYAN);
					fh4.setLayout(null);
					lh1[7].setBounds(120,180,200,40);
  	 				lh1[7].setText("You Got:  "+(count)+"  |  5");
					Font font1 = new Font("Serif", Font.BOLD, 20);
		        		lh1[7].setFont(font1); 
	 				lh1[8].setBounds(40,120,200,40);
   	 				lh1[8].setText("RESULTS ::");
					Font font = new Font("Serif", Font.BOLD, 25);
		        		lh1[8].setFont(font);		
	 				fh4.add(lh1[8]);	
	 				fh4.add(lh1[7]);  
			}});
			
			}});

			}});
			}
				if(rq1==1)
				{
				bbb6.setBounds(150,150,300,100);
				f5.add(bbb6);


				bbb6.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ee){
				fb2.setVisible(false);
				bb3=new Button("Submit");
				
					Label lbl=new Label("Fill in the Blanks");
					lbl.setBounds(60,80,350,30);
				try{
		   		   Font font = new Font("Serif", Font.BOLD, 30);
		   		   lbl.setFont(font);
				   }catch(Exception e){}
				
				fb1.add(lbl);
	
		

					int a=Integer.parseInt(tb[0].getText());
					int bbb=50,bcc=160,bdd=20,bee=20;
						for(int i=1;i<=a;i++)
						{
						Lb2[i]=new Label();
						Lb2[i].setBounds(bbb,bcc,bdd,bee);
						bcc=bcc+40;
						Lb2[i].setText(i+".");
						Font font3 = new Font("Serif", Font.BOLD, 18);
		        			Lb2[i].setFont(font3); 
						fb1.add(Lb2[i]);
						}
					
					int cb=70,cc=160,cd=520,ce=20;
						for(int i=1;i<=a;i++)
						{
						Lb3[i]=new Label();
						Lb3[i].setText(tb[i].getText());
						Lb3[i].setBounds(cb,cc,cd,ce);
						Font font4 = new Font("Serif", Font.BOLD, 15);
		        			Lb3[i].setFont(font4); 
						cc=cc+40;
						fb1.add(Lb3[i]);
						}
					int aabb=610,aacc=160,aadd=110,aaee=20;
						for(int i=1;i<=a;i++)
						{
						tb2[i]=new TextField(100);
						tb2[i].setBounds(aabb,aacc,aadd,aaee);
						aacc=aacc+40;
						fb1.add(tb2[i]);
						}
					

					bb3.setBounds(635,(aacc+30),90,20);
					
					fb1.add(bb3);
					fb1.setSize(750,500);
					fb1.setVisible(true);
					

		bb3.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ee){
		fb1.setVisible(false);
		fb3.setVisible(true);
		bb4=new Button("Show Results");
		fb3.setBackground(Color.CYAN);
		fb3.setLayout(null);
		fb3.setSize(500,500);
				lb7=new Label("Submitted Successfully");
				//l7.setForeground(Color.green);
				lb7.setBounds(100,180,350,40);
				Font font5 = new Font("Serif", Font.BOLD, 30);
		        	lb7.setFont(font5);



		bb4.setBounds(190,260,100,25);
		Font font6 = new Font("Serif", Font.BOLD, 15);
		bb4.setFont(font6);
		int i=1,rt=160;
		count=0;
		mark=Integer.parseInt(tb[0].getText());
              		while(i<=mark)
			{
			String sa=tb1[i].getText();
			String ca=tb2[i].getText();
			
			//System.out.println(sa);
			//System.out.println(ca);
				if(sa.equalsIgnoreCase(ca))
                         	{
				count++;
				i++;
				}
			 	else 
				{
				i++;
				}
				
			rt=rt+40;	
			}
 	// label for printing you got so and so marks
	/*L4[0]=new Label();
	  Lb4[1]=new Label();
	Lb4[0].setBounds(160,(rt+100),200,20);
   	Lb4[0].setText("You Got : "+count+"/"+a);	
        Lb4[1].setBounds(100,(rt+70),100,20);
   	Lb4[1].setText("RESULTS : :");		
  	fb1.add(Lb4[1]);	
  	fb1.add(Lb4[0]);*/
			fb3.add(lb7);
			fb3.add(bb4);
			
					bb4.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ee){
					fb3.setVisible(false);
					fb4.setVisible(true);
					fb4.setSize(400,400);
					fb4.setBackground(Color.CYAN);
					fb4.setLayout(null);
					Lb4[0]=new Label();
	  				Lb4[1]=new Label();
					Lb4[0].setBounds(120,180,200,40);
  	 				Lb4[0].setText("You Got:  "+(count)+"  |  "+mark);
					Font font1 = new Font("Serif", Font.BOLD, 20);
		        		Lb4[0].setFont(font1); 
	 				Lb4[1].setBounds(40,120,200,40);
   	 				Lb4[1].setText("RESULTS ::");
					Font font = new Font("Serif", Font.BOLD, 25);
		        		Lb4[1].setFont(font);		
	 				fb4.add(Lb4[1]);	
	 				fb4.add(Lb4[0]);  

			}});
					}});
					}});
					}
				
				if(rq2==1)
				{
				bm8.setBounds(150,c+150,300,100);
				f5.add(bm8);
			
				bm8.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ee){
					fm2.setVisible(false);
				Label lml=new Label("Choose the Correct answers");
				bm5=new Button("submit");
				bm30=new Button("Prev");
				bm31=new Button("Next");
				lml.setBounds(60,60,370,30);
				bm30.setBounds(300,300,50,20);
				bm31.setBounds(351,300,50,20);
				
		 	try{
		   	    Font font = new Font("Serif", Font.BOLD, 30);
		   	    lml.setFont(font);
		     	   }catch(Exception e){}
				bm30.addActionListener(this);
				bm31.addActionListener(this);
				fm1.add(lml);
				fm1.add(bm30);
				fm1.add(bm31);
				
				


					//int a=Integer.parseInt(tm[0].getText());
					if(am<=3)
					{
					int fb=320,fc=330,fd=20,fe=20;
						for(int i=1;i<=am;i++)
						{
							bm4[i]=new Button(""+i);
							bm4[i].setBounds(fb,fc,fd,fe);
							fb=fb+20;
							fm1.add(bm4[i]);
							bm4[i].addActionListener(this);
						}

					 }
					else if(am>3&&am<=6)
					{
					int fb=300,fc=330,fd=20,fe=20;
						for(int i=1;i<=am;i++)
						{
							bm4[i]=new Button(""+i);
							bm4[i].setBounds(fb,fc,fd,fe);
							fb=fb+20;
							fm1.add(bm4[i]);
							bm4[i].addActionListener(this);
						}

					 }
					else if(am>6&&am<=12)
					{
						int fb=250,fc=330,fd=20,fe=20;
						for(int i=1;i<=am;i++)
						{
							bm4[i]=new Button(""+i);
							bm4[i].setBounds(fb,fc,fd,fe);
							fb=fb+20;
							fm1.add(bm4[i]);
							bm4[i].addActionListener(this);
						}

					}
					else if(am>12&&am<=15)
					{
						int fb=200,fc=330,fd=20,fe=20;
						for(int i=1;i<=am;i++)
						{
							bm4[i]=new Button(""+i);
							bm4[i].setBounds(fb,fc,fd,fe);
							fb=fb+20;
							fm1.add(bm4[i]);
							bm4[i].addActionListener(this);
						}

					}
					else if(am>15&&am<=20)
					{
						int fb=150,fc=330,fd=20,fe=20;
						for(int i=1;i<=am;i++)
						{
							bm4[i]=new Button(""+i);
							bm4[i].setBounds(fb,fc,fd,fe);
							fb=fb+20;
							fm1.add(bm4[i]);
							bm4[i].addActionListener(this);
						}

					}
					else if(am>20)
					{
						int fb=98,fc=330,fd=20,fe=20;
						for(int i=1;i<=am;i++)
						{
							bm4[i]=new Button(""+i);
							bm4[i].setBounds(fb,fc,fd,fe);
							fb=fb+20;
							fm1.add(bm4[i]);
							bm4[i].addActionListener(this);
						}

					}

		for(int i=0;i<10;i++)
		{
		Lm6[i]=new Label();
		}
			
					fm1.setBackground(Color.CYAN);
					jrm5[0].setBounds(130,200,20,20);
					jrm6[0].setBounds(300,200,20,20);
					jrm7[0].setBounds(130,240,20,20);
					jrm8[0].setBounds(300,240,20,20);
				
			
			
					jrm5[0].setText("a");
					jrm6[0].setText("b");
					jrm7[0].setText("c");
					jrm8[0].setText("d");
					bgm2[0]=new ButtonGroup();
					bgm2[0].add(jrm5[0]);
					bgm2[0].add(jrm6[0]);
					bgm2[0].add(jrm7[0]);
					bgm2[0].add(jrm8[0]);
					fm1.add(jrm5[0]);
					fm1.add(jrm6[0]);
					fm1.add(jrm7[0]);
					fm1.add(jrm8[0]);



		
		Lm6[0].setText(Lm[1].getText());
		Lm6[1].setText(tm[1].getText());
		Lm6[3].setText(tm2[1].getText());
		Lm6[5].setText(tm3[1].getText());	
		Lm6[7].setText(tm4[1].getText());
		Lm6[9].setText(tm5[1].getText());


		Lm6[0].setBounds(80,160,20,20);
		Lm6[1].setBounds(100,160,450,20);
		Lm6[3].setBounds(160,200,120,20);
		Lm6[5].setBounds(340,200,120,20);	
		Lm6[7].setBounds(160,240,100,20);
		Lm6[9].setBounds(340,240,100,20);



		for(int i=0;i<10;i++)
		{
		fm1.add(Lm6[i]);
		}

/*String m=h.getActionCommand();
int i=Integer.parseInt(m);
bm4[i].addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ee){

 zm=Integer.parseInt(m);
Lm6[0].setText(Lm[zm].getText());
Lm6[1].setText(tm[zm].getText());
Lm6[3].setText(tm2[zm].getText());
Lm6[5].setText(tm3[zm].getText());	
Lm6[7].setText(tm4[zm].getText());
Lm6[9].setText(tm5[zm].getText());
Lm6[0].setBounds(80,160,20,20);
Lm6[1].setBounds(100,160,450,20);
Lm6[3].setBounds(160,200,120,20);
Lm6[5].setBounds(340,200,120,20);
Lm6[7].setBounds(160,240,100,20);
Lm6[9].setBounds(340,240,100,20);
		
		
for(int i=0;i<10;i++)
{
fm1.add(Lm6[i]);
}

jrm5[zm].setText("a");
jrm6[zm].setText("b");
jrm7[zm].setText("c");
jrm8[zm].setText("d");
bgm2[zm]=new ButtonGroup();
bgm2[zm].add(jrm5[zm]);
bgm2[zm].add(jrm6[zm]);
bgm2[zm].add(jrm7[zm]);
bgm2[zm].add(jrm7[zm]);
jrm5[zm].setBounds(130,200,20,20);
jrm6[zm].setBounds(300,200,20,20);
jrm7[zm].setBounds(130,240,20,20);
jrm8[zm].setBounds(300,240,20,20);
					
fm1.add(jrm5[zm]);
fm1.add(jrm6[zm]);
fm1.add(jrm7[zm]);
fm1.add(jrm8[zm]);
				


}});*/



			
				bm5.setBounds(550,370,100,20);
				fm1.add(bm5);
				
				fm1.setSize(750,500);
				fm1.setVisible(true);

						bm5.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ee){	
								fm1.setVisible(false);
								fm3.setSize(500,500);
								fm3.setVisible(true);
								
								fm3.setBackground(Color.CYAN);
								fm3.setLayout(null);
			
								lm7=new Label("Submitted Successfully");
								//l7.setForeground(Color.green);
								lm7.setBounds(100,180,350,40);
								Font font5 = new Font("Serif", Font.BOLD, 30);
		        					lm7.setFont(font5);

								bm7=new Button("Show Results");
								bm7.setBounds(190,260,100,25);
								Font font6 = new Font("Serif", Font.BOLD, 15);
								bm7.setFont(font6);
								//int i=1,rt=160;
		
								//mark=Integer.parseInt(t[0].getText());
              		
 								// label for printing you got so and so marks

								/*L4[1]=new Label();
								Lm4[0].setBounds(160,(rt+100),200,20);
   								Lm4[0].setText("You Got : "+count+"/"+a);	
        							Lm4[1].setBounds(100,(rt+70),100,20);
   								Lm4[1].setText("RESULTS : :");*/
								fm3.add(lm7);
								fm3.add(bm7);
								bm5.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ee){
								}});
						}});
				}});
				}
			
    /*  else if(d.getActionCommand()=="Prev")
      {
		if(zm==1)
				{
			Lm6[0].setText(Lm[zm].getText());
			Lm6[1].setText(tm[zm].getText());
			Lm6[3].setText(tm2[zm].getText());
			Lm6[5].setText(tm3[zm].getText());	
			Lm6[7].setText(tm4[zm].getText());
			Lm6[9].setText(tm5[zm].getText());


			Lm6[0].setBounds(80,160,20,20);
			Lm6[1].setBounds(100,160,450,20);
			Lm6[3].setBounds(160,200,120,20);
			Lm6[5].setBounds(340,200,120,20);
			Lm6[7].setBounds(160,240,100,20);
			Lm6[9].setBounds(340,240,100,20);


							
					jrm5[zm].setBounds(130,200,20,20);
					jrm6[zm].setBounds(300,200,20,20);
					jrm7[zm].setBounds(130,240,20,20);
					jrm8[zm].setBounds(300,240,20,20);
				
			
			
					jrm5[zm].setText("a");
					jrm6[zm].setText("b");
					jrm7[zm].setText("c");
					jrm8[zm].setText("d");
					bgm2[zm]=new ButtonGroup();
					bgm2[zm].add(jrm5[zm]);
					bgm2[zm].add(jrm6[zm]);
					bgm2[zm].add(jrm7[zm]);
					bgm2[zm].add(jrm8[zm]);
					fm1.add(jrm5[zm]);
					fm1.add(jrm6[zm]);
					fm1.add(jrm7[zm]);
					fm1.add(jrm8[zm]);

				


		}
		else
		{
			Lm6[0].setText(Lm[zm-1].getText());
			Lm6[1].setText(tm[zm-1].getText());
			Lm6[3].setText(tm2[zm-1].getText());
			Lm6[5].setText(tm3[zm-1].getText());	
			Lm6[7].setText(tm4[zm-1].getText());
			Lm6[9].setText(tm5[zm-1].getText());


			Lm6[0].setBounds(80,160,20,20);
			Lm6[1].setBounds(100,160,450,20);
			Lm6[3].setBounds(160,200,120,20);
			Lm6[5].setBounds(340,200,120,20);
			Lm6[7].setBounds(160,240,100,20);
			Lm6[9].setBounds(340,240,100,20);



							
					jrm5[zm-1].setBounds(130,200,20,20);
					jrm6[zm-1].setBounds(300,200,20,20);
					jrm7[zm-1].setBounds(130,240,20,20);
					jrm8[zm-1].setBounds(300,240,20,20);
				
			
			
					jrm5[zm-1].setText("a");
					jrm6[zm-1].setText("b");
					jrm7[zm-1].setText("c");
					jrm8[zm-1].setText("d");
					bgm2[zm-1]=new ButtonGroup();
					bgm2[zm-1].add(jrm5[zm-1]);
					bgm2[zm-1].add(jrm6[zm-1]);
					bgm2[zm-1].add(jrm7[zm-1]);
					bgm2[zm-1].add(jrm8[zm-1]);
					fm1.add(jrm5[zm-1]);
					fm1.add(jrm6[zm-1]);
					fm1.add(jrm7[zm-1]);
					fm1.add(jrm8[zm-1]);
				}
      }

 	else if(d.getActionCommand()=="Next")
      	{
		Lm6[0].setText(Lm[zm+1].getText());
		Lm6[1].setText(tm[zm+1].getText());
		Lm6[3].setText(tm2[zm+1].getText());
		Lm6[5].setText(tm3[zm+1].getText());	
		Lm6[7].setText(tm4[zm+1].getText());
		Lm6[9].setText(tm5[zm+1].getText());


		
		Lm6[0].setBounds(80,160,20,20);
		Lm6[1].setBounds(100,160,450,20);
		Lm6[3].setBounds(160,200,120,20);
		Lm6[5].setBounds(340,200,120,20);
		Lm6[7].setBounds(160,240,100,20);
		Lm6[9].setBounds(340,240,100,20);


						
					jrm5[zm+1].setBounds(130,200,20,20);
					jrm6[zm+1].setBounds(300,200,20,20);
					jrm7[zm+1].setBounds(130,240,20,20);
					jrm8[zm+1].setBounds(300,240,20,20);
				
			
			
					jrm5[zm+1].setText("a");
					jrm6[zm+1].setText("b");
					jrm7[zm+1].setText("c");
					jrm8[zm+1].setText("d");
					bgm2[zm+1]=new ButtonGroup();
					bgm2[zm+1].add(jrm5[zm+1]);
					bgm2[zm+1].add(jrm6[zm+1]);
					bgm2[zm+1].add(jrm7[zm+1]);
					bgm2[zm+1].add(jrm8[zm+1]);
					fm1.add(jrm5[zm+1]);
					fm1.add(jrm6[zm+1]);
					fm1.add(jrm7[zm+1]);
					fm1.add(jrm8[zm+1]);






		for(int i=0;i<10;i++)
		{
		fm1.add(Lm6[i]);
		}
		
		zm=zm+1;
        }*/


			
			
}});




		
	
}}
	public static void main(String f[])
	{
	LogIn j=new LogIn();
	
	}

}
