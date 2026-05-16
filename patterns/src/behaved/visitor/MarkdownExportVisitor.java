package behaved.visitor;

import java.util.List;

public class MarkdownExportVisitor implements DocumentVisitor {
    private final StringBuilder markdown = new StringBuilder();

    @Override
    public void visit(TextElement text) {
        markdown.append(text.getContent()).append("\n\n");
    }

    @Override
    public void visit(ImageElement image) {
        markdown.append(String.format(
                "![Image](%s){width=%d height=%d}\n\n",
                image.getUrl(), image.getWidth(), image.getHeight()));
    }

    @Override
    public void visit(TableElement table) {
        // Упрощённая реализация для Markdown
        List<List<String>> data = table.getData();
        if (!data.isEmpty()) {
            // Заголовки
            List<String> headers = data.get(0);
            markdown.append("| ").append(String.join(" | ", headers)).append(" |\n");
            // Разделитель
            markdown.append("|").append(String.join("|", headers.stream().map(h -> "---").toList())).append("|\n");
            // Данные
            for (int i = 1; i < data.size(); i++) {
                List<String> row = data.get(i);
                markdown.append("| ").append(String.join(" | ", row)).append(" |\n");
            }
            markdown.append("\n");
        }
    }

    public String getResult() {
        return markdown.toString();
    }
}
