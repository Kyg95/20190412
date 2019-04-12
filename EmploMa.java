package yyyg;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EmploMa extends Frame {
	Label[] lbs;
	Button[] buts;
	TextField[] input;
	Choice part;
	Panel panel;
	Font font;
	String[] part_name = { "���ߺ�", "�λ������", "�ѹ���", "������" };

	public void panel() { // �ǳڿ� �� ������

		lbs = new Label[4];// ��
		lbs[0] = new Label("�̸��� �Է��ϼ���");
		lbs[1] = new Label("������ �Է��ϼ���");
		lbs[2] = new Label("�μ��� �����ϼ���");
		lbs[3] = new Label("��������� �������ּ���");
		buts = new Button[4];// ��ư 4��
		buts[0] = new Button("�� ��");
		buts[1] = new Button("�� ��");
		buts[2] = new Button("�� ȸ");
		buts[3] = new Button("�� ��");
		input = new TextField[4];// ���ʵ�
		input[0] = new TextField(20);
		input[1] = new TextField(20);
		input[2] = new TextField(20);
		input[3] = new TextField(20);
		part = new Choice();
		for(int i =0; i< part_name.length; i++) {
			part.add(part_name[i]);
		}
		part.setBackground(Color.PINK);
		
	}

	public void addPanel() {
		panel.add(new Label()); panel.add(new Label());
		panel.add(lbs[0]); panel.add(input[0]);
		panel.add(new Label()); panel.add(new Label());
		panel.add(lbs[1]); panel.add(input[1]);
		panel.add(new Label()); panel.add(new Label());
		panel.add(lbs[2]); panel.add(part);
		panel.add(new Label()); panel.add(new Label());
		panel.add(lbs[3]); panel.add(input[3]); panel.add(new Label());
		panel.add(new Label());panel.add(new Label());
		panel.add(new Label()); panel.add(new Label());
		panel.add(new Label()); panel.add(new Label());
		panel.add(buts[0]);panel.add(buts[1]);
		panel.add(buts[2]);panel.add(buts[3]);
	}

	public EmploMa(String title) {
		super(title);
		panel = new Panel();
		panel();
		addPanel();
		font = new Font("�޸ձ���ü", font.ITALIC,20);
		buts = new Button[4];
		buts[0] = new Button("j");
		buts[0].setFont(font);
		buts[1] = new Button("c");
		buts[1].setFont(font);
		buts[2] = new Button("u");
		buts[2].setFont(font);
		buts[3] = new Button("y");
		buts[3].setFont(font);
		this.setLayout(new BorderLayout(4,5));
		this.add("North", buts[0]);
		this.add("East", buts[1]);
		this.add("West", buts[2]);
		this.add("Center", panel);
		this.add("South", buts[3]);
		this.setBackground(Color.YELLOW);//���
		this.setSize(400, 400); //ũ��
		this.setVisible(true);
		this.setResizable(false);//������ �����Ұ�
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
	}
}