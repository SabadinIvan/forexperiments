package behaved.visitor;

import java.util.Arrays;
import java.util.List;

public class VisitorDemo {

    public static void main(String[] args) {
        List<DocumentElement> document = Arrays.asList(
                new TextElement("Заголовок документа"),
                new ImageElement("photo.jpg", 800, 600),
                new TableElement(Arrays.asList(
                        Arrays.asList("Имя", "Возраст", "Город"),
                        Arrays.asList("Анна", "25", "Москва"),
                        Arrays.asList("Иван", "30", "СПб")
                )),
                new TextElement("Конец документа")
        );

        // Экспорт в HTML
        HtmlExportVisitor htmlVisitor = new HtmlExportVisitor();
        for (DocumentElement element : document) {
            element.accept(htmlVisitor);
        }
        System.out.println("HTML:");
        System.out.println(htmlVisitor.getResult());

        // Экспорт в Markdown
        MarkdownExportVisitor mdVisitor = new MarkdownExportVisitor();
        for (DocumentElement element : document) {
            element.accept(mdVisitor);
        }
        System.out.println("\nMarkdown:");
        System.out.println(mdVisitor.getResult());
    }
}
