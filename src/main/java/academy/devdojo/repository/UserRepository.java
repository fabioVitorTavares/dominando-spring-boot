package academy.devdojo.repository;

import academy.devdojo.domain.UserEntity;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public UserEntity getUserById(Integer id){
        UserEntity user = new UserEntity();
        user.setId(id);
        user.setNome("Fabio");
        return user;
    }
}
