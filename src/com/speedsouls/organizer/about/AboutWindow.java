package com.speedsouls.organizer.about;


import java.awt.Dialog;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.speedsouls.organizer.data.OrganizerManager;


/**
 * Short description.
 * <p>
 * Long description.
 *
 * @author Kahmul (www.twitch.tv/kahmul78)
 * @date 4 Jun 2016
 */
public class AboutWindow extends JDialog
{

	private static final long serialVersionUID = 3660600135211221410L;


	/**
	 * Creates a new AboutWindow.
	 */
	public AboutWindow()
	{
		super(null, "About SpeedSouls - Save Organizer", Dialog.ModalityType.APPLICATION_MODAL);

		initProperties();
		initLayout();

		setVisible(true);
	}


	/**
	 * 
	 */
	private void initProperties()
	{
		setIconImage(OrganizerManager.speedsoulsIcon);
		setSize(330, 140);
		setLocationRelativeTo(null);
		setResizable(false);
		setAlwaysOnTop(OrganizerManager.isAlwaysOnTop());
	}


	/**
	 * 
	 */
	private void initLayout()
	{
		JPanel guiPanel = new JPanel();
		guiPanel.setLayout(new FlowLayout(FlowLayout.LEADING, 50, 0));
		guiPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

		guiPanel.add(new AboutPanel());
		guiPanel.add(new JLabel(new ImageIcon(OrganizerManager.speedsoulsIconMedium)));

		add(guiPanel);
	}
}