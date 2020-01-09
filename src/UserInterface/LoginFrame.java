package UserInterface;

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
	private JTextField CountW;
	private JPasswordField SerectW;

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
		
		JLabel lblNewLabel = new JLabel("\u8D26\u53F7\uFF1A");
		
		CountW = new JTextField();
		CountW.setColumns(10);
		
		JButton LoginB = new JButton("\u767B\u5F55");
		LoginB.setBackground(UIManager.getColor("InternalFrame.inactiveTitleGradient"));
		LoginB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//登录
				JOptionPane.setDefaultLocale(null);
				JOptionPane.showMessageDialog(null, "登录下次展示", "登录信息", JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		
		
		SerectW = new JPasswordField();
		SerectW.setEchoChar('*');
		
		JLabel label = new JLabel("\u5BC6\u7801\uFF1A");
		
		JButton CancelB = new JButton("\u53D6\u6D88");
		CancelB.setBackground(UIManager.getColor("InternalFrame.inactiveTitleGradient"));
		CancelB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//取消
				/*
				 * 1、先确认
				 * 2、再进行操作
				 */
				int a=JOptionPane.showConfirmDialog(null, "确定退出吗？", "退出确认",JOptionPane.OK_CANCEL_OPTION);
				if(a==0) {
					//setVisible(false);        窗口暂时隐藏
					dispose();                //销毁窗口
				}
			}
		});
		
		JCheckBox SerectS = new JCheckBox("\u663E\u793A\u5BC6\u7801");
		SerectS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(SerectS.isSelected()) {
					SerectW.setEchoChar((char)0);
				}else {
					SerectW.setEchoChar('*');
				}
				 
			}
		});
		SerectS.setHorizontalAlignment(SwingConstants.LEFT);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(93, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(LoginB)
							.addGap(18)
							.addComponent(CancelB))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel)
								.addComponent(label))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(SerectW)
								.addComponent(CountW, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE))))
					.addGap(18)
					.addComponent(SerectS)
					.addGap(57))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(70)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(CountW, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel))
					.addGap(31)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(SerectW, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label)
						.addComponent(SerectS))
					.addGap(51)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(CancelB, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(LoginB, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(32))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
