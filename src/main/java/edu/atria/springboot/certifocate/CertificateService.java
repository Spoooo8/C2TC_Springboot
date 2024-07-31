package edu.atria.springboot.certifocate;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CertificateService {
	
	@Autowired
	private CertificateRepository certificateRepo;
	
	public Certificate saveDetails(Certificate certificate) {
		return certificateRepo.save(certificate);
	}
	
	public List<Certificate> getAllDetails(){
		return certificateRepo.findAll();
	}
	public Optional<Certificate> getDetailById(int id) {
        return certificateRepo.findById(id);
    }
	public void deleteById(int id) {
        certificateRepo.deleteById(id);
    }
}
