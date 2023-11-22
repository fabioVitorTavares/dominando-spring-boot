package academy.devdojo.services;

import academy.devdojo.domain.UserEntity;
import academy.devdojo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
    public UserEntity getUserById(Integer id){

        UserEntity user =  userRepository.getUserById(id);
        user.setNome(user.getNome() + " Tavares");
        user.setNome(user.getNome().toUpperCase());
        return user;
    }
}
