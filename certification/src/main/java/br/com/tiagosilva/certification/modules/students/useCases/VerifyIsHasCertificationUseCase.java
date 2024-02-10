package br.com.tiagosilva.certification.modules.students.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tiagosilva.certification.modules.students.dto.VerifyHasCertificationDTO;
import br.com.tiagosilva.certification.modules.students.repositories.CertificationStudentRepository;

@Service
public class VerifyIsHasCertificationUseCase {

	@Autowired
	private CertificationStudentRepository certifificationStudentRepository;
	
	public boolean execute(VerifyHasCertificationDTO dto) {
		var result = this.certifificationStudentRepository.findByStudentEmailAndTechnology(dto.getEmail(), dto.getTechnology());
		if(!result.isEmpty() ) {
			return true;
		}
		return false;
	}
}
