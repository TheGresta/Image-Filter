import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class f1 extends JFrame {

	private JPanel contentPane;
	private JTextField text_alpha;
	private JTextField text_red;
	private JTextField text_green;
	private JTextField text_blue;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		// change system looks
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {

		}

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					f1 frame = new f1();
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
	public f1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 975, 533);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JLabel label_img = new JLabel("");
		label_img.setHorizontalAlignment(SwingConstants.CENTER);
		label_img.setBackground(Color.WHITE);
		label_img.setBounds(195, 11, 754, 501);
		contentPane.add(label_img);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(10, 11, 175, 478);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		final JLabel label = new JLabel("No image chosen");
		label.setFont(new Font("Tahoma", Font.BOLD, 10));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(10, 11, 155, 21);
		panel_1.add(label);
		
		JButton btn_select = new JButton("Pick an image");
		btn_select.setFont(new Font("Tahoma", Font.BOLD, 10));
		btn_select.setBounds(10, 43, 155, 34);
		panel_1.add(btn_select);
		
		JButton btn_clear = new JButton("Clear");
		btn_clear.setFont(new Font("Tahoma", Font.BOLD, 10));
		btn_clear.setBounds(10, 437, 155, 34);
		panel_1.add(btn_clear);
		
		JButton btn_convert = new JButton("Convert");
		btn_convert.setFont(new Font("Tahoma", Font.BOLD, 10));
		btn_convert.setBounds(10, 347, 155, 34);
		panel_1.add(btn_convert);
		
		JLabel label_alpha = new JLabel("Alpha");
		label_alpha.setHorizontalAlignment(SwingConstants.CENTER);
		label_alpha.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_alpha.setBounds(10, 89, 155, 21);
		panel_1.add(label_alpha);
		
		text_alpha = new JTextField();
		text_alpha.setBounds(93, 121, 72, 20);
		panel_1.add(text_alpha);
		text_alpha.setColumns(10);
		
		JLabel label_red = new JLabel("Red");
		label_red.setHorizontalAlignment(SwingConstants.CENTER);
		label_red.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_red.setBounds(10, 152, 155, 21);
		panel_1.add(label_red);
		
		text_red = new JTextField();
		text_red.setColumns(10);
		text_red.setBounds(93, 184, 72, 20);
		panel_1.add(text_red);
		
		JLabel label_green = new JLabel("Greed");
		label_green.setHorizontalAlignment(SwingConstants.CENTER);
		label_green.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_green.setBounds(10, 215, 155, 21);
		panel_1.add(label_green);
		
		text_green = new JTextField();
		text_green.setColumns(10);
		text_green.setBounds(93, 247, 72, 20);
		panel_1.add(text_green);
		
		JLabel label_blue = new JLabel("Blue");
		label_blue.setHorizontalAlignment(SwingConstants.CENTER);
		label_blue.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_blue.setBounds(10, 278, 155, 21);
		panel_1.add(label_blue);
		
		text_blue = new JTextField();
		text_blue.setColumns(10);
		text_blue.setBounds(93, 310, 72, 20);
		panel_1.add(text_blue);
		
		final JComboBox combo_alpha = new JComboBox();
		combo_alpha.setModel(new DefaultComboBoxModel(new String[] {"*", "/", "+", "-"}));
		combo_alpha.setFont(new Font("Tahoma", Font.BOLD, 14));
		combo_alpha.setToolTipText("Select operation");
		combo_alpha.setBounds(10, 121, 73, 22);
		panel_1.add(combo_alpha);
		
		final JComboBox combo_red = new JComboBox();
		combo_red.setModel(new DefaultComboBoxModel(new String[] {"*", "/", "+", "-", "avrg"}));
		combo_red.setToolTipText("Select operation");
		combo_red.setFont(new Font("Tahoma", Font.BOLD, 14));
		combo_red.setBounds(10, 183, 73, 22);
		panel_1.add(combo_red);
		
		final JComboBox combo_green = new JComboBox();
		combo_green.setModel(new DefaultComboBoxModel(new String[] {"*", "/", "+", "-", "avrg"}));
		combo_green.setToolTipText("Select operation");
		combo_green.setFont(new Font("Tahoma", Font.BOLD, 14));
		combo_green.setBounds(10, 247, 73, 22);
		panel_1.add(combo_green);
		
		final JComboBox combo_blue = new JComboBox();
		combo_blue.setModel(new DefaultComboBoxModel(new String[] {"*", "/", "+", "-", "avrg"}));
		combo_blue.setToolTipText("Select operation");
		combo_blue.setFont(new Font("Tahoma", Font.BOLD, 14));
		combo_blue.setBounds(10, 310, 73, 22);
		panel_1.add(combo_blue);
		
		JButton btn_save = new JButton("Save");		
		btn_save.setFont(new Font("Tahoma", Font.BOLD, 10));
		btn_save.setBounds(10, 392, 155, 34);
		panel_1.add(btn_save);
		
		final JLabel label_path = new JLabel("New label");
		label_path.setBounds(254, 465, 46, 14);
		contentPane.add(label_path);
		label_path.setEnabled(false);
		label_path.setVisible(false);
		
		//Events
		
		//Files Select Button Event
		btn_select.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFileChooser fileChooser = new JFileChooser(); //create file chooser
				fileChooser.setCurrentDirectory(new File(".")); //set current directory as project file
				fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY); //*
				fileChooser.setDialogTitle("Select image file");
				fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("PNG","png"));// filter with only png
				fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("JPEG","jpg"));// filter with only png
				fileChooser.setAcceptAllFileFilterUsed(true);
				int response = fileChooser.showOpenDialog(null); //select file to open				
				
				//if file is selected
				if(response == JFileChooser.APPROVE_OPTION) {					
					
					String imageFileName = fileChooser.getSelectedFile().getName(); //label the text with chosen file name			
					label.setText(imageFileName);					
					
					File imageFile = new File(fileChooser.getSelectedFile().getAbsolutePath()); //get the path of file
					label_path.setText(imageFile.getPath());
					ImageIcon img = new ImageIcon(imageFile.getPath()); 
					
					
					label_img.setSize(img.getIconWidth(), img.getIconHeight());//display image on screen
					label_img.setIcon(img); 					
				}
			}
		});
		
		//convert button event
		btn_convert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//values of text fields
				double alphaValue = Double.valueOf(text_alpha.getText().toString());
				double redValue = Double.valueOf(text_red.getText().toString());
				double greenValue = Double.valueOf(text_green.getText().toString());
				double blueValue = Double.valueOf(text_blue.getText().toString());
				
				//selected combobox items
				int alphaSelected = combo_alpha.getSelectedIndex();
				int redSelected = combo_red.getSelectedIndex();
				int greenSelected = combo_green.getSelectedIndex();
				int blueSelected = combo_blue.getSelectedIndex();
				
				//create file and bufferedimage
				BufferedImage img = null;
				File f = null;
				
				//read image
				try {
					f = new File(label_path.getText().toString());
					img = ImageIO.read(f);
					
				}catch(Exception e1) {
					System.out.println(e1);
				}
				
				//get image height and width
				int width = img.getWidth();
				int height = img.getHeight();
				
				//convert to gray scale
				for(int y=0; y<height; y++) {
					for(int x=0; x<width; x++) {
						
						//get values of RGB for each pixel
						int p = img.getRGB(x, y);
						
						int a = (p>>24)&0xff;
						int r = (p>>16)&0xff;
						int g = (p>>8)&0xff;
						int b = p&0xff;
						int avrg = (r+g+b)/3;
						
						// * / + - witch one we choose ? (0 means *) (1 means /) ....
						switch(alphaSelected) {
						case 0:
							a *= alphaValue;
							break;
						case 1:
							a /= alphaValue;
							break;
						case 2:
							a += alphaValue;
							break;
						case 3:
							a -= alphaValue;
							break;
						}
						
						switch(redSelected) {
						case 0:
							r *= redValue;
							break;
						case 1:
							r /= redValue;
							break;
						case 2:
							r += redValue;
							break;
						case 3:
							r -= redValue;
							break;	
						case 4:
							r = avrg;
						}
						
						switch(greenSelected) {
						case 0:
							g *= greenValue;
							break;
						case 1:
							g /= greenValue;
							break;
						case 2:
							g += greenValue;
							break;
						case 3:
							g -= greenValue;
							break;	
						case 4:
							g = avrg;
						}
						
						switch(blueSelected) {
						case 0:
							b *= blueValue;
							break;
						case 1:
							b /= blueValue;
							break;
						case 2:
							b += blueValue;
							break;
						case 3:
							b -= blueValue;
							break;	
						case 4:
							b = avrg;
						}
						
						//RGB values should be between 0-255
						if(a < 0) a = 0;
						if(a > 255) a = 255;
						if(r < 0) r = 0;
						if(r > 255) r = 255;
						if(g < 0) g = 0;
						if(g > 255) g = 255;
						if(b < 0) b = 0;
						if(b > 255) b = 255;
						
						//replace RGB value with new RGB value
						p = (a<<24) | (r<<16) | (g<<8) | b;	
						img.setRGB(x, y, p);
					}	
				}
				
				//write image
				ImageIcon imgNEW = new ImageIcon(img);
				label_img.setSize(imgNEW.getIconWidth(), imgNEW.getIconHeight());//display image on screen
				label_img.setIcon(imgNEW);	
				
				//create image to save
				Image image = imgNEW.getImage();
				BufferedImage buffered = (BufferedImage) image;
				
				//Save image
				File currentDirFile = new File("./test.png");
				
				try {
					ImageIO.write(buffered,"png", currentDirFile);
				} catch (IOException e1) {
					System.out.println("Can not create img");
				}
			}
		});
		
		btn_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//set text fiels as empty
				text_alpha.setText("");
				text_red.setText("");
				text_green.setText("");
				text_blue.setText("");
				
				//set comboBoxes as empty
				combo_alpha.setSelectedIndex(0);
				combo_red.setSelectedIndex(0);
				combo_green.setSelectedIndex(0);
				combo_blue.setSelectedIndex(0);
				
				ImageIcon img = new ImageIcon(label_path.getText().toString());//get the original image
				label_img.setSize(img.getIconWidth(), img.getIconHeight());//display image on screen
				label_img.setIcon(img);
			}
		});	
		
		//save buton event
		btn_save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFileChooser fileChooser = new JFileChooser(); //create file chooser
				fileChooser.setCurrentDirectory(new File(".")); //set current directory as project file
				fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY); //*
				fileChooser.setAcceptAllFileFilterUsed(true);
				fileChooser.setDialogTitle("Save the image");
				fileChooser.setFileFilter(new FolderFilter()); //filter for only folders
			    fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				int response = fileChooser.showSaveDialog(null); //select file to open		
				
				
				//save the image
				if(response == JFileChooser.APPROVE_OPTION) {
					try {
						BufferedImage img = ImageIO.read(new File(("./test.png"))); //read the current image
						String path = fileChooser.getSelectedFile().getPath();//get selected file path
						File imgCopy = new File(path + "\\\\test.png"); //create empty image
						imgCopy.createNewFile();
						ImageIO.write(img,"png", imgCopy); //write the image
						
						System.out.println("Image Saved...");
					}catch(Exception e1) {
						System.out.println("Failed to load...");
					}
				}
			}
		});
	}

	class FolderFilter extends javax.swing.filechooser.FileFilter {
		@Override
		public boolean accept(File file) {
			return file.isDirectory();
		}

		@Override
		public String getDescription() {
			return "We only take directories";
		}
	}
}
