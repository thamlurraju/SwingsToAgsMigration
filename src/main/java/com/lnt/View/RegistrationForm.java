package com.lnt.View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javafx.application.Preloader.StateChangeNotification;

	public class RegistrationForm 
	{
		
	

	JLabel regLabel,nameLabel,genderLabel,passwordLabel,dobLabel,mobLabel,emailLabel,areaLabel,stateLabel,maleLabel,femaleLabel,nationalityLabel,s1,s2,s3;
	JPanel panel;
	JFrame jf;
	JButton registerButton;
	JTextField nameTextField,textfield2,passwordTextfield,dayTextfield,monthTextfield,yearTextfield,mobileTextfield,mailTextfield,areaTextfield,stateTextfield,nationTextfield;
	JPasswordField passwordfield1;
	JRadioButton radiobutton2,radiobutton3;
	String name,gender,dob1,dob2,dob,dobb,password,mobileNumber,email,area,state,nationality,selectedState;
	JComboBox combobox1;
	Connection con1;
	Statement st1;
	int index,count;
	//String states[] = new String[50];

	public RegistrationForm(String args)
	{
	initComponents();
	event();

	}

	public void initComponents() {
	jf=new javax.swing.JFrame("Registration Form");
	panel=new javax.swing.JPanel();
	jf.add(panel);
	panel.setBackground(new Color(191,239,255));
	panel.setLayout(null);
	jf.setSize(970,700);
	jf.show();

	regLabel=new javax.swing.JLabel("Registration Form");
	regLabel.setFont(new Font("Dialog", Font.ITALIC, 24));
	regLabel.setBounds(300,20,400,40);
	panel.add(regLabel);

	nameLabel=new javax.swing.JLabel("Name");
	nameLabel.setFont(new Font("Dialog", Font.BOLD, 20));
	nameLabel.setBounds(100,80,150,40);
	panel.add(nameLabel);

	genderLabel=new javax.swing.JLabel("Gender");
	genderLabel.setFont(new Font("Dialog", Font.BOLD, 20));
	genderLabel.setBounds(100,140,150,40);
	//panel.add(genderLabel);

	passwordLabel=new javax.swing.JLabel("Password");
	passwordLabel.setFont(new Font("Dialog", Font.BOLD, 20));
	passwordLabel.setBounds(100,140,150,40);
	panel.add(passwordLabel);

	dobLabel=new javax.swing.JLabel("Date Of Birth");
	dobLabel.setFont(new Font("Dialog", Font.BOLD, 20));
	//dobLabel.setBounds();
	//panel.add(dobLabel);

	mobLabel=new javax.swing.JLabel("Mobile Number");
	mobLabel.setFont(new Font("Dialog", Font.BOLD, 20));
	mobLabel.setBounds(100,200,150,40);
	panel.add(mobLabel);

	emailLabel=new javax.swing.JLabel("E-mail");
	emailLabel.setFont(new Font("Dialog", Font.BOLD, 20));
	emailLabel.setBounds(100,260,150,40);
	panel.add(emailLabel);

	areaLabel=new javax.swing.JLabel("Area");
	areaLabel.setFont(new Font("Dialog", Font.BOLD, 20));
	areaLabel.setBounds(100,320,150,40);
	panel.add(areaLabel);

	

	nameTextField=new javax.swing.JTextField();
	nameTextField.setFont(new Font("Dialog", Font.BOLD, 16));
	nameTextField.setBounds(350,80,180,30);
	panel.add(nameTextField);

	maleLabel=new javax.swing.JLabel("Male");
	maleLabel.setFont(new Font("Dialog", Font.BOLD, 20));
	maleLabel.setBounds(350,140,60,40);
	//panel.add(maleLabel);

	femaleLabel=new javax.swing.JLabel("Female");
	femaleLabel.setFont(new Font("Dialog", Font.BOLD, 20));
	femaleLabel.setBounds(460,140,100,40);
	//panel.add(femaleLabel);
	
	stateLabel=new javax.swing.JLabel("State");
	stateLabel.setFont(new Font("Dialog", Font.BOLD, 20));
	stateLabel.setBounds(100,380,150,40);
	panel.add(stateLabel);

	nationalityLabel=new javax.swing.JLabel("Nationality");
	nationalityLabel.setFont(new Font("Dialog", Font.BOLD, 20));
	nationalityLabel.setBounds(100,440,150,40);
	panel.add(nationalityLabel);

	radiobutton2=new javax.swing.JRadioButton();
	radiobutton2.setFont(new Font("Dialog", Font.BOLD, 16));
	radiobutton2.setBounds(420,140,20,30);
//	panel.add(radiobutton2);

	radiobutton3=new javax.swing.JRadioButton();
	radiobutton3.setFont(new Font("Dialog", Font.BOLD, 16));
	radiobutton3.setBounds(570,140,20,30);
	//panel.add(radiobutton3);

	ButtonGroup jb = new ButtonGroup();
	jb.add(radiobutton2);
	jb.add(radiobutton3);

	passwordTextfield=new javax.swing.JPasswordField();
	passwordTextfield.setFont(new Font("Dialog", Font.BOLD, 16));
	passwordTextfield.setBounds(350,140,180,30);
	panel.add(passwordTextfield);

	dayTextfield=new javax.swing.JTextField();
	dayTextfield.setFont(new Font("Dialog", Font.BOLD, 16));
	dayTextfield.setBounds(350,260,40,30);
	//panel.add(dayTextfield);

	s1=new javax.swing.JLabel("/");
	s1.setFont(new Font("Dialog", Font.BOLD, 16));
	s1.setBounds(400,260,20,30);
	//panel.add(s1);

	monthTextfield=new javax.swing.JTextField();
	monthTextfield.setFont(new Font("Dialog", Font.BOLD, 16));
	monthTextfield.setBounds(430,260,40,30);
	//panel.add(monthTextfield);

	s2=new javax.swing.JLabel("/");
	s2.setFont(new Font("Dialog", Font.BOLD, 16));
	s2.setBounds(480,260,20,30);
	//panel.add(s2);

	yearTextfield=new javax.swing.JTextField();
	yearTextfield.setFont(new Font("Dialog", Font.BOLD, 16));
	yearTextfield.setBounds(510,260,100,30);
	//panel.add(yearTextfield);

	s3=new javax.swing.JLabel("DD/MM/YYYY");
	s3.setFont(new Font("Dialog", Font.BOLD, 16));
	s3.setBounds(620,260,150,30);
	//panel.add(s3);

	mobileTextfield=new javax.swing.JTextField();
	mobileTextfield.setFont(new Font("Dialog", Font.BOLD, 16));
	mobileTextfield.setBounds(350,200,180,30);
	panel.add(mobileTextfield);

	mailTextfield=new javax.swing.JTextField();
	mailTextfield.setFont(new Font("Dialog", Font.BOLD, 16));
	mailTextfield.setBounds(350,260,180,30);
	panel.add(mailTextfield);

	areaTextfield=new javax.swing.JTextField();
	areaTextfield.setFont(new Font("Dialog", Font.BOLD, 16));
	areaTextfield.setBounds(350,320,180,30);
	panel.add(areaTextfield);

	stateTextfield=new javax.swing.JTextField();
	stateTextfield.setFont(new Font("Dialog", Font.BOLD, 16));
	stateTextfield.setBounds(350,380,180,30);
	panel.add(stateTextfield);

	nationTextfield=new javax.swing.JTextField();
	nationTextfield.setFont(new Font("Dialog", Font.BOLD, 16));
	nationTextfield.setBounds(350,440,180,30);
	panel.add(nationTextfield);

	registerButton = new javax.swing.JButton("Register");
	registerButton.setFont(new Font("Dialog", Font.BOLD, 16));
	registerButton.setBounds(250,500,100,30);
	panel.add(registerButton);

	combobox1 = new JComboBox();
	combobox1.setBounds(350,500,180,30);
	combobox1.setFont(new Font("Dialog",Font.BOLD,18));
	//panel.add(combobox1);

	/*states[0] = "Karnataka";
	states[1] = "Arunachal Pradesh";
	states[2] = "Assam";
	states[3] = "Bihar";
	states[4] = "Chhattisgarh";
	states[5] = "Goa";
	states[6] = "Gujarat";
	states[7] = "Haryana";
	states[8] = "Himachal Pradesh";
	states[9] = "Jammu and Kashmir";
	states[10] = "Jharkhand";
	states[11] = "Andra Pradesh";
	states[12] = "Kerala";
	states[13] = "Madya Pradesh";
	states[14] = "Maharashtra";
	states[15] = "Manipur";
	states[16] = "Meghalaya";
	states[17] = "Mizoram";
	states[18] = "Nagaland";
	states[19] = "Orissa";
	states[20] = "Punjab";
	states[21] = "Rajasthan";
	states[22] = "Sikkim";
	states[23] = "Tamil Nadu";
	states[24] = "Tripura";
	states[25] = "Uttaranchal";
	states[26] = "Uttar Pradesh";
	states[27] = "West Bengal";
	states[28] = "Andaman and Nicobar Islands";
	states[29] = "Chandigarh";
	states[30] = "Dadar and Nagar Haveli";
	states[31] = "Daman and Diu";
	states[32] = "Delhi";
	states[33] = "Lakshadeep";
	states[34] = "Pondicherry";*/

/*	for (int j= 0 ; j< 35; j++) {
		combobox1.addItem(states[j]);
		} */
	gender = ""; 
		}
	
	
	public void event() { 
			nameTextField.addKeyListener(new KeyAdapter() { public void keyTyped(KeyEvent e) { char c = e.getKeyChar(); String sag=nameTextField.getText(); if (!(((c >= 'a')||(c >= 'A')) && ((c <= 'z')||(c <= 'Z')) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) { e.consume(); } } }); dayTextfield.addKeyListener(new KeyAdapter() { public void keyTyped(KeyEvent e) { char c = e.getKeyChar(); if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) { // getToolkit().beep(); e.consume(); } } }); textfield4b.addKeyListener(new KeyAdapter() { public void keyTyped(KeyEvent e) { char c = e.getKeyChar(); if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) { // getToolkit().beep(); e.consume(); } } }); textfield4c.addKeyListener(new KeyAdapter() { public void keyTyped(KeyEvent e) { char c = e.getKeyChar(); if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) { // getToolkit().beep(); e.consume(); } } }); textfield5.addKeyListener(new KeyAdapter() { public void keyTyped(KeyEvent e) { char c = e.getKeyChar(); if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) { // getToolkit().beep(); e.consume(); } } }); textfield7.addKeyListener(new KeyAdapter() { public void keyTyped(KeyEvent e) { char c = e.getKeyChar(); String sag=textfield1.getText(); if (!(((c >= 'a')||(c >= 'A')) && ((c <= 'z')||(c <= 'Z')) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) { e.consume(); } } }); textfield9.addKeyListener(new KeyAdapter() { public void keyTyped(KeyEvent e) { char c = e.getKeyChar(); String sag=textfield1.getText(); if (!(((c >= 'a')||(c >= 'A')) && ((c <= 'z')||(c <= 'Z')) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
	e.consume();
	}
	}
	});

	registerButton.addActionListener(new ActionListener()
	{
	public void actionPerformed(ActionEvent event)
	{

	//getUserInformation();
	//validation();
	//registerUserData();

	}
	});

	combobox1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent event)
	{
	Object selectedStateobj = combobox1.getSelectedItem();
	selectedState = String.valueOf(selectedStateobj);
	index = combobox1.getSelectedIndex();

	}
	});

	radiobutton2.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	gender = "Male";
	}
	});
	radiobutton3.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	gender = "Female";
	}
	});
	}
	public void getUserInformation() {

	name = nameTextField.getText();
	password = passwordTextfield.getText();
	//dob = dayTextfield.getText();
	//dob1 = monthTextfield.getText();
	//dob2 = yearTextfield.getText();
	//dobb = dob + "/" + dob1 + "/" + dob2;
	mobileNumber = mobileTextfield.getText();
	email = mailTextfield.getText();
	area = areaTextfield.getText();
	state = selectedState;
	nationality = nationTextfield.getText();

	}

	public void validation() {
	count = 0;

	if(name.equals(""))
	{
	JOptionPane.showMessageDialog(null,"Enter Name");
	}
	else if(password.equals(""))
	{
	JOptionPane.showMessageDialog(null,"Enter Father Name");
	}
	else if(dob.equals(""))
	{
	JOptionPane.showMessageDialog(null,"Enter Date");
	}
	else if(dob1.equals(""))
	{
	JOptionPane.showMessageDialog(null,"Enter Month");
	}
	else if(dob2.equals(""))
	{
	JOptionPane.showMessageDialog(null,"Enter Year");
	}

	else if(mobileNumber.equals(""))
	{
	JOptionPane.showMessageDialog(null,"Enter Mobile Number");
	}

	else if(email.equals(""))
	{
	JOptionPane.showMessageDialog(null,"Enter E-Mail address");
	}

	else if(area.equals(""))
	{
	JOptionPane.showMessageDialog(null,"Enter Area");
	}

	/*else if(selectedState.equals(""))
	{
	JOptionPane.showMessageDialog(null,"Select State");
	}*/
	else if(nationality.equals(""))
	{
	JOptionPane.showMessageDialog(null,"Enter Nationality");
	}
/*	else if(gender.equals(""))
	{
	JOptionPane.showMessageDialog(null,"Select gender");
	}*/
	else {
	if((Integer.parseInt(dob2)<=2010) && (Integer.parseInt(dob2)>=1900))
	{
	if((Integer.parseInt(dob1)<=12) && (Integer.parseInt(dob1)>0))
	{
	if((Integer.parseInt(dob1)==1) || (Integer.parseInt(dob1)==3) || (Integer.parseInt(dob1)==5) || (Integer.parseInt(dob1)==7) || (Integer.parseInt(dob1)==8) || (Integer.parseInt(dob1)==10) || (Integer.parseInt(dob1)==12))
	{
	if((Integer.parseInt(dob)<=31) && (Integer.parseInt(dob)>=1))
	{
	dobb=dob+"/"+dob1+"/"+dob2;

	if(email.contains("@") && email.contains(".com")) {
	if(mobileNumber.length()==10) {
	count++;
	}
	else {
	JOptionPane.showMessageDialog(null,"Enter 10-digit moblie number");
	}
	}
	else {
	JOptionPane.showMessageDialog(null,"Enter valid mail ID");
	}

	}
	else
	{
	JOptionPane.showMessageDialog(null,"Invalid Date");
	}
	}
	else if((Integer.parseInt(dob1)==4) || (Integer.parseInt(dob1)==6) || (Integer.parseInt(dob1)==9) || (Integer.parseInt(dob1)==11))
	{
	if((Integer.parseInt(dob)<=30) && (Integer.parseInt(dob)>=1))
	{
	dobb=dob+"/"+dob1+"/"+dob2;

	if(email.contains("@") && email.contains(".com")) {
	if(mobileNumber.length()==10) {
	count++;
	}
	else {
	JOptionPane.showMessageDialog(null,"Enter 10-digit moblie number");
	}
	}
	else {
	JOptionPane.showMessageDialog(null,"Enter valid mail ID");
	}

	}
	else
	{
	JOptionPane.showMessageDialog(null,"Invalid Date");
	}
	}
	else
	{
	if(((Integer.parseInt(dob2)%100)==0) || ((Integer.parseInt(dob2)%4)==0))
	{
	if((Integer.parseInt(dob)<=29) && (Integer.parseInt(dob)>=1))
	{
	dobb=dob+"/"+dob1+"/"+dob2;
	}
	else
	{
	JOptionPane.showMessageDialog(null,"Invalid Date");
	}
	}
	else
	{
	if((Integer.parseInt(dob)<=28) && (Integer.parseInt(dob)>=1))
	{
	dobb=dob+"/"+dob1+"/"+dob2;
	}
	else
	{
	JOptionPane.showMessageDialog(null,"Invalid Date");
	}
	}
	}
	}
	else
	{
	JOptionPane.showMessageDialog(null,"Enter month between 1 and 12");
	}
	}
	else
	{
	JOptionPane.showMessageDialog(null,"Enter year between 1900 and 2010");
	}
	}
	}

	/*public void registerUserData() {
	try {

	if(count==1) {
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	con1 = DriverManager.getConnection("jdbc:odbc:user");
	st1 = con1.createStatement();
	st1.execute("INSERT INTO User_Details (Name,Gender,Password,DOB,Mobile_Number,Email,Area,State,Nationality,StateIndex) VALUES('"+name+"','"+gender+"','"+password+"','"+dobb+"','"+mobileNumber+"','"+email+"','"+area+"','"+state+"','"+nationality+"',"+index+")");
	st1.close();
	con1.close();
	JOptionPane.showMessageDialog(null,"Data are Registered Successfully");
	}

	}
	catch (Exception e) {
	System.out.println("Exception1 is " + e);
	}

	}*/

	 public JTextField getFirstnameTextfield() {
		  return nameTextField;
		 }
		 
		 public void setFirstnameTextfield(JTextField firstnameTextfield) {
		  this.nameTextField = firstnameTextfield;
		 }
		 public JRadioButton getMaleGender() {
			  return radiobutton2;
			 }
			 
			 public void setMaleGender(JRadioButton radiobutton2) {
			  this.radiobutton2 = radiobutton2;
			 }
			 public JRadioButton getFemaleGender() {
				  return radiobutton3;
				 }
				 
				 public void setFemaleGender(JRadioButton radiobutton3) {
				  this.radiobutton3 = radiobutton3;
				 }
			 public JTextField getPassword() {
				  return passwordTextfield;
				 }
				 
				 public void setPassword(JTextField passwordTextfield) {
				  this.passwordTextfield = passwordTextfield;
				 }
				 
				 public JTextField getDay() {
					  return dayTextfield;
					 }
					 
					 public void setDay(JTextField textfield4a) {
					  this.dayTextfield = textfield4a;
					 }	 
					 public JTextField getMonth() {
						  return monthTextfield;
						 }
						 
						 public void setMonth(JTextField monthTextfield) {
						  this.monthTextfield = monthTextfield;
						 }	
						 public JTextField getYear() {
							  return yearTextfield;
							 }
							 
							 public void setYear(JTextField yearTextfield) {
							  this.yearTextfield = yearTextfield;
							 }	
							 public JTextField getMail() {
								  return mailTextfield;
								 }
								 
								 public void setMail(JTextField mailTextfield) {
								  this.mailTextfield = mailTextfield;
								 }			 
								 public JTextField getArea() {
									  return areaTextfield;
									 }
									 
									 public void setArea(JTextField areaTextfield) {
									  this.areaTextfield = areaTextfield;
									 }		
									 
									 public JTextField getState() {
										  return stateTextfield;
										 }
										 
										 public void setState(JTextField stateTextfield) {
										  this.stateTextfield = stateTextfield;
										 }
										 
										 public JTextField getNation() {
											  return nationTextfield;
											 }
											 
											 public void setNation(JTextField nationTextfield) {
											  this.nationTextfield = nationTextfield;
						
											 }	 
											 public JTextField getMobileNumber() {
												  return mobileTextfield;
												 }
												 
												 public void setMobileNumber(JTextField mobileTextfield) {
												  this.mobileTextfield = mobileTextfield;
							
												 }	 			 
		 public JButton getSubmitButton() {
			 return registerButton;
					 
		 }
		 public void setSubmitButton(JButton saveButton) {
			  this.registerButton = saveButton;
			 }
	}



