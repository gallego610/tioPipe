package co.arq.tiopipe.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import co.arq.tiopipe.model.local.gateways.LocalRepository;
import co.arq.tiopipe.usecase.consultarplatos.ConsultarPlatosUseCase;

@Configuration
public class UseCasesConfig {

	@Bean
	public ConsultarPlatosUseCase consultarPlatosUseCase(LocalRepository localRepository) {
		return new ConsultarPlatosUseCase(localRepository);
	}
	

}
