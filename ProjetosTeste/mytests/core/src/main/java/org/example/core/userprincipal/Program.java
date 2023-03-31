package org.example.core.userprincipal;

import com.sun.security.auth.UserPrincipal;

import java.security.Principal;

public class Program {

    public static void main(String[] args) {
        Principal user = new UserPrincipal("Daniel");

    }
}
