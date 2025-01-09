package com.hahmad92.keycloack.integration.service;

import com.hahmad92.keycloack.integration.dto.ResetPassword;
import com.hahmad92.keycloack.integration.dto.UserRegistrationRecord;
import org.keycloak.admin.client.resource.UserResource;
import org.keycloak.representations.idm.UserRepresentation;

public interface KeycloakUserService {

    UserRegistrationRecord createUser(UserRegistrationRecord userRegistrationRecord);
    UserRepresentation getUserById(String userId);
    void deleteUserById(String userId);
    void emailVerification(String userId);
    UserResource getUserResource(String userId);
    void updatePassword(String userId);
    void updatePassword(ResetPassword resetPassword, String userId);
}
