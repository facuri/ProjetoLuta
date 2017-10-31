package projetoLuta;

import java.util.Random;
import javax.swing.JOptionPane;
  

public class Luta {
	
	//Atributos
	private Lutador desafiado;//(Agrega��o) - Atributos e M�todos da classe Lutador.
	private Lutador  desafiante;//(Agrega��o) - Atributos e M�todos da classe Lutador.
	private Lutador posicao;
	private int rounds;
	private boolean aprovada;
	
	//M�todos especiais(Getters e Setters)
	public Lutador getDesafiado() {
		return desafiado;
	}
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	public Lutador getDesafiante() {
		return desafiante;
	}
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	public Lutador getPosicao() {
		return posicao;
	}
	public void setPosicao(Lutador posicao) {
		this.posicao = posicao;
	}
	public int getRounds() {
		return rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	public boolean getAprovada() {
		return aprovada;
	}
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	//M�todos
	public void marcarLuta(Lutador l1, Lutador l2){
		if(l1.getCategoria().equals(l2.getCategoria()) && (l1 != l2)){
		   this.aprovada = true;
		   this.desafiado = l1;
		   this.desafiante = l2;
		   System.out.println("***Luta marcada!***" +
			                      "\nDesafiado: "+ this.desafiado.getNome() +
			                      "\nDesafiante: " + this.desafiante.getNome());
			                      System.out.println("------------------------");
		}else{
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
			System.out.println("***Luta n�o marcada!*** \nFavor consultar Regras");
			System.out.println("------------------------");
			}
		 }
	public void lutar(){
		if(this.aprovada){
			System.out.println("***Desafiado***");
			this.desafiado.apresentarCampeao();
			System.out.println("***Desafiante***");
			this.desafiante.apresentarDesafiante();
			
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(4);//vai gerar o resultado aleatoriamente:0, 1, 2, 3
			System.out.println("====RESULTADO DA LUTA====");
			switch(vencedor){
			    case 0://Empate
				   System.out.println("Empatou!!");
				   this.desafiado.empatarLuta();
				   this.desafiante.empatarLuta();
				   break;
			    case 1://Desafiado vence
				   System.out.println("Vit�ria do: " + this.desafiado.getNome());
				   this.desafiado.ganharLuta();
				   this.desafiante.perderLuta();
				   break;
			    case 2://Desafiante vence
				   System.out.println("Vit�ria do: " + this.desafiante.getNome());
				   this.desafiante.ganharLuta();
				   this.desafiado.perderLuta();
				   break;
			    case 3://Aqui seria um b�nus apenas para os lutadores que tenham vit�rias por nocaute.
			    	   //O lutador que tiver mais vit�rias por nocaute vence.
			       if(this.desafiado.getVitoriaNocaute() > this.desafiante.getVitoriaNocaute()) {
				     System.out.println("B�nus!!! - Vit�ria do: " + this.desafiado.getNome());
				     this.desafiado.ganharLuta();
				     this.desafiante.perderLuta();
				    }
				   else if(this.desafiante.getVitoriaNocaute() > this.desafiado.getVitoriaNocaute()){  
				     System.out.println("B�nus!!! - Vit�ria do: " + this.desafiante.getNome()); 
				     this.desafiante.ganharLuta();
				     this.desafiado.perderLuta();
				     }
				  else
					System.out.println("S� para quem t�m vit�rias por nocaute!!, tente mais um round");
				    break;
			   }
	   System.out.println("====================================");
	 }else
		 System.out.println("A luta n�o pode acontecer!!");
		
	}
}

 
