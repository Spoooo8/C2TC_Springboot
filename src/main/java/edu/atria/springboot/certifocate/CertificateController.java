package edu.atria.springboot.certifocate;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CertificateController {
	
	@Autowired
	private CertificateService certificateService;
	
	@PostMapping("/addCertificate")
	public Certificate postDetail(@RequestBody Certificate certificate) {
		return certificateService.saveDetails(certificate);
	}
	
	@GetMapping("/getCertificate")
	public List<Certificate> getDetails()
	{
		return certificateService.getAllDetails();
	}
	
	 @GetMapping("/getCertificate/{id}")
	    public Certificate getDetailById(@PathVariable int id) {
	        Optional<Certificate> certificate = certificateService.getDetailById(id);
	        return certificate.orElse(null); 
	    }
	 
	 @DeleteMapping("/deleteCertificate/{id}")
	    public ResponseEntity<Void> deleteCertificateById(@PathVariable int id) {
	        if (certificateService.getDetailById(id).isPresent()) {
	            certificateService.deleteById(id);
	            return ResponseEntity.noContent().build();
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	 }
 }

