import java.applet.Applet;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Sample6 extends Applet implements ActionListener {
	
	Button bt;
	
	public void init(){
		bt = new Button("�J�n"); //�{�^���I�u�W�F�N�g���쐬
		add(bt); //�A�v���b�g�Ƀ{�^���I�u�W�F�N�g������
		bt.addActionListener(this); //�{�^���������ꂽ�Ƃ��̃C�x���g���󂯎�鏀��
	}

	@Override
	public void actionPerformed(ActionEvent ae) { //�{�^���������ꂽ���̏���
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		bt.setLabel("���~"); //���x���𒆎~�ɂ���

	}

}
