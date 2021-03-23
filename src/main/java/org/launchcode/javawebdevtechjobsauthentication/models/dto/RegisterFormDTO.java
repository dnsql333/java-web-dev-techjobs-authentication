package org.launchcode.javawebdevtechjobsauthentication.models.dto;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class RegisterFormDTO {

        private String verifyPassword;

        public String getVerifyPassword() {
            return verifyPassword;
        }

        public void setVerifyPassword(String verifyPassword) {
            this.verifyPassword = verifyPassword;
        }

}
