package org.gamegogo.TheStreamApi.MappingExample2;

// Use map() to create a new stream that contains only
// selected aspects of the original stream.
class NamePhoneEmail {
    String name;
    String phonenum;
    String email;
    NamePhoneEmail(String n, String p, String e) {
        name = n;
        phonenum = p;
        email = e;
    }
}

