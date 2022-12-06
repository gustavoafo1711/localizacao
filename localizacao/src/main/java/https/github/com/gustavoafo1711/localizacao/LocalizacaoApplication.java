package https.github.com.gustavoafo1711.localizacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import https.github.com.gustavoafo1711.localizacao.domain.entity.Cidade;
import https.github.com.gustavoafo1711.localizacao.domain.repository.CidadeRepository;
import jakarta.transaction.Transactional;

@SpringBootApplication
public class LocalizacaoApplication implements CommandLineRunner{

	@Autowired
	private CidadeRepository cidadeRepository;
	
	@Override
	public void run(String... args) throws Exception {
		listarCidades();
		listarCidadesPorNome();
		listarCidadesPorHabitantes();
	}

	void listarCidadesPorNome() {
		System.out.println("\nLista cidade por nome:");
		cidadeRepository.findByNome("Mogi das Cruzes").forEach(System.out::println);
		
		System.out.println("\nLista cidade por inicial do nome:");
		cidadeRepository.findByNomeStartingWith("B").forEach(System.out::println);
		
		System.out.println("\nLista cidade por final do nome:");
		cidadeRepository.findByNomeEndingWith("s").forEach(System.out::println);
		
		System.out.println("\nLista cidade por qualquer parte do nome:");
		cidadeRepository.findByNomeContaining("na").forEach(System.out::println);
		
		System.out.println("\nLista cidade pelo LIKE:");
		cidadeRepository.findByNomeLike("%mogi%").forEach(System.out::println);
		
	}
	
	void listarCidadesPorHabitantes() {
		System.out.println("\nLista cidade por habitantes:");
		System.out.println(cidadeRepository.findByHabitantes(354000L));
	}
	
	void listarCidades() {
		System.out.println("\nLista todas as cidades:");
		cidadeRepository.findAll().forEach(System.out::println);
	}

	public static void main(String[] args) {
		SpringApplication.run(LocalizacaoApplication.class, args);
	}

}
