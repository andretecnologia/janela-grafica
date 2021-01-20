package programa;


public class Programa {

	public static void main(String[] args) {
		/**
		 * O comando java.awt.EventQueue.invokeLater 
		 * Coloca uma requisição (no caso, de abrir a janela) na Thread do Swing.
		 * Vai ser então a thread do swing que processa essa requisição. 
		 * Como o Swing não é thread-safe, essa é a forma correta de proceder, 
		 * caso o seu comando de abrir a janela esteja vindo de outra thread 
		 * (como o main, por exemplo). Se você estiver dentro do código de um listener de botão, 
		 * esse código já executa na thread do Swing. Até por isso a interface gráfica fica travada 
		 * caso você faça ali um processamento muito pesado. Nesse caso, não seria necessário usar o comando, 
		 * já que você já está na thread certa. A única diferença nesse caso é que usando o comando você deixará 
		 * o processamento para depois da finalização do método.
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
