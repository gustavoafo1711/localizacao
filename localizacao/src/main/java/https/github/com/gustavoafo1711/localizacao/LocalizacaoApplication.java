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
		salvarCidade();
		listarCidades();
	}
	
	@Transactional
	void salvarCidade () {
		var cidade = new Cidade(1L, "São Paulo", 12000000L);
		cidadeRepository.save(cidade);
	}
	
	void listarCidades() {
		cidadeRepository.findAll().forEach(System.out::println);
	}

	public static void main(String[] args) {
		SpringApplication.run(LocalizacaoApplication.class, args);
	}

}
