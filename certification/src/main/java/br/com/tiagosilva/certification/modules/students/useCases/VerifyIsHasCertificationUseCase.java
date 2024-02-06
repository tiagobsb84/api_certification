package br.com.tiagosilva.certification.modules.students.useCases;

import org.springframework.stereotype.Service;

import br.com.tiagosilva.certification.modules.students.dto.VerifyHasCertificationDTO;

@Service
public class VerifyIsHasCertificationUseCase {

	public boolean execute(VerifyHasCertificationDTO dto) {
		if(dto.getEmail().equals("tiago@gmail.com") && dto.getTechnology().equals("JAVA") ) {
			return true;
		}
		
		return false;
	}
}
