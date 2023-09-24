package controller;

import io.javalin.Javalin;

public class HelloJavalin {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(8500);
        app.get("/", ctx -> ctx.result("Hello Javalin"));
    }
}
