package com.globant.tc.scooter.accounts.serviceimp;

import com.globant.tc.scooter.accounts.api.FindUserByIdApi;
import com.globant.tc.scooter.accounts.api.util.ApiUtil;
import com.globant.tc.scooter.accounts.constant.Constant;
import com.globant.tc.scooter.accounts.entity.UserEntity;
import com.globant.tc.scooter.accounts.model.User;
import com.globant.tc.scooter.accounts.repositories.UserRepository;
import com.globant.tc.scooter.accounts.services.FindUserByIdApiDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FindUserByIdApiDelegateImp implements FindUserByIdApiDelegate {
    private final String message = "A user with the specified ID was not found";

    @Autowired
    private UserRepository userRepository;

    /**
     * findUserById/{userId} : Find a user registered in the system by the id
     *
     * @param userId id of the user (required)
     * @return OK (status code 200)
     * @see FindUserByIdApi#findUserByIdUserIdGet
     */
    @Override
    public ResponseEntity<User> findUserByIdUserIdGet(Long userId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"preferredPayment\" : \"preferredPayment\", \"name\" : \"name\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });

        Optional<UserEntity> user = userRepository.findById(userId);
        if (!user.isPresent()) {
            return new ResponseEntity(Constant.RecordNotFoundMessage, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity(new User(user.get().getName(), user.get().getPreferredPayment()), HttpStatus.OK);
    }
}
