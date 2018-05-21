package org.gamegogo.ExploringJavaLang.System;

class ShowUserDir {
    public static void main(String args[]) {
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("java.vm.specification.vendor"));
        System.out.println(System.getProperty("java.vm.version"));
        System.out.println(System.getProperty("java.compiler"));
    }
}

