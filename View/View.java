package View;

import Model.Deck;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame{

	    private JButton tempCard;
	    private JButton tempCard1;
	    private JButton tempCard2;
	    private JLabel internalBrd;
	    public static JLayeredPaneExtension basic_panel;
	    private JLayeredPane internalPane;
	    private URL imageURL;
	    private ClassLoader cldr;
	    private JPanel square;
	    private JTextArea text;
	    boolean enabled = true;
	    public String player;
	    public static JButton rPawn1;
	    public static JButton rPawn2;
	    public static JButton yPawn1;
	    public static JButton yPawn2;
	    public Clicklistener click= new Clicklistener();
	    public static JButton b1;
	    public static JButton b2;
	    public static JButton b3;
	    public static JButton b4;
	    public static int count;
	    
	    String[] image_path = new String[]{
    			"resources\\images\\cards\\Card1.png",
    			"resources\\images\\cards\\Card2.png",
    			"resources\\images\\cards\\Card3.png",
    			"resources\\images\\cards\\Card4.png",
    			"resources\\images\\cards\\Card5.png",
    			"resources\\images\\cards\\Card6.png",
    			"resources\\images\\cards\\Card7.png",
    			"resources\\images\\cards\\Card8.png",
    			"resources\\images\\cards\\Card9.png",
    			"resources\\images\\cards\\Card10.png",
    			"resources\\images\\cards\\Card11.png",
    			"resources\\images\\cards\\Card12.png",
    			"resources\\images\\cards\\sorryCard.png"
    	    };

	    public View() {
	        cldr = this.getClass().getClassLoader();
	        this.setResizable(false);
	        this.setTitle("Sorry! Game");
	        this.setPreferredSize(new Dimension(910, 714));
	        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	    }

	    public void initComponents() {
	    	
	        tempCard = new JButton();
	        square = new JPanel();
	        
	        URL imageURL = cldr.getResource("resources\\images\\bg_green.png");
	        Image image = new ImageIcon(imageURL).getImage();
	        basic_panel = new JLayeredPaneExtension(image);
	        
	        JMenuBar mb = new JMenuBar();

	    	JButton b1 = new JButton("Start Game");
	    	JButton b2 = new JButton("Save Game");
	    	JButton b3 = new JButton("Continue Saved Game");
	    	JButton b4 = new JButton("Exit Game");

	    	mb.add(b1);
	    	mb.add(b2);
	    	mb.add(b3);
	    	mb.add(b4);

	    	b1.addActionListener(click);
	    	mb.setBounds(0, 0, 447, 25);
	    	basic_panel.add(mb, JLayeredPane.DEFAULT_LAYER); 
	        
	        // button 
	        tempCard1 = new JButton();
	        tempCard1.setBounds(700, 100, 75, 110); //thesi X, thesi Y, megethos X, megethos Y
	        imageURL = cldr.getResource("resources\\images\\cards\\backCard.png");
	        image = new ImageIcon(imageURL).getImage();
	        image = image.getScaledInstance(80, 110, java.awt.Image.SCALE_SMOOTH);
	        tempCard1.setIcon(new ImageIcon(image));
	        basic_panel.add(tempCard1);
	        tempCard1.setVisible(true);
	        
	        tempCard2 = new JButton();
	        tempCard2.setBounds(800, 100, 75, 110); //thesi X, thesi Y, megethos X, megethos Y
	        basic_panel.add(tempCard2);
	        tempCard2.addActionListener(click);
	        tempCard2.setVisible(true);
	        
	        
	        
	        tempCard = new JButton();
	        tempCard.setBounds(700, 300, 180, 50); //thesi X, thesi Y, megethos X, megethos Y
	        tempCard.setBackground(Color.red);
	        tempCard.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        tempCard.setText("Fold Button");
	        basic_panel.add(tempCard);
	        tempCard.setVisible(true);
	        
	        internalBrd = new JLabel();
	        internalBrd.setBounds(210, 120, 400, 400);
	        imageURL = cldr.getResource("resources\\images\\sorryImage.png");
	        image = new ImageIcon(imageURL).getImage();
	        image = image.getScaledInstance(200, 100, java.awt.Image.SCALE_SMOOTH);
	        internalBrd.setIcon(new ImageIcon(image));
	        basic_panel.add(internalBrd);
	        internalBrd.setVisible(true);   	         
	        
	        internalPane = new JLayeredPane();
	        internalPane.setBounds(10, 30, 640, 640);
	        internalPane.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        basic_panel.add(internalPane);
	        
	        rPawn1 = new JButton();
	        rPawn1.setBounds(155, 95, 25, 35);
	        imageURL = cldr.getResource("resources\\images\\pawns\\redPawn1.png");
	        image = new ImageIcon(imageURL).getImage();
	        image = image.getScaledInstance(25, 35, java.awt.Image.SCALE_SMOOTH);
	        rPawn1.setIcon(new ImageIcon(image));
	        basic_panel.add(rPawn1);
	        
	        rPawn2 = new JButton();
	        rPawn2.setBounds(190, 95, 25, 35);
	        imageURL = cldr.getResource("resources\\images\\pawns\\redPawn2.png");
	        image = new ImageIcon(imageURL).getImage();
	        image = image.getScaledInstance(25, 35, java.awt.Image.SCALE_SMOOTH);
	        rPawn2.setIcon(new ImageIcon(image));
	        basic_panel.add(rPawn2);
	        
	        yPawn1 = new JButton();
	        yPawn1.setBounds(440, 585, 25, 35);
	        imageURL = cldr.getResource("resources\\images\\pawns\\yellowPawn1.png");
	        image = new ImageIcon(imageURL).getImage();
	        image = image.getScaledInstance(25, 35, java.awt.Image.SCALE_SMOOTH);
	        yPawn1.setIcon(new ImageIcon(image));
	        basic_panel.add(yPawn1);
	        
	        yPawn2 = new JButton();
	        yPawn2.setBounds(475, 585, 25, 35);
	        imageURL = cldr.getResource("resources\\images\\pawns\\yellowPawn2.png");
	        image = new ImageIcon(imageURL).getImage();
	        image = image.getScaledInstance(25, 35, java.awt.Image.SCALE_SMOOTH);
	        yPawn2.setIcon(new ImageIcon(image));
	        basic_panel.add(yPawn2);
	        
	        square = new JPanel();
	        square.setBounds(10, 30, 40, 40);
	        square.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        square.setBackground(Color.white);
	        basic_panel.add(square);
	        
	        square = new JPanel();
	        square.setBounds(10, 70, 40, 40);
	        square.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        square.setBackground(Color.white);
	        basic_panel.add(square);
	        
	        internalBrd = new JLabel();
	        internalBrd.setBounds(10, 110, 40, 40);
	        internalBrd.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        imageURL = cldr.getResource("resources\\images\\slides\\greenSlideEnd.png");
	        image = new ImageIcon(imageURL).getImage();
	        image = image.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
	        internalBrd.setIcon(new ImageIcon(image));
	        basic_panel.add(internalBrd);
	        
	        internalBrd = new JLabel();
	        internalBrd.setBounds(10, 150, 40, 40);
	        internalBrd.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        imageURL = cldr.getResource("resources\\images\\slides\\greenSlideMedium.png");
	        image = new ImageIcon(imageURL).getImage();
	        image = image.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
	        internalBrd.setIcon(new ImageIcon(image));
	        basic_panel.add(internalBrd);
	        
	        internalBrd = new JLabel();
	        internalBrd.setBounds(10, 190, 40, 40);
	        internalBrd.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        imageURL = cldr.getResource("resources\\images\\slides\\greenSlideMedium.png");
	        image = new ImageIcon(imageURL).getImage();
	        image = image.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
	        internalBrd.setIcon(new ImageIcon(image));
	        basic_panel.add(internalBrd);
	        
	        internalBrd = new JLabel();
	        internalBrd.setBounds(10, 230, 40, 40);
	        internalBrd.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        imageURL = cldr.getResource("resources\\images\\slides\\greenSlideMedium.png");
	        image = new ImageIcon(imageURL).getImage();
	        image = image.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
	        internalBrd.setIcon(new ImageIcon(image));
	        basic_panel.add(internalBrd);
	        
	        internalBrd = new JLabel();
	        internalBrd.setBounds(10, 270, 40, 40);
	        internalBrd.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        imageURL = cldr.getResource("resources\\images\\slides\\greenSlideStart.png");
	        image = new ImageIcon(imageURL).getImage();
	        image = image.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
	        internalBrd.setIcon(new ImageIcon(image));
	        basic_panel.add(internalBrd);
	        
	        square = new JPanel();
	        square.setBounds(10, 310, 40, 40);
	        square.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        square.setBackground(Color.white);
	        basic_panel.add(square);
	        
	        square = new JPanel();
	        square.setBounds(10, 350, 40, 40);
	        square.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        square.setBackground(Color.white);
	        basic_panel.add(square);
	        
	        square = new JPanel();
	        square.setBounds(10, 390, 40, 40);
	        square.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        square.setBackground(Color.white);
	        basic_panel.add(square);
	        
	        square = new JPanel();
	        square.setBounds(10, 430, 40, 40);
	        square.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        square.setBackground(Color.white);
	        basic_panel.add(square);
	        
	        internalBrd = new JLabel();
	        internalBrd.setBounds(10, 470, 40, 40);
	        internalBrd.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        imageURL = cldr.getResource("resources\\images\\slides\\greenSlideEnd.png");
	        image = new ImageIcon(imageURL).getImage();
	        image = image.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
	        internalBrd.setIcon(new ImageIcon(image));
	        basic_panel.add(internalBrd);
	        
	        internalBrd = new JLabel();
	        internalBrd.setBounds(10, 510, 40, 40);
	        internalBrd.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        imageURL = cldr.getResource("resources\\images\\slides\\greenSlideMedium.png");
	        image = new ImageIcon(imageURL).getImage();
	        image = image.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
	        internalBrd.setIcon(new ImageIcon(image));
	        basic_panel.add(internalBrd);
	        
	        internalBrd = new JLabel();
	        internalBrd.setBounds(10, 550, 40, 40);
	        internalBrd.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        imageURL = cldr.getResource("resources\\images\\slides\\greenSlideMedium.png");
	        image = new ImageIcon(imageURL).getImage();
	        image = image.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
	        internalBrd.setIcon(new ImageIcon(image));
	        basic_panel.add(internalBrd);
	        
	        internalBrd = new JLabel();
	        internalBrd.setBounds(10, 590, 40, 40);
	        internalBrd.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        imageURL = cldr.getResource("resources\\images\\slides\\greenSlideStart.png");
	        image = new ImageIcon(imageURL).getImage();
	        image = image.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
	        internalBrd.setIcon(new ImageIcon(image));
	        basic_panel.add(internalBrd);
	        
	        square = new JPanel();
	        square.setBounds(10, 630, 40, 40);
	        square.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        square.setBackground(Color.white);
	        basic_panel.add(square);
	        
	        square = new JPanel();
	        square.setBounds(50, 630, 40, 40);
	        square.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        square.setBackground(Color.white);
	        basic_panel.add(square);
	        
	        internalBrd = new JLabel();
	        internalBrd.setBounds(90, 630, 40, 40);
	        internalBrd.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        imageURL = cldr.getResource("resources\\images\\slides\\yellowSlideEnd.png");
	        image = new ImageIcon(imageURL).getImage();
	        image = image.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
	        internalBrd.setIcon(new ImageIcon(image));
	        basic_panel.add(internalBrd);
	        
	        internalBrd = new JLabel();
	        internalBrd.setBounds(130, 630, 40, 40);
	        internalBrd.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        imageURL = cldr.getResource("resources\\images\\slides\\yellowSlideMedium.png");
	        image = new ImageIcon(imageURL).getImage();
	        image = image.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
	        internalBrd.setIcon(new ImageIcon(image));
	        basic_panel.add(internalBrd);
	        
	        internalBrd = new JLabel();
	        internalBrd.setBounds(170, 630, 40, 40);
	        internalBrd.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        imageURL = cldr.getResource("resources\\images\\slides\\yellowSlideMedium.png");
	        image = new ImageIcon(imageURL).getImage();
	        image = image.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
	        internalBrd.setIcon(new ImageIcon(image));
	        basic_panel.add(internalBrd);
	        
	        internalBrd = new JLabel();
	        internalBrd.setBounds(210, 630, 40, 40);
	        internalBrd.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        imageURL = cldr.getResource("resources\\images\\slides\\yellowSlideMedium.png");
	        image = new ImageIcon(imageURL).getImage();
	        image = image.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
	        internalBrd.setIcon(new ImageIcon(image));
	        basic_panel.add(internalBrd);
	        
	        internalBrd = new JLabel();
	        internalBrd.setBounds(250, 630, 40, 40);
	        internalBrd.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        imageURL = cldr.getResource("resources\\images\\slides\\yellowSlideStart.png");
	        image = new ImageIcon(imageURL).getImage();
	        image = image.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
	        internalBrd.setIcon(new ImageIcon(image));
	        basic_panel.add(internalBrd);
	        
	        square = new JPanel();
	        square.setBounds(290, 630, 40, 40);
	        square.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        square.setBackground(Color.white);
	        basic_panel.add(square);
	        
	        square = new JPanel();
	        square.setBounds(330, 630, 40, 40);
	        square.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        square.setBackground(Color.white);
	        basic_panel.add(square);
	        
	        square = new JPanel();
	        square.setBounds(370, 630, 40, 40);
	        square.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        square.setBackground(Color.white);
	        basic_panel.add(square);
	        
	        square = new JPanel();
	        square.setBounds(410, 630, 40, 40);
	        square.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        square.setBackground(Color.white);
	        basic_panel.add(square);
	        
	        internalBrd = new JLabel();
	        internalBrd.setBounds(450, 630, 40, 40);
	        internalBrd.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        imageURL = cldr.getResource("resources\\images\\slides\\yellowSlideEnd.png");
	        image = new ImageIcon(imageURL).getImage();
	        image = image.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
	        internalBrd.setIcon(new ImageIcon(image));
	        basic_panel.add(internalBrd);
	        
	        internalBrd = new JLabel();
	        internalBrd.setBounds(490, 630, 40, 40);
	        internalBrd.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        imageURL = cldr.getResource("resources\\images\\slides\\yellowSlideMedium.png");
	        image = new ImageIcon(imageURL).getImage();
	        image = image.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
	        internalBrd.setIcon(new ImageIcon(image));
	        basic_panel.add(internalBrd);
	        
	        internalBrd = new JLabel();
	        internalBrd.setBounds(530, 630, 40, 40);
	        internalBrd.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        imageURL = cldr.getResource("resources\\images\\slides\\yellowSlideMedium.png");
	        image = new ImageIcon(imageURL).getImage();
	        image = image.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
	        internalBrd.setIcon(new ImageIcon(image));
	        basic_panel.add(internalBrd);
	        
	        internalBrd = new JLabel();
	        internalBrd.setBounds(570, 630, 40, 40);
	        internalBrd.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        imageURL = cldr.getResource("resources\\images\\slides\\yellowSlideStart.png");
	        image = new ImageIcon(imageURL).getImage();
	        image = image.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
	        internalBrd.setIcon(new ImageIcon(image));
	        basic_panel.add(internalBrd);
	        
	        square = new JPanel();
	        square.setBounds(610, 630, 40, 40);
	        square.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        square.setBackground(Color.white);
	        basic_panel.add(square);
	        
	        internalBrd = new JLabel();
	        internalBrd.setBounds(50, 30, 40, 40);
	        internalBrd.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        imageURL = cldr.getResource("resources\\images\\slides\\redSlideStart.png");
	        image = new ImageIcon(imageURL).getImage();
	        image = image.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
	        internalBrd.setIcon(new ImageIcon(image));
	        basic_panel.add(internalBrd);
	        
	        internalBrd = new JLabel();
	        internalBrd.setBounds(90, 30, 40, 40);
	        internalBrd.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        imageURL = cldr.getResource("resources\\images\\slides\\redSlideMedium.png");
	        image = new ImageIcon(imageURL).getImage();
	        image = image.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
	        internalBrd.setIcon(new ImageIcon(image));
	        basic_panel.add(internalBrd);
	        
	        internalBrd = new JLabel();
	        internalBrd.setBounds(130, 30, 40, 40);
	        internalBrd.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        imageURL = cldr.getResource("resources\\images\\slides\\redSlideMedium.png");
	        image = new ImageIcon(imageURL).getImage();
	        image = image.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
	        internalBrd.setIcon(new ImageIcon(image));
	        basic_panel.add(internalBrd);
	        
	        internalBrd = new JLabel();
	        internalBrd.setBounds(170, 30, 40, 40);
	        internalBrd.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        imageURL = cldr.getResource("resources\\images\\slides\\redSlideEnd.png");
	        image = new ImageIcon(imageURL).getImage();
	        image = image.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
	        internalBrd.setIcon(new ImageIcon(image));
	        basic_panel.add(internalBrd);
	        
	        square = new JPanel();
	        square.setBounds(210, 30, 40, 40);
	        square.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        square.setBackground(Color.white);
	        basic_panel.add(square);
	        
	        square = new JPanel();
	        square.setBounds(250, 30, 40, 40);
	        square.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        square.setBackground(Color.white);
	        basic_panel.add(square);
	        
	        square = new JPanel();
	        square.setBounds(290, 30, 40, 40);
	        square.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        square.setBackground(Color.white);
	        basic_panel.add(square);
	        
	        square = new JPanel();
	        square.setBounds(330, 30, 40, 40);
	        square.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        square.setBackground(Color.white);
	        basic_panel.add(square);
	        
	        internalBrd = new JLabel();
	        internalBrd.setBounds(370, 30, 40, 40);
	        internalBrd.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        imageURL = cldr.getResource("resources\\images\\slides\\redSlideStart.png");
	        image = new ImageIcon(imageURL).getImage();
	        image = image.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
	        internalBrd.setIcon(new ImageIcon(image));
	        basic_panel.add(internalBrd);
	        
	        internalBrd = new JLabel();
	        internalBrd.setBounds(410, 30, 40, 40);
	        internalBrd.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        imageURL = cldr.getResource("resources\\images\\slides\\redSlideMedium.png");
	        image = new ImageIcon(imageURL).getImage();
	        image = image.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
	        internalBrd.setIcon(new ImageIcon(image));
	        basic_panel.add(internalBrd);
	        
	        internalBrd = new JLabel();
	        internalBrd.setBounds(450, 30, 40, 40);
	        internalBrd.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        imageURL = cldr.getResource("resources\\images\\slides\\redSlideMedium.png");
	        image = new ImageIcon(imageURL).getImage();
	        image = image.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
	        internalBrd.setIcon(new ImageIcon(image));
	        basic_panel.add(internalBrd);
	        
	        internalBrd = new JLabel();
	        internalBrd.setBounds(490, 30, 40, 40);
	        internalBrd.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        imageURL = cldr.getResource("resources\\images\\slides\\redSlideMedium.png");
	        image = new ImageIcon(imageURL).getImage();
	        image = image.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
	        internalBrd.setIcon(new ImageIcon(image));
	        basic_panel.add(internalBrd);
	        
	        internalBrd = new JLabel();
	        internalBrd.setBounds(530, 30, 40, 40);
	        internalBrd.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        imageURL = cldr.getResource("resources\\images\\slides\\redSlideEnd.png");
	        image = new ImageIcon(imageURL).getImage();
	        image = image.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
	        internalBrd.setIcon(new ImageIcon(image));
	        basic_panel.add(internalBrd);
	        
	        square = new JPanel();
	        square.setBounds(570, 30, 40, 40);
	        square.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        square.setBackground(Color.white);
	        basic_panel.add(square);
	        
	        square = new JPanel();
	        square.setBounds(610, 30, 40, 40);
	        square.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        square.setBackground(Color.white);
	        basic_panel.add(square);
	        
	        internalBrd = new JLabel();
	        internalBrd.setBounds(610, 70, 40, 40);
	        internalBrd.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        imageURL = cldr.getResource("resources\\images\\slides\\blueSlideStart.png");
	        image = new ImageIcon(imageURL).getImage();
	        image = image.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
	        internalBrd.setIcon(new ImageIcon(image));
	        basic_panel.add(internalBrd);
	        
	        internalBrd = new JLabel();
	        internalBrd.setBounds(610, 110, 40, 40);
	        internalBrd.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        imageURL = cldr.getResource("resources\\images\\slides\\blueSlideMedium.png");
	        image = new ImageIcon(imageURL).getImage();
	        image = image.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
	        internalBrd.setIcon(new ImageIcon(image));
	        basic_panel.add(internalBrd);
	        
	        internalBrd = new JLabel();
	        internalBrd.setBounds(610, 150, 40, 40);
	        internalBrd.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        imageURL = cldr.getResource("resources\\images\\slides\\blueSlideMedium.png");
	        image = new ImageIcon(imageURL).getImage();
	        image = image.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
	        internalBrd.setIcon(new ImageIcon(image));
	        basic_panel.add(internalBrd);
	        
	        internalBrd = new JLabel();
	        internalBrd.setBounds(610, 190, 40, 40);
	        internalBrd.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        imageURL = cldr.getResource("resources\\images\\slides\\blueSlideEnd.png");
	        image = new ImageIcon(imageURL).getImage();
	        image = image.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
	        internalBrd.setIcon(new ImageIcon(image));
	        basic_panel.add(internalBrd);
	        
	        square = new JPanel();
	        square.setBounds(610, 230, 40, 40);
	        square.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        square.setBackground(Color.white);
	        basic_panel.add(square);
	        
	        square = new JPanel();
	        square.setBounds(610, 270, 40, 40);
	        square.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        square.setBackground(Color.white);
	        basic_panel.add(square);
	        
	        square = new JPanel();
	        square.setBounds(610, 310, 40, 40);
	        square.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        square.setBackground(Color.white);
	        basic_panel.add(square);
	        
	        square = new JPanel();
	        square.setBounds(610, 350, 40, 40);
	        square.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        square.setBackground(Color.white);
	        basic_panel.add(square);
	        
	        internalBrd = new JLabel();
	        internalBrd.setBounds(610, 390, 40, 40);
	        internalBrd.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        imageURL = cldr.getResource("resources\\images\\slides\\blueSlideStart.png");
	        image = new ImageIcon(imageURL).getImage();
	        image = image.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
	        internalBrd.setIcon(new ImageIcon(image));
	        basic_panel.add(internalBrd);
	        
	        internalBrd = new JLabel();
	        internalBrd.setBounds(610, 430, 40, 40);
	        internalBrd.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        imageURL = cldr.getResource("resources\\images\\slides\\blueSlideMedium.png");
	        image = new ImageIcon(imageURL).getImage();
	        image = image.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
	        internalBrd.setIcon(new ImageIcon(image));
	        basic_panel.add(internalBrd);
	        
	        internalBrd = new JLabel();
	        internalBrd.setBounds(610, 470, 40, 40);
	        internalBrd.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        imageURL = cldr.getResource("resources\\images\\slides\\blueSlideMedium.png");
	        image = new ImageIcon(imageURL).getImage();
	        image = image.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
	        internalBrd.setIcon(new ImageIcon(image));
	        basic_panel.add(internalBrd);
	        
	        internalBrd = new JLabel();
	        internalBrd.setBounds(610, 510, 40, 40);
	        internalBrd.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        imageURL = cldr.getResource("resources\\images\\slides\\blueSlideMedium.png");
	        image = new ImageIcon(imageURL).getImage();
	        image = image.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
	        internalBrd.setIcon(new ImageIcon(image));
	        basic_panel.add(internalBrd);
	        
	        internalBrd = new JLabel();
	        internalBrd.setBounds(610, 550, 40, 40);
	        internalBrd.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        imageURL = cldr.getResource("resources\\images\\slides\\blueSlideEnd.png");
	        image = new ImageIcon(imageURL).getImage();
	        image = image.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
	        internalBrd.setIcon(new ImageIcon(image));
	        basic_panel.add(internalBrd);
	        
	        square = new JPanel();
	        square.setBounds(610, 590, 40, 40);
	        square.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        square.setBackground(Color.white);
	        basic_panel.add(square);
	        
	        square = new JPanel();
	        square.setBounds(90, 70, 40, 40);
	        square.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        square.setBackground(Color.red);
	        basic_panel.add(square);
	        
	        square = new JPanel();
	        square.setBounds(90, 110, 40, 40);
	        square.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        square.setBackground(Color.red);
	        basic_panel.add(square);
	        
	        square = new JPanel();
	        square.setBounds(90, 150, 40, 40);
	        square.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        square.setBackground(Color.red);
	        basic_panel.add(square);
	        
	        square = new JPanel();
	        square.setBounds(90, 190, 40, 40);
	        square.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        square.setBackground(Color.red);
	        basic_panel.add(square);
	        
	        square = new JPanel();
	        square.setBounds(90, 230, 40, 40);
	        square.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        square.setBackground(Color.red);
	        basic_panel.add(square);
	        
	        text = new JTextArea("Home");
	        text.setBounds(75, 270, 70, 70);
	        text.setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.RED));
	        text.setFont(new java.awt.Font("Rockwell Extra Bold", 10, 20));
	        text.setBackground(Color.white);
	        basic_panel.add(text);
	        text.setEditable(false);
	        
	        text = new JTextArea("Start");
	        text.setBounds(150, 72, 70, 70);
	        text.setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.RED));
	        text.setFont(new java.awt.Font("Rockwell Extra Bold", 4, 20));
	        text.setBackground(Color.white);
	        basic_panel.add(text);
	        text.setEditable(false);
	        
	        square = new JPanel();
	        square.setBounds(530, 590, 40, 40);
	        square.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        square.setBackground(Color.yellow);
	        basic_panel.add(square);
	        
	        square = new JPanel();
	        square.setBounds(530, 550, 40, 40);
	        square.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        square.setBackground(Color.yellow);
	        basic_panel.add(square);
	        
	        square = new JPanel();
	        square.setBounds(530, 510, 40, 40);
	        square.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        square.setBackground(Color.yellow);
	        basic_panel.add(square);
	        
	        square = new JPanel();
	        square.setBounds(530, 470, 40, 40);
	        square.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        square.setBackground(Color.yellow);
	        basic_panel.add(square);
	        
	        square = new JPanel();
	        square.setBounds(530, 430, 40, 40);
	        square.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        square.setBackground(Color.yellow);
	        basic_panel.add(square);
	        
	        text = new JTextArea("Home");
	        text.setBounds(515, 360, 70, 70);
	        text.setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.YELLOW));
	        text.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 20));
	        text.setBackground(Color.white);
	        basic_panel.add(text);
	        text.setEditable(false);
	        
	        text = new JTextArea("Start");
	        text.setBounds(435, 558, 70, 70);
	        text.setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.YELLOW));
	        text.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 20));
	        text.setBackground(Color.white);
	        basic_panel.add(text);
	        text.setEditable(false);
	        
	        text = new JTextArea("        Info Box" + "\n" + "\n" + " Turn: Player " + player);
	        text.setBounds(700, 400, 180, 140);
	        text.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        text.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 20));
	        text.setBackground(Color.white);
	        basic_panel.add(text);
	        text.setEditable(false);    
	        
	        square = new JPanel();
	        square.setBounds(50, 70, 560, 560);
	        square.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
	        square.setBackground(Color.cyan);
	        basic_panel.add(square);
	        
	        internalBrd = new JLabel("Receive Card");
	        internalBrd.setBounds(700, 210, 100, 40);
	        text.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 20));
	        basic_panel.add(internalBrd);
	        
	        internalBrd = new JLabel("Current Card");
	        internalBrd.setBounds(800, 210, 100, 40);
	        text.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 20));
	        basic_panel.add(internalBrd);	        
	         
	        GroupLayout layout = new GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	                layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(basic_panel, GroupLayout.PREFERRED_SIZE, 910, GroupLayout.PREFERRED_SIZE));
	        layout.setVerticalGroup(
	                layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(basic_panel, GroupLayout.PREFERRED_SIZE, 685, GroupLayout.PREFERRED_SIZE));
	        pack();
	        
	        basic_panel.repaint();
	    }
	    
	    public static String nameFrame() {
	    	
	    	 String playerName = JOptionPane.showInputDialog("Player Name: ");
	    	 
	    	 return playerName;
	    	
	    }
	    
	    public class Clicklistener implements ActionListener
	    {
	    	int i = 12;
	    	public void actionPerformed (ActionEvent e)
	    	{
	    		Random random = new Random();
	    	
	    		if ( e.getSource() == tempCard2) {
				
	    			i = random.nextInt(12 - 0 + 1);
	    			//imageURL = cldr.getResource(image_path[i]);
	    			imageURL = cldr.getResource("resources\\images\\cards\\Card12.png");
	    			Image image = new ImageIcon(imageURL).getImage();
	    			image = image.getScaledInstance(80, 110, java.awt.Image.SCALE_SMOOTH);
	    			tempCard2.setIcon(new ImageIcon(image));
	    			
	    			count = i + 1;
	    			
	    			if( i == 12) {
	    				
	    				count -= 1;
	    				
	    			}
			
	    		}
	    	}
	    }

	    public static void main(String[] args) {

	        javax.swing.SwingUtilities.invokeLater(new Runnable() {
	        	
	            public void run() {
	            	
	                View view = new View();
	                view.setVisible(true);
	                view.initComponents();
	                
	            }
	        });

	    }
}
