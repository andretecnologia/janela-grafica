package programa;


public class Programa {

	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater( new Runnable() {	
			public void run() {
				
				FrmPrincipal fmain = new FrmPrincipal();
				fmain.setLocationRelativeTo( null );
				fmain.setVisible( true );
				
			}	
		});
	}
}
