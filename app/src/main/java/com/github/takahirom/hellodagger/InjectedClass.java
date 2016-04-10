package com.github.takahirom.hellodagger;

import javax.inject.Inject;

class InjectedClass {
    @Inject
    public InjectedClass() {
    }

    public void print() {
        System.out.println("hello");
    }
}