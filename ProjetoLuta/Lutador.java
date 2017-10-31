package projetoLuta;

public class Lutador implements Combate {
	
	//Atributos
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int lutas;
	private int vitorias;
	private int vitoriaNocaute;
	private int derrotas;
	private int empates;
	
    //Métodos especiais(Getters e Setters)
	public String getNome() {
		return nome;
	}
	public void setNome(String no) {
		this.nome = no;
	}
	public int getLutas() {
		return lutas;
	}
	public void setLutas(int lu) {
		this.lutas = lu;
	}
	public int getVitoriaNocaute() {
		return vitoriaNocaute;
	}
	public void setVitoriaNocaute(int vitoriaNocaute) {
		this.vitoriaNocaute = vitoriaNocaute;
	}
	
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String na) {
		this.nacionalidade = na;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int id) {
		this.idade = id;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float al) {
		this.altura = al;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float pe) {
		this.peso = pe;
		this.setCategoria();
	}
	public String getCategoria() {
		return categoria;
	}
	private void setCategoria() {
		if(this.peso < 52.2)
		  this.categoria = "Inválido";
		else if(this.peso <= 70.3)
		   this.categoria = "Leve";
		else if(this.peso <= 83.9)
		   this.categoria = "Médio";
		else if(this.peso <= 120.2)
		   this.categoria = "Pesado";
		else
		   this.categoria = "Inválido";
	}
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vi) {
		this.vitorias = vi;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int de) {
		this.derrotas = de;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int em) {
		this.empates = em;
	}
	
	//Método Construtor
	public Lutador(String no, String na, int id, float al, float pe, int lu, int vi,  int vitoriaNocaute, int de, int em){
		this.nome = no;
		this.nacionalidade = na;
		this.idade = id;
		this.altura = al;
		this.setPeso(pe);
		this.lutas = lu;
		this.vitorias = vi;
		this.vitoriaNocaute = vitoriaNocaute;
		this.derrotas = de;
	    this.empates = em;
	}  
	//Métodos Abstratos
	@Override
	public void apresentarCampeao() {
		System.out.println("Chegou a hora apresentamos o Campeão: " + this.getNome());
		System.out.println("Diretamente da: " + this.getNacionalidade());
		System.out.println("Com: " + getIdade() + " anos e " + this.getAltura() + "m de altura");
		System.out.println("Pesando: " + this.getPeso() + "KG");
		System.out.println("-----Cartel----");
		System.out.println(this.getLutas() + " Lutas");
		System.out.println(this.getVitorias() + " vítorias");
		System.out.println(this.getVitoriaNocaute() + " vítorias por Nocaute");
		System.out.println(this.getDerrotas() + " derrotas");
		System.out.println(this.getEmpates() + " empates");
		System.out.println("-------------------------------------------------------"); 
		
	}
	@Override
	public void apresentarDesafiante() {
		System.out.println("Chegou a hora apresentamos o Desafiante: " + this.getNome());
		System.out.println("Diretamente da: " + this.getNacionalidade());
		System.out.println("Com: " + getIdade() + " anos e " + this.getAltura() + "m de altura");
		System.out.println("Pesando: " + this.getPeso() + "KG");
		System.out.println("-----Cartel----");
		System.out.println(this.getLutas() + " Lutas");
		System.out.println(this.getVitorias() + " vítorias");
		System.out.println(this.getVitoriaNocaute() + " vítorias por Nocaute");
		System.out.println(this.getDerrotas() + " derrotas");
		System.out.println(this.getEmpates() + " empates"); 
		
	}
	@Override
	public void status() {
		System.out.println(this.getNome() + " é um peso: " + this.getCategoria());
		System.out.println("Ganhou " + this.getVitorias() + " vezes");
		System.out.println("Perdeu " + this.getDerrotas() + " vezes");
		System.out.println("Empatou " + this.getEmpates() + " vezes");
		System.out.println("-------------------------------------------------------");
		
	}
	@Override
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1); 
		
	}
	@Override
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1); 
		
	}
	@Override
	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
		
	}
	

}
