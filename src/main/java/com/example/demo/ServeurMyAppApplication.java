package com.example.demo;

import com.example.demo.entity.Produit;
import com.example.demo.entity.Role;
import com.example.demo.entity.User;
import com.example.demo.repository.ProduitRepository;
import com.example.demo.repository.RoleRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.util.RoleEnum;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class ServeurMyAppApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext ctx = SpringApplication.run(ServeurMyAppApplication.class, args);

        ProduitRepository produitRepository = ctx.getBean(ProduitRepository.class);

        produitRepository.save(new Produit("Livre",60,20));
        produitRepository.save(new Produit("Cahier",200,5.25f));
        produitRepository.save(new Produit("Stylo",500,2.10f));

        RoleRepository roleRepository=ctx.getBean(RoleRepository.class);
        Role roleUser=new Role(RoleEnum.ROLE_USER);
        Role roleAdmin=new Role(RoleEnum.ROLE_ADMIN );

        roleRepository.save(roleUser);
        roleRepository.save(roleAdmin);

        UserRepository userRepository=ctx.getBean(UserRepository.class);
        User user=new User("user","passworduser",true);
        user.setRoles(Arrays.asList(roleUser));
        userRepository.save(user);
        User admin=new User("admin","passwordadmin",true);
        admin.setRoles(Arrays.asList(roleUser,roleAdmin));
        userRepository.save(admin);
    }


}
