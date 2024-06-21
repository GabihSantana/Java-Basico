package view;

import model.Urna;
import java.time.LocalDate;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;

import java.time.LocalDate;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.DateTime;

public class UrnaView {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			UrnaView window = new UrnaView();
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
		shell.setSize(528, 438);
		shell.setText("SWT Application");
		
		Urna urna = new Urna(1);

		DateTime dateTimeAbertura = new DateTime(shell, SWT.BORDER);
		dateTimeAbertura.setBounds(260, 63, 229, 34);
		
		DateTime dateTimeFechamento = new DateTime(shell, SWT.BORDER);
		dateTimeFechamento.setBounds(260, 146, 229, 34);
		
		
		Button btnAbertura = new Button(shell, SWT.NONE);
		btnAbertura.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				urna.abrirUrna(LocalDate.now());
				
				//date time pega um mes a frente
				dateTimeAbertura.setDay(urna.getDataAbertura().getDayOfMonth());
				dateTimeAbertura.setMonth(urna.getDataAbertura().getMonthValue());
				dateTimeAbertura.setYear(urna.getDataAbertura().getYear());
			}
		});
		btnAbertura.setBounds(31, 63, 97, 34);
		btnAbertura.setText("Abrir Urna");
		
		
		Button btnFechamento = new Button(shell, SWT.NONE);
		btnFechamento.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				urna.fecharUrna(LocalDate.now());
				
				//date time pega um mes a frente
				dateTimeFechamento.setDay(urna.getDataFechamento().getDayOfMonth());
				dateTimeFechamento.setMonth(urna.getDataFechamento().getMonthValue());
				dateTimeFechamento.setYear(urna.getDataFechamento().getYear());
				
			}
		});
		btnFechamento.setBounds(31, 146, 97, 34);
		btnFechamento.setText("Fechar Urna");
		
		
		

	}
}
