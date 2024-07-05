package eleicao;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.DateTime;

public class ProfessorView {

	protected Shell shell;
	private Text textNomeProf;
	private Text textTitulacao;
	private Text textAreaAtuacao;
	private Text textStatus;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			ProfessorView window = new ProfessorView();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 543);
		shell.setText("SWT Application");
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNewButton.setBounds(121, 390, 156, 34);
		btnNewButton.setText("Inserir Professor");
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setBounds(24, 30, 127, 17);
		lblNewLabel.setText("Numero Func");
		
		Label lblNewLabel_2 = new Label(shell, SWT.NONE);
		lblNewLabel_2.setBounds(24, 166, 70, 17);
		lblNewLabel_2.setText("Titulação:");
		
		Label lblNewLabel_3 = new Label(shell, SWT.NONE);
		lblNewLabel_3.setBounds(24, 278, 113, 17);
		lblNewLabel_3.setText("Status Docencia:");
		
		Label lblNewLabel_1 = new Label(shell, SWT.NONE);
		lblNewLabel_1.setText("Data Cadastro:");
		lblNewLabel_1.setBounds(24, 100, 101, 17);
		
		DateTime dateTime = new DateTime(shell, SWT.BORDER);
		dateTime.setBounds(166, 93, 229, 34);
		
		textNomeProf = new Text(shell, SWT.BORDER);
		textNomeProf.setBounds(177, 27, 201, 30);
		
		textTitulacao = new Text(shell, SWT.BORDER);
		textTitulacao.setBounds(177, 166, 201, 30);
		
		textAreaAtuacao = new Text(shell, SWT.BORDER);
		textAreaAtuacao.setBounds(177, 223, 201, 30);
		
		Label lblNewLabel_4 = new Label(shell, SWT.NONE);
		lblNewLabel_4.setBounds(24, 225, 113, 17);
		lblNewLabel_4.setText("Area Atuação");
		
		textStatus = new Text(shell, SWT.BORDER);
		textStatus.setBounds(178, 276, 180, 30);

	}
}
