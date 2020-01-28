package br.com.mastertech.hometeacher;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class AppController {
    @GetMapping
    public String mostraHome(){
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n" +
                "    <title>Home Teacher </title>\n" +
                "    <link rel=\"stylesheet\" href=\"styles.css\">\n" +
                "</head>\n" +
                "<body>\n" +
                "    <div class=\"hearder\"> \n" +
                "        <h1>\n" +
                "            <a href=\"index.html\">Home Teacher</a>\n" +
                "        </h1>\n" +
                "\n" +
                "        <div class=\"menu\">\n" +
                "            <a href=\"produtos.html\">Produtos</a>\n" +
                "            <a href=\"sobre.html\">Sobre</a>\n" +
                "            <a href=\"contato.html\">Contato</a>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "\n" +
                "    <img class=\"banner\" src=\"https://images.unsplash.com/photo-1556302132-40bb13638500?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=755&q=80\" alt=\"\">\n" +
                "</body>\n" +
                "</html>";
    }
}
