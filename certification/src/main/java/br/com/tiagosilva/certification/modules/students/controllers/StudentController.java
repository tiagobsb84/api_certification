package br.com.tiagosilva.certification.modules.students.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tiagosilva.certification.modules.students.dto.VerifyHasCertificationDTO;
import br.com.tiagosilva.certification.modules.students.useCases.VerifyIsHasCertificationUseCase;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	private VerifyIsHasCertificationUseCase verifyIsHasCertificationUseCase;

	@GetMapping("/")
	public String verifyIfHasCertification(@RequestBody VerifyHasCertificationDTO verifyHasCertifiationDTO) {
		
		var result = verifyIsHasCertificationUseCase.execute(verifyHasCertifiationDTO);
		
		if(result) {
			return "Usuário já fez a prova";
		}
		System.out.println(verifyHasCertifiationDTO);
		return "Usuário pode fazer a prova";
	}
}
