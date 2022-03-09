package br.com.generation.heranca;

public class TestaTodoMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cachorro ch = new Cachorro();
		Cavalo cv = new Cavalo();
		Preguica pg = new Preguica();
		
		ch.setNome("Bob");
		ch.setCorre("Sim");
		ch.setSom("Late");
		ch.setIdade(7);
		
		System.out.println("Nome: " + ch.getNome());
		System.out.println("Corre: " + ch.getCorre());
		System.out.println("Som: " + ch.getSom());
		System.out.println("Idade: " + ch.getIdade());
		
		System.out.println();
		
		cv.setNome("Thor");
		cv.setCorre("Sim");
		cv.setSom("relinchar");
		cv.setIdade(9);
		
		System.out.println("Nome: " + cv.getNome());
		System.out.println("Corre: " + cv.getCorre());
		System.out.println("Som: " + cv.getSom());
		System.out.println("Idade: " + cv.getIdade());
		
		System.out.println();
		
		pg.setNome("Zeca");
		pg.setCorre("Nao");
		pg.setSom("Sim");
		pg.setIdade(15);
		
		System.out.println("Nome: " + pg.getNome());
		System.out.println("Corre: " + pg.getCorre());
		System.out.println("Som: " + pg.getSom());
		System.out.println("Idade: " + pg.getIdade());
		

	}

}
