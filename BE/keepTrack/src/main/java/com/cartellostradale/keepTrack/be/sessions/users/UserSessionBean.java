package com.cartellostradale.keepTrack.be.sessions.users;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.cartellostradale.keepTrack.be.converters.users.UserDtoConverter;
import com.cartellostradale.keepTrack.be.entities.users.User;
import com.cartellostradale.keepTrack.commons.costants.ConversionLevel;
import com.cartellostradale.keepTrack.commons.dtos.users.UserDto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Service
@Repository
@Transactional
public class UserSessionBean {

    @PersistenceContext
    private EntityManager em;

    public UserDto login(String username) throws Exception {
        User result = null;
        UserDto resultDto = null;
        try {
            String hql = "FROM User u WHERE u.username = :username";
            TypedQuery<User> query = em.createQuery(hql, User.class);
            query.setParameter("username", username);

            result = query.getSingleResult();

            if (result != null) {
                resultDto = UserDtoConverter.toDto(result, null, ConversionLevel.COMPLETE);
            }

        } catch (NoResultException nre) {
            return null;
        } catch (Exception e) {
            throw new Exception("Error during login", e);
        }
        return resultDto;
    }

}
