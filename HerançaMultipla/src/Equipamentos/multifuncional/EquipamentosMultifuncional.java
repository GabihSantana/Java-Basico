package Equipamentos.multifuncional;

import Equipamentos.copiadora.Copiadora;
import Equipamentos.digitalizadora.Digitalizadora;
import Equipamentos.impressora.Impressora;

public class EquipamentosMultifuncional implements Copiadora, Digitalizadora, Impressora{
	public void copiar() {
		System.out.println("COPIANDO VIA EQUIPAMENTO MULTIFUNCINCIONAL");
	}
	public void digitalizar() {
		System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCINCIONAL");
	}
	public void imprimir() {
		System.out.println("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCINCIONAL");
	}
}
