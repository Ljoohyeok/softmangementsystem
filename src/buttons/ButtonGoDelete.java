package buttons;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import gui.WindowFrame;

public class ButtonGoDelete extends MouseAdapter {
	WindowFrame frame;
	public ButtonGoDelete(WindowFrame frame) {
		this.frame = frame;
	}
	@Override
	public void mousePressed(MouseEvent e) {
		frame.setupPanel(frame.getAccountdeleter());
	}
}
