package objectsAndClasses.articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String articleData = scanner.nextLine();
        String title = articleData.split(", ")[0];
        String content = articleData.split(", ")[1];
        String author = articleData.split(", ")[2];

        Article article = new Article(title, content, author);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String input=scanner.nextLine();
            switch (input.split(":")[0]){
                case "Edit":
                    article.edit(input.split(": ")[1]);
                    break;
                case "Rename":
                    article.rename(input.split(": ")[1]);
                    break;
                case"ChangeAuthor":
                    article.changeAuthor(input.split(": ")[1]);
                    break;
            }
        }
        System.out.println(article);
    }
}
