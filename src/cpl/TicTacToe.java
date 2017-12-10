/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpl;

/**
 *
 * @author Dell Inspiron 15
 */
import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JDialog;
import javax.swing.JTextField;
import java.awt.Color;

public class TicTacToe extends JFrame implements ActionListener
{
    JButton btns[][] = new JButton[4][4];
    JTextField tf;
    String move = "X";
    int player = 0, Xscore = 0, Oscore = 0, numOfMoves = 0;
    boolean win = false;
    JPanel pnl;
    
    public TicTacToe()
    {
        super("TicTacToe");
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        setLayout(new BorderLayout());
        setSize(500, 600);
        setResizable(false);
        setLocationRelativeTo(null);
        build();
        setVisible(true);
    }
    
    public void end()
    {
        JOptionPane.showMessageDialog(this, move + " WINS!", "TIC-TAC-TOE Results", JOptionPane.INFORMATION_MESSAGE);
        
        int i, j;
        
        if (move.equals("X"))
        {
            Xscore ++;
        }
        else
        {
            Oscore ++;
        }
        
        reset();
    }
    
    public void tie()
    {
        JOptionPane.showMessageDialog(this, "NOBODY WON!", "TIC-TAC-TOE Results", JOptionPane.INFORMATION_MESSAGE);
        reset();
    }
    
    public void reset()
    {
        int i, j;
        
        for (i = 0; i < btns.length; i ++)
        {
            for (j = 0; j < btns[i].length; j ++)
            {
                btns[i][j].setText("");
            }
        }
        
        numOfMoves = 00000000000000000000000000000000000;
        tf.setText(move + "'s turn. X = " + Xscore + "   O = " + Oscore);
    }
    
    public void build()
    {
        JLabel lbl;
        Font f;
        
        int i, j;
        
        f = new Font("Serif", Font.PLAIN, 50);
        
        lbl = new JLabel("TIC-TAC-TOE");
        lbl.setFont(f);
        lbl.setHorizontalAlignment(JLabel.CENTER);
        
        add(lbl, BorderLayout.NORTH);
        
        pnl = new JPanel(new GridLayout(4, 4));
        
        for (i = 0; i < btns.length; i ++)
        {
            for (j = 0; j < btns[i].length; j ++)
            {
                btns[i][j] = new JButton("");
                btns[i][j].setFont(f);
                btns[i][j].setContentAreaFilled(false);
                btns[i][j].addActionListener(this);
                pnl.add(btns[i][j]);
            }
        }
        
        add(pnl);
        
        tf = new JTextField(15);
        tf.setText(move + "'s turn. X = " + Xscore + "   O = " + Oscore);
        tf.setFont(f);
        tf.setHorizontalAlignment(JTextField.CENTER);
        tf.setEditable(false);
        tf.setOpaque(false);
        
        add(tf, BorderLayout.SOUTH);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        int i, j;
        
        if (e.getActionCommand().equals(""))
        {
            JButton btn;
            btn = (JButton) e.getSource();
            btn.setText(move);
            
            //Checks horizontal similarities
            i = 0;
            j = 0;
            
            while (i < btns.length && j < btns[i].length)
            {
                j = 0;
                
                while (j < btns[i].length && btns[i][j].getText().equals(move))
                {
                    j ++;
                }
                
                i ++;
            }
            
            if (j == btns[i - 1].length)
            {
                end();
            }
            
            //Checks vertical similarities
            i = 0;
            j = 0;
            
            while (i < btns.length && j < btns[i].length)
            {
                i = 0;
                
                while (i < btns.length && btns[i][j].getText().equals(move))
                {
                    i ++;
                }
                
                j ++;
            }
            
            if (i == btns.length)
            {
                end();
            }
            
            //Checks diagonal similarities(frontslash)
            i = 0;
            j = 0;
            
            while (i < btns.length && j < btns[i].length && btns[i][j].getText().equals(move))
            {
                i ++;
                j ++;
            }
            
            if (i == btns.length)
            {
                end();
            }
            
            //Checks diagonal similarities(backslash)
            i = 0;
            j = 2;
            
            while (i < btns.length && j < btns[i].length && btns[i][j].getText().equals(move))
            {
                i ++;
                j --;
            }
            
            if (j == -1)
            {
                end();
            }
            
            //Switches Player
            switch(player)
            {
                case 0: player = 1;
                        move = "O";
                        pnl.setBackground(Color.CYAN);
                        tf.setText(move + "'s turn. X = " + Xscore + "   O = " + Oscore);
                        break;
                case 1: player = 0;
                        move = "X";
                        pnl.setBackground(Color.WHITE);
                        tf.setText(move + "'s turn. X = " + Xscore + "   O = " + Oscore);
                        break;
            }
            numOfMoves ++;
            
            if (numOfMoves == 9)
            {
                tie();
            }
        }
    }
    
    public static void main(String[] args) 
    {
        TicTacToe app = new TicTacToe();
        /*String pnl[][] = new String[3][3];
        String move = "[X]";
        int i, j, player = 0, temp;
        boolean win = true;
        Scanner sc = new Scanner(System.in);
        
        //Initializes board
        for (i = 0; i < pnl.length; i ++)
        {
            for (j = 0; j < pnl[i].length; j ++)
            {
                pnl[i][j] = "[ ]";
            }
        }
        
        while (win)
        {
            System.out.print("Enter row: ");
            i = sc.nextInt() - 1;

            System.out.print("Enter column: ");
            j = sc.nextInt() - 1;

            if (pnl[i][j].equals("[ ]"))
            {
                pnl[i][j] = move; 
                
                //Checks horizontal similarities
                temp = j;
                j = 0;
                
                while (j != pnl[i].length && pnl[i][j].equals(move))
                {
                    j ++;
                }

                if (j == pnl[i].length)
                {
                    System.out.println(move + " WINS!");
                    win = false;
                }
                
                //Checks vertical similarities
                i = 0;
                j = temp;
                
                while (i != pnl.length && pnl[i][j].equals(move))
                {
                    i ++;
                }

                if (i == pnl.length)
                {
                    System.out.println(move + " WINS!");
                    win = false;
                }
                
                //Checks diagonal similarities (frontslash)
                i = 0;
                j = 0;
                
                while (i != pnl.length && j != pnl[i].length && pnl[i][j].equals(move))
                {
                    i ++;
                    j ++;
                }
                
                if (i == pnl.length && j == pnl[i - 1].length)
                {
                    System.out.println(move + " WINS!");
                    win = false;
                }
                
                i = 0;
                j = 2;
                
                //Checks diagonal similarities (backslash)
                while (i != pnl.length && j != -1 && pnl[i][j].equals(move))
                {
                    i ++;
                    j --;
                }
                
                if (i == pnl.length && j == -1)
                {
                    System.out.println(move + " WINS!");
                    win = false;
                }
                
                //Switches players
                switch (player)
                {
                    case 0: player = 1;
                            move = "[O]";
                            break;
                    case 1: player = 0;
                            move = "[X]";
                            break;       
                }
            }
            
            //Prints the board
            for (i = 0; i < pnl.length; i ++)
            {
                for (j = 0; j < pnl[i].length; j ++)
                {
                    System.out.print(pnl[i][j]);
                }
                System.out.println("");
            }
            
            System.out.println("");
        }*/
    }
}
