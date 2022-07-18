
package com.ap.portfolio.service;

import com.ap.portfolio.model.Login;
import com.ap.portfolio.repository.LoginRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class LoginService {
  @Autowired
    private LoginRepository loginRepository;
    
    public boolean isUserEnabled(Login login) {
        boolean isUserEnabled = false;
        List<Login> users = loginRepository.findByUserName(login.getUserName());
        if (!users.isEmpty()) {
            Login user = users.get(0);
            if (user.getPassword().equals(login.getPassword())){
                isUserEnabled = true;
            }
        }
        return isUserEnabled;
    }
    
}