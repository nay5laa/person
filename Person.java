package com.mycompany.person;

class Person {

    private String username;
    private String password;

    public Person() {
        System.out.println("");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public static void main(String[] args) {
        Person orang = new Person();
        
        orang.setUsername("nay5laa");
        orang.setPassword("ber217an");
        
        System.out.println("Username: " + orang.getUsername());
        System.out.println("Password: " + orang.getPassword());
        
    }

}
