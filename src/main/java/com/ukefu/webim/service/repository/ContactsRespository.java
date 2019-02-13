package com.ukefu.webim.service.repository;

import com.ukefu.webim.web.model.CallMonitor;
import com.ukefu.webim.web.model.Contacts;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @title:
 * @Author: yeyu
 * @Date: 2019/1/29 13:12
 * @Version 1.0
 */
public interface ContactsRespository extends JpaRepository<Contacts, String> {
}
