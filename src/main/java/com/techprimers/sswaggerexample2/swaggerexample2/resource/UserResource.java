package com.techprimers.sswaggerexample2.swaggerexample2.resource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/rest/user")
@Api(value = "User  EndPoint"   ,description = "shows User info"   )
public class UserResource {


    @GetMapping
    public List<User> getUsers() {
        return Arrays.asList(new User("Sam", 2633L), new User("Peter", 24625L));
    }

    @GetMapping("/{userName}")
    public User getUser(@PathVariable("userName") final String userName) {
        return new User(userName, 42131);
    }


    private class User {
        @ApiModelProperty(notes = "name of the User")
        private String userName;
        @ApiModelProperty(notes = "salary of the User")
        private long salary;

        public User(String userName, long salary) {
            this.userName = userName;
            this.salary = salary;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public Long getSalary() {
            return salary;
        }

        public void setSalary(Long salary) {
            this.salary = salary;
        }
    }
}
