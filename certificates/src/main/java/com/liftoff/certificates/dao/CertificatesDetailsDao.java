package com.liftoff.certificates.dao;

import com.liftoff.certificates.entity.CertificatesDetails;
import org.joda.time.DateTime;
import java.util.List;

/**
 * Created by vijay.hathimare on 2/8/18.
 */
public interface CertificatesDetailsDao extends BaseDao<CertificatesDetails> {
    public List<CertificatesDetails> getCertificatesByUserId(String userId);
    public List<CertificatesDetails> getCertificatesByCourse(String courseId);
    public List<CertificatesDetails> getCertificatesBetweenDates(DateTime toDate, DateTime fromDate);
}
