package com.liftoff.certificates.service;

import com.liftoff.certificates.dao.CertificatesDetailsDaoImpl;
import com.liftoff.certificates.domain.CertificatesRequest;
import com.liftoff.certificates.entity.CertificatesDetails;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by vijay.hathimare on 2/8/18.
 *
 */
@Slf4j
public class CertificateService {
    CertificatesDetailsDaoImpl certificatesDetailsDao = null;
    public CertificateService(){
        certificatesDetailsDao = new CertificatesDetailsDaoImpl();
    }

    public Map<String, String> createCertificate(CertificatesRequest certificatesRequest){
        Map<String, String> response =  new HashMap<>();
        Object ob = null;
        CertificatesDetails certificatesDetails = new CertificatesDetails();
        certificatesDetails.setCourseId(certificatesRequest.getCourseId());
        certificatesDetails.setUserId(certificatesRequest.getUserId());
        certificatesDetails.setMarks(certificatesRequest.getMarks());
        ob = certificatesDetailsDao.persist(certificatesDetails);
        if(ob != null){
            response.put("status", "success");
        }else {
            response.put("status", "failure");
        }
        return response;
    }

    public List<CertificatesDetails> getCertificates(String userId){
        List<CertificatesDetails> certificatesDetailses = new ArrayList<>();
        certificatesDetailses = certificatesDetailsDao.getCertificatesByUserId(userId);
        return certificatesDetailses;
    }

    public List<CertificatesDetails> getCertificatesByCourseId(String courseId){
        List<CertificatesDetails> certificatesDetailses = new ArrayList<>();
        certificatesDetailses = certificatesDetailsDao.getCertificatesByCourse(courseId);
        return certificatesDetailses;
    }
}
