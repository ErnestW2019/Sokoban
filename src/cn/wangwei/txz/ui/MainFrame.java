package cn.wangwei.txz.ui;

import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
//������ʾ��������
//��Ҫ�̳�Frame��----�̳�
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MainFrame extends Frame implements KeyListener{
	
	//�����������һ�´������������Ϣ
	//1.1�����Ƿ���ʾ
	//���췽��
	public MainFrame(){
		//����һ�������������������ӵ�������
		//����ͼƬ���˳��
		//����ͼƬ������ʵ����ͼƬ�����������ӣ���������������
		//������(Ŀ��λ��)
		
		targetInit();
		//����̫�ǣ����
		wolfInit();
		
		
		//��������
		sheepInit();
		
		treeInit();
		
		//���Ӹ��ָ���Ҫ��ʾ�Ķ���������
		backgroundInit();
		
		
		
		//������������
		setMainFrameUI();
		

		//ʹ�����ܹ��ල�û��ǲ��ǵ��˼���
		this.addKeyListener(this); 
		
		}
	//��������ģ�⣬ʹ�ö�ά����ģ��
	JLabel[][] sheeps = new JLabel[12][16];
	//1�����ϰ���0�����յ�
	//2��������
	int[][] datas = {
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1},
			{1,0,1,0,0,0,1,0,0,1,1,1,1,0,0,1},
			{1,0,1,0,0,0,0,0,0,1,0,0,0,0,0,1},
			{1,0,1,0,0,0,0,0,0,1,1,1,1,0,0,1},
			{1,0,1,0,0,0,0,0,0,0,0,0,1,0,0,1},
			{1,0,1,0,0,0,1,0,0,1,1,1,1,0,0,1},
			{1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
		};
	 int wx,sx1,sx2,sx3;
	 int wy,sy1,sy2,sy3;
	 //����Ŀ��������
	 int num = 0;
	 //������
	 int total = 3; 

	private void  treeInit(){
		//1.����ͼƬ
		Icon ic = new ImageIcon("tree.png");
		//������ά����
		for (int i = 0;i<datas.length;i++){
			for (int j = 0;j<datas[i].length;j++){
				if(datas[i][j]==1){
				//2.����JLabel
				JLabel lab_tree = new JLabel(ic);
				//���ô�С����
				lab_tree.setBounds(12+50*j,36+50*i,50,50);
				//���ӵ�������
				this.add(lab_tree);}
			}
		}
	}
	
	
	
	private void targetInit() {
		// //1.����ͼƬ
		Icon i = new ImageIcon("target.png");
		JLabel lab_target1 = new JLabel(i);
		lab_target1.setBounds(712,236,50,50);
		this.add(lab_target1);
		
		JLabel lab_target2 = new JLabel(i);
		lab_target2.setBounds(712,286,50,50);
		this.add(lab_target2);
		
		JLabel lab_target3 = new JLabel(i);
		lab_target3.setBounds(712,336,50,50);
		this.add(lab_target3);
	}

	private void sheepInit() {
		
		sx1 = 6;sx2=6;sx3=6;
		sy1 = 4;sy2=6;sy3=8;
		//�������ӵ�ģ��
		//����һ��ͼƬ
		Icon i = new ImageIcon("sheep-no.png");
		JLabel lab_sheep1 = new JLabel(i);
		lab_sheep1.setBounds(12+sx1*50,36+sy1*50,50,50);
		this.add(lab_sheep1);
		datas [sy1][sx1]= 4;
		sheeps [sy1][sx1]=lab_sheep1;
		
		//�����ڶ�ֻ��ͼƬ����Ҫ������
		//�ڶ�ֻ������ʱֻ��Ҫ�޸���ʾλ��
		JLabel lab_sheep2 = new JLabel(i);
		lab_sheep2.setBounds(12+sx2*50, 36+sy2*50, 50, 50);
		this.add(lab_sheep2);
		datas [sy2][sx2]= 4;
		sheeps [sy2][sx2]=lab_sheep2;
		
		JLabel lab_sheep3 = new JLabel(i);
		lab_sheep3.setBounds(12+sx3*50, 36+sy3*50, 50, 50);
		this.add(lab_sheep3);
		datas [sy3][sx3]= 4;
		sheeps [sy3][sx3]=lab_sheep3;
	}
	JLabel lab_sheep1;
	private void wolfInit() {
		//�������λ�������
		wx = 4;
		wy = 5;
		
		
		
		//ʹ��һ��ͼƬ��ģ������
		//1.����һ��ͼƬ������ͼƬ
		Icon i = new ImageIcon("wolf-zm.png");
		//ʹ�� JLabel���ģ������
		lab_wolf = new JLabel(i);
		//3.������������Ļ�ϵ���ʾλ��
		//�������ʾλ�÷����ںδ���Ϊ������
		lab_wolf.setBounds(12+wx*50,36+wy*50,50,50);
		//4.���������ŵ���������
		this.add(lab_wolf);
		//��������������ӵ�������
		//�������Ӧ��λ���ϵ����ݸ�Ϊ2
		datas[5][4]=2;
	}
	JLabel lab_wolf;//�������÷�Χ
	//������ʼ��
	private void backgroundInit() {
		// TODO Auto-generated  method stub
		//���������ʵ�ֵģ����������
	
		//��ʹ��ͼƬ��JLabel�ڲ���ʵ������
		//����һ��ͼƬ
		Icon i = new ImageIcon("bg.png");
		//ʹ��JLabel��������
		JLabel lab_bg = new JLabel(i);
		//����Ҫ���ӵ������λ�����С
		lab_bg.setBounds(12, 36,800, 600);
		//������������ӵ���������
		this.add(lab_bg);
		
	}


	//���������������ʾЧ��
	private void setMainFrameUI(){	
		//������������Ĳ���ģʽΪ���ɲ���
		this.setLayout(null);
		//���ô��ڱ���
		this.setTitle("������ v2.0 - java.wangwei");
		//���ô���λ��
		this.setLocation(110,30);
		//���ô��ڳߴ磬��400����300
		this.setSize(826,650);
		//���ô�����ʾ����
		this.setVisible(true);
	}
	
	private void victory() {
		if(num == total)
			System.out.println("ʤ��");
	}
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated me//��ηֱ��û�������Ǽ��̵�ĳ����
		//ͨ������ֵ�ֱ�����һ����
		//��ȡ����ֵ�ķ�ʽ
		//key����������������ĸ���
		//�� 37
		//�� 38
		//�� 39
		//�� 40 
		
		int key = e.getKeyCode();
		if(key==39){	
			//�����������ƶ�
			//�����ϵĵ�һλ����wy wx+1
			//�����ϵĵ�һλ����wy wx+2
			if(datas[wy][wx+1]==0){
				wx=wx+1;
				int x =(int) lab_wolf.getLocation().getX();
				
				int y =(int) lab_wolf.getLocation().getY();
				
				lab_wolf.setLocation(x+50,y);
				
				Icon i = new ImageIcon("wolf-ym.png");
				lab_wolf.setIcon(i);
				return;
			}
			if(datas[wy][wx+1]==1)
				return;
			if(datas[wy][wx+1]==4&&datas[wy][wx+2]==1)
				return;
			if(datas[wy][wx+1]==4&&datas[wy][wx+2]==4)
				return;
			if(datas[wy][wx+1]==4&&datas[wy][wx+2]==12)
				return;
			if(datas[wy][wx+1]==12&&datas[wy][wx+2]==1)
				return;
			if(datas[wy][wx+1]==12&&datas[wy][wx+2]==4)
				return;
			if(datas[wy][wx+1]==12&&datas[wy][wx+2]==12)
				return;
			
			if(datas[wy][wx+1]==8){
				wx=wx+1;
				int x =(int) lab_wolf.getLocation().getX();
				
				int y =(int) lab_wolf.getLocation().getY();
				
				lab_wolf.setLocation(x+50,y);
				
				Icon i = new ImageIcon("wolf-ym.png");
				lab_wolf.setIcon(i);
				return;
				
			}
			if(datas[wy][wx+1]==4&&datas[wy][wx+2]==0){
				datas[wy][wx+1] = 0;
				datas[wy][wx+2] = 4;
				
			}
			if(datas[wy][wx+1]==4&&datas[wy][wx+2]==8){
				datas[wy][wx+1] = 0;
				datas[wy][wx+2] = 12;
				num++;
			}	
				
			if(datas[wy][wx+1]==12&&datas[wy][wx+2]==0){
					datas[wy][wx+1] = 8;
					datas[wy][wx+2] = 4;
					num--;
				}		
				
			if(datas[wy][wx+1]==12&&datas[wy][wx+2]==8){
				datas[wy][wx+1] = 8;
				datas[wy][wx+2] = 12;
			}		
			
			
				sheeps[wy][wx+1].setLocation(12+wx*50+100,36+wy*50);
				sheeps[wy][wx+2] = sheeps[wy][wx+1];
				sheeps[wy][wx+1] = null;
				
				wx=wx+1;
				int x =(int) lab_wolf.getLocation().getX();
				
				int y =(int) lab_wolf.getLocation().getY();
				
				lab_wolf.setLocation(x+50,y);
				
				Icon i = new ImageIcon("wolf-ym.png");
				lab_wolf.setIcon(i);
				//�ж�ʤ��
				victory();
				return;
				
	}
		 
		if(key==37){
			if(datas[wy][wx-1]==1)
				return;
			if(datas[wy][wx-1]==4&&datas[wy][wx-2]==1)
				return;
			if(datas[wy][wx-1]==4&&datas[wy][wx-2]==4)
				return;
			if(datas[wy][wx-1]==4&&datas[wy][wx-2]==12)
				return;
			if(datas[wy][wx-1]==12&&datas[wy][wx-2]==1)
				return;
			if(datas[wy][wx-1]==12&&datas[wy][wx-2]==4)
				return;
			if(datas[wy][wx-1]==12&&datas[wy][wx-2]==12)
				return;
			if(datas[wy][wx-1]==0){
				wx=wx-1;
				int x =(int) lab_wolf.getLocation().getX();
				
				int y =(int) lab_wolf.getLocation().getY();
				
				lab_wolf.setLocation(x-50,y);
				
				Icon i = new ImageIcon("wolf-zuom.png");
				lab_wolf.setIcon(i);
				return;
			}
			if(datas[wy][wx-1]==8){
				wx=wx-1;
				int x =(int) lab_wolf.getLocation().getX();
				
				int y =(int) lab_wolf.getLocation().getY();
				
				lab_wolf.setLocation(x-50,y);
				
				Icon i = new ImageIcon("wolf-zuom.png");
				lab_wolf.setIcon(i);
				return;
				
			}
			if(datas[wy][wx-1]==4&&datas[wy][wx-2]==0){
				datas[wy][wx-1] = 0;
				datas[wy][wx-2] = 4;
				
			}
			if(datas[wy][wx-1]==4&&datas[wy][wx-2]==8){
				datas[wy][wx-1] = 0;
				datas[wy][wx-2] = 12;
				num++;
			}	
				
			if(datas[wy][wx-1]==12&&datas[wy][wx-2]==0){
					datas[wy][wx-1] = 8;
					datas[wy][wx-2] = 4;
					num--;
				}		
				
			if(datas[wy][wx-1]==12&&datas[wy][wx-2]==8){
				datas[wy][wx-1] = 8;
				datas[wy][wx-2] = 12;
			}		
			
			
				sheeps[wy][wx-1].setLocation(12+wx*50-100,36+wy*50);
				sheeps[wy][wx-2] = sheeps[wy][wx-1];
				sheeps[wy][wx-1] = null;
				
				wx=wx-1;
				int x =(int) lab_wolf.getLocation().getX();
				
				int y =(int) lab_wolf.getLocation().getY();
				
				lab_wolf.setLocation(x-50,y);
				
				Icon i = new ImageIcon("wolf-zuom.png");
				lab_wolf.setIcon(i);
				victory();
				return;
		
	}		
					
					
		if(key==38){
			//x�����ƶ�
			
			if(datas[wy-1][wx]==1)
				return;
			if(datas[wy-1][wx]==4&&datas[wy-2][wx]==1)
				return;
			if(datas[wy-1][wx]==4&&datas[wy-2][wx]==4)
				return;
			if(datas[wy-1][wx]==4&&datas[wy-2][wx]==12)
				return;
			if(datas[wy-1][wx]==12&&datas[wy-2][wx]==1)
				return;
			if(datas[wy-1][wx]==12&&datas[wy-2][wx]==4)
				return;
			if(datas[wy-1][wx]==12&&datas[wy-2][wx]==12)
				return;
			if(datas[wy-1][wx]==0){
				wy=wy-1;
				int x =(int) lab_wolf.getLocation().getX();
				
				int y =(int) lab_wolf.getLocation().getY();
				
				lab_wolf.setLocation(x,y-50);
				
				Icon i = new ImageIcon("wolf-hm.png");
				lab_wolf.setIcon(i);
				return;
			}
			if(datas[wy-1][wx]==8){
				wy=wy-1;
				int x =(int) lab_wolf.getLocation().getX();
				
				int y =(int) lab_wolf.getLocation().getY();
				
				lab_wolf.setLocation(x,y-50);
				
				Icon i = new ImageIcon("wolf-hm.png");
				lab_wolf.setIcon(i);
				return;
				
			}
			if(datas[wy-1][wx]==4&&datas[wy-2][wx]==0){
				datas[wy-1][wx] = 0;
				datas[wy-2][wx] = 4;
				
			}
			if(datas[wy-1][wx]==4&&datas[wy-2][wx]==8){
				datas[wy-1][wx] = 0;
				datas[wy-2][wx] = 12;
				num++;
			}	
				
			if(datas[wy-1][wx]==12&&datas[wy-2][wx]==0){
					datas[wy-1][wx] = 8;
					datas[wy-2][wx] = 4;
					num--;
				}		
				
			if(datas[wy-1][wx]==12&&datas[wy-2][wx]==8){
				datas[wy-1][wx] = 8;
				datas[wy-2][wx] = 12;
			}		
			
			
				sheeps[wy-1][wx].setLocation(12+wx*50,36+wy*50-100);
				sheeps[wy-2][wx] = sheeps[wy-1][wx];
				sheeps[wy-1][wx] = null;
				
				wy=wy-1;
				int x =(int) lab_wolf.getLocation().getX();
				
				int y =(int) lab_wolf.getLocation().getY();
				
				lab_wolf.setLocation(x,y-50);
				
				Icon i = new ImageIcon("wolf-hm.png");
				lab_wolf.setIcon(i);
				victory();
				return;
		 }	 
		
		
		
		
		
		
		if(key==40){
			//�����ƶ�
			
			if(datas[wy+1][wx]==1)
				return;
			if(datas[wy+1][wx]==4&&datas[wy+2][wx]==1)
				return;
			if(datas[wy+1][wx]==4&&datas[wy+2][wx]==4)
				return;
			if(datas[wy+1][wx]==4&&datas[wy+2][wx]==12)
				return;
			if(datas[wy+1][wx]==12&&datas[wy+2][wx]==1)
				return;
			if(datas[wy+1][wx]==12&&datas[wy+2][wx]==4)
				return;
			if(datas[wy+1][wx]==12&&datas[wy+2][wx]==12)
				return;
			if(datas[wy+1][wx]==0){
				wy=wy+1;
				int x =(int) lab_wolf.getLocation().getX();
				
				int y =(int) lab_wolf.getLocation().getY();
				
				lab_wolf.setLocation(x,y+50);
				
				Icon i = new ImageIcon("wolf-zm.png");
				lab_wolf.setIcon(i);
				return;
			}
			if(datas[wy+1][wx]==8){
				wy=wy+1;
				int x =(int) lab_wolf.getLocation().getX();
				
				int y =(int) lab_wolf.getLocation().getY();
				
				lab_wolf.setLocation(x,y+50);
				
				Icon i = new ImageIcon("wolf-zm.png");
				lab_wolf.setIcon(i);
				return;
				
			}
			if(datas[wy+1][wx]==4&&datas[wy+2][wx]==0){
				datas[wy+1][wx] = 0;
				datas[wy+2][wx] = 4;
				
			}
			if(datas[wy+1][wx]==4&&datas[wy+2][wx]==8){
				datas[wy+1][wx] = 0;
				datas[wy+2][wx] = 12;
				num++;
			}	
				
			if(datas[wy+1][wx]==12&&datas[wy+2][wx]==0){
					datas[wy+1][wx] = 8;
					datas[wy+2][wx] = 4;
					num--;
				}		
				
			if(datas[wy+1][wx]==12&&datas[wy+2][wx]==8){
				datas[wy+1][wx] = 8;
				datas[wy+2][wx] = 12;
			}		
			
			
				sheeps[wy+1][wx].setLocation(12+wx*50,36+wy*50+100);
				sheeps[wy+2][wx] = sheeps[wy+1][wx];
				sheeps[wy+1][wx] = null;
				
				wy=wy+1;
				int x =(int) lab_wolf.getLocation().getX();
				
				int y =(int) lab_wolf.getLocation().getY();
				
				lab_wolf.setLocation(x,y+50);
				
				Icon i = new ImageIcon("wolf-zm.png");
				lab_wolf.setIcon(i);
				victory();
				return;
		}
	
	}
	
	



	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	
}