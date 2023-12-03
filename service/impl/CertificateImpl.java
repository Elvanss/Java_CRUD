package ls10.lab.service.impl;

import ls10.lab.model.Certificate;
import ls10.lab.dao.impl.CertificateDao;

import java.util.List;

public class CertificateImpl {

    private CertificateDao cerDao = new CertificateDao();

    public List<Certificate> getAllCertifications() {
        return cerDao.getAll();
    }

}
