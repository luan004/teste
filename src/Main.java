import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Main {

	public static void main(String[] args) {
		
		int numeroMagico = 30;
		
		int i = 0;
		int x = 0;
		int y = 0;
		while (i < numeroMagico) {
			abrirVarias(x,y);
			i++;
			x=x+40;
			
			if (y < 200) {
				y=y+40;
			}
			else {
				y=0;
			}
			
		}

	}
	
	public static void abrirVarias(int x,int y) {
		// Cria a janela
		JFrame janela = new JFrame("Virusciani");
		
		// Cria a barra de menu
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.blue);
		
		// Criar menus
		JMenu menu = new JMenu("Teste");
		JMenu menu2 = new JMenu("Teste 2");
		
		// Criar itens
		JMenuItem item = new JMenuItem("Item 1");
		JMenuItem item2 = new JMenuItem("Item 2");
		
		// Adicionar itens aos menus
		menu.add(item);
		menu2.add(item2);
		
		// Adicionar os menus a barra de menus
		menuBar.add(menu);
		menuBar.add(menu2);
		
		// Adiciona a barra de menu a janela
		janela.add(menuBar, BorderLayout.NORTH);
		
		// Cria a imagem
	    ImageIcon icon = new ImageIcon("src\\img.jpg");
	    janela.add(new JLabel(icon));
		
	      
		janela.setSize(800,800);
		janela.setLocation(x, y);
		janela.setResizable(false);
		janela.getContentPane().setBackground(Color.red);
		janela.setUndecorated(true);
		janela.setVisible(true);
	}

}
