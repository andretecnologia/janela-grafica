package programa;


public class Programa {

	public static void main(String[] args) {
		/**
		 * O comando java.awt.EventQueue.invokeLater 
		 * Coloca uma requisi��o (no caso, de abrir a janela) na Thread do Swing.
		 * Vai ser ent�o a thread do swing que processa essa requisi��o. 
		 * Como o Swing n�o � thread-safe, essa � a forma correta de proceder, 
		 * caso o seu comando de abrir a janela esteja vindo de outra thread 
		 * (como o main, por exemplo). Se voc� estiver dentro do c�digo de um listener de bot�o, 
		 * esse c�digo j� executa na thread do Swing. At� por isso a interface gr�fica fica travada 
		 * caso voc� fa�a ali um processamento muito pesado. Nesse caso, n�o seria necess�rio usar o comando, 
		 * j� que voc� j� est� na thread certa. A �nica diferen�a nesse caso � que usando o comando voc� deixar� 
		 * o processamento para depois da finaliza��o do m�todo.
		 */
		
		java.awt.EventQueue.invokeLater( new Runnable() {	
			public void run() {
				
				Modal fmain = new Modal();
				fmain.setLocationRelativeTo( null );
				fmain.setVisible( true );
				
			}	
		});
	}
}
