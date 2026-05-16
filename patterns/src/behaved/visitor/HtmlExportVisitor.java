package behaved.visitor;

import java.util.List;

public class HtmlExportVisitor implements DocumentVisitor {
    private final StringBuilder html = new StringBuilder();

    @Override
    public void visit(TextElement text) {
        html.append("<p>").append(text.getContent()).append("</p>");
    }

    @Override
    public void visit(ImageElement image) {
        html.append(String.format(
                "<img src='%s' width='%d' height='%d'>",
                image.getUrl(), image.getWidth(), image.getHeight()));
    }

    @Override
    public void visit(TableElement table) {
        html.append("<table border='1'>");
        for (List<String> row : table.getData()) {
            html.append("<tr>");
            for (String cell : row) {
                html.append("<td>").append(cell).append("</td>");
            }
            html.append("</tr>");
        }
        html.append("</table>");
    }

    public String getResult() {
        return html.toString();
    }
}
