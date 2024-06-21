package model;

public class MaterialComplementar {
	private String materiaMaterialComplementar;
	private String arquivoMaterialComplementar;
	private String tituloMaterialComplementar;
	private String miniaturaMaterialComplementar;
	private String descricaoMaterialComplementar;
	
	public MaterialComplementar(String materiaMaterialComplementar, String arquivoMaterialComplementar,
			String tituloMaterialComplementar, String miniaturaMaterialComplementar,
			String descricaoMaterialComplementar) {
		super();
		this.materiaMaterialComplementar = materiaMaterialComplementar;
		this.arquivoMaterialComplementar = arquivoMaterialComplementar;
		this.tituloMaterialComplementar = tituloMaterialComplementar;
		this.miniaturaMaterialComplementar = miniaturaMaterialComplementar;
		this.descricaoMaterialComplementar = descricaoMaterialComplementar;
	}
	
	public String getMateriaMaterialComplementar() {
		return materiaMaterialComplementar;
	}
	public void setMateriaMaterialComplementar(String materiaMaterialComplementar) {
		this.materiaMaterialComplementar = materiaMaterialComplementar;
	}
	public String getArquivoMaterialComplementar() {
		return arquivoMaterialComplementar;
	}
	public void setArquivoMaterialComplementar(String arquivoMaterialComplementar) {
		this.arquivoMaterialComplementar = arquivoMaterialComplementar;
	}
	public String getTituloMaterialComplementar() {
		return tituloMaterialComplementar;
	}
	public void setTituloMaterialComplementar(String tituloMaterialComplementar) {
		this.tituloMaterialComplementar = tituloMaterialComplementar;
	}
	public String getMiniaturaMaterialComplementar() {
		return miniaturaMaterialComplementar;
	}
	public void setMiniaturaMaterialComplementar(String miniaturaMaterialComplementar) {
		this.miniaturaMaterialComplementar = miniaturaMaterialComplementar;
	}
	public String getDescricaoMaterialComplementar() {
		return descricaoMaterialComplementar;
	}
	public void setDescricaoMaterialComplementar(String descricaoMaterialComplementar) {
		this.descricaoMaterialComplementar = descricaoMaterialComplementar;
	}
}
