package Estabelecimento;

import Equipamentos.copiadora.Copiadora;
import Equipamentos.digitalizadora.Digitalizadora;
import Equipamentos.impressora.Impressora;
import Equipamentos.multifuncional.EquipamentosMultifuncional;

public class Fabrica {
	public static void main(String[] args) {
		EquipamentosMultifuncional em = new EquipamentosMultifuncional();
		Impressora impressora = em;
		Digitalizadora digitalizadora = em;
		Copiadora copiadora = em;
		
		impressora.imprimir();
		digitalizadora.digitalizar();
		copiadora.copiar();
	}
}
