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
	String[] part_name = { "개발부", "인사관리부", "총무부", "영업부" };

	public void panel() { // 판넬에 들어갈 정보들

		lbs = new Label[4];// 라벨
		lbs[0] = new Label("이름을 입력하세요");
		lbs[1] = new Label("직급을 입력하세요");
		lbs[2] = new Label("부서를 선택하세요");
		lbs[3] = new Label("생년월일을 선택해주세요");
		buts = new Button[4];// 버튼 4개
		buts[0] = new Button("추 가");
		buts[1] = new Button("수 정");
		buts[2] = new Button("조 회");
		buts[3] = new Button("삭 제");
		input = new TextField[4];// 텍필드
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
		font = new Font("휴먼굴림체", font.ITALIC,20);
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
		this.setBackground(Color.YELLOW);//배경
		this.setSize(400, 400); //크기
		this.setVisible(true);
		this.setResizable(false);//사이즈 조절불가
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
	}
}