import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static Color c1 = new Color(255, 80, 255);
	public static Color HLColor = new Color(255, 150, 180);
	public static int volnaMista1 = 4;
	public static int volnaMista2 = 4;
	public static int volnaMista3 = 4;
	public static int[] sedadlaZabranost1 = new int[4];
	public static int[] sedadlaZabranost2 = new int[4];
	public static int[] sedadlaZabranost3 = new int[4];
	public static int[] ktereLetyTisknout = new int[3];
	public static int volanoNaLet;
	public static int volanoNaButton;
	public static int cisloLetu1 = 1;
	public static int cisloLetu2 = 2;
	public static int cisloLetu3 = 3;
	public static String[] jmena = new String[12];

	public static void tisk() {
		File file = new File("Letenka.txt");
		try {
			FileWriter write = new FileWriter(file);
			String toWrite = "";
			String pom = "";
			if (ktereLetyTisknout[0] == 1) {
				pom += "LET-BE " + cisloLetu1 + " volné: " + volnaMista1 + "       ";
			}
			if (ktereLetyTisknout[1] == 1) {
				pom += "LET-BE " + cisloLetu2 + " volné: " + volnaMista2 + "       ";
			}
			if (ktereLetyTisknout[2] == 1) {
				pom += "LET-BE " + cisloLetu3 + " volné: " + volnaMista3;
			}
			pom += System.lineSeparator();
			if (ktereLetyTisknout[0] == 1) {
				if (sedadlaZabranost1[0] == 1) {
					pom += "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -"
							+ System.lineSeparator() + "LET  BE " + cisloLetu1 + System.lineSeparator() + "Sedadlo 1"
							+ " / " + jmena[0] + System.lineSeparator()
							+ "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -"
							+ System.lineSeparator();
				}
				if (sedadlaZabranost1[1] == 1) {
					pom += "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -"
							+ System.lineSeparator() + "LET  BE " + cisloLetu1 + System.lineSeparator() + "Sedadlo 2"
							+ " / " + jmena[1] + System.lineSeparator()
							+ "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -"
							+ System.lineSeparator();
				}
				if (sedadlaZabranost1[2] == 1) {
					pom += "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -"
							+ System.lineSeparator() + "LET  BE " + cisloLetu1 + System.lineSeparator() + "Sedadlo 3"
							+ " / " + jmena[2] + System.lineSeparator()
							+ "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -"
							+ System.lineSeparator();
				}
				if (sedadlaZabranost1[3] == 1) {
					pom += "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -"
							+ System.lineSeparator() + "LET  BE " + cisloLetu1 + System.lineSeparator() + "Sedadlo 4"
							+ " / " + jmena[3] + System.lineSeparator()
							+ "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -"
							+ System.lineSeparator();
				}
				toWrite += pom + System.lineSeparator() + System.lineSeparator();
			}
			pom = "";
			if (ktereLetyTisknout[1] == 1) {
				if (sedadlaZabranost2[0] == 1) {
					pom += "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -"
							+ System.lineSeparator() + "LET  BE " + cisloLetu2 + System.lineSeparator() + "Sedadlo 1"
							+ " / " + jmena[4] + System.lineSeparator()
							+ "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -"
							+ System.lineSeparator();
				}
				if (sedadlaZabranost2[1] == 1) {
					pom += "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -"
							+ System.lineSeparator() + "LET  BE " + cisloLetu2 + System.lineSeparator() + "Sedadlo 2"
							+ " / " + jmena[5] + System.lineSeparator()
							+ "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -"
							+ System.lineSeparator();
				}
				if (sedadlaZabranost2[2] == 1) {
					pom += "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -"
							+ System.lineSeparator() + "LET  BE " + cisloLetu2 + System.lineSeparator() + "Sedadlo 3"
							+ " / " + jmena[6] + System.lineSeparator()
							+ "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -"
							+ System.lineSeparator();
				}
				if (sedadlaZabranost2[3] == 1) {
					pom += "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -"
							+ System.lineSeparator() + "LET  BE " + cisloLetu2 + System.lineSeparator() + "Sedadlo 4"
							+ " / " + jmena[7] + System.lineSeparator()
							+ "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -"
							+ System.lineSeparator();
				}
				toWrite += pom + System.lineSeparator() + System.lineSeparator();
			}
			pom = "";
			if (ktereLetyTisknout[2] == 1) {
				if (sedadlaZabranost3[0] == 1) {
					pom += "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -"
							+ System.lineSeparator() + "LET  BE " + cisloLetu3 + System.lineSeparator() + "Sedadlo 1"
							+ " / " + jmena[8] + System.lineSeparator()
							+ "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -"
							+ System.lineSeparator();
				}
				if (sedadlaZabranost3[1] == 1) {
					pom += "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -"
							+ System.lineSeparator() + "LET  BE " + cisloLetu3 + System.lineSeparator() + "Sedadlo 2"
							+ " / " + jmena[9] + System.lineSeparator()
							+ "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -"
							+ System.lineSeparator();
				}
				if (sedadlaZabranost3[2] == 1) {
					pom += "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -"
							+ System.lineSeparator() + "LET  BE " + cisloLetu3 + System.lineSeparator() + "Sedadlo 3"
							+ " / " + jmena[10] + System.lineSeparator()
							+ "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -"
							+ System.lineSeparator();
				}
				if (sedadlaZabranost3[3] == 1) {
					pom += "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -"
							+ System.lineSeparator() + "LET  BE " + cisloLetu3 + System.lineSeparator() + "Sedadlo 4"
							+ " / " + jmena[11] + System.lineSeparator()
							+ "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -"
							+ System.lineSeparator();
				}
				toWrite += pom;
			}
			write.write(toWrite);
			write.close();
			Desktop desktop = Desktop.getDesktop();
			desktop.print(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		ktereLetyTisknout[0] = 0;
		ktereLetyTisknout[1] = 0;
		ktereLetyTisknout[2] = 0;
		sedadlaZabranost1[0] = 0;
		sedadlaZabranost1[1] = 0;
		sedadlaZabranost1[2] = 0;
		sedadlaZabranost1[3] = 0;
		sedadlaZabranost2[0] = 0;
		sedadlaZabranost2[1] = 0;
		sedadlaZabranost2[2] = 0;
		sedadlaZabranost2[3] = 0;
		sedadlaZabranost3[0] = 0;
		sedadlaZabranost3[1] = 0;
		sedadlaZabranost3[2] = 0;
		sedadlaZabranost3[3] = 0;
		for (int i = 0; i < 12; i++) {
			jmena[i] = "";
		}

		Random r = new Random();

		cisloLetu1 = r.nextInt(9000) + 1000;
		do {
			cisloLetu2 = r.nextInt(9000) + 1000;
		} while (cisloLetu2 == cisloLetu1);
		do {
			cisloLetu3 = r.nextInt(9000) + 1000;
		} while (cisloLetu3 == cisloLetu1 || cisloLetu3 == cisloLetu2);

		try {
			FileInputStream fis = new FileInputStream("Color1.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			HLColor = (Color) ois.readObject();
			ois.close();
			
			fis = new FileInputStream("Color2.dat");
			ois = new ObjectInputStream(fis);
			c1 = (Color) ois.readObject();
			ois.close();
		} catch (Exception e) {
		}

		JFrame HLFrame = new JFrame("Barbie Express");

		JPanel HLPanel = new JPanel();

		Label odsazeni = new Label("");
		odsazeni.setPreferredSize(new Dimension(550, 40));
		HLPanel.add(odsazeni, BorderLayout.CENTER);

		Label let1 = new Label("LET  BE " + cisloLetu1);
		HLPanel.add(let1, BorderLayout.CENTER);
		Label volno1 = new Label("/        Poèet volných míst: " + String.valueOf(volnaMista1) + "      ");
		HLPanel.add(volno1, BorderLayout.CENTER);
		JButton sedadla1 = new JButton("Na sedadla");
		sedadla1.setBackground(c1);
		HLPanel.add(sedadla1);

		Label odsazeni1 = new Label("                                              Obsazená sedadla: ");
		odsazeni1.setPreferredSize(new Dimension(550, 150));
		HLPanel.add(odsazeni1, BorderLayout.CENTER);

		Label let2 = new Label("LET  BE " + cisloLetu2);
		HLPanel.add(let2, BorderLayout.CENTER);
		Label volno2 = new Label("/        Poèet volných míst: " + String.valueOf(volnaMista2) + "      ");
		HLPanel.add(volno2, BorderLayout.CENTER);
		JButton sedadla2 = new JButton("Na sedadla");
		sedadla2.setBackground(c1);
		HLPanel.add(sedadla2);

		Label odsazeni2 = new Label("                                              Obsazená sedadla: ");
		odsazeni2.setPreferredSize(new Dimension(550, 150));
		HLPanel.add(odsazeni2, BorderLayout.CENTER);

		Label let3 = new Label("LET  BE " + cisloLetu3);
		HLPanel.add(let3, BorderLayout.CENTER);
		Label volno3 = new Label("/        Poèet volných míst: " + String.valueOf(volnaMista3) + "      ");
		HLPanel.add(volno3, BorderLayout.CENTER);
		JButton sedadla3 = new JButton("Na sedadla");
		sedadla3.setBackground(c1);
		HLPanel.add(sedadla3);

		Label odsazeni3 = new Label("                                              Obsazená sedadla: ");
		odsazeni3.setPreferredSize(new Dimension(550, 150));
		HLPanel.add(odsazeni3, BorderLayout.CENTER);

		JFrame SideFrame = new JFrame("Sedaèky v letadle");
		JPanel SidePanel = new JPanel();
		JPanel SidePanelMain = new JPanel();

		JFrame PrintFrame = new JFrame("Tisk");
		JPanel PrintPanel = new JPanel();
		JPanel DolniPrintPanel = new JPanel();

		PrintPanel.setBackground(HLColor);
		DolniPrintPanel.setBackground(HLColor);
		PrintFrame.setVisible(false);
		PrintFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		PrintFrame.setSize(250, 500);
		PrintFrame.setLocationRelativeTo(null);
		PrintFrame.setResizable(false);
		PrintFrame.setAlwaysOnTop(true);
		PrintFrame.add(PrintPanel, BorderLayout.CENTER);
		PrintFrame.add(DolniPrintPanel, BorderLayout.SOUTH);

		JFrame NameFrame = new JFrame("Zadejte jméno");
		JPanel NamePanel = new JPanel();
		JPanel DolniNamePanel = new JPanel();

		NamePanel.setBackground(HLColor);
		DolniNamePanel.setBackground(HLColor);
		NameFrame.setVisible(false);
		NameFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		NameFrame.setSize(300, 200);
		NameFrame.setLocationRelativeTo(null);
		NameFrame.setResizable(false);
		NameFrame.setAlwaysOnTop(true);
		NameFrame.add(NamePanel, BorderLayout.CENTER);
		NameFrame.add(DolniNamePanel, BorderLayout.SOUTH);

		HLPanel.setBackground(HLColor);
		HLFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		HLFrame.setSize(600, 700);
		HLFrame.setLocationRelativeTo(null);
		HLFrame.setResizable(false);
		HLFrame.setAlwaysOnTop(true);
		HLFrame.add(HLPanel, BorderLayout.CENTER);

		JButton konec = new JButton("Konec");
		konec.setPreferredSize(new Dimension(70, 30));
		konec.setBackground(c1);
		HLPanel.add(konec, BorderLayout.CENTER);

		JButton autoTisk = new JButton("Tisk");
		autoTisk.setPreferredSize(new Dimension(70, 30));
		autoTisk.setBackground(c1);
		HLPanel.add(autoTisk, BorderLayout.CENTER);

		Icon icon = new ImageIcon("gear.png");
		JButton settings = new JButton(icon);
		settings.setPreferredSize(new Dimension(30, 30));
		settings.setBackground(c1);
		HLPanel.add(settings, BorderLayout.CENTER);

		HLFrame.setVisible(true);

		konec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				System.exit(0);
			};
		});

		JFrame ColorFrame = new JFrame("Nastavení barvy");
		JPanel ColorPanel = new JPanel();
		JPanel DolniColorPanel = new JPanel();

		ColorPanel.setBackground(HLColor);
		DolniColorPanel.setBackground(HLColor);
		ColorFrame.setVisible(false);
		ColorFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		ColorFrame.setSize(300, 220);
		ColorFrame.setLocationRelativeTo(null);
		ColorFrame.setResizable(false);
		ColorFrame.setAlwaysOnTop(true);
		ColorFrame.add(ColorPanel, BorderLayout.CENTER);
		ColorFrame.add(DolniColorPanel, BorderLayout.SOUTH);

		Label info = new Label("                                     Pozadí                                   ");
		ColorPanel.add(info, BorderLayout.CENTER);

		SpinnerModel value1 = new SpinnerNumberModel(HLColor.getRed(), 0, 255, 1);
		SpinnerModel value2 = new SpinnerNumberModel(HLColor.getGreen(), 0, 255, 1);
		SpinnerModel value3 = new SpinnerNumberModel(HLColor.getBlue(), 0, 255, 1);
		SpinnerModel value4 = new SpinnerNumberModel(c1.getRed(), 0, 255, 1);
		SpinnerModel value5 = new SpinnerNumberModel(c1.getGreen(), 0, 255, 1);
		SpinnerModel value6 = new SpinnerNumberModel(c1.getBlue(), 0, 255, 1);

		Label r1 = new Label("R");
		ColorPanel.add(r1, BorderLayout.CENTER);

		JSpinner Rgb = new JSpinner(value1);
		Rgb.setPreferredSize(new Dimension(50, 30));
		ColorPanel.add(Rgb);

		Label g1 = new Label("G");
		ColorPanel.add(g1, BorderLayout.CENTER);

		JSpinner rGb = new JSpinner(value2);
		rGb.setPreferredSize(new Dimension(50, 30));
		ColorPanel.add(rGb);

		Label b1 = new Label("B");
		ColorPanel.add(b1, BorderLayout.CENTER);

		JSpinner rgB = new JSpinner(value3);
		rgB.setPreferredSize(new Dimension(50, 30));
		ColorPanel.add(rgB);

		Label info2 = new Label("                                     Tlaèítka                                   ");
		ColorPanel.add(info2, BorderLayout.CENTER);

		Label r2 = new Label("R");
		ColorPanel.add(r2, BorderLayout.CENTER);

		JSpinner Rgb2 = new JSpinner(value4);
		Rgb2.setPreferredSize(new Dimension(50, 30));
		ColorPanel.add(Rgb2);

		Label g2 = new Label("G");
		ColorPanel.add(g2, BorderLayout.CENTER);

		JSpinner rGb2 = new JSpinner(value5);
		rGb2.setPreferredSize(new Dimension(50, 30));
		ColorPanel.add(rGb2);

		Label b2 = new Label("B");
		ColorPanel.add(b2, BorderLayout.CENTER);

		JSpinner rgB2 = new JSpinner(value6);
		rgB2.setPreferredSize(new Dimension(50, 30));
		ColorPanel.add(rgB2);

		JButton setBarva = new JButton("Potvrzuji");
		setBarva.setPreferredSize(new Dimension(80, 40));
		setBarva.setBackground(c1);
		DolniColorPanel.add(setBarva);

		TextField field = new TextField();
		field.setPreferredSize(new Dimension(200, 100));
		NamePanel.add(field);

		JButton setJmeno = new JButton("Potvrzuji");
		setJmeno.setPreferredSize(new Dimension(80, 40));
		setJmeno.setBackground(c1);
		DolniNamePanel.add(setJmeno);

		SidePanel.setBackground(HLColor);
		SidePanelMain.setBackground(HLColor);
		SideFrame.setVisible(false);
		SideFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		SideFrame.setSize(300, 500);
		SideFrame.setLocationRelativeTo(null);
		SideFrame.setResizable(false);
		SideFrame.setAlwaysOnTop(true);
		SideFrame.add(SidePanel, BorderLayout.SOUTH);
		SideFrame.add(SidePanelMain, BorderLayout.CENTER);

		JButton potvrd = new JButton("Potvrzuji");
		potvrd.setPreferredSize(new Dimension(80, 40));
		potvrd.setBackground(c1);
		SidePanel.add(potvrd);

		JButton potvrd2 = new JButton("Zpìt");
		potvrd2.setPreferredSize(new Dimension(80, 40));
		potvrd2.setBackground(c1);
		DolniPrintPanel.add(potvrd2);

		JButton tisk = new JButton("Tisk");
		tisk.setPreferredSize(new Dimension(80, 40));
		tisk.setBackground(c1);
		DolniPrintPanel.add(tisk);

		Label label = new Label();
		label.setPreferredSize(new Dimension(250, 100));
		SidePanelMain.add(label);

		JButton sedadlo1 = new JButton("Sedadlo 1");
		sedadlo1.setPreferredSize(new Dimension(100, 80));
		SidePanelMain.add(sedadlo1);
		JButton sedadlo2 = new JButton("Sedadlo 2");
		sedadlo2.setPreferredSize(new Dimension(100, 80));
		SidePanelMain.add(sedadlo2);
		JButton sedadlo3 = new JButton("Sedadlo 3");
		sedadlo3.setPreferredSize(new Dimension(100, 80));
		SidePanelMain.add(sedadlo3);
		JButton sedadlo4 = new JButton("Sedadlo 4");
		sedadlo4.setPreferredSize(new Dimension(100, 80));
		SidePanelMain.add(sedadlo4);

		sedadlo1.setBackground(Color.GREEN);
		sedadlo2.setBackground(Color.GREEN);
		sedadlo3.setBackground(Color.GREEN);
		sedadlo4.setBackground(Color.GREEN);

		Label odsazeni4 = new Label("");
		odsazeni4.setPreferredSize(new Dimension(138, 70));
		PrintPanel.add(odsazeni4, BorderLayout.CENTER);
		JButton lety1 = new JButton("Let 1");
		lety1.setPreferredSize(new Dimension(138, 80));
		PrintPanel.add(lety1);
		JButton lety2 = new JButton("Let 2");
		lety2.setPreferredSize(new Dimension(138, 80));
		PrintPanel.add(lety2);
		JButton lety3 = new JButton("Let 3");
		lety3.setPreferredSize(new Dimension(138, 80));
		PrintPanel.add(lety3);

		autoTisk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				PrintFrame.setVisible(true);
				HLFrame.setVisible(false);
				lety1.setBackground(Color.GREEN);
				lety1.setLabel("Let 1");
				lety2.setBackground(Color.GREEN);
				lety2.setLabel("Let 2");
				lety3.setBackground(Color.GREEN);
				lety3.setLabel("Let 3");
				ktereLetyTisknout[0] = 0;
				ktereLetyTisknout[1] = 0;
				ktereLetyTisknout[2] = 0;
			};
		});
		lety1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				if (ktereLetyTisknout[0] == 0) {
					ktereLetyTisknout[0] = 1;
					lety1.setBackground(Color.RED);
					lety1.setLabel("Vybráno");
				} else {
					ktereLetyTisknout[0] = 0;
					lety1.setBackground(Color.GREEN);
					lety1.setLabel("Let 1");
				}
			};
		});
		lety2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				if (ktereLetyTisknout[1] == 0) {
					ktereLetyTisknout[1] = 1;
					lety2.setBackground(Color.RED);
					lety2.setLabel("Vybráno");
				} else {
					ktereLetyTisknout[1] = 0;
					lety2.setBackground(Color.GREEN);
					lety2.setLabel("Let 2");
				}
			};
		});
		lety3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				if (ktereLetyTisknout[2] == 0) {
					ktereLetyTisknout[2] = 1;
					lety3.setBackground(Color.RED);
					lety3.setLabel("Vybráno");
				} else {
					ktereLetyTisknout[2] = 0;
					lety3.setBackground(Color.GREEN);
					lety3.setLabel("Let 1");
				}
			};
		});

		sedadla1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				SideFrame.setVisible(true);
				HLFrame.setVisible(false);
				volanoNaLet = 1;
				if (sedadlaZabranost1[0] == 0) {
					sedadlo1.setBackground(Color.GREEN);
					sedadlo1.setLabel("Sedadlo 1");
				} else {
					sedadlo1.setBackground(Color.RED);
					sedadlo1.setLabel(jmena[0]);
				}
				if (sedadlaZabranost1[1] == 0) {
					sedadlo2.setBackground(Color.GREEN);
					sedadlo2.setLabel("Sedadlo 2");
				} else {
					sedadlo2.setBackground(Color.RED);
					sedadlo2.setLabel(jmena[1]);
				}
				if (sedadlaZabranost1[2] == 0) {
					sedadlo3.setBackground(Color.GREEN);
					sedadlo3.setLabel("Sedadlo 3");
				} else {
					sedadlo3.setBackground(Color.RED);
					sedadlo3.setLabel(jmena[2]);
				}
				if (sedadlaZabranost1[3] == 0) {
					sedadlo4.setBackground(Color.GREEN);
					sedadlo4.setLabel("Sedadlo 4");
				} else {
					sedadlo4.setBackground(Color.RED);
					sedadlo4.setLabel(jmena[3]);
				}
			};
		});

		sedadla2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				SideFrame.setVisible(true);
				HLFrame.setVisible(false);
				volanoNaLet = 2;
				if (sedadlaZabranost2[0] == 0) {
					sedadlo1.setBackground(Color.GREEN);
					sedadlo1.setLabel("Sedadlo 1");
				} else {
					sedadlo1.setBackground(Color.RED);
					sedadlo1.setLabel(jmena[4]);
				}
				if (sedadlaZabranost2[1] == 0) {
					sedadlo2.setBackground(Color.GREEN);
					sedadlo2.setLabel("Sedadlo 2");
				} else {
					sedadlo2.setBackground(Color.RED);
					sedadlo2.setLabel(jmena[5]);
				}
				if (sedadlaZabranost2[2] == 0) {
					sedadlo3.setBackground(Color.GREEN);
					sedadlo3.setLabel("Sedadlo 3");
				} else {
					sedadlo3.setBackground(Color.RED);
					sedadlo3.setLabel(jmena[6]);
				}
				if (sedadlaZabranost2[3] == 0) {
					sedadlo4.setBackground(Color.GREEN);
					sedadlo4.setLabel("Sedadlo 4");
				} else {
					sedadlo4.setBackground(Color.RED);
					sedadlo4.setLabel(jmena[7]);
				}
			};
		});

		sedadla3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				SideFrame.setVisible(true);
				HLFrame.setVisible(false);
				volanoNaLet = 3;
				if (sedadlaZabranost3[0] == 0) {
					sedadlo1.setBackground(Color.GREEN);
					sedadlo1.setLabel("Sedadlo 1");
				} else {
					sedadlo1.setBackground(Color.RED);
					sedadlo1.setLabel(jmena[8]);
				}
				if (sedadlaZabranost3[1] == 0) {
					sedadlo2.setBackground(Color.GREEN);
					sedadlo2.setLabel("Sedadlo 2");
				} else {
					sedadlo2.setBackground(Color.RED);
					sedadlo2.setLabel(jmena[9]);
				}
				if (sedadlaZabranost3[2] == 0) {
					sedadlo3.setBackground(Color.GREEN);
					sedadlo3.setLabel("Sedadlo 3");
				} else {
					sedadlo3.setBackground(Color.RED);
					sedadlo3.setLabel(jmena[10]);
				}
				if (sedadlaZabranost3[3] == 0) {
					sedadlo4.setBackground(Color.GREEN);
					sedadlo4.setLabel("Sedadlo 4");
				} else {
					sedadlo4.setBackground(Color.RED);
					sedadlo4.setLabel(jmena[11]);
				}
			};
		});

		potvrd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				SideFrame.setVisible(false);
				HLFrame.setVisible(true);
				volno1.setText(" /        Poèet volných míst: " + String.valueOf(volnaMista1) + "      ");
				volno2.setText(" /        Poèet volných míst: " + String.valueOf(volnaMista2) + "      ");
				volno3.setText(" /        Poèet volných míst: " + String.valueOf(volnaMista3) + "      ");
				String pom = "";
				if (sedadlaZabranost1[0] == 1) {
					pom += "   1";
				}
				if (sedadlaZabranost1[1] == 1) {
					pom += "   2";
				}
				if (sedadlaZabranost1[2] == 1) {
					pom += "   3";
				}
				if (sedadlaZabranost1[3] == 1) {
					pom += "   4";
				}
				odsazeni1.setText("                                              Obsazená sedadla: " + pom);
				pom = "";
				if (sedadlaZabranost2[0] == 1) {
					pom += "   1";
				}
				if (sedadlaZabranost2[1] == 1) {
					pom += "   2";
				}
				if (sedadlaZabranost2[2] == 1) {
					pom += "   3";
				}
				if (sedadlaZabranost2[3] == 1) {
					pom += "   4";
				}
				odsazeni2.setText("                                              Obsazená sedadla: " + pom);
				pom = "";
				if (sedadlaZabranost3[0] == 1) {
					pom += "   1";
				}
				if (sedadlaZabranost3[1] == 1) {
					pom += "   2";
				}
				if (sedadlaZabranost3[2] == 1) {
					pom += "   3";
				}
				if (sedadlaZabranost3[3] == 1) {
					pom += "   4";
				}
				odsazeni3.setText("                                              Obsazená sedadla: " + pom);
			};
		});
		setJmeno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				SideFrame.setVisible(true);
				NameFrame.setVisible(false);
				int pom = 0;
				if (volanoNaLet == 2) {
					pom = 4;
				} else if (volanoNaLet == 3) {
					pom = 8;
				}

				if (volanoNaButton == 1) {
					jmena[pom] = field.getText();
					sedadlo1.setLabel(field.getText());
				} else if (volanoNaButton == 2) {
					jmena[pom + 1] = field.getText();
					sedadlo2.setLabel(field.getText());
				} else if (volanoNaButton == 3) {
					jmena[pom + 2] = field.getText();
					sedadlo3.setLabel(field.getText());
				} else if (volanoNaButton == 4) {
					jmena[pom + 3] = field.getText();
					sedadlo4.setLabel(field.getText());
				}
				field.setText("");
			};
		});
		potvrd2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				PrintFrame.setVisible(false);
				HLFrame.setVisible(true);
			};
		});

		tisk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				PrintFrame.setVisible(false);
				tisk();
				HLFrame.setVisible(true);
			};
		});

		settings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				ColorFrame.setVisible(true);
				HLFrame.setVisible(false);
			};
		});

		setBarva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				try {
					Color pom1 = new Color((Integer) Rgb.getValue(), (Integer) rGb.getValue(),
							(Integer) rgB.getValue());
					HLColor = pom1;
					FileOutputStream fos = new FileOutputStream("Color1.dat");
					ObjectOutputStream oos = new ObjectOutputStream(fos);
					oos.writeObject(pom1);
					oos.close();

					pom1 = new Color((Integer) Rgb2.getValue(), (Integer) rGb2.getValue(), (Integer) rgB2.getValue());
					c1 = pom1;
					fos = new FileOutputStream("Color2.dat");
					oos = new ObjectOutputStream(fos);
					oos.writeObject(pom1);
					oos.close();
				} catch (Exception e) {
				}
				ColorFrame.setVisible(false);

				sedadla1.setBackground(c1);
				sedadla2.setBackground(c1);
				sedadla3.setBackground(c1);
				konec.setBackground(c1);
				autoTisk.setBackground(c1);
				settings.setBackground(c1);
				setBarva.setBackground(c1);
				setJmeno.setBackground(c1);
				potvrd.setBackground(c1);
				potvrd2.setBackground(c1);
				tisk.setBackground(c1);

				odsazeni.setBackground(HLColor);
				let1.setBackground(HLColor);
				volno1.setBackground(HLColor);
				odsazeni1.setBackground(HLColor);
				let2.setBackground(HLColor);
				volno2.setBackground(HLColor);
				odsazeni2.setBackground(HLColor);
				let3.setBackground(HLColor);
				volno3.setBackground(HLColor);
				odsazeni3.setBackground(HLColor);
				info.setBackground(HLColor);
				info2.setBackground(HLColor);
				r1.setBackground(HLColor);
				r2.setBackground(HLColor);
				g1.setBackground(HLColor);
				g2.setBackground(HLColor);
				b1.setBackground(HLColor);
				b2.setBackground(HLColor);
				PrintPanel.setBackground(HLColor);
				DolniPrintPanel.setBackground(HLColor);
				NamePanel.setBackground(HLColor);
				DolniNamePanel.setBackground(HLColor);
				HLPanel.setBackground(HLColor);
				ColorPanel.setBackground(HLColor);
				DolniColorPanel.setBackground(HLColor);
				SidePanel.setBackground(HLColor);
				SidePanelMain.setBackground(HLColor);

				HLFrame.setVisible(true);
			};
		});

		sedadlo1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				if (volanoNaLet == 1) {
					if (sedadlaZabranost1[0] == 0) {
						volnaMista1--;
						sedadlo1.setBackground(Color.RED);
						sedadlaZabranost1[0] = 1;
						volanoNaButton = 1;
						SideFrame.setVisible(false);
						NameFrame.setVisible(true);
					} else {
						volnaMista1++;
						sedadlo1.setBackground(Color.GREEN);
						sedadlaZabranost1[0] = 0;
						sedadlo1.setLabel("Sedadlo 1");
					}
				} else if (volanoNaLet == 2) {
					if (sedadlaZabranost2[0] == 0) {
						volnaMista2--;
						sedadlo1.setBackground(Color.RED);
						sedadlaZabranost2[0] = 1;
						volanoNaButton = 1;
						SideFrame.setVisible(false);
						NameFrame.setVisible(true);
					} else {
						volnaMista2++;
						sedadlo1.setBackground(Color.GREEN);
						sedadlaZabranost2[0] = 0;
						sedadlo1.setLabel("Sedadlo 1");
					}
				} else if (volanoNaLet == 3) {
					if (sedadlaZabranost3[0] == 0) {
						volnaMista3--;
						sedadlo1.setBackground(Color.RED);
						sedadlaZabranost3[0] = 1;
						volanoNaButton = 1;
						SideFrame.setVisible(false);
						NameFrame.setVisible(true);
					} else {
						volnaMista3++;
						sedadlo1.setBackground(Color.GREEN);
						sedadlaZabranost3[0] = 0;
						sedadlo1.setLabel("Sedadlo 1");
					}
				}
			};
		});

		sedadlo2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				if (volanoNaLet == 1) {
					if (sedadlaZabranost1[1] == 0) {
						volnaMista1--;
						sedadlo2.setBackground(Color.RED);
						sedadlaZabranost1[1] = 1;
						volanoNaButton = 2;
						SideFrame.setVisible(false);
						NameFrame.setVisible(true);
					} else {
						volnaMista1++;
						sedadlo2.setBackground(Color.GREEN);
						sedadlaZabranost1[1] = 0;
						sedadlo2.setLabel("Sedadlo 2");
					}
				} else if (volanoNaLet == 2) {
					if (sedadlaZabranost2[1] == 0) {
						volnaMista2--;
						sedadlo2.setBackground(Color.RED);
						sedadlaZabranost2[1] = 1;
						volanoNaButton = 2;
						SideFrame.setVisible(false);
						NameFrame.setVisible(true);
					} else {
						volnaMista2++;
						sedadlo2.setBackground(Color.GREEN);
						sedadlaZabranost2[1] = 0;
						sedadlo2.setLabel("Sedadlo 2");
					}
				} else if (volanoNaLet == 3) {
					if (sedadlaZabranost3[1] == 0) {
						volnaMista3--;
						sedadlo2.setBackground(Color.RED);
						sedadlaZabranost3[1] = 1;
						volanoNaButton = 2;
						SideFrame.setVisible(false);
						NameFrame.setVisible(true);
					} else {
						volnaMista3++;
						sedadlo2.setBackground(Color.GREEN);
						sedadlaZabranost3[1] = 0;
						sedadlo2.setLabel("Sedadlo 2");
					}
				}
			};
		});

		sedadlo3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				if (volanoNaLet == 1) {
					if (sedadlaZabranost1[2] == 0) {
						volnaMista1--;
						sedadlo3.setBackground(Color.RED);
						sedadlaZabranost1[2] = 1;
						volanoNaButton = 3;
						SideFrame.setVisible(false);
						NameFrame.setVisible(true);
					} else {
						volnaMista1++;
						sedadlo3.setBackground(Color.GREEN);
						sedadlaZabranost1[2] = 0;
						sedadlo3.setLabel("Sedadlo 3");
					}
				} else if (volanoNaLet == 2) {
					if (sedadlaZabranost2[2] == 0) {
						volnaMista2--;
						sedadlo3.setBackground(Color.RED);
						sedadlaZabranost2[2] = 1;
						volanoNaButton = 3;
						SideFrame.setVisible(false);
						NameFrame.setVisible(true);
					} else {
						volnaMista2++;
						sedadlo3.setBackground(Color.GREEN);
						sedadlaZabranost2[2] = 0;
						sedadlo3.setLabel("Sedadlo 3");
					}
				} else if (volanoNaLet == 3) {
					if (sedadlaZabranost3[2] == 0) {
						volnaMista3--;
						sedadlo3.setBackground(Color.RED);
						sedadlaZabranost3[2] = 1;
						volanoNaButton = 3;
						SideFrame.setVisible(false);
						NameFrame.setVisible(true);
					} else {
						volnaMista3++;
						sedadlo3.setBackground(Color.GREEN);
						sedadlaZabranost3[2] = 0;
						sedadlo3.setLabel("Sedadlo 3");
					}
				}
			};
		});

		sedadlo4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				if (volanoNaLet == 1) {
					if (sedadlaZabranost1[3] == 0) {
						volnaMista1--;
						sedadlo4.setBackground(Color.RED);
						sedadlaZabranost1[3] = 1;
						volanoNaButton = 4;
						SideFrame.setVisible(false);
						NameFrame.setVisible(true);
					} else {
						volnaMista1++;
						sedadlo4.setBackground(Color.GREEN);
						sedadlaZabranost1[3] = 0;
						sedadlo4.setLabel("Sedadlo 4");
					}
				} else if (volanoNaLet == 2) {
					if (sedadlaZabranost2[3] == 0) {
						volnaMista2--;
						sedadlo4.setBackground(Color.RED);
						sedadlaZabranost2[3] = 1;
						volanoNaButton = 4;
						SideFrame.setVisible(false);
						NameFrame.setVisible(true);
					} else {
						volnaMista2++;
						sedadlo4.setBackground(Color.GREEN);
						sedadlaZabranost2[3] = 0;
						sedadlo4.setLabel("Sedadlo 4");
					}
				} else if (volanoNaLet == 3) {
					if (sedadlaZabranost3[3] == 0) {
						volnaMista3--;
						sedadlo4.setBackground(Color.RED);
						sedadlaZabranost3[3] = 1;
						volanoNaButton = 4;
						SideFrame.setVisible(false);
						NameFrame.setVisible(true);
					} else {
						volnaMista3++;
						sedadlo4.setBackground(Color.GREEN);
						sedadlaZabranost3[3] = 0;
						sedadlo4.setLabel("Sedadlo 4");
					}
				}
			};
		});

	}

}