package controller;

import io.javalin.Javalin;

public class JavalinHello {
    public static void main(String[] args) {
        var app = Javalin.create().start(7500);
        app.get("/", ctx -> ctx.result("Hello World"));
    }
}
