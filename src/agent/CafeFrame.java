package agent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import coke.*;
import company.desert;
import company.drink;
import customer.Order;
import customer.OrderBuidler;

//程序运行时呈现的窗体
public class CafeFrame extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	public JLabel label;
	public JButton b1,b2,b3;
	public JPanel panel;
	public JTextArea tf1;
	public JCheckBox cb1,cb2,cb3,cb4;
	public JRadioButton rb1,rb2;
	public JScrollPane sp;
	int i=0 ;

	desert coca = desert.getInstance();
	drink pepsi = drink.getInstance();
	public CafeFrame() {
		super("Super Cofe");
		label = new JLabel("1顾客下单                              2 工厂准备                             3 取餐方式");
		b1 = new JButton("确认");
		b2 = new JButton("工厂状态");
		b3 = new JButton("确定");
		panel = new JPanel();
		tf1 = new JTextArea();
		cb1 = new JCheckBox("果汁");
		cb2 = new JCheckBox("奶茶");
		cb3 = new JCheckBox("蛋糕");
		cb4 = new JCheckBox("曲奇");
		rb1 = new JRadioButton("店内用餐");
		rb2 = new JRadioButton("自提带走");
		sp = new JScrollPane();

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		tf1.setText("");
		tf1.setLineWrap(true); //自动换行

		panel.setLayout(null);//将panel的布局设置为空，这样能自定义组件位置
		panel.add(label);
		panel.add(tf1);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(cb1);
		panel.add(cb2);
		panel.add(cb3);
		panel.add(cb4);
		panel.add(rb1);
		panel.add(rb2);
		panel.add(sp);
		label.setBounds(20, 20, 400, 20);
		cb1.setBounds(20, 50, 100, 20);
		cb2.setBounds(20, 80, 100, 20);
		cb3.setBounds(20, 110, 100, 20);
		cb4.setBounds(20, 140, 100, 20);
		b1.setBounds(20, 170, 70, 30);
		b2.setBounds(150, 50, 100, 30);
		rb1.setBounds(300, 50, 100, 20);
		rb2.setBounds(300, 140, 100, 20);
		b3.setBounds(300, 170, 70, 30);
		tf1.setBounds(20, 150, 400, 200);
		sp.setBounds(20, 230, 400, 200);

		sp.setViewportView(tf1);
		this.setSize(450,500);//设置窗口大小
		this.setLocationRelativeTo(null);//运行程序后界面在电脑屏幕正中央显示
		this.getContentPane().add(panel);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗口即结束程序
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1){

			if (cb1.isSelected() && cb2.isSelected()&&cb3.isSelected()&&cb4.isSelected()) {
				tf1.append("\n**********1、顾客下单**********");
				tf1.append("\n店家接单");
				tf1.append("\n果汁、奶茶、蛋糕、曲奇制作中");


				tf1.append("\n等待完成");
				tf1.append("\n***********************************\n");
				i=1;
			} else if (cb1.isSelected() && cb2.isSelected()&&cb3.isSelected() ){

				tf1.append("\n**********1、顾客下单**********");
				tf1.append("\n店家接单");
				tf1.append("\n果汁、奶茶、蛋糕制作中");


				tf1.append("\n等待完成");
				tf1.append("\n***********************************\n");
				i=2;
			}
			else if (cb1.isSelected() && cb2.isSelected()&&cb4.isSelected() ){
				tf1.append("\n**********1、顾客下单**********");
				tf1.append("\n店家接单");
				tf1.append("\n果汁、奶茶、曲奇制作中");

				tf1.append("\n等待完成");
				tf1.append("\n***********************************\n");
				i=3;
			}
			else if (cb1.isSelected() && cb3.isSelected()&&cb4.isSelected() ){
				tf1.append("\n**********1、顾客下单**********");
				tf1.append("\n店家接单");
				tf1.append("\n果汁、蛋糕、曲奇制作中");

				tf1.append("\n等待完成");
				tf1.append("\n***********************************\n");
				i=4;
			}else if (cb2.isSelected()&&cb3.isSelected()&&cb4.isSelected()) {
				tf1.append("\n**********1、顾客下单**********");
				tf1.append("\n店家接单");
				tf1.append("\n果汁、奶茶、蛋糕、曲奇制作中");

				tf1.append("\n等待完成");
				tf1.append("\n***********************************\n");
				i=5;
			} else if (cb1.isSelected()&&cb2.isSelected()) {
				tf1.append("\n**********1、顾客下单**********");
				tf1.append("\n店家接单");
				tf1.append("\n果汁、奶茶制作中");

				tf1.append("\n等待完成");
				tf1.append("\n***********************************\n");
				i=6;
			} else if (cb1.isSelected()&&cb3.isSelected()) {
				tf1.append("\n**********1、顾客下单**********");
				tf1.append("\n店家接单");
				tf1.append("\n果汁、蛋糕制作中");

				tf1.append("\n等待完成");
				tf1.append("\n***********************************\n");
				i=7;
			}else if (cb1.isSelected()&&cb4.isSelected()) {
				tf1.append("\n**********1、顾客下单**********");
				tf1.append("\n店家接单");
				tf1.append("\n果汁、曲奇制作中");

				tf1.append("\n等待完成");
				tf1.append("\n***********************************\n");
				i=8;
			} else if (cb2.isSelected()&&cb3.isSelected()) {
				tf1.append("\n**********1、顾客下单**********");
				tf1.append("\n店家接单");
				tf1.append("\n奶茶、蛋糕制作中");

				tf1.append("\n等待完成");
				tf1.append("\n***********************************\n");
				i=9;
			} else if (cb2.isSelected()&&cb4.isSelected()) {
				tf1.append("\n**********1、顾客下单**********");
				tf1.append("\n店家接单");
				tf1.append("\n果汁、曲奇制作中");

				tf1.append("\n等待完成");
				tf1.append("\n***********************************\n");
				i=10;
			} else if (cb3.isSelected()&&cb4.isSelected()) {
				tf1.append("\n**********1、顾客下单**********");
				tf1.append("\n店家接单");
				tf1.append("\n蛋糕、曲奇制作中");

				tf1.append("\n等待完成");
				tf1.append("\n***********************************\n");
				i=11;
			}else if (cb1.isSelected()){
				tf1.append("\n**********1、顾客下单**********");
				tf1.append("\n店家接单");
				tf1.append("\n果汁制作中");

				tf1.append("\n等待完成");
				tf1.append("\n***********************************\n");
				i=12;
			}else if (cb2.isSelected()) {
				tf1.append("\n**********1、顾客下单**********");
				tf1.append("\n店家接单");
				tf1.append("\n奶茶制作中");

				tf1.append("\n等待完成");
				tf1.append("\n***********************************\n");
				i=13;
			}else if (cb3.isSelected()) {
				tf1.append("\n**********1、顾客下单**********");
				tf1.append("\n店家接单");
				tf1.append("\n蛋糕制作中");

				tf1.append("\n等待完成");
				tf1.append("\n***********************************\n");
				i=14;
			}else if (cb4.isSelected()) {
				tf1.append("\n**********1、顾客下单**********");
				tf1.append("\n店家接单");
				tf1.append("\n曲奇制作中");

				tf1.append("\n等待完成");
				tf1.append("\n***********************************\n");
				i=15;
			}
			else {

				JOptionPane.showMessageDialog(this, "请选择商品", "提示消息", JOptionPane.WARNING_MESSAGE);
			}

			cb1.setSelected(false);//清空选择
			cb2.setSelected(false);
			cb3.setSelected(false);
			cb4.setSelected(false);

		}
		if(e.getSource()==b2){
			if(!tf1.getText().equals("")&&i==1){
				i=0;
				tf1.append("\n**********2、工厂接单**********");
				juice_Factory juice = new juice_Factory();//抽象工厂模式
				milk_Factory milk = new milk_Factory();
				cake_Factory cake = new cake_Factory();
				cookie_Factory cookie = new cookie_Factory();
				tf1.append("\n"+juice.producedrink().produce()+"\n"+milk.producedrink().produce()+"\n"+cake.producedesert().produce()+"\n"+cookie.producedesert().produce() );
				tf1.append("\n（1）店内用餐，（2）自提带走");
				tf1.append("\n*********************************\n");
			}if(!tf1.getText().equals("")&&i==2){
				i=0;
				tf1.append("\n**********2、工厂接单**********");
				juice_Factory juice = new juice_Factory();//抽象工厂模式
				milk_Factory milk = new milk_Factory();
				cake_Factory cake = new cake_Factory();
				cookie_Factory cookie = new cookie_Factory();
				tf1.append("\n"+juice.producedrink().produce()+"\n"+milk.producedrink().produce()+"\n"+cake.producedesert().produce()+"\n" );
				tf1.append("\n（1）店内用餐，（2）自提带走");
				tf1.append("\n*********************************\n");
			}if(!tf1.getText().equals("")&&i==3){
				i=0;
				tf1.append("\n**********2、工厂接单**********");
				juice_Factory juice = new juice_Factory();//抽象工厂模式
				milk_Factory milk = new milk_Factory();
				cake_Factory cake = new cake_Factory();
				cookie_Factory cookie = new cookie_Factory();
				tf1.append("\n"+juice.producedrink().produce()+"\n"+milk.producedrink().produce()+"\n"+cookie.producedesert().produce() );
				tf1.append("\n（1）店内用餐，（2）自提带走");
				tf1.append("\n*********************************\n");
			}if(!tf1.getText().equals("")&&i==4){
				i=0;
				tf1.append("\n**********2、工厂接单**********");
				juice_Factory juice = new juice_Factory();//抽象工厂模式
				milk_Factory milk = new milk_Factory();
				cake_Factory cake = new cake_Factory();
				cookie_Factory cookie = new cookie_Factory();
				tf1.append("\n"+juice.producedrink().produce()+"\n"+cake.producedesert().produce()+"\n"+cookie.producedesert().produce() );
				tf1.append("\n（1）店内用餐，（2）自提带走");
				tf1.append("\n*********************************\n");
			}if(!tf1.getText().equals("")&&i==5){
				i=0;
				tf1.append("\n**********2、工厂接单**********");
				juice_Factory juice = new juice_Factory();//抽象工厂模式
				milk_Factory milk = new milk_Factory();
				cake_Factory cake = new cake_Factory();
				cookie_Factory cookie = new cookie_Factory();
				tf1.append("\n"+milk.producedrink().produce()+"\n"+cake.producedesert().produce()+"\n"+cookie.producedesert().produce() );
				tf1.append("\n（1）店内用餐，（2）自提带走");
				tf1.append("\n*********************************\n");
			}if(!tf1.getText().equals("")&&i==6){
				i=0;
				tf1.append("\n**********2、工厂接单**********");
				juice_Factory juice = new juice_Factory();//抽象工厂模式
				milk_Factory milk = new milk_Factory();
				cake_Factory cake = new cake_Factory();
				cookie_Factory cookie = new cookie_Factory();
				tf1.append("\n"+juice.producedrink().produce()+"\n"+milk.producedrink().produce() );
				tf1.append("\n（1）店内用餐，（2）自提带走");
				tf1.append("\n*********************************\n");
			}if(!tf1.getText().equals("")&&i==7){
				i=0;
				tf1.append("\n**********2、工厂接单**********");
				juice_Factory juice = new juice_Factory();//抽象工厂模式
				milk_Factory milk = new milk_Factory();
				cake_Factory cake = new cake_Factory();
				cookie_Factory cookie = new cookie_Factory();
				tf1.append("\n"+juice.producedrink().produce()+"\n"+cake.producedesert().produce() );
				tf1.append("\n（1）店内用餐，（2）自提带走");
				tf1.append("\n*********************************\n");
			}if(!tf1.getText().equals("")&&i==8){
				i=0;
				tf1.append("\n**********2、工厂接单**********");
				juice_Factory juice = new juice_Factory();//抽象工厂模式
				milk_Factory milk = new milk_Factory();
				cake_Factory cake = new cake_Factory();
				cookie_Factory cookie = new cookie_Factory();
				tf1.append("\n"+juice.producedrink().produce()+"\n"+cookie.producedesert().produce() );
				tf1.append("\n（1）店内用餐，（2）自提带走");
				tf1.append("\n*********************************\n");
			}if(!tf1.getText().equals("")&&i==9){
				i=0;
				tf1.append("\n**********2、工厂接单**********");
				juice_Factory juice = new juice_Factory();//抽象工厂模式
				milk_Factory milk = new milk_Factory();
				cake_Factory cake = new cake_Factory();
				cookie_Factory cookie = new cookie_Factory();
				tf1.append("\n"+milk.producedrink().produce()+"\n"+cake.producedesert().produce() );
				tf1.append("\n（1）店内用餐，（2）自提带走");
				tf1.append("\n*********************************\n");
			}if(!tf1.getText().equals("")&&i==10){
				i=0;
				tf1.append("\n**********2、工厂接单**********");
				juice_Factory juice = new juice_Factory();//抽象工厂模式
				milk_Factory milk = new milk_Factory();
				cake_Factory cake = new cake_Factory();
				cookie_Factory cookie = new cookie_Factory();
				tf1.append("\n"+milk.producedrink().produce()+"\n"+cookie.producedesert().produce() );
				tf1.append("\n（1）店内用餐，（2）自提带走");
				tf1.append("\n*********************************\n");
			}if(!tf1.getText().equals("")&&i==11){
				i=0;
				tf1.append("\n**********2、工厂接单**********");
				juice_Factory juice = new juice_Factory();//抽象工厂模式
				milk_Factory milk = new milk_Factory();
				cake_Factory cake = new cake_Factory();
				cookie_Factory cookie = new cookie_Factory();
				tf1.append("\n"+cake.producedesert().produce()+"\n"+cookie.producedesert().produce() );
				tf1.append("\n（1）店内用餐，（2）自提带走");
				tf1.append("\n*********************************\n");
			}if(!tf1.getText().equals("")&&i==12){
				i=0;
				tf1.append("\n**********2、工厂接单**********");
				juice_Factory juice = new juice_Factory();//抽象工厂模式
				milk_Factory milk = new milk_Factory();
				cake_Factory cake = new cake_Factory();
				cookie_Factory cookie = new cookie_Factory();
				tf1.append("\n"+juice.producedrink().produce() );
				tf1.append("\n（1）店内用餐，（2）自提带走");
				tf1.append("\n*********************************\n");
			}if(!tf1.getText().equals("")&&i==13){
				i=0;
				tf1.append("\n**********2、工厂接单**********");
				juice_Factory juice = new juice_Factory();//抽象工厂模式
				milk_Factory milk = new milk_Factory();
				cake_Factory cake = new cake_Factory();
				cookie_Factory cookie = new cookie_Factory();
				tf1.append("\n"+milk.producedrink().produce() );
				tf1.append("\n（1）店内用餐，（2）自提带走");
				tf1.append("\n*********************************\n");
			}if(!tf1.getText().equals("")&&i==14){
				i=0;
				tf1.append("\n**********2、工厂接单**********");
				juice_Factory juice = new juice_Factory();//抽象工厂模式
				milk_Factory milk = new milk_Factory();
				cake_Factory cake = new cake_Factory();
				cookie_Factory cookie = new cookie_Factory();
				tf1.append("\n"+cake.producedesert().produce() );
				tf1.append("\n（1）店内用餐，（2）自提带走");
				tf1.append("\n*********************************\n");
			}if(!tf1.getText().equals("")&&i==15){
				i=0;
				tf1.append("\n**********2、工厂接单**********");
				juice_Factory juice = new juice_Factory();//抽象工厂模式
				milk_Factory milk = new milk_Factory();
				cake_Factory cake = new cake_Factory();
				cookie_Factory cookie = new cookie_Factory();
				tf1.append("\n"+cookie.producedesert().produce() );
				tf1.append("\n（1）店内用餐，（2）自提带走");
				tf1.append("\n*********************************\n");
			}if(tf1.getText().equals("")&&i==0){

				JOptionPane.showMessageDialog(this, "没有接收到订单！", "提示消息", JOptionPane.WARNING_MESSAGE);
			}

		}
		if(e.getSource()==b3){


			if(rb1.isSelected()||rb2.isSelected()){

				if(rb1.isSelected()&&!rb2.isSelected()){
					String str1= JOptionPane.showInputDialog("请输入小号");
					tf1.append("\n**********3、取餐方式**********");
					tf1.append("\n客人店内用餐");
					OrderBuidler builder = new OrderBuidler(str1);
					Order order = builder.create();
					tf1.append("\n订单号："+order.getNum());
					methods deliverGoods;
					tf1.append("\n感谢光临");
					tf1.append("\n********************************");

				}if(!rb1.isSelected()&&rb2.isSelected()){
					String str1= JOptionPane.showInputDialog("请输入小号");
					tf1.append("\n**********3、取餐方式**********");
					tf1.append("\n客人打包带走");
					OrderBuidler builder = new OrderBuidler(str1);
					Order order = builder.create();
					tf1.append("\n订单号："+order.getNum());
					methods deliverGoods;
					tf1.append("\n感谢光临");
					tf1.append("\n********************************");

				}if(rb1.isSelected()&&rb2.isSelected()){
					JOptionPane.showMessageDialog(this, "只能选取一种取餐方式！", "提示消息", JOptionPane.WARNING_MESSAGE);
				}

			}else{

				JOptionPane.showMessageDialog(this, "请先选择取餐方式！", "提示消息", JOptionPane.WARNING_MESSAGE);
			}
		}
	}
}
