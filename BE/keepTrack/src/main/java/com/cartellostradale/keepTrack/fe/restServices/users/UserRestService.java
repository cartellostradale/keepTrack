package com.cartellostradale.keepTrack.fe.restServices.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cartellostradale.keepTrack.be.sessions.users.UserSessionBean;
import com.cartellostradale.keepTrack.commons.costants.MediaTypes;
import com.cartellostradale.keepTrack.commons.costants.RestServices;
import com.cartellostradale.keepTrack.commons.dtos.users.UserDto;

@RestController
@RequestMapping(RestServices.APPLICATION_PATH)
public class UserRestService {

    @Autowired
    UserSessionBean userSBean;

    @RequestMapping(path = "/**", method = {RequestMethod.OPTIONS})
    public ResponseEntity<?> handleOptions() {
        return ResponseEntity.ok()
                .header("Access-Control-Allow-Origin", "http://localhost:4200")
                .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS")
                .header("Access-Control-Allow-Headers", "Content-Type, Authorization")
                .build();
    }

    @PostMapping(path = RestServices.LOGIN_PATH, produces = MediaTypes.APPLICATION_JSON_VALUE, consumes = MediaTypes.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserDto> login(@RequestBody UserDto user) throws Exception {
        UserDto result;
        try {
            result = userSBean.login(user.getUsername());


        } catch (Exception e) {
            throw new Exception("sus", e);
        }
        return ResponseEntity.ok(result);
    }

}
