import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.Color;

public class Calculator {

	private JFrame frmCalculator;
	private JTextField txtDisplay;
	private JButton btn8;
	private JButton btn9;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn0;
	private JButton btnPlus;
	private JButton btnMinus;
	private JButton btnDuplicate;
	private JButton btnClear;
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;
	
	String value;
	
	private JButton btnDivision;
	private JButton btnPercent;
	private JButton btnBackSpace;
	private JButton btnSin;
	private JButton btnCos;
	private JButton btnTan;
	private JButton btnTanh;
	private JButton btnCosh;
	private JButton btnSinh;
	private JButton btnLog;
	private JButton btnExp;
	private JButton btnOneDevidedX;
	private JTextField txtFiledShowEvents;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setTitle("Kalkulator");
		frmCalculator.setBounds(500, 100, 439, 629);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		/*****
		txtFiledShowEvents = new JTextField();
		txtFiledShowEvents.setBackground(Color.WHITE);
		txtFiledShowEvents.setEditable(false);
		txtFiledShowEvents.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtFiledShowEvents.setHorizontalAlignment(SwingConstants.RIGHT);
		txtFiledShowEvents.setBounds(41, 55, 337, 45);
		frmCalculator.getContentPane().add(txtFiledShowEvents);
		txtFiledShowEvents.setColumns(10);
		*******/
		
		txtDisplay = new JTextField();
		txtDisplay.setBackground(Color.WHITE);
		txtDisplay.setEditable(false);
		txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtDisplay.setBounds(41, 64, 337, 45);
		frmCalculator.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText()+btn7.getText();
				txtDisplay.setText(EnterNumber);
				
				//This action was made to display on screen all numbers//
				//value = txtFiledShowEvents.getText()+7;
				//txtFiledShowEvents.setText(value);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(113, 337, 62, 45);
		frmCalculator.getContentPane().add(btn7);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText()+btn8.getText();
				txtDisplay.setText(EnterNumber);
				
				//This action was made to display on screen all numbers//
				//value = txtFiledShowEvents.getText()+8;
				//txtFiledShowEvents.setText(value);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(180, 337, 62, 45);
		frmCalculator.getContentPane().add(btn8);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText()+btn9.getText();
				txtDisplay.setText(EnterNumber);
				
				//This action was made to display on screen all numbers//
				//value = txtFiledShowEvents.getText()+9;
				//txtFiledShowEvents.setText(value);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(246, 337, 62, 45);
		frmCalculator.getContentPane().add(btn9);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText()+btn4.getText();
				txtDisplay.setText(EnterNumber);
				
				//This action was made to display on screen all numbers//
				//value = txtFiledShowEvents.getText()+4;
				//txtFiledShowEvents.setText(value);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(113, 392, 62, 45);
		frmCalculator.getContentPane().add(btn4);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText()+btn5.getText();
				txtDisplay.setText(EnterNumber);
				
				//This action was made to display on screen all numbers//
				//value = txtFiledShowEvents.getText()+5;
				//txtFiledShowEvents.setText(value);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(180, 392, 62, 45);
		frmCalculator.getContentPane().add(btn5);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText()+btn6.getText();
				txtDisplay.setText(EnterNumber);
				
				//This action was made to display on screen all numbers//
				//value = txtFiledShowEvents.getText()+6;
				//txtFiledShowEvents.setText(value);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(246, 392, 62, 45);
		frmCalculator.getContentPane().add(btn6);
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText()+btn1.getText();
				txtDisplay.setText(EnterNumber);
				
				//This action was made to display on screen all numbers//
				//value = txtFiledShowEvents.getText()+1;
				//txtFiledShowEvents.setText(value);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(113, 447, 62, 45);
		frmCalculator.getContentPane().add(btn1);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText()+btn2.getText();
				txtDisplay.setText(EnterNumber);
				
				//This action was made to display on screen all numbers//
				//value = txtFiledShowEvents.getText()+2;
				//txtFiledShowEvents.setText(value);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(180, 447, 62, 45);
		frmCalculator.getContentPane().add(btn2);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText()+btn3.getText();
				txtDisplay.setText(EnterNumber);
				
				//This action was made to display on screen all numbers//
				//value = txtFiledShowEvents.getText()+3;
				//txtFiledShowEvents.setText(value);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(246, 447, 62, 45);
		frmCalculator.getContentPane().add(btn3);
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText()+btn0.getText();
				txtDisplay.setText(EnterNumber);
				
				//This action was made to display on screen all numbers//
				//value = txtFiledShowEvents.getText()+0;
				//txtFiledShowEvents.setText(value);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(113, 502, 129, 45);
		frmCalculator.getContentPane().add(btn0);
		
		//--- This button sumus up numbers---//
		btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText().replace(",", "."));
				txtDisplay.setText("");
				operations = "+";
				
				//This action was made to display on screen all symbols//
				//value = txtFiledShowEvents.getText()+"+";
				//txtFiledShowEvents.setText(value);
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPlus.setBounds(316, 447, 62, 45);
		frmCalculator.getContentPane().add(btnPlus);
		
		//--- This button deducts numbers in between---//
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText().replace(",", "."));
				txtDisplay.setText("");
				operations = "-";
				
				//This action was made to display on screen all symbols//
				//value = txtFiledShowEvents.getText()+"-";
				//txtFiledShowEvents.setText(value);
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMinus.setBounds(316, 392, 62, 45);
		frmCalculator.getContentPane().add(btnMinus);
		
		//---This button is to multiplicate numbers---//
		JButton btnDuplicate = new JButton("*");
		btnDuplicate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText().replace(",", "."));
				txtDisplay.setText("");
				operations = "*";
				
				//This action was made to display on screen all symbols//
				//value = txtFiledShowEvents.getText()+"*";
				//txtFiledShowEvents.setText(value);
			}
		});
		btnDuplicate.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDuplicate.setBounds(316, 337, 62, 45);
		frmCalculator.getContentPane().add(btnDuplicate);
		
		//---This button was made for + and - functions--//
		JButton btnPM = new JButton("+/-");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = ops * (-1);
				txtDisplay.setText(String.valueOf(ops));
				
				//This action was made to display on screen all symbols//
				//value = txtFiledShowEvents.getText();
				//txtFiledShowEvents.setText(String.valueOf(ops));
			}
		});
		btnPM.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPM.setBounds(41, 503, 62, 45);
		frmCalculator.getContentPane().add(btnPM);
		
		//--- This button is to put Dot in between numbers--//
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(! txtDisplay.getText().contains("."))
		          {
		          txtDisplay.setText(txtDisplay.getText() + btnDot.getText());
		          }
				//This action was made to display on screen all symbols//
				//value = txtFiledShowEvents.getText()+".";
				//txtFiledShowEvents.setText(value);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDot.setBounds(246, 502, 62, 45);
		frmCalculator.getContentPane().add(btnDot);
		
		//--- This button was made to make results in every function possible---//
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secondnum = Double.parseDouble(txtDisplay.getText().replace(",", "."));
				
				if(operations == "+")
				{
					result = firstnum + secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
					//txtFiledShowEvents.setText(" = "+ answer);
				}
				else if (operations =="-")
				{
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);	
					//txtFiledShowEvents.setText(" = "+ answer);
				
				}
				else if (operations == "*")
				{
					result = firstnum * secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);	
					//txtFiledShowEvents.setText(" = "+ answer);
				}
				else if (operations == "/")
				{
					result = firstnum / secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
					//txtFiledShowEvents.setText(" = "+ answer);
				}
				else if (operations == "%")
				{
					result = firstnum % secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
					//txtFiledShowEvents.setText(" = "+ answer);
				}
				else if(operations == "X^Y")
				{
					/*
					 * double resultt = 1;
					for(int i=0; i<secondnum; i++);
					{
						resultt = firstnum * resultt;	
					}
					answer = String.format("%.2f", resultt);
					txtDisplay.setText(answer);
					*/
					
					result = Math.pow(firstnum, secondnum);
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
					//txtFiledShowEvents.setText(" = "+ answer);
					
				}
				
				
				//This action was made to display on screen all symbols//
				//value = txtFiledShowEvents.getText()+"=";
				//txtFiledShowEvents.setText(value);
				//answer = txtFiledShowEvents.getText();
				//txtFiledShowEvents.setText(answer);
				
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEqual.setBounds(316, 502, 62, 45);
		frmCalculator.getContentPane().add(btnEqual);
		
		//---This button was made to clean everthing from txtDisplay---//
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(null);
				
				//This action was made to display clean screen on txtFiledShowEvents//
				//txtFiledShowEvents.setText(null);
				
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClear.setBounds(246, 282, 62, 45);
		frmCalculator.getContentPane().add(btnClear);
		
		//--- This button was made for Division numbers---//
		JButton btnDivision = new JButton("/");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText().replace(",", "."));
				txtDisplay.setText("");
				operations = "/";
				
				//This action was made to display on screen all symbols//
				//value = txtFiledShowEvents.getText()+"/";
				//txtFiledShowEvents.setText(value);
			}
		});
		btnDivision.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDivision.setBounds(316, 282, 62, 45);
		frmCalculator.getContentPane().add(btnDivision);
		
		//---This number was made for Percentig of the number---//
		btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText().replace(",", "."));
				txtDisplay.setText("");
				operations = "%";
				
				//This action was made to display on screen all symbols//
				//value = txtFiledShowEvents.getText()+"%";
				//txtFiledShowEvents.setText(value);
			}
		});
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPercent.setBounds(180, 282, 62, 45);
		frmCalculator.getContentPane().add(btnPercent);
		
		//---This button was made for backwards---//
		JButton btnBackSpace = new JButton("\uF0E7");
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace=null;
				
				if(txtDisplay.getText().length()> 0) {
					StringBuilder strB = new StringBuilder(txtDisplay.getText());
					strB.deleteCharAt(txtDisplay.getText().length()-1);
					backspace = strB.toString();
					txtDisplay.setText(backspace);
				}
				
				//This action was made to display on screen all symbols//
				/*
				if(txtFiledShowEvents.getText().length()> 0) {
					StringBuilder strB = new StringBuilder(txtFiledShowEvents.getText());
					strB.deleteCharAt(txtFiledShowEvents.getText().length()-1);
					backspace = strB.toString();
					txtFiledShowEvents.setText(backspace);}
				*/	
			}
		});
		btnBackSpace.setFont(new Font("Wingdings", Font.BOLD, 18));
		btnBackSpace.setBounds(113, 282, 62, 45);
		frmCalculator.getContentPane().add(btnBackSpace);
		
		// --- This button calculate Sin function from choosen number with Math.sin function--//
		JButton btnSin = new JButton("Sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a = Math.sin(Double.parseDouble(txtDisplay.getText().replace(",", ".")));
				txtDisplay.setText("");
				txtDisplay.setText(txtDisplay.getText() +a);
				
			}
		});
		btnSin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSin.setBounds(316, 164, 62, 45);
		frmCalculator.getContentPane().add(btnSin);
		
		// --- This button calculate Cos function from choosen number with Math.cos function--//
		JButton btnCos = new JButton("Cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a = Math.cos(Double.parseDouble(txtDisplay.getText().replace(",", ".")));
				txtDisplay.setText("");
				txtDisplay.setText(txtDisplay.getText() +a);
				
				//This action was made to display on screen all symbols//
				//value = txtFiledShowEvents.getText()+"Cos"+"=";
				//txtFiledShowEvents.setText(value);
			}
		});
		btnCos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCos.setBounds(246, 164, 62, 45);
		frmCalculator.getContentPane().add(btnCos);
		
		// --- This button calculate Tan function from choosen number with Math.tan function--//
		
		JButton btnTan = new JButton("Tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.tan(Double.parseDouble(txtDisplay.getText().replace(",", ".")));
				txtDisplay.setText("");
				txtDisplay.setText(txtDisplay.getText() +a);
			}
		});
		btnTan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTan.setBounds(180, 164, 62, 45);
		frmCalculator.getContentPane().add(btnTan);
		
		// --- This button calculate Tanh function from choosen number with Math.tanh function--//
		JButton btnTanh = new JButton("Tanh");
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.tanh(Double.parseDouble(txtDisplay.getText().replace(",", ".")));
				txtDisplay.setText("");
				txtDisplay.setText(txtDisplay.getText() +a);
			}
		});
		btnTanh.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnTanh.setBounds(180, 216, 62, 45);
		frmCalculator.getContentPane().add(btnTanh);
		
		// --- This button calculate Cosh function from choosen number with Math.cosh function--//
		btnCosh = new JButton("Cosh");
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.cosh(Double.parseDouble(txtDisplay.getText().replace(",", ".")));
				txtDisplay.setText("");
				txtDisplay.setText(txtDisplay.getText() +a);
			}
		});
		btnCosh.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCosh.setBounds(246, 216, 62, 45);
		frmCalculator.getContentPane().add(btnCosh);
		
		// --- This button calculate Sinh function from choosen number with Math.sinh function--//
		JButton btnSinh = new JButton("Sinh");
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sinh(Double.parseDouble(txtDisplay.getText().replace(",", ".")));
				txtDisplay.setText("");
				txtDisplay.setText(txtDisplay.getText() +a);
			}
		});
		btnSinh.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSinh.setBounds(316, 216, 62, 45);
		frmCalculator.getContentPane().add(btnSinh);
		
		// --- This button calculate Log function from choosen number with Math.Log function--//
		JButton btnLog = new JButton("Log");
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.log(Double.parseDouble(txtDisplay.getText().replace(",", ".")));
				txtDisplay.setText("");
				txtDisplay.setText(txtDisplay.getText() +a);
			}
		});
		btnLog.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnLog.setBounds(113, 216, 62, 45);
		frmCalculator.getContentPane().add(btnLog);
		
		// --- This button calculate EXP function from choosen number with Math.exp function--//
		
		JButton btnExp = new JButton("e^x");
		btnExp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.exp(Double.parseDouble(txtDisplay.getText().replace(",", ".")));
				txtDisplay.setText("");
				txtDisplay.setText(txtDisplay.getText() +a);
			}
		});
		btnExp.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnExp.setBounds(113, 165, 62, 45);
		frmCalculator.getContentPane().add(btnExp);
		
		// --- This button calculate 1 devided with x function from choosen number--//
		JButton btnOneDevidedX = new JButton("1/X");
		btnOneDevidedX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = 1 / (Double.parseDouble(txtDisplay.getText().replace(",", ".")));
				txtDisplay.setText("");
				txtDisplay.setText(txtDisplay.getText() +a);
			}
		});
		btnOneDevidedX.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnOneDevidedX.setBounds(41, 216, 62, 45);
		frmCalculator.getContentPane().add(btnOneDevidedX);
		
		JButton btnN = new JButton("n!");
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(txtDisplay.getText().replace(",", "."));
				double fact = 1;
				while(a!=0)
				{
					fact=fact*a;
					a--;
				}
				txtDisplay.setText("");
				txtDisplay.setText(txtDisplay.getText()+fact);
			}
		});
		btnN.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnN.setBounds(41, 447, 62, 45);
		frmCalculator.getContentPane().add(btnN);
		
		//-- This button was made to exponential expressions for power on 2--//
		JButton btnXforTwo = new JButton("X^2");
		btnXforTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = (Double.parseDouble(txtDisplay.getText().replace(",", ".")));
				a=a*a;
				
				txtDisplay.setText("");
				txtDisplay.setText(txtDisplay.getText()+a);
			}
		});
		btnXforTwo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnXforTwo.setBounds(41, 392, 62, 45);
		frmCalculator.getContentPane().add(btnXforTwo);
		
		//-- This button was made to exponential expressions for power on 3--//
		JButton btnXPoweronThree = new JButton("X^3");
		btnXPoweronThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = (Double.parseDouble(txtDisplay.getText().replace(",", ".")));
				a=a*a*a;
				
				txtDisplay.setText("");
				txtDisplay.setText(txtDisplay.getText()+a);
			
			}
		});
		btnXPoweronThree.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnXPoweronThree.setBounds(41, 337, 62, 45);
		frmCalculator.getContentPane().add(btnXPoweronThree);
		
		//--This button returns the square root of a value of type double passed to it as argument--//
		JButton btnR = new JButton("\u221A");
		btnR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sqrt(Double.parseDouble(txtDisplay.getText().replace(",", ".")));
				
				txtDisplay.setText("");
				txtDisplay.setText(txtDisplay.getText()+a);
			
			}
		});
		btnR.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnR.setBounds(41, 164, 62, 45);
		frmCalculator.getContentPane().add(btnR);
		
		//---This button X^Y was made to make this action MathPower X AND Y, formula is located in resut---//
		JButton btnXy = new JButton("X^Y");
		btnXy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText().replace(",", "."));
				txtDisplay.setText("");
				operations = "X^Y";
			}
		});
		btnXy.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnXy.setBounds(41, 282, 62, 45);
		frmCalculator.getContentPane().add(btnXy);
				
	}
}
