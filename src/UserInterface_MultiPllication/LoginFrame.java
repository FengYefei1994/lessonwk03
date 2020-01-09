package UserInterface_MultiPllication;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

public class LoginFrame extends JFrame {

	private JPanel contentPane;
	private JTextField num1;
	private JLabel Result;
	private JTextField textField;
	private JTextField num2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginFrame() {
		setAlwaysOnTop(true);
		setFont(UIManager.getFont("ToolBar.font"));
		setForeground(UIManager.getColor("TextPane.selectionBackground"));
		setBackground(Color.CYAN);
		setTitle("\u767B\u5F55");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(UIManager.getColor("ToggleButton.background"));
		contentPane.setBackground(UIManager.getColor("ToggleButton.background"));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("\u5E95\u6570\uFF1A");
		
		num1 = new JTextField();
		num1.setColumns(10);
		
		JButton LoginB = new JButton("\u7B49\u4E8E");
		LoginB.setBackground(UIManager.getColor("InternalFrame.inactiveTitleGradient"));
		LoginB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//等于——计算
				JOptionPane.setDefaultLocale(null);//居中展示
				
				//调用乘法模块
				Multi mul=new Multi();
				int a=mul.Multi(Integer.parseInt(num1.getText()), Integer.parseInt(num2.getText()));
				textField.setText(a+"");
				
				
			}
		});
		
		JLabel label = new JLabel("\u6307\u6570\uFF1A");
		
		Result = new JLabel("Result");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		num2 = new JTextField();
		num2.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(28)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel)
							.addGap(18)
							.addComponent(num1, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(Result, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addComponent(label)
							.addGap(18)
							.addComponent(num2)))
					.addGap(223))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(115)
					.addComponent(LoginB)
					.addContainerGap(262, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(29)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(num1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel))
					.addGap(43)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(label)
						.addComponent(num2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(LoginB, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
					.addGap(21)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(Result)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(75))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
