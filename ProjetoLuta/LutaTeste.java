package projetoLuta;

 //import aula07agregacao.Luta;

   //import aulaAgregacao.Lutador;

public class LutaTeste {
	public static void main(String[]args){
		Lutador l[] = new Lutador[10];
		 l[0] = new Lutador("Pit bull", "França", 31, 1.75f, 68.9f, 14, 11, 5, 2, 1);
		     
		 l[1] = new Lutador("Leonardo Muralha", "Brasil", 29, 1.68f, 57.8f, 20, 14, 0, 3, 3);
			
		  l[2] = new Lutador("California Kid", "EUA", 35, 1.65f, 80.9f, 25, 15, 3, 6, 4);
			
		  l[3] = new Lutador("Cold Man", "Austrália", 28, 1.93f, 84.6f, 18, 16, 0, 0, 2);
			
		  l[4] = new Lutador("Carlos Mutante", "Brasil", 37, 1.70f, 119.3f, 17, 14, 5, 2, 1);
			
		  l[5] = new Lutador("João Bomba", "Brasil", 25, 1.75f, 60.0f, 16, 10, 3, 5, 1);
			 
		  l[6] = new Lutador("Mighty Mouse", "EUA", 30, 1.81f, 103.7f, 20, 12, 10, 5, 3);
			 
	      l[7] = new Lutador("Rampage", "Austrália", 40, 1.85f, 110.1f, 35, 25, 8, 5, 5);
			 
		  l[8] = new Lutador("Jardine", "Dinamarca", 30, 1.65f, 90.5f, 20, 10, 0, 6, 4);
			 
		  l[9] = new Lutador("Strong Boy", "EUA", 20, 1.75f, 69.3f, 25, 12, 0, 8, 5);
			 
			 
		  Luta ueco1 = new Luta();
		  
		  ueco1.marcarLuta(l[0], l[5]); 
		  ueco1.lutar();
		  l[0].status();
		  l[5].status();
			    
			   
	      //Raking de lutadores
		    int maior = 0;
		    String mensagem = "";
			System.out.println("**Raking dos principais Lutadores**");
			for(int i = 0; i <= 9; i++){
			  if(maior < l[i].getVitorias()){
				 maior = l[i].getVitorias();
				 mensagem = mensagem + "Posição: " + i + " - " + l[i].getNome() + " - " + maior + " vitórias, ";
				   }
				}
			System.out.println( mensagem);

    }
}