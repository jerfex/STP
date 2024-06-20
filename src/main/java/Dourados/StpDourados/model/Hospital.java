package Dourados.StpDourados.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

/**
 * 
 */
public class Hospital {
	
	
	 @Id @GeneratedValue(strategy  =  GenerationType.IDENTITY)
	    private Long id;

	    @NotBlank
	    private String nome;

	    @NotBlank
	    private String endereco;

	    private String telefone;

	    private String pessoalResponsavel;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getEndereco() {
			return endereco;
		}

		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}

		public String getTelefone() {
			return telefone;
		}

		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}

		public String getPessoalResponsavel() {
			return pessoalResponsavel;
		}

		public void setPessoalResponsavel(String pessoalResponsavel) {
			this.pessoalResponsavel = pessoalResponsavel;
		}
	    
}
